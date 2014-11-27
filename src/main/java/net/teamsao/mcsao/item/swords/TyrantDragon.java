package net.teamsao.mcsao.item.swords;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.teamsao.mcsao.helper.ReferenceHelper;
import net.teamsao.mcsao.init.SAOItems;
import net.teamsao.mcsao.item.SItemSword;
import net.teamsao.mcsao.creativetabs.SAOTabsManager;
//

/**
 * Created by bfox1 on 7/10/2014.
 */
public class TyrantDragon extends SItemSword {
    public TyrantDragon(ToolMaterial p_i45356_1_, String typeName ) {
        super(p_i45356_1_, typeName);
        this.setUnlocalizedName("TyrantDragon");
        this.setTextureName(ReferenceHelper.setItemName(this));
        this.setCreativeTab(SAOTabsManager.saoTools);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3) {
        par3.setItemInUse(par1, this.getMaxItemUseDuration(par1));

        ItemStack sword = new ItemStack(SAOItems.TyrantDragonPowered);
        sword.addEnchantment(Enchantment.sharpness, 2);
        if (!par2.isRemote) {
            if (par3.isSneaking()) {
                sword.setItemDamage(par1.getItemDamage());
                return sword;
            }

        }
        return par1;
    }
}
