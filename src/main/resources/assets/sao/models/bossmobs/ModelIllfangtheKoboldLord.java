// Date: 7/21/2014 6:49:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package assets.sao.models.bossmobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIllfangtheKoboldLord extends ModelBase
{
  //fields
    ModelRenderer Main_body;
    ModelRenderer body_out;
    ModelRenderer body_top;
    ModelRenderer Left_leg_top;
    ModelRenderer right_leg_top;
    ModelRenderer left_leg_bottom;
    ModelRenderer right_leg_bottom;
    ModelRenderer left_foot;
    ModelRenderer right_foot;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer jaw_bottom;
    ModelRenderer jaw_top;
    ModelRenderer head_front;
    ModelRenderer left_arm_top;
    ModelRenderer left_arm_mid;
    ModelRenderer left_arm_bottom;
    ModelRenderer left_ear;
    ModelRenderer right_ear;
    ModelRenderer right_arm_top;
    ModelRenderer right_arm_mid;
    ModelRenderer right_arm_bottom;
    ModelRenderer left_hand;
    ModelRenderer right_hand;
    ModelRenderer left_finger_one;
    ModelRenderer left_finger_two;
    ModelRenderer left_finger_three;
    ModelRenderer left_thumb;
    ModelRenderer left_thumb_two;
    ModelRenderer right_finger_1;
    ModelRenderer right_finger_2;
    ModelRenderer right_finger_3;
    ModelRenderer right_thumb;
    ModelRenderer right_thumb_2;
    ModelRenderer tail_one;
    ModelRenderer tail_two;
    ModelRenderer sheild_main;
    ModelRenderer sheild_out;
    ModelRenderer shield_out_2;
    ModelRenderer shield_out_3;
    ModelRenderer axe_pole;
    ModelRenderer axe_dot_1;
    ModelRenderer axe_dot_2;
    ModelRenderer axe_dot_3;
    ModelRenderer axe_dot_4;
    ModelRenderer axe_dot_5;
    ModelRenderer axe_blade_main;
    ModelRenderer axe_blade_1;
    ModelRenderer axe_blade_2;
    ModelRenderer sword_hilt;
    ModelRenderer sword_main;
    ModelRenderer sword_blade;
    ModelRenderer sword;
  
  public ModelIllfangtheKoboldLord()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Main_body = new ModelRenderer(this, 0, 0);
      Main_body.addBox(0F, 0F, 0F, 32, 32, 16);
      Main_body.setRotationPoint(0F, -44F, 0F);
      Main_body.setTextureSize(64, 32);
      Main_body.mirror = true;
      setRotation(Main_body, 0F, 0F, 0F);
      body_out = new ModelRenderer(this, 0, 0);
      body_out.addBox(0F, 0F, 0F, 20, 13, 3);
      body_out.setRotationPoint(6F, -30F, -2F);
      body_out.setTextureSize(64, 32);
      body_out.mirror = true;
      setRotation(body_out, 0F, 0F, 0F);
      body_top = new ModelRenderer(this, 0, 0);
      body_top.addBox(0F, 0F, 0F, 25, 7, 11);
      body_top.setRotationPoint(3F, -49F, 2F);
      body_top.setTextureSize(64, 32);
      body_top.mirror = true;
      setRotation(body_top, 0F, 0F, 0F);
      Left_leg_top = new ModelRenderer(this, 0, 0);
      Left_leg_top.addBox(0F, 0F, 0F, 10, 16, 10);
      Left_leg_top.setRotationPoint(-3F, -16F, 5F);
      Left_leg_top.setTextureSize(64, 32);
      Left_leg_top.mirror = true;
      setRotation(Left_leg_top, -0.6237745F, 0.3346075F, 0F);
      right_leg_top = new ModelRenderer(this, 0, 0);
      right_leg_top.addBox(0F, 0F, 0F, 10, 16, 10);
      right_leg_top.setRotationPoint(25F, -16F, 2F);
      right_leg_top.setTextureSize(64, 32);
      right_leg_top.mirror = true;
      setRotation(right_leg_top, -0.6108652F, -0.3316126F, 0F);
      left_leg_bottom = new ModelRenderer(this, 0, 0);
      left_leg_bottom.addBox(0F, 0F, 0F, 6, 11, 5);
      left_leg_bottom.setRotationPoint(-3F, -1F, -3F);
      left_leg_bottom.setTextureSize(64, 32);
      left_leg_bottom.mirror = true;
      setRotation(left_leg_bottom, 0.2602503F, 0F, 0F);
      right_leg_bottom = new ModelRenderer(this, 0, 0);
      right_leg_bottom.addBox(0F, 0F, 0F, 6, 11, 5);
      right_leg_bottom.setRotationPoint(28F, 0F, -3F);
      right_leg_bottom.setTextureSize(64, 32);
      right_leg_bottom.mirror = true;
      setRotation(right_leg_bottom, 0.260246F, 0F, 0F);
      left_foot = new ModelRenderer(this, 0, 0);
      left_foot.addBox(0F, 0F, 0F, 4, 9, 1);
      left_foot.setRotationPoint(-2F, 8F, 0F);
      left_foot.setTextureSize(64, 32);
      left_foot.mirror = true;
      setRotation(left_foot, -0.7807508F, 0F, 0F);
      right_foot = new ModelRenderer(this, 0, 0);
      right_foot.addBox(0F, 0F, 0F, 4, 9, 1);
      right_foot.setRotationPoint(29F, 8F, 0F);
      right_foot.setTextureSize(64, 32);
      right_foot.mirror = true;
      setRotation(right_foot, -0.7755196F, 0F, 0F);
      neck = new ModelRenderer(this, 0, 0);
      neck.addBox(0F, 0F, 0F, 7, 4, 7);
      neck.setRotationPoint(12F, -52F, 5F);
      neck.setTextureSize(64, 32);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(0F, 0F, 0F, 5, 6, 7);
      head.setRotationPoint(13.26667F, -57F, 4F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      jaw_bottom = new ModelRenderer(this, 0, 0);
      jaw_bottom.addBox(0F, 0F, 0F, 3, 2, 7);
      jaw_bottom.setRotationPoint(14F, -51F, -1F);
      jaw_bottom.setTextureSize(64, 32);
      jaw_bottom.mirror = true;
      setRotation(jaw_bottom, 0.2974289F, 0F, 0F);
      jaw_top = new ModelRenderer(this, 0, 0);
      jaw_top.addBox(0F, 0F, 0F, 3, 1, 7);
      jaw_top.setRotationPoint(14F, -54F, -2F);
      jaw_top.setTextureSize(64, 32);
      jaw_top.mirror = true;
      setRotation(jaw_top, 0F, 0F, 0F);
      head_front = new ModelRenderer(this, 0, 0);
      head_front.addBox(0F, 0F, 0F, 3, 1, 4);
      head_front.setRotationPoint(14F, -55F, 1F);
      head_front.setTextureSize(64, 32);
      head_front.mirror = true;
      setRotation(head_front, 0F, 0F, 0F);
      left_arm_top = new ModelRenderer(this, 0, 0);
      left_arm_top.addBox(0F, 0F, 0F, 6, 13, 6);
      left_arm_top.setRotationPoint(1F, -45F, 4F);
      left_arm_top.setTextureSize(64, 32);
      left_arm_top.mirror = true;
      setRotation(left_arm_top, 0F, 0F, 1.115358F);
      left_arm_mid = new ModelRenderer(this, 0, 0);
      left_arm_mid.addBox(0F, 0F, 0F, 4, 11, 5);
      left_arm_mid.setRotationPoint(-10F, -39F, 4F);
      left_arm_mid.setTextureSize(64, 32);
      left_arm_mid.mirror = true;
      setRotation(left_arm_mid, 0F, 0F, 0.4461433F);
      left_arm_bottom = new ModelRenderer(this, 0, 0);
      left_arm_bottom.addBox(0F, 0F, 0F, 3, 9, 3);
      left_arm_bottom.setRotationPoint(-14F, -30F, 5F);
      left_arm_bottom.setTextureSize(64, 32);
      left_arm_bottom.mirror = true;
      setRotation(left_arm_bottom, -0.3717861F, 0F, 0F);
      left_ear = new ModelRenderer(this, 0, 0);
      left_ear.addBox(0F, 0F, 0F, 1, 4, 1);
      left_ear.setRotationPoint(13F, -56F, 10F);
      left_ear.setTextureSize(64, 32);
      left_ear.mirror = true;
      setRotation(left_ear, 3.141593F, 0F, -0.6320364F);
      right_ear = new ModelRenderer(this, 0, 0);
      right_ear.addBox(0F, 0F, 0F, 1, 4, 1);
      right_ear.setRotationPoint(18F, -56F, 9F);
      right_ear.setTextureSize(64, 32);
      right_ear.mirror = true;
      setRotation(right_ear, -3.141593F, -3.141593F, -0.6320364F);
      right_arm_top = new ModelRenderer(this, 0, 0);
      right_arm_top.addBox(0F, 0F, 0F, 6, 13, 6);
      right_arm_top.setRotationPoint(29F, -40F, 4F);
      right_arm_top.setTextureSize(64, 32);
      right_arm_top.mirror = true;
      setRotation(right_arm_top, 0F, 0F, -1.003817F);
      right_arm_mid = new ModelRenderer(this, 0, 0);
      right_arm_mid.addBox(0F, 0F, 0F, 4, 11, 5);
      right_arm_mid.setRotationPoint(38F, -36F, 4F);
      right_arm_mid.setTextureSize(64, 32);
      right_arm_mid.mirror = true;
      setRotation(right_arm_mid, 0F, 0F, -0.4461411F);
      right_arm_bottom = new ModelRenderer(this, 0, 0);
      right_arm_bottom.addBox(0F, 0F, 0F, 3, 9, 3);
      right_arm_bottom.setRotationPoint(42F, -28F, 4F);
      right_arm_bottom.setTextureSize(64, 32);
      right_arm_bottom.mirror = true;
      setRotation(right_arm_bottom, -0.37179F, 0F, 0F);
      left_hand = new ModelRenderer(this, 0, 0);
      left_hand.addBox(0F, 0F, 0F, 1, 4, 4);
      left_hand.setRotationPoint(-14F, -22F, 1F);
      left_hand.setTextureSize(64, 32);
      left_hand.mirror = true;
      setRotation(left_hand, 0F, 0F, 0F);
      right_hand = new ModelRenderer(this, 0, 0);
      right_hand.addBox(0F, 0F, 0F, 1, 4, 4);
      right_hand.setRotationPoint(44F, -20F, 0F);
      right_hand.setTextureSize(64, 32);
      right_hand.mirror = true;
      setRotation(right_hand, 0F, 0F, 0F);
      left_finger_one = new ModelRenderer(this, 0, 0);
      left_finger_one.addBox(0F, 0F, 0F, 1, 1, 3);
      left_finger_one.setRotationPoint(-14F, -22F, -2F);
      left_finger_one.setTextureSize(64, 32);
      left_finger_one.mirror = true;
      setRotation(left_finger_one, 0F, 0F, 0F);
      left_finger_two = new ModelRenderer(this, 0, 0);
      left_finger_two.addBox(0F, 0F, 0F, 1, 1, 3);
      left_finger_two.setRotationPoint(-14F, -20F, -2F);
      left_finger_two.setTextureSize(64, 32);
      left_finger_two.mirror = true;
      setRotation(left_finger_two, 0F, 0F, 0F);
      left_finger_three = new ModelRenderer(this, 0, 0);
      left_finger_three.addBox(0F, 0F, 0F, 1, 1, 4);
      left_finger_three.setRotationPoint(-14F, -18F, -2F);
      left_finger_three.setTextureSize(64, 32);
      left_finger_three.mirror = true;
      setRotation(left_finger_three, 0F, 0F, 0F);
      left_thumb = new ModelRenderer(this, 0, 0);
      left_thumb.addBox(0F, 0F, 0F, 3, 1, 1);
      left_thumb.setRotationPoint(-14F, -19F, 2F);
      left_thumb.setTextureSize(64, 32);
      left_thumb.mirror = true;
      setRotation(left_thumb, 0F, 0F, 0F);
      left_thumb_two = new ModelRenderer(this, 0, 0);
      left_thumb_two.addBox(0F, 0F, 0F, 1, 1, 4);
      left_thumb_two.setRotationPoint(-11F, -19F, -1F);
      left_thumb_two.setTextureSize(64, 32);
      left_thumb_two.mirror = true;
      setRotation(left_thumb_two, 0F, 0F, 0F);
      right_finger_1 = new ModelRenderer(this, 0, 0);
      right_finger_1.addBox(0F, 0F, 0F, 1, 1, 3);
      right_finger_1.setRotationPoint(44F, -20F, -3F);
      right_finger_1.setTextureSize(64, 32);
      right_finger_1.mirror = true;
      setRotation(right_finger_1, 0F, 0F, 0F);
      right_finger_2 = new ModelRenderer(this, 0, 0);
      right_finger_2.addBox(0F, 0F, 0F, 1, 1, 3);
      right_finger_2.setRotationPoint(44F, -18F, -3F);
      right_finger_2.setTextureSize(64, 32);
      right_finger_2.mirror = true;
      setRotation(right_finger_2, 0F, 0F, 0F);
      right_finger_3 = new ModelRenderer(this, 0, 0);
      right_finger_3.addBox(0F, 0F, 0F, 1, 1, 4);
      right_finger_3.setRotationPoint(44F, -16F, -3F);
      right_finger_3.setTextureSize(64, 32);
      right_finger_3.mirror = true;
      setRotation(right_finger_3, 0F, 0F, 0F);
      right_thumb = new ModelRenderer(this, 0, 0);
      right_thumb.addBox(0F, 0F, 0F, 2, 1, 1);
      right_thumb.setRotationPoint(42F, -17F, 1F);
      right_thumb.setTextureSize(64, 32);
      right_thumb.mirror = true;
      setRotation(right_thumb, 0F, 0F, 0F);
      right_thumb_2 = new ModelRenderer(this, 0, 0);
      right_thumb_2.addBox(0F, 0F, 0F, 1, 1, 4);
      right_thumb_2.setRotationPoint(41F, -17F, -2F);
      right_thumb_2.setTextureSize(64, 32);
      right_thumb_2.mirror = true;
      setRotation(right_thumb_2, 0F, 0F, 0F);
      tail_one = new ModelRenderer(this, 0, 0);
      tail_one.addBox(0F, 0F, 0F, 6, 4, 20);
      tail_one.setRotationPoint(13F, -19F, 15.53333F);
      tail_one.setTextureSize(64, 32);
      tail_one.mirror = true;
      setRotation(tail_one, 0.2230717F, 0.3346075F, 0F);
      tail_two = new ModelRenderer(this, 0, 0);
      tail_two.addBox(0F, 0F, 0F, 3, 2, 19);
      tail_two.setRotationPoint(21F, -22F, 32F);
      tail_two.setTextureSize(64, 32);
      tail_two.mirror = true;
      setRotation(tail_two, 0.7435722F, 0F, 0F);
      sheild_main = new ModelRenderer(this, 0, 0);
      sheild_main.addBox(0F, 0F, 0F, 2, 12, 12);
      sheild_main.setRotationPoint(45F, -31F, -1F);
      sheild_main.setTextureSize(64, 32);
      sheild_main.mirror = true;
      setRotation(sheild_main, 0F, 0F, 0F);
      sheild_out = new ModelRenderer(this, 0, 0);
      sheild_out.addBox(0F, 0F, 0F, 1, 16, 4);
      sheild_out.setRotationPoint(45F, -33F, 3F);
      sheild_out.setTextureSize(64, 32);
      sheild_out.mirror = true;
      setRotation(sheild_out, 0F, 0F, 0F);
      shield_out_2 = new ModelRenderer(this, 0, 0);
      shield_out_2.addBox(0F, 0F, 0F, 1, 4, 16);
      shield_out_2.setRotationPoint(45F, -27F, -3F);
      shield_out_2.setTextureSize(64, 32);
      shield_out_2.mirror = true;
      setRotation(shield_out_2, 0F, 0F, 0F);
      shield_out_3 = new ModelRenderer(this, 0, 0);
      shield_out_3.addBox(0F, 0F, 0F, 2, 8, 8);
      shield_out_3.setRotationPoint(46F, -29F, 1F);
      shield_out_3.setTextureSize(64, 32);
      shield_out_3.mirror = true;
      setRotation(shield_out_3, 0F, 0F, 0F);
      axe_pole = new ModelRenderer(this, 0, 0);
      axe_pole.addBox(0F, 0F, 0F, 1, 39, 1);
      axe_pole.setRotationPoint(-13F, -55F, 0F);
      axe_pole.setTextureSize(64, 32);
      axe_pole.mirror = true;
      setRotation(axe_pole, 0F, 0F, 0F);
      axe_dot_1 = new ModelRenderer(this, 0, 0);
      axe_dot_1.addBox(0F, 0F, 0F, 3, 2, 3);
      axe_dot_1.setRotationPoint(-14F, -31F, -1F);
      axe_dot_1.setTextureSize(64, 32);
      axe_dot_1.mirror = true;
      setRotation(axe_dot_1, 0F, 0F, 0F);
      axe_dot_2 = new ModelRenderer(this, 0, 0);
      axe_dot_2.addBox(0F, 0F, 0F, 3, 2, 3);
      axe_dot_2.setRotationPoint(-14F, -38F, -1F);
      axe_dot_2.setTextureSize(64, 32);
      axe_dot_2.mirror = true;
      setRotation(axe_dot_2, 0F, 0F, 0F);
      axe_dot_3 = new ModelRenderer(this, 0, 0);
      axe_dot_3.addBox(0F, 0F, 0F, 3, 2, 3);
      axe_dot_3.setRotationPoint(-14F, -42F, -1F);
      axe_dot_3.setTextureSize(64, 32);
      axe_dot_3.mirror = true;
      setRotation(axe_dot_3, 0F, 0F, 0F);
      axe_dot_4 = new ModelRenderer(this, 0, 0);
      axe_dot_4.addBox(0F, 0F, 0F, 3, 2, 3);
      axe_dot_4.setRotationPoint(-14F, -50F, -1F);
      axe_dot_4.setTextureSize(64, 32);
      axe_dot_4.mirror = true;
      setRotation(axe_dot_4, 0F, 0F, 0F);
      axe_dot_5 = new ModelRenderer(this, 0, 0);
      axe_dot_5.addBox(0F, 0F, 0F, 3, 1, 3);
      axe_dot_5.setRotationPoint(-14F, -55F, -1F);
      axe_dot_5.setTextureSize(64, 32);
      axe_dot_5.mirror = true;
      setRotation(axe_dot_5, 0F, 0F, 0F);
      axe_blade_main = new ModelRenderer(this, 0, 0);
      axe_blade_main.addBox(0F, 0F, 0F, 1, 8, 11);
      axe_blade_main.setRotationPoint(-13F, -49F, -12F);
      axe_blade_main.setTextureSize(64, 32);
      axe_blade_main.mirror = true;
      setRotation(axe_blade_main, 0F, 0F, 0F);
      axe_blade_1 = new ModelRenderer(this, 0, 0);
      axe_blade_1.addBox(0F, 0F, 0F, 1, 9, 6);
      axe_blade_1.setRotationPoint(-13F, -56F, -9F);
      axe_blade_1.setTextureSize(64, 32);
      axe_blade_1.mirror = true;
      setRotation(axe_blade_1, -0.2974289F, 0F, 0F);
      axe_blade_2 = new ModelRenderer(this, 0, 0);
      axe_blade_2.addBox(0F, 0F, 0F, 1, 7, 6);
      axe_blade_2.setRotationPoint(-13F, -42F, -12F);
      axe_blade_2.setTextureSize(64, 32);
      axe_blade_2.mirror = true;
      setRotation(axe_blade_2, 0.4833219F, 0F, 0F);
      sword_hilt = new ModelRenderer(this, 0, 0);
      sword_hilt.addBox(0F, 0F, 0F, 6, 1, 1);
      sword_hilt.setRotationPoint(29F, -25F, 16F);
      sword_hilt.setTextureSize(64, 32);
      sword_hilt.mirror = true;
      setRotation(sword_hilt, 0F, 0F, 0F);
      sword_main = new ModelRenderer(this, 0, 0);
      sword_main.addBox(0F, 0F, 0F, 29, 2, 1);
      sword_main.setRotationPoint(0F, -26F, 16F);
      sword_main.setTextureSize(64, 32);
      sword_main.mirror = true;
      setRotation(sword_main, 0F, 0F, 0F);
      sword_blade = new ModelRenderer(this, 0, 0);
      sword_blade.addBox(0F, 0F, 0F, 34, 1, 1);
      sword_blade.setRotationPoint(-4F, -29F, 16F);
      sword_blade.setTextureSize(64, 32);
      sword_blade.mirror = true;
      setRotation(sword_blade, 0F, 0F, 0.1138079F);
      sword = new ModelRenderer(this, 0, 0);
      sword.addBox(0F, 0F, 0F, 18, 1, 1);
      sword.setRotationPoint(-1F, -28F, 16F);
      sword.setTextureSize(64, 32);
      sword.mirror = true;
      setRotation(sword, 0F, 0F, 0.1115358F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Main_body.render(f5);
    body_out.render(f5);
    body_top.render(f5);
    Left_leg_top.render(f5);
    right_leg_top.render(f5);
    left_leg_bottom.render(f5);
    right_leg_bottom.render(f5);
    left_foot.render(f5);
    right_foot.render(f5);
    neck.render(f5);
    head.render(f5);
    jaw_bottom.render(f5);
    jaw_top.render(f5);
    head_front.render(f5);
    left_arm_top.render(f5);
    left_arm_mid.render(f5);
    left_arm_bottom.render(f5);
    left_ear.render(f5);
    right_ear.render(f5);
    right_arm_top.render(f5);
    right_arm_mid.render(f5);
    right_arm_bottom.render(f5);
    left_hand.render(f5);
    right_hand.render(f5);
    left_finger_one.render(f5);
    left_finger_two.render(f5);
    left_finger_three.render(f5);
    left_thumb.render(f5);
    left_thumb_two.render(f5);
    right_finger_1.render(f5);
    right_finger_2.render(f5);
    right_finger_3.render(f5);
    right_thumb.render(f5);
    right_thumb_2.render(f5);
    tail_one.render(f5);
    tail_two.render(f5);
    sheild_main.render(f5);
    sheild_out.render(f5);
    shield_out_2.render(f5);
    shield_out_3.render(f5);
    axe_pole.render(f5);
    axe_dot_1.render(f5);
    axe_dot_2.render(f5);
    axe_dot_3.render(f5);
    axe_dot_4.render(f5);
    axe_dot_5.render(f5);
    axe_blade_main.render(f5);
    axe_blade_1.render(f5);
    axe_blade_2.render(f5);
    sword_hilt.render(f5);
    sword_main.render(f5);
    sword_blade.render(f5);
    sword.render(f5);
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
