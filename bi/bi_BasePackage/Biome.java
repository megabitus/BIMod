package bi.bi_BasePackage;

import bi.bi_Blocks.ModBlocks;
import cpw.*;
import cpw.mods.*;
import cpw.mods.fml.*;
import cpw.mods.fml.client.*;
import cpw.mods.fml.client.modloader.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.modloader.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import ibxm.*;
import net.*;
import net.minecraft.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.client.texturepacks.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.packet.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.liquids.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import java.util.Random;

public class Biome{

	public Biome(){}

	public void load(){
		ModLoader.addBiome(new BiomeGenbiomey());
	}

	class BiomeGenbiomey extends BiomeGenBase
	{
		public BiomeGenbiomey()
		{
			super(23);
			topBlock = (byte)Block.ice.blockID;
			fillerBlock = (byte)Block.oreEmerald.blockID;
			theBiomeDecorator.generateLakes = true;
			theBiomeDecorator.treesPerChunk = 40;
			theBiomeDecorator.flowersPerChunk = 56;
			theBiomeDecorator.grassPerChunk = 66;
			theBiomeDecorator.deadBushPerChunk = 106;
			theBiomeDecorator.mushroomsPerChunk = 35;
			theBiomeDecorator.reedsPerChunk = 64;
			theBiomeDecorator.cactiPerChunk = 92;
			theBiomeDecorator.sandPerChunk = 222;
			rainfall = 0.0F;
			minHeight = 0.11F;
			maxHeight = 0.31F;
			//enableRain = true;
			//enableSnow = true;
			//spawnableMonsterList.add(new SpawnListEntry(net.minecraft.src.EntityOcelot.class, 2, 1, 1));
		}

		public WorldGenerator getRandomWorldGenForTrees(Random par1Random){
			return new Tree();
		}
		class Tree extends WorldGenerator
		{
			/** The minimum height of a generated tree. */
			private final int minTreeHeight;

			/** True if this tree should grow Vines. */
			private final boolean vinesGrow;

			/** The metadata value of the wood to use in tree generation. */
			private final int metaWood;

			/** The metadata value of the leaves to use in tree generation. */
			private final int metaLeaves;

			public Tree()
			{
				super(false);
				this.minTreeHeight = 16;
				this.metaWood = 0;
				this.metaLeaves = 0;
				this.vinesGrow = true;
			}

			public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
			{
				int var6 = par2Random.nextInt(3) + this.minTreeHeight;
				boolean var7 = true;

				if (par4 >= 1 && par4 + var6 + 1 <= 256)
				{
					int var8;
					byte var9;
					int var11;
					int var12;

					for (var8 = par4; var8 <= par4 + 1 + var6; ++var8)
					{
						var9 = 1;

						if (var8 == par4)
						{
							var9 = 0;
						}

						if (var8 >= par4 + 1 + var6 - 2)
						{
							var9 = 2;
						}

						for (int var10 = par3 - var9; var10 <= par3 + var9 && var7; ++var10)
						{
							for (var11 = par5 - var9; var11 <= par5 + var9 && var7; ++var11)
							{
								if (var8 >= 0 && var8 < 256)
								{
									var12 = par1World.getBlockId(var10, var8, var11);

									if (var12 != 0 && var12 != Block.vine.blockID && var12 != Block.grass.blockID && var12 != ModBlocks.StormmSand.blockID && var12 != ModBlocks.StormmStone.blockID)
									{
										var7 = false;
									}
								}
								else
								{
									var7 = false;
								}
							}
						}
					}

					if (!var7)
					{
						return false;
					}
					else
					{
						var8 = par1World.getBlockId(par3, par4 - 1, par5);

						if ((var8 == Block.grass.blockID || var8 == ModBlocks.StarSky.blockID) && par4 < 256 - var6 - 1)
						{
							this.setBlock(par1World, par3, par4 - 1, par5, ModBlocks.StarSky.blockID);
							var9 = 3;
							byte var18 = 0;
							int var13;
							int var14;
							int var15;

							for (var11 = par4 - var9 + var6; var11 <= par4 + var6; ++var11)
							{
								var12 = var11 - (par4 + var6);
								var13 = var18 + 1 - var12 / 2;

								for (var14 = par3 - var13; var14 <= par3 + var13; ++var14)
								{
									var15 = var14 - par3;

									for (int var16 = par5 - var13; var16 <= par5 + var13; ++var16)
									{
										int var17 = var16 - par5;

										if ((Math.abs(var15) != var13 || Math.abs(var17) != var13 || par2Random.nextInt(2) != 0 && var12 != 0) && !Block.opaqueCubeLookup[par1World.getBlockId(var14, var11, var16)])
										{
											this.setBlockAndMetadata(par1World, var14, var11, var16, Block.bookShelf.blockID, this.metaLeaves);
										}
									}
								}
							}

							for (var11 = 0; var11 < var6; ++var11)
							{
								var12 = par1World.getBlockId(par3, par4 + var11, par5);

								if (var12 == 0 || var12 == ModBlocks.ReinforcedStone.blockID)
								{
									this.setBlockAndMetadata(par1World, par3, par4 + var11, par5, Block.tilledField.blockID, this.metaWood);

									if (this.vinesGrow && var11 > 0)
									{
										if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 - 1, par4 + var11, par5))
										{
											this.setBlockAndMetadata(par1World, par3 - 1, par4 + var11, par5, Block.vine.blockID, 8);
										}

										if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 + 1, par4 + var11, par5))
										{
											this.setBlockAndMetadata(par1World, par3 + 1, par4 + var11, par5, Block.vine.blockID, 2);
										}

										if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3, par4 + var11, par5 - 1))
										{
											this.setBlockAndMetadata(par1World, par3, par4 + var11, par5 - 1, Block.vine.blockID, 1);
										}

										if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3, par4 + var11, par5 + 1))
										{
											this.setBlockAndMetadata(par1World, par3, par4 + var11, par5 + 1, Block.vine.blockID, 4);
										}
									}
								}
							}

							if (this.vinesGrow)
							{
								for (var11 = par4 - 3 + var6; var11 <= par4 + var6; ++var11)
								{
									var12 = var11 - (par4 + var6);
									var13 = 2 - var12 / 2;

									for (var14 = par3 - var13; var14 <= par3 + var13; ++var14)
									{
										for (var15 = par5 - var13; var15 <= par5 + var13; ++var15)
										{
											if (par1World.getBlockId(var14, var11, var15) == ModBlocks.ReinforcedStone.blockID)
											{
												if (par2Random.nextInt(4) == 0 && par1World.getBlockId(var14 - 1, var11, var15) == 0)
												{
													this.growVines(par1World, var14 - 1, var11, var15, 8);
												}

												if (par2Random.nextInt(4) == 0 && par1World.getBlockId(var14 + 1, var11, var15) == 0)
												{
													this.growVines(par1World, var14 + 1, var11, var15, 2);
												}

												if (par2Random.nextInt(4) == 0 && par1World.getBlockId(var14, var11, var15 - 1) == 0)
												{
													this.growVines(par1World, var14, var11, var15 - 1, 1);
												}

												if (par2Random.nextInt(4) == 0 && par1World.getBlockId(var14, var11, var15 + 1) == 0)
												{
													this.growVines(par1World, var14, var11, var15 + 1, 4);
												}
											}
										}
									}
								}

								if (par2Random.nextInt(5) == 0 && var6 > 5)
								{
									for (var11 = 0; var11 < 2; ++var11)
									{
										for (var12 = 0; var12 < 4; ++var12)
										{
											if (par2Random.nextInt(4 - var11) == 0)
											{
												var13 = par2Random.nextInt(3);
												this.setBlockAndMetadata(par1World, par3 + Direction.offsetX[Direction.rotateOpposite[var12]], par4 + var6 - 5 + var11, par5 + Direction.offsetZ[Direction.rotateOpposite[var12]], Block.blockDiamond.blockID, var13 << 2 | var12);
											}
										}
									}
								}
							}

							return true;
						}
						else
						{
							return false;
						}
					}
				}
				else
				{
					return false;
				}
			}

			/**
			 * Grows vines downward from the given block for a given length. Args: World, x, starty, z, vine-length
			 */
			 private void growVines(World par1World, int par2, int par3, int par4, int par5)
			{
				this.setBlockAndMetadata(par1World, par2, par3, par4, Block.vine.blockID, par5);
				int var6 = 4;

				while (true)
				{
					--par3;

					if (par1World.getBlockId(par2, par3, par4) != 0 || var6 <= 0)
					{
						return;
					}

					this.setBlockAndMetadata(par1World, par2, par3, par4, Block.vine.blockID, par5);
					--var6;
				}
			}
		}

		//70 - visina
		//true - true/false za vin
		//Block.vine - block za vine
		//Block.tilledField - block za cez les
		//Block.bookShelf - block za listje
		//Block.blockDiamond - block za coce

	}

}
