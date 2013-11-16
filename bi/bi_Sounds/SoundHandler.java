package bi.bi_Sounds;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SoundHandler {
	@ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
            for(Sounds sound : Sounds.values()){
            	addSound(event,sound);
            }
    }
	private void addSound(SoundLoadEvent event,Sounds sound){
		event.manager.addSound(Sounds.SOUNDS_LOCATION + ":" + sound.getName() + ".ogg");
	}
	
}