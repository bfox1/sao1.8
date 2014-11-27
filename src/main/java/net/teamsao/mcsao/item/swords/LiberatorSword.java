package net.teamsao.mcsao.item.swords;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.teamsao.mcsao.helper.ReferenceHelper;
import net.teamsao.mcsao.item.SItemSword;
import net.teamsao.mcsao.creativetabs.SAOTabsManager;

/**
 * Created by bfox1 on 8/25/2014.
 */
public class LiberatorSword extends SItemSword {
    public LiberatorSword(ToolMaterial p_i45356_1_, String typeName) {
        super(p_i45356_1_, typeName);
        this.setUnlocalizedName("LiberatorSword");
        this.setTextureName(ReferenceHelper.setItemName(this));
        this.setCreativeTab(SAOTabsManager.saoTools);
    }

    @Override
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {

        EntityPlayer player = ((EntityPlayer) entity);
        if (!world.isRemote)
        {

            if (!itemstack.isItemEnchanted())
            {
                itemstack.addEnchantment(Enchantment.sharpness, 5);
            }

        }
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
    {
        par1ItemStack.damageItem(1, par3EntityLiving);
        par2EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20 * 7, 3));
         par2EntityLiving.addPotionEffect(new PotionEffect(Potion.weakness.id, 30 * 5, 3));

        return true;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        par3.setItemInUse(par1, this.getMaxItemUseDuration(par1));
        return par1;

    }
}
