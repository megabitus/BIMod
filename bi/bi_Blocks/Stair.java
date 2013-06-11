package bi.bi_Blocks;

import bi.bi_BasePackage.BaseClass;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class Stair extends BlockStairs{

	protected Stair(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		this.setCreativeTab(BaseClass.BITab);
	}
	
}