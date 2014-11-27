package net.teamsao.mcsao.init;

import net.minecraft.item.Item;
import net.teamsao.mcsao.block.DungeonBlockMetaData;
import net.teamsao.mcsao.helper.ReferenceHelper;
import net.teamsao.mcsao.item.*;
import net.teamsao.mcsao.item.ingots.*;
import net.teamsao.mcsao.item.armor.*;
import net.teamsao.mcsao.item.foods.*;
import net.teamsao.mcsao.item.items.*;
import net.teamsao.mcsao.item.hammers.*;
import net.teamsao.mcsao.item.items.SAOCD;
import net.teamsao.mcsao.item.potions.*;
import net.teamsao.mcsao.item.swords.*;
import net.teamsao.mcsao.material.SArmorMaterial;
import net.teamsao.mcsao.material.SToolMaterial;
import net.teamsao.mcsao.player.skill.SkillList;
import net.teamsao.mcsao.recipes.ForgeStationRecipes;

/**
 * Initializing Items
 * @author bfox1
 */
public class SAOItems
{
    // Swords
    public static SItemSword Elucidator = new Elucidator(SToolMaterial.Elucidator, "one-handed-sword");
    public static SItemSword ElucidatorPowered = new ElucidatorPowered(SToolMaterial.Elucidator, "one-handed-sword");
    public static SItemSword AnnealBlade = new AnnealBlade(SToolMaterial.AnnealBlade,"one-handed-sword");
    public static SItemSword AnnealBladePowered = new AnnealBladePowered(SToolMaterial.AnnealBlade,"one-handed-sword");
    public static SItemSword DarkRepulser = new DarkRepulser(SToolMaterial.DarkRepulser,"one-handed-sword");
    public static SItemSword DarkRepulserPowered = new DarkRepulserPowered(SToolMaterial.DarkRepulser,"one-handed-sword");
    public static SItemSword EbonDagger = new EbonDagger(SToolMaterial.EbonDagger, "dagger");
    public static SItemSword EbonDaggerPowered = new EbonDaggerPowered(SToolMaterial.EbonDagger, "dagger");
    public static SItemSword GuiltyThorn = new GuiltyThorn(SToolMaterial.GuiltyThorn, "spear");
    public static SItemSword GuiltyThornPowered = new GuiltyThornPowered(SToolMaterial.GuiltyThorn, "spear");
    public static SItemSword Karakurenai = new Karakurenai(SToolMaterial.Karakurenai,"katana");
    public static SItemSword KarakurenaiPowered = new KarakurenaiPowered(SToolMaterial.Karakurenai,"katana");
    public static SItemSword LambentLight = new LambentLight(SToolMaterial.LambentLight, "rapier-sword");
    public static SItemSword LambentLightPowered = new LambentLightPowered(SToolMaterial.LambentLight, "rapier-sword");
    public static SItemSword LiberatorShield = new LiberatorShield(SToolMaterial.LiberatorShield, "shield");
    public static SItemSword LiberatorSword = new LiberatorSword(SToolMaterial.LiberatorSword, "one-handed-sword");
    public static SItemSword MateChopper = new MateChopper(SToolMaterial.MateChopper, "dagger");
    public static SItemSword MateChopperPowered = new MateChopperPowered(SToolMaterial.MateChopper, "dagger");
    public static SItemSword ObjectEraser = new ObjectEraser(SToolMaterial.ObjectEraser, "two-handed-sword");
    public static SItemSword ShadowDagger = new ShadowDagger(SToolMaterial.ShadowDagger, "dagger");
    public static SItemSword ShadowDaggerPowered = new ShadowDaggerPowered(SToolMaterial.ShadowDagger, "dagger");
    public static SItemSword TyrantDragon = new TyrantDragon(SToolMaterial.TyrantDragon, "two-handed-sword");
    public static SItemSword TyrantDragonPowered = new TyrantDragonPowered(SToolMaterial.TyrantDragon, "two-handed-sword");



    public static SItemSword KagemitsuG4 = new KagemitsuG4(SToolMaterial.KagemitsuG4, "one-handed-sword");
    public static Item KagemitsuG4Powered = new KagemitsuG4Powered(SToolMaterial.KagemitsuG4, "one-handed-sword");


    // Guns
    public static Item FnFiveSeven /* = new FnFiveSeven(SToolMaterial.FnFiveSeven)*/;
    public static Item PgmUltimaRatioHecateII /* = new PgmUltimaRatioHecateII(SToolMaterial.PgmUltimaRatioHecateII)*/;
    public static Item Type54BlackStar;
    
    //Hammers
    public static Item ZoringenHammer = new ZoringenHammer();

    // ItemBlocks
    public static Item DungeonStoneItem = new DungeonBlockMetaData(SAOBlocks.DungeonStone);
    public static Item CrystalDungeonItem = new DungeonBlockMetaData(SAOBlocks.CrystalStone);

    // Items
    public static Item BossKillToken = new BossKillToken();
    public static Item HeartOfKobold = new HeartOfKobold();
    public static Item NerveGear = new NerveGear(SArmorMaterial.nerveGear, 0, "NerveGear");
    public static Item AntidoteCrystal = new AntidoteCrystal();
    public static Item TownTeleportCrystal = new TownTeleportCrystal();
    public static Item HealingCrystal = new HealingCrystal();
    public static Item CDSAO = new SAOCD();


    //Potions
    public static Item Elixer = new Elixir();
    public static Item EmptyVial = new EmptyVial();

    public static Item WeaponTypeSelector = new WeaponTypeSelector();
    public static Item SwordTypeSelector = new SwordTypeSelector();
    
    //Ingots
    public static Item CrystalliteIngot = new CrystalliteIngot();
    public static Item SteelIngot = new SteelIngot();

    //Armor
    public static Item CoatOfMidnightBody = new COM_Body(SArmorMaterial.coatOfMidnight, 1, "CoatOfMidnightBody");
    public static Item CoatOfMidnightLeggings = new COM_Leggings(SArmorMaterial.coatOfMidnight, 2, "CoatOfMidnightLeggings");
    public static Item CoatOfMidnightBoots = new COM_Boots(SArmorMaterial.coatOfMidnight, 3, "CoatOfMidnightBoots");
    public static Item debugHelmet = new Debug_Helmet(SArmorMaterial.debugMaterial, 0, "DebugHelmet");
    public static Item debugChestPlate = new Debug_ChestPlate(SArmorMaterial.debugMaterial,  1, "DebugChestPlate");
    public static Item debugLeggings = new Debug_Leggings(SArmorMaterial.debugMaterial,  2, "DebugLeggings");
    public static Item debugBoots = new Debug_Boots(SArmorMaterial.debugMaterial,  3, "DebugBoots");

    // Food
    public static Item ragoutRabbitMeat = new RabbitMeat(10, 15.0F, false, "ragoutmeat");
    public static Item RawRagoutRabbitMeat = new RawRabbitMeat(2, 2.0F, false, "rawragoutmeat");
    public static SItemFood ScavengerToadMeat = new ScavengerToadMeat(1, 1.0F, false, "toadmeat");
    public static SItemFood ScavengerCookedToadMeat = new ScavengerCookedToadMeat(3, 4.0F, false, "cookedtoadmeat");
    
    public static void registerInit() {

        Item[] items = { BossKillToken, HeartOfKobold, NerveGear,AntidoteCrystal,
        		TownTeleportCrystal, CoatOfMidnightBody, CoatOfMidnightLeggings, CoatOfMidnightBoots,
                ObjectEraser, debugHelmet, debugChestPlate, debugLeggings, debugBoots, CDSAO, Elixer, EmptyVial,
                HealingCrystal/* , WeaponTypeSelector, SwordTypeSelector*/};

        Item[] foods = {ragoutRabbitMeat , ScavengerToadMeat, RawRagoutRabbitMeat, ScavengerCookedToadMeat};

        Item[] swords = {Elucidator, AnnealBlade, DarkRepulser, GuiltyThorn, LambentLight, EbonDagger, MateChopper,
                        Karakurenai, ShadowDagger, TyrantDragon, KagemitsuG4, LiberatorShield, LiberatorSword};

        Item[] ingots = {CrystalliteIngot, SteelIngot};

        Item[] pSwords = {ElucidatorPowered, AnnealBladePowered, DarkRepulserPowered, GuiltyThornPowered, LambentLightPowered,
                         EbonDaggerPowered, MateChopperPowered, KarakurenaiPowered, ShadowDaggerPowered, TyrantDragonPowered,
                         KagemitsuG4Powered/*, LiberatorShieldPowered, LiberatorSwordPowered*/};

        /*Item[] guns = {FnFiveSeven, PgmUltimaRatioHecateII, Type54BlackStar};*/
        
        Item[] hammers = {ZoringenHammer};

        for (Item item : items) {
            ReferenceHelper.registerItem(item);
        }


        for (Item food : foods) {
            ReferenceHelper.registerItem(food);
        }

        for (Item hammer : hammers) {
            ReferenceHelper.registerItem(hammer);
        }

        for (Item ingot : ingots) {
            ReferenceHelper.registerItem(ingot);
            for (Item hammer : hammers) {
                ForgeStationRecipes.forging().addForgingRecipe(ingot, WeaponTypeSelector, SwordTypeSelector, hammer, 0.1F);
            }
        }

        for (Item food : foods) {
            ReferenceHelper.registerItem(food);

        }

        for (Item sword : swords) {
            ReferenceHelper.registerItem(sword);
        }


        for (Item pSword : pSwords) {
            ReferenceHelper.registerItem(pSword);
        }

       /* for (Item gun : guns) {
            ReferenceHelper.registerItem(gun);
        } */

    }
}
