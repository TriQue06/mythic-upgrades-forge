package net.trique.mythicupgrades.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MythicTiers {
    public static final ForgeTier SAPPHIRE = new ForgeTier(4, 2031, 9.0f,
            5.0f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(MythicItems.SAPPHIRE_INGOT.get()));
    public static final ForgeTier RUBY = new ForgeTier(4, 2031, 13.0f,
            4.0f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(MythicItems.RUBY_INGOT.get()));
    public static final ForgeTier TOPAZ = new ForgeTier(4, 4062, 9.0f,
            4.0f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(MythicItems.TOPAZ_INGOT.get()));

}