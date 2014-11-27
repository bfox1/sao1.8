package net.teamsao.mcsao.world;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.teamsao.mcsao.SwordArtOnline;
import net.teamsao.mcsao.world.DimensionId;
import net.teamsao.mcsao.world.generation.SAOBiomeGen;

/**
 * 
 * @author Ian
 * Main manager class for building the new dimension. It uses a biome attempting to make a creative build environment,
 * as well as a chunk generator that removes every block everywhere.
 */
public class SAOWorldProvider extends WorldProvider
{
	public BiomeGenBase void_world = new SAOBiomeGen(44, true);
	
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(void_world, 0.1F);
		this.dimensionId = DimensionId.SAO_DIMENSION_ID;
	}
	
	public IChunkProvider createChunkGenerator()
	{
		return new SAOChunkProvider(worldObj, worldObj.getSeed(), true);
	}
	
	@Override
	public String getDimensionName()
	{
		return "Aincrad";
	}
}