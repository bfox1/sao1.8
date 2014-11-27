package net.teamsao.mcsao.proxy;

import java.io.File;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.teamsao.mcsao.client.renderers.items.ItemRendererCrystal;
import net.teamsao.mcsao.entity.*;
import net.teamsao.mcsao.client.renderers.SafeAreaBlockRenderer;
import net.teamsao.mcsao.client.settings.KeyBindings;
import net.teamsao.mcsao.client.handler.SaoKeyInputHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.teamsao.mcsao.init.SAOItems;
import net.teamsao.mcsao.gui.Saoingamemenu;
import net.teamsao.mcsao.model.*;
import net.teamsao.mcsao.overlay.OverlayHealth;
import net.teamsao.mcsao.overlay.OverlayVersionText;

public class ClientProxy extends CommonProxy
{
	public static int safeAreaBlockRenderType;
	public static int renderPass;
	
	@Override
	public void initClientConfig(File configFile)
	{
		
	}

	@Override
	public void initRenderingAndTextures()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntityKoboldTest.class, new RenderEntityKoboldTest(new Illfang_the_Kobold_Lord(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, new RenderBoar(new boar(), 0.5F));
        safeAreaBlockRenderType = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new SafeAreaBlockRenderer());


        MinecraftForgeClient.registerItemRenderer(SAOItems.TownTeleportCrystal, new ItemRendererCrystal(0));
        MinecraftForgeClient.registerItemRenderer(SAOItems.HealingCrystal, new ItemRendererCrystal(1));
        MinecraftForgeClient.registerItemRenderer(SAOItems.AntidoteCrystal, new ItemRendererCrystal(2));
    }

    @Override
    public void registerRenderers(){
        MinecraftForge.EVENT_BUS.register(new OverlayHealth(Minecraft.getMinecraft()));
        MinecraftForge.EVENT_BUS.register(new OverlayVersionText(Minecraft.getMinecraft()));
        MinecraftForge.EVENT_BUS.register(new Saoingamemenu(Minecraft.getMinecraft()));
    }

    @Override
    public void registerEventHandlers()
    {
        super.registerEventHandlers();
        FMLCommonHandler.instance().bus().register(new SaoKeyInputHandler());
    }

	@Override
	public void registerKeybindings()
	{
        ClientRegistry.registerKeyBinding(KeyBindings.guiSkill);
	}

    @Override
    public void registerEntityLiving()
    {
    	
    }

}
