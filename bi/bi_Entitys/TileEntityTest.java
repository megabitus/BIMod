package bi.bi_Entitys;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;

public class TileEntityTest extends TileEntity{
	@Override
	public void updateEntity() {
		if(worldObj.getClosestPlayer(xCoord, yCoord, zCoord, 2) != null){
//			if(Minecraft.getMinecraft().thePlayer.username.equals("dode513")){
//			}else{
				worldObj.createExplosion(null, xCoord, yCoord, zCoord, 2F, true);
			}
		}
//	}

}
