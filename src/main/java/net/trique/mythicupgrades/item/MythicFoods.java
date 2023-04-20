package net.trique.mythicupgrades.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class MythicFoods {

    public static final FoodProperties SAPPHIRE_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).
            effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400), 1F).
            effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 1), 1F).
            alwaysEat().build();

    public static final FoodProperties RUBY_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).
            effect(new MobEffectInstance(MobEffects.DIG_SPEED, 4800, 1), 1F).
            alwaysEat().build();

    public static final FoodProperties JADE_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).
            effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1), 1F).
            effect(new MobEffectInstance(MobEffects.HEAL, 1, 1), 1F).
            alwaysEat().build();

    public static final FoodProperties TOPAZ_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).
            effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 2), 1F).
            effect(new MobEffectInstance(MobEffects.GLOWING, 1200), 1F).
            alwaysEat().build();
}
