package net.teamsao.mcsao.helper;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;

/**
 * Look! Blocks now store their own metadata again!
 * @author Ian
 *
 */
public class BlockData implements Comparable
{

	private Block block;
	private IBlockState state;
	private BlockPos position;
	
	/**
	 * Allows you to set both the block and a specific metadata.
	 * @param block
	 * @param metadata
	 */
	public BlockData(Block block, IBlockState state, int x, int y, int z)
	{
		this.block = block;
		this.state = state;
		this.position = new BlockPos(x,y,z);
	}
	
	/**
	 * Allows you to set both the block and a specific metadata.
	 * @param block
	 * @param metadata
	 */
	public BlockData(Block block, IBlockState state, BlockPos position)
	{
		this.block = block;
		this.state = state;
		this.position = position;
	}
	
	/**
	 * Allows you to just set the block and default the metadata to 0.
	 * @param block
	 */
	public BlockData(Block block, int x, int y, int z)
	{
		this.block = block;
		this.state = Blocks.air.getDefaultState();
		this.position = new BlockPos(x,y,z);
	}
	
	/**
	 * Well, there's nothing here, so I guess the block is air?
	 */
	public BlockData(int x, int y, int z)
	{
		this.block = Blocks.air;
		this.state = Blocks.air.getDefaultState();
		this.position = new BlockPos(x,y,z);
	}
	
	/**
	 * Helper method to use when copying a piece of data or for use with lists.
	 * @return a copy of this object with the same block, metadata, and coordinate values, but a different reference.
	 */
	public BlockData getCopy()
	{
		return new BlockData(this.block, this.state, 
				new BlockPos(this.position.getX(), this.position.getY(), this.position.getZ()));
	}
	
	/**
	 * Copies an ArrayList of BlockData objects, deep copy so no references to the original array or its stored objects
	 * remain in the copy.
	 * @param original
	 * @return a completely separate copy of the original ArrayList
	 */
	public static ArrayList<BlockData> copyList(ArrayList<BlockData> original)
	{
		ArrayList<BlockData> copy = new ArrayList<BlockData>(original.size());
		for(BlockData data : original)
		{
			copy.add(data.getCopy());
		}
		return copy;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((block == null) ? 0 : block.hashCode());
		result = prime * result
				+ ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlockData other = (BlockData) obj;
		if (block == null) {
			if (other.block != null)
				return false;
		} else if (!block.equals(other.block))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	public Block getBlock()
	{
		if(block == null)
		{
			return null;
		}
		return block;
	}

	public void setBlock(Block block)
	{
		this.block = block;
	}
	
	public IBlockState getState()
	{
		return state;
	}

	public void setState(IBlockState state)
	{
		this.state = state;
	}

	public BlockPos getPosition()
	{
		return position;
	}

	public void setPosition(BlockPos position)
	{
		this.position = position;
	}

	public int getBlockX()
	{
		return position.getX();
	}

	public int getBlockY()
	{
		return position.getY();
	}

	public int getBlockZ()
	{
		return position.getZ();
	}

	@Override
	public int compareTo(Object other)
	{
		return 0;
	}

}
