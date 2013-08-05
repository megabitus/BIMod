package bi.bi_Helper;

import java.util.Random;

import bi.bi_Blocks.ModBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class BIWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId)
		{
		case -1: generateNether(world, random,chunkX*16,chunkZ*16);
		case 0 : generateSurface(world, random,chunkX*16,chunkZ*16);
		case 1 : generateSurface2(world, random,chunkX*16,chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		for(int i =0; i<30;i++){
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = 64 + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.StormmSand.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
	private void generateNether(World world, Random random, int i, int j) {
	}
	private void generateSurface2(World world, Random random, int chunkX,int chunkZ){
		for(int i = 0; i < 15; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.NuggetOre.blockID, 20)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
	 private void generateSurface3(World world, Random random, int BlockX, int BlockZ) {

		  for(int i = 0; i < 20; i++){
		   int Xcoord1 = BlockX + random.nextInt(16);
		   int Ycoord1 = random.nextInt(90);
		   int Zcoord1 = BlockZ + random.nextInt(16);
		   
		   (new WorldGenGlowTree(false, 6, 0, 0, false)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		   
		  }
	 }

}