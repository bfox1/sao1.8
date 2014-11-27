package net.teamsao.mcsao.block.dungeonstone;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.teamsao.mcsao.block.BlockSAO;
import net.teamsao.mcsao.creativetabs.SAOTabsManager;

import java.util.List;

/**
 * Created by bfox1 on 7/20/2014.
 */
public class CrystalStone extends BlockSAO
{

    public CrystalStone()
    {
        super(Material.anvil);
        this.setCreativeTab(SAOTabsManager.saoBlocks);
        this.setUnlocalizedName("CrystalStone");
    }

    //@Override
    public int damageDropped(int par1)
    {
        return par1;
    }

    /**
     * Removed - IIcon and IIconRegister do not exist.
     * Seek other methods.
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        icons = new IIcon[5];

        for(int i = 0; i < icons.length; i++)
        {
            icons[i] = par1IconRegister.registerIcon(this.getUnlocalizedName().substring(5) + i);
        }
    }
    **/
	/*
	 * (non-Javadoc)
	 * @see net.minecraft.block.Block#getIcon(int, int)
	 * For the Texturers, The Case indicated the MetaData Number of the block
	 * This is only useful for texturers so for ex. case0: returns icons[0]; to
	 * translate that to a Name, simple add DungeonBlock0.png and add that to the Blocks folder
	 * in textures.
	 *
	 * For Item Name, @see net.teamsao.mcsao.block.itemBlockDungeonStone
	 */

    /**
     * Same as Above. Missing IIcons
     * @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int blockSide, int blockMetadataIcon)
    {
        if(blockMetadataIcon >= 0 && blockMetadataIcon < icons.length)
        {
            return icons[blockMetadataIcon];
        }
        else
        {
            //System.out.println("Invalid metadata for " + this.getUnlocalizedName());
            return icons[0];
        }
    }
     **/

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for(int i = 0; i < 4; i++)
        {
            par3List.add(new ItemStack(par1, 1, i));
        }
    }
}
//- test