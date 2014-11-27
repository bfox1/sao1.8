package net.teamsao.mcsao.item.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.teamsao.mcsao.helper.ReferenceHelper;
import net.teamsao.mcsao.init.SAOItems;
import net.teamsao.mcsao.creativetabs.SAOTabsManager;

/**
<<<<<<< HEAD
 * @author bfox1
=======
 * Created by bfox1 on 8/21/2014.
>>>>>>> 79313ea16d2318340787e6ca2a63af359f0dafde
 */
public class HealingCrystal extends Item {

    public HealingCrystal(){
        super();
        this.setUnlocalizedName("HealingCrystal");
        this.setTextureName(ReferenceHelper.setItemName(this));
        this.setCreativeTab(SAOTabsManager.SAO);
        this.setMaxDamage(24);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){

        player.setItemInUse(item, this.getMaxItemUseDuration(item));
        ItemStack thisItem = new ItemStack(SAOItems.HealingCrystal);
        if(!world.isRemote && player.getHealth() != player.getMaxHealth())
        {
            float health = player.getMaxHealth() - player.getHealth();

            int diffHealth = Math.round(health);
            thisItem.setItemDamage(item.getItemDamage());
            int newHealth = diffHealth + (int)player.getHealth();

            thisItem.damageItem(diffHealth, player);
            player.setHealth(newHealth);
            return thisItem;
        }
        return item;
    }

    @Override
    public boolean isFull3D() {
        return true;
    }
}
