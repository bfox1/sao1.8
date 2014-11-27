package net.teamsao.mcsao.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.util.IIcon;
import net.teamsao.mcsao.init.SAOBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AincradCobbleStairs extends BlockStairs
{
	
	private Block material;
	
	public AincradCobbleStairs(Block block)
	{
		super(block, 0);
		this.setBlockName("cobbleroadstairs");
		this.setLightOpacity(0);
		this.material = block;
		this.setBlockUnbreakable();
        this.setResistance(30000000.0F);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int blockSide, int blockMetadataIcon)
	{
		return material.getIcon(1, 0);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return "sao:cobbleroadstairs";
	}
    @Override
    public int damageDropped(int par1)
    {
        return par1;
    }
}
