package net.teamsao.mcsao.recipes;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.teamsao.mcsao.init.SAOItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.teamsao.mcsao.helper.LogHelper;

import java.util.ArrayList;

public class ItemRecipes {

    public static void swordRecipe(Item newItem, int quantity, Item itemRecipe1, Item itemRecipe2, Item itemRecipe3 )
    {
        GameRegistry.addShapedRecipe(new ItemStack(newItem, quantity), "S", "O", "E", 'S', itemRecipe1, 'O', itemRecipe2, 'E', itemRecipe3);
    }
    public static void swordRecipe(Item newItem, int quantity, Item itemRecipe1, Item itemRecipe2, Block itemRecipe3 )
    {
        GameRegistry.addShapedRecipe(new ItemStack(newItem, quantity), "S", "O", "E", 'S', itemRecipe1, 'O', itemRecipe2, 'E', itemRecipe3);
    }

    private static void RemoveRecipeByOutput(ItemStack resultItem) {
        ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();

        for (int scan = 0; scan < recipes.size(); scan++) {
            IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
            recipeResult = tmpRecipe.getRecipeOutput();
            if (recipeResult != null) {
                if (recipeResult.getItem() == resultItem.getItem() && recipeResult.getItemDamage() == resultItem.getItemDamage() && recipeResult.stackSize == recipeResult.stackSize) {
                    LogHelper.info("SAO Removed Recipe: " + recipes.get(scan) + " ===> " + recipeResult);
                    recipes.remove(scan);
                    scan--;
                }
            }
        }
    }

    public static void removeBlockRecipes(){
        RemoveRecipeByOutput(new ItemStack(Blocks.crafting_table));
    }
	
	public static void init(){
		/*
		Temporary Recipes for Item Creation EXCEPT Object Eraser ;)
		 */
		GameRegistry.addShapedRecipe(new ItemStack(SAOItems.DarkRepulser, 1),    " C ", " C ", " D ", 'C', SAOItems.CrystalliteIngot, 'D', Items.diamond);

        GameRegistry.addShapedRecipe(new ItemStack(SAOItems.TownTeleportCrystal, 1), " S ", " A ", "   ", 'A', SAOItems.CrystalliteIngot, 'S', Items.iron_ingot);

        GameRegistry.addShapedRecipe(new ItemStack(SAOItems.Elucidator, 1),      " S ", " O ", " T ", 'S', Blocks.obsidian,           'O', SAOItems.CrystalliteIngot, 'T', Items.diamond);
        GameRegistry.addShapedRecipe(new ItemStack(SAOItems.NerveGear, 1),       "GRG", "RHR", "GSG", 'G', Blocks.gold_block,         'R', Blocks.redstone_block,     'H', Items.iron_helmet, 'S', Blocks.glass);

        swordRecipe(SAOItems.AnnealBlade, 1, Items.iron_ingot, Items.iron_ingot, Blocks.obsidian);
        swordRecipe(SAOItems.EbonDagger, 1, Items.iron_ingot, Items.wooden_sword, SAOItems.CrystalliteIngot);
	}



}
