package bi.bi_Entitys;


import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bi.bi_Items.ModItems;
import bi.bi_Sounds.Sounds;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingData;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityOana extends EntityMob
{

	public EntityOana(World par1World) 
	{
		super(par1World);
		this.getNavigator().setBreakDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
		this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 1.0D, false));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
		
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));

	}
	//	@SideOnly(Side.CLIENT)
	//	public void  Dode(){
	//		if(!Minecraft.getMinecraft().thePlayer.username.equals("megabitus")){
	//			this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	//			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	//			this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	//		}
	//		return;
	//	}
	public int getAttackStrength(Entity par1Entity) { return 6; }

	protected boolean isAIEnabled()
	{
		return true;
	}

	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEAD;
	}
	public int getTotalArmorValue()
	{
		return 20;
	}

	public void onLivingUpdate()
	{
		if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
		{
			float var1 = this.getBrightness(1.0F);

			if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
			{
				this.setFire(8);
			}
		}

		super.onLivingUpdate();
	}

	//	protected String getLivingSound()
	//	{
	//		return "mob.zombie.say";
	//	}
	@SideOnly(Side.CLIENT)
	@Override
	protected String getHurtSound()
	{
		return Sounds.Oana_Hit.play(posX, posY, posZ, 1, 2);
	}
	@SideOnly(Side.CLIENT)
	protected String getDeathSound()
	{
		return Sounds.Oana_Death.play(posX, posY, posZ, 1, 2);
	}

	//	protected void playStepSound(int par1, int par2, int par3, int par4)
	//	{
	//		this.worldObj.playSoundAtEntity(this, "mob.zombie.step", 0.15F, 1.0F);
	//	}
	protected int getDropItemId()
	{
		return ModItems.CrazyIngot.itemID;
	}

	protected void dropRareDrop(int par1)
	{
		switch (this.rand.nextInt(2))
		{
		case 0:
			this.dropItem(ModItems.CrazyIngot.itemID, 1);
			break;
		case 1:
			this.dropItem(ModItems.CrazyIngot.itemID, 1);
			break;
		case 2:
			this.dropItem(ModItems.Orange.getMetadata(3), 1);
			break;
		}
	}

	protected void dropFewItems(boolean par1, int par2)
	{
		if(this.rand.nextInt(3) == 0)
		{
			this.dropItem(ModItems.CrazyIngot.itemID, 1);
		}
	}

}