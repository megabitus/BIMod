package bi.bi_Items;

import bi.bi_BasePackage.BaseClass;
import bi.bi_BasePackage.ClientProxy;
import bi.bi_BasePackage.CommonProxy;
import bi.bi_Helper.BiIds;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;

public class ModItems {
	public static CommonProxy proxy;
	public static EnumArmorMaterial armorGlowNugget = EnumHelper.addArmorMaterial("NUGGET", 40, new int[]{9, 16, 12, 9}, 35);
	public static EnumToolMaterial GlowNuggetS = EnumHelper.addToolMaterial("GlowNugget", 3, 3126, 6F, 10, 25);
	public static EnumToolMaterial GlowNugget = EnumHelper.addToolMaterial("GlowNugget", 3, 3126, 6F, 1, 25);
	public static EnumToolMaterial CrazyS = EnumHelper.addToolMaterial("CrazyS", 3, 5126, 30F, 20, 25);
	public static EnumToolMaterial Crazy = EnumHelper.addToolMaterial("Crazy", 3, 5126, 30F, 2, 25);
	
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
	
	public static void init() {
		
		GlowstoneNugget = new ItemNugget(BiIds.GlowstoneNuggetID).setUnlocalizedName("GlowstoneNugget");
//		NuggetHelmet = new NuggetHelmet(BiIds.NuggetHelmetID, armorGlowNugget, ArmorGlowNugget, 0).setUnlocalizedName("NuggetHelmet").setCreativeTab(BaseClass.BITab);
//		NuggetChestPlate = new NuggetChestPlate(BiIds.NuggetChestPlateID, armorGlowNugget, ArmorGlowNugget, 1).setUnlocalizedName("NuggetChestPlate").setCreativeTab(BaseClass.BITab);
//		NuggetLeggings = new NuggetLeggings(BiIds.NuggetLeggingsID, armorGlowNugget ,ArmorGlowNugget, 2).setUnlocalizedName("NuggetLeggings").setCreativeTab(BaseClass.BITab);
//		NuggetBoots = new NuggetBoots(BiIds.NuggetBootsID, armorGlowNugget, ArmorGlowNugget, 3).setUnlocalizedName("NuggetBoots").setCreativeTab(BaseClass.BITab);
		NuggetSword = new NuggetSword(BiIds.NuggetSwordID, GlowNuggetS).setUnlocalizedName("NuggetSword");
		NuggetPickaxe = new NuggetPickaxe(BiIds.NuggetPickaxeID, GlowNugget).setUnlocalizedName("NuggetPickaxe");
		NuggetShovel = new NuggetShovel(BiIds.NuggetShovelID, GlowNugget).setUnlocalizedName("NuggetShovel");
		NuggetAxe = new NuggetAxe(BiIds.NuggetAxeID, GlowNugget).setUnlocalizedName("NuggetAxe");
		InfusedCoal = new InfusedCoal(BiIds.InfusedCoalID).setUnlocalizedName("InfusedCoal");
		Flour = new ItemFlour(BiIds.FlourID).setUnlocalizedName("Flour");
		Turky = new ItemTurky(BiIds.TurkyID, 10, true).setAlwaysEdible().setUnlocalizedName("Turky");
		BeaconLaser = new BeaconLaser(BiIds.BeaconLaserID).setUnlocalizedName("BeaconLaser");
		LaserMunition = new LaserMunition(BiIds.LaserMunitionID).setUnlocalizedName("LaserMunition");
		NuggetRawDust = new NuggetRawDust(BiIds.NuggetRawDustID).setUnlocalizedName("NuggetRawDust");
		NuggetDust = new NuggetDust(BiIds.NuggetDustID).setUnlocalizedName("NuggetDust");
		CrazyIngot = new CrazyIngot(BiIds.CrazyIngotID).setUnlocalizedName("CrazyIngot");
		CrazyBar = new CrazyBar(BiIds.CrazyBarID).setUnlocalizedName("CrazyBar");
		CrazySword = new CrazySword(BiIds.CrazySwordID, CrazyS).setUnlocalizedName("CrazySword");
		CrazyPickaxe = new CrazyPickaxe(BiIds.CrazyPickaxeID, Crazy).setUnlocalizedName("CrazyPickaxe");
		CrazyShovel = new CrazyShovel(BiIds.CrazyShovelID, Crazy).setUnlocalizedName("CrazyShovel");
		CrazyAxe = new CrazyAxe(BiIds.CrazyAxeID, Crazy).setUnlocalizedName("CrazyAxe");
		
	}

}
