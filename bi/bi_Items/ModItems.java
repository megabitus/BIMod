package bi.bi_Items;

import bi.bi_BasePackage.BaseClass;
import bi.bi_BasePackage.ClientProxy;
import bi.bi_BasePackage.CommonProxy;
import bi.bi_Config.BiIds;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;

public class ModItems {
	public static CommonProxy proxy;
	public static EnumToolMaterial GlowNuggetS = EnumHelper.addToolMaterial("GlowNugget", 3, 1126, 6F, 10, 25);
	public static EnumToolMaterial GlowNugget = EnumHelper.addToolMaterial("GlowNugget", 3, 1126, 6F, 1, 25);
	public static EnumToolMaterial CrazyS = EnumHelper.addToolMaterial("CrazyS", 3, 3126, 30F, 20, 25);
	public static EnumToolMaterial Crazy = EnumHelper.addToolMaterial("Crazy", 3, 53126, 30F, 2, 25);
	
	public static Item NuggetHelmet;
	public static Item NuggetChestPlate;
	public static Item NuggetLeggings;
	public static Item NuggetBoots;
	public static Item NuggetSword;
	public static Item NuggetPickaxe;
	public static Item NuggetShovel;
	public static Item NuggetAxe;
	public static Item InfusedCoal;
	public static Item GlowstoneNugget;
	public static Item Flour;
	public static Item Turky;
	public static Item BeaconLaser;
	public static Item LaserMunition;
	public static Item NuggetRawDust;
	public static Item NuggetDust;
	public static Item CrazyIngot;
	public static Item CrazyBar;
	public static Item CrazySword;
	public static Item CrazyPickaxe;
	public static Item CrazyShovel;
	public static Item CrazyAxe;
	public static Item NetherFuel;
	public static Item GlowingStick;
	public static Item Banana;
	public static Item Orange;
	public static Item Test;
	
	public static void init() {
		
		GlowstoneNugget = new ItemNugget(BiIds.GlowstoneNuggetID);
		NuggetSword = new NuggetSword(BiIds.NuggetSwordID, GlowNuggetS);
		NuggetPickaxe = new NuggetPickaxe(BiIds.NuggetPickaxeID, GlowNugget);
		NuggetShovel = new NuggetShovel(BiIds.NuggetShovelID, GlowNugget);
		NuggetAxe = new NuggetAxe(BiIds.NuggetAxeID, GlowNugget);
		InfusedCoal = new InfusedCoal(BiIds.InfusedCoalID);
		Flour = new ItemFlour(BiIds.FlourID);
		Turky = new ItemTurky(BiIds.TurkyID, 10, true);
		BeaconLaser = new BeaconLaser(BiIds.BeaconLaserID);
		LaserMunition = new LaserMunition(BiIds.LaserMunitionID);
		NuggetRawDust = new NuggetRawDust(BiIds.NuggetRawDustID);
		NuggetDust = new NuggetDust(BiIds.NuggetDustID);
		CrazyIngot = new CrazyIngot(BiIds.CrazyIngotID);
		CrazyBar = new CrazyBar(BiIds.CrazyBarID);
		CrazySword = new CrazySword(BiIds.CrazySwordID, CrazyS);
		CrazyPickaxe = new CrazyPickaxe(BiIds.CrazyPickaxeID, Crazy);
		CrazyShovel = new CrazyShovel(BiIds.CrazyShovelID, Crazy);
		CrazyAxe = new CrazyAxe(BiIds.CrazyAxeID, Crazy);
		NetherFuel = new NetherFuel(BiIds.NetherFuelID);
		GlowingStick = new GlowingStick(BiIds.GlowingStickID);
		Banana = new Banana(BiIds.BananaID, 4, true);
		Orange = new Orange(BiIds.OrangeID, 2, true);
		Test = new Test(BiIds.TestID);
		
	}

}
