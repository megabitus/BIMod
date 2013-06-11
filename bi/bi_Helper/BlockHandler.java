package bi.bi_Helper;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class BlockHandler implements ISimpleBlockRenderingHandler
{
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
	{
		// Your rendering code

	}

	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
	{
		// Your renderring code
		return false;
	}

	public boolean shouldRender3DInInventory()
	{
		// This is where it asks if you want the renderInventory part called or not.
		return false; // Change to 'true' if you want the Inventory render to be called.
	}

	public int getRenderId()
	{
		return 1;

	}
}