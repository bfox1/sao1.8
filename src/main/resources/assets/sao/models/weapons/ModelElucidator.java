// Date: 7/23/2014 2:16:33 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package assets.sao.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelElucidator extends ModelBase
{
  //fields
    ModelRenderer main_blade;
    ModelRenderer tip_1;
    ModelRenderer tip_2;
    ModelRenderer point_1;
    ModelRenderer point_2;
    ModelRenderer point_3;
    ModelRenderer hilt_1;
    ModelRenderer hilt_2;
    ModelRenderer hilt_3;
    ModelRenderer hilt_4;
    ModelRenderer hilt_point_1;
    ModelRenderer hilt_point_2;
    ModelRenderer hilt_handle_1;
    ModelRenderer hilt_handle_2;
    ModelRenderer h_h_point_1;
    ModelRenderer hilt_main;
    ModelRenderer budle;
    ModelRenderer budle_2;
    ModelRenderer budle_3;
    ModelRenderer budle_4;
    ModelRenderer budle_5;
  
  public ModelElucidator()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      main_blade = new ModelRenderer(this, 16, 29);
      main_blade.addBox(0F, 0F, 0F, 22, 1, 2);
      main_blade.setRotationPoint(0F, 0F, 0F);
      main_blade.setTextureSize(64, 32);
      main_blade.mirror = true;
      setRotation(main_blade, 0F, 0F, 0F);
      tip_1 = new ModelRenderer(this, 60, 26);
      tip_1.addBox(0F, 0F, 0F, 1, 1, 1);
      tip_1.setRotationPoint(21.4F, 0F, 0.2F);
      tip_1.setTextureSize(64, 32);
      tip_1.mirror = true;
      setRotation(tip_1, 0F, 0F, 0F);
      tip_2 = new ModelRenderer(this, 60, 23);
      tip_2.addBox(0F, 0F, 0F, 1, 1, 1);
      tip_2.setRotationPoint(21.4F, 0F, 0.8F);
      tip_2.setTextureSize(64, 32);
      tip_2.mirror = true;
      setRotation(tip_2, 0F, 0F, 0F);
      point_1 = new ModelRenderer(this, 55, 26);
      point_1.addBox(0F, 0F, 0F, 1, 1, 1);
      point_1.setRotationPoint(21.5F, 0F, 0.9F);
      point_1.setTextureSize(64, 32);
      point_1.mirror = true;
      setRotation(point_1, 0F, 1.152537F, 0F);
      point_2 = new ModelRenderer(this, 50, 26);
      point_2.addBox(0F, 0F, 0F, 1, 1, 1);
      point_2.setRotationPoint(22.5F, 0F, 0.7F);
      point_2.setTextureSize(64, 32);
      point_2.mirror = true;
      setRotation(point_2, 0F, -1.115356F, 0F);
      point_3 = new ModelRenderer(this, 55, 23);
      point_3.addBox(0F, 0F, 0F, 1, 1, 1);
      point_3.setRotationPoint(22F, 0F, 1.1F);
      point_3.setTextureSize(64, 32);
      point_3.mirror = true;
      setRotation(point_3, 0F, 0.8726646F, 0F);
      hilt_1 = new ModelRenderer(this, 58, 0);
      hilt_1.addBox(0F, 0F, 0F, 1, 1, 2);
      hilt_1.setRotationPoint(-0.9F, 0F, -0.5F);
      hilt_1.setTextureSize(64, 32);
      hilt_1.mirror = true;
      setRotation(hilt_1, 0F, 0.6320364F, 0F);
      hilt_2 = new ModelRenderer(this, 51, 0);
      hilt_2.addBox(0F, 0F, 0F, 1, 1, 2);
      hilt_2.setRotationPoint(-2F, 0F, -1F);
      hilt_2.setTextureSize(64, 32);
      hilt_2.mirror = true;
      setRotation(hilt_2, 0F, 1.07818F, 0F);
      hilt_3 = new ModelRenderer(this, 46, 0);
      hilt_3.addBox(0F, 0F, 0F, 1, 1, 1);
      hilt_3.setRotationPoint(-2.5F, 0F, -1.7F);
      hilt_3.setTextureSize(64, 32);
      hilt_3.mirror = true;
      setRotation(hilt_3, 0F, 0F, 0F);
      hilt_4 = new ModelRenderer(this, 56, 4);
      hilt_4.addBox(0F, 0F, 0F, 1, 1, 3);
      hilt_4.setRotationPoint(0F, 0F, 1F);
      hilt_4.setTextureSize(64, 32);
      hilt_4.mirror = true;
      setRotation(hilt_4, 0F, -0.7435722F, 0F);
      hilt_point_1 = new ModelRenderer(this, 41, 0);
      hilt_point_1.addBox(0F, 0F, 0F, 1, 1, 1);
      hilt_point_1.setRotationPoint(-1F, 0F, -1F);
      hilt_point_1.setTextureSize(64, 32);
      hilt_point_1.mirror = true;
      setRotation(hilt_point_1, 0F, 1.784573F, 0F);
      hilt_point_2 = new ModelRenderer(this, 46, 3);
      hilt_point_2.addBox(0F, 0F, 0F, 1, 1, 1);
      hilt_point_2.setRotationPoint(-0.5F, 0F, 2F);
      hilt_point_2.setTextureSize(64, 32);
      hilt_point_2.mirror = true;
      setRotation(hilt_point_2, 0F, -0.1115358F, 0F);
      hilt_handle_1 = new ModelRenderer(this, 0, 20);
      hilt_handle_1.addBox(0F, 0F, 0F, 1, 1, 5);
      hilt_handle_1.setRotationPoint(-3F, -0.3F, -3F);
      hilt_handle_1.setTextureSize(64, 32);
      hilt_handle_1.mirror = true;
      setRotation(hilt_handle_1, 0F, 0F, 0F);
      hilt_handle_2 = new ModelRenderer(this, 0, 17);
      hilt_handle_2.addBox(0F, 0F, 0F, 4, 1, 1);
      hilt_handle_2.setRotationPoint(-2F, -0.3F, 0.5F);
      hilt_handle_2.setTextureSize(64, 32);
      hilt_handle_2.mirror = true;
      setRotation(hilt_handle_2, 0F, 0F, 0F);
      h_h_point_1 = new ModelRenderer(this, 0, 14);
      h_h_point_1.addBox(0F, 0F, 0F, 1, 1, 1);
      h_h_point_1.setRotationPoint(1F, -0.3F, 1.1F);
      h_h_point_1.setTextureSize(64, 32);
      h_h_point_1.mirror = true;
      setRotation(h_h_point_1, 0F, 0.9294653F, 0F);
      hilt_main = new ModelRenderer(this, 0, 3);
      hilt_main.addBox(0F, 0F, 0F, 6, 1, 1);
      hilt_main.setRotationPoint(-9F, 0F, 0.3F);
      hilt_main.setTextureSize(64, 32);
      hilt_main.mirror = true;
      setRotation(hilt_main, 0.7435722F, 0F, 0F);
      budle = new ModelRenderer(this, 20, 0);
      budle.addBox(0F, 0F, 0F, 1, 1, 1);
      budle.setRotationPoint(-10F, -0.5F, 0.5F);
      budle.setTextureSize(64, 32);
      budle.mirror = true;
      setRotation(budle, 0F, 0F, 0F);
      budle_2 = new ModelRenderer(this, 15, 0);
      budle_2.addBox(0F, 0F, 0F, 1, 1, 1);
      budle_2.setRotationPoint(-9.5F, -0.3F, 0.3F);
      budle_2.setTextureSize(64, 32);
      budle_2.mirror = true;
      setRotation(budle_2, 0F, 0F, 0F);
      budle_3 = new ModelRenderer(this, 10, 0);
      budle_3.addBox(0F, 0F, 0F, 1, 1, 1);
      budle_3.setRotationPoint(-9.5F, -0.3F, 0.7F);
      budle_3.setTextureSize(64, 32);
      budle_3.mirror = true;
      setRotation(budle_3, 0F, 0F, 0F);
      budle_4 = new ModelRenderer(this, 5, 0);
      budle_4.addBox(0F, 0F, 0F, 1, 1, 1);
      budle_4.setRotationPoint(-9.5F, -0.7F, 0.3F);
      budle_4.setTextureSize(64, 32);
      budle_4.mirror = true;
      setRotation(budle_4, 0F, 0F, 0F);
      budle_5 = new ModelRenderer(this, 0, 0);
      budle_5.addBox(0F, 0F, 0F, 1, 1, 1);
      budle_5.setRotationPoint(-9.5F, -0.7F, 0.7F);
      budle_5.setTextureSize(64, 32);
      budle_5.mirror = true;
      setRotation(budle_5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    main_blade.render(f5);
    tip_1.render(f5);
    tip_2.render(f5);
    point_1.render(f5);
    point_2.render(f5);
    point_3.render(f5);
    hilt_1.render(f5);
    hilt_2.render(f5);
    hilt_3.render(f5);
    hilt_4.render(f5);
    hilt_point_1.render(f5);
    hilt_point_2.render(f5);
    hilt_handle_1.render(f5);
    hilt_handle_2.render(f5);
    h_h_point_1.render(f5);
    hilt_main.render(f5);
    budle.render(f5);
    budle_2.render(f5);
    budle_3.render(f5);
    budle_4.render(f5);
    budle_5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
