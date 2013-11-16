package bi.bi_Sounds;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public enum Sounds {
	Oana_Death("oanadeath"),
	Oana_Hit("oanahit"),
	Magic_Grow("magicgrowsound"),
	Magic_Wand("magicwand");
	
	public static final String SOUNDS_LOCATION = "minecraft";
	private String name;
	Sounds(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String play(double x,double y,double z,float volume,float pitch){
		Minecraft.getMinecraft().sndManager.playSound(SOUNDS_LOCATION + ":" + name, (float)x, (float)y, (float)z, volume, pitch);
		return name;
	}
}
