package bi.bi_Renders;

import bi.bi_Entitys.EntityOana;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderOana extends RenderLiving
{
    private static final ResourceLocation field_110871_a = new ResourceLocation("textures/entity/B&I/Oana.png");

    /** Scale of the model to use */
    private float scale;

    public RenderOana(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
    }

    /**
     * Applies the scale to the transform matrix
     */
    protected void preRenderScale(EntityOana par1EntityOana, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    protected ResourceLocation func_110870_a(EntityOana par1EntityOana)
    {
        return field_110871_a;
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderScale((EntityOana)par1EntityLivingBase, par2);
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110870_a((EntityOana)par1Entity);
    }
}
