package net.teamsao.mcsao;




import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.teamsao.mcsao.entity.EntitySAO;
import net.teamsao.mcsao.event.commands.TpDimension;
import net.teamsao.mcsao.event.commands.setSkill;
import net.teamsao.mcsao.handler.ConfigurationHandler;
import net.teamsao.mcsao.helper.Messages;
import net.teamsao.mcsao.init.SAOBlocks;
import net.teamsao.mcsao.init.SAOItems;
import net.teamsao.mcsao.gui.GuiHandler;
import net.teamsao.mcsao.helper.LogHelper;
import net.teamsao.mcsao.helper.Reference;
import net.teamsao.mcsao.recipes.ItemRecipes;
import net.teamsao.mcsao.material.SToolMaterial;
import net.teamsao.mcsao.network.SaoPacketPipeline;
import net.teamsao.mcsao.proxy.SProxy;

import java.util.logging.LogManager;

/**
 * <p>This is the main file for the entire mod. All Init MUST go here.</p>
 * <p>If you need help, ask bfox1 for information or refer to the Other classes for examples.</p>
 *
 * @author bfox1
 */
@Mod(modid = Reference.MODID, name = Reference.NAME, certificateFingerprint = "Test", version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class SwordArtOnline {

    @Mod.Instance(Reference.MODID)
    public static SwordArtOnline instance;

    public static final SaoPacketPipeline packetPipeline = new SaoPacketPipeline();
    public static int modGuiIndex = 0;
    public static final int GUI_ITEM_INV = modGuiIndex++;


    public static final int GUI_TELEPORT_CRYSTAL = modGuiIndex + 2;
    public static final int GUI_TELEPORT_CRYSTAL_BLOCK = modGuiIndex + 3;
    public static final int GUI_SKILL = modGuiIndex + 4;


	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static SProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
            LogHelper.info("PreInitEvent - 0% complete - Creating configuration...");

            ConfigurationHandler.init(event.getSuggestedConfigurationFile());

            LogHelper.info("PreInitEvent - 13% complete - Registering configuration...");

            FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

            LogHelper.info("PreInitEvent - 25% complete - Registering entities...");

            EntitySAO.registerIds();

            LogHelper.info("PreInitEvent - 38% complete - Registering materials...");

            SToolMaterial.init();

           proxy.registerKeybindings();

            LogHelper.info("PreInitEvent - 50% complete - Registering items...");

            SAOItems.registerInit();

            LogHelper.info("PreInitEvent - 63% complete - Registering blocks...");

            SAOBlocks.registerInit();

            LogHelper.info("PreInitEvent - 75% complete - Registering dimension...");

            proxy.registerDimension();

            LogHelper.info("PreInitEvent - 88% complete - Initializing textures...");

            proxy.initRenderingAndTextures();

            LogHelper.info("PreInitEvent - 100% complete - Starting InitEvent...");
    }

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

        LogHelper.info("InitEvent - 0% complete - Registering packets...");
        packetPipeline.initialise();
        LogHelper.info("InitEvent - 11% complete - Adding dungeon loot...");
        proxy.addChestLoot();
        LogHelper.info("InitEvent - 22% complete - Registering events...");
        proxy.registerEventHandlers();
        LogHelper.info("InitEvent - 33% complete - Registering global entities...");
        proxy.registerGlobalEntity();
        LogHelper.info("InitEvent - 44% complete - Registering tile entities...");
        proxy.registerTileEntities();
        LogHelper.info("InitEvent - 67% complete - Registering recipes, step 1...");
        ItemRecipes.removeBlockRecipes();
        LogHelper.info("InitEvent - 78% complete - Registering recipes, step 2...");
        ItemRecipes.init();
        LogHelper.info("InitEvent - 89% complete - Registering Guis...");
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
        LogHelper.info("InitEvent - 100% complete - Starting PostInitEvent...");
	}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("PostInitEvent - 0% complete - Registering renderers...");
        proxy.registerRenderers();
        LogHelper.info("PostInitEvent - 50% complete - Registering packets...");
        packetPipeline.postInitialise();
        LogHelper.info("PostInitEvent - 100% complete - Launching Minecraft...");
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new TpDimension());
        event.registerServerCommand(new setSkill());
    }

}
