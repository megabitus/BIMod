package bi.bi_Helper;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemGlowNuggetChestRender implements IItemRenderer {
private ModelChest chestModel;
	
	public ItemGlowNuggetChestRender(){
		chestModel = new ModelChest();
		
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityGlowNuggetChest(), 0.0D, 0.0D, 0.0D, 0.0F);

	}

}
