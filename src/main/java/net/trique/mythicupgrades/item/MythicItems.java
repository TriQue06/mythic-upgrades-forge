package net.trique.mythicupgrades.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.trique.mythicupgrades.MythicUpgrades;

public class MythicItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MythicUpgrades.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_INGOT = ITEMS.register("sapphire_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SAPPHIRE_APPLE = ITEMS.register("sapphire_apple",
            () -> new Item(new Item.Properties().food(MythicFoods.SAPPHIRE_APPLE)));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(MythicTiers.SAPPHIRE, 4, -2.4f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(MythicTiers.SAPPHIRE, 5.5f, -3f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(MythicTiers.SAPPHIRE, 1, -2.8f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(MythicTiers.SAPPHIRE, -3, 0f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(MythicTiers.SAPPHIRE, 1.5f, -3.0f,
                    new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_INGOT = ITEMS.register("ruby_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> RUBY_APPLE = ITEMS.register("ruby_apple",
            () -> new Item(new Item.Properties().food(MythicFoods.RUBY_APPLE)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(MythicTiers.RUBY, 3, -1.8f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(MythicTiers.RUBY, 5f, -2.4f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(MythicTiers.RUBY, 1, -2.2f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(MythicTiers.RUBY, -3, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(MythicTiers.RUBY, 1.5f, -2.2f,
                    new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_INGOT = ITEMS.register("jade_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> JADE_APPLE = ITEMS.register("jade_apple",
            () -> new Item(new Item.Properties().food(MythicFoods.JADE_APPLE)));

    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new ArmorItem(MythicArmorMaterials.JADE, EquipmentSlot.HEAD, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
            () -> new ArmorItem(MythicArmorMaterials.JADE, EquipmentSlot.CHEST, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> JADE_LEGGING = ITEMS.register("jade_leggings",
            () -> new ArmorItem(MythicArmorMaterials.JADE, EquipmentSlot.LEGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new ArmorItem(MythicArmorMaterials.JADE, EquipmentSlot.FEET, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_INGOT = ITEMS.register("topaz_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TOPAZ_APPLE = ITEMS.register("topaz_apple",
            () -> new Item(new Item.Properties().food(MythicFoods.TOPAZ_APPLE)));

    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new SwordItem(MythicTiers.TOPAZ, 3, -2.4f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe",
            () -> new AxeItem(MythicTiers.TOPAZ, 5f, -3f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(MythicTiers.TOPAZ, 1, -2.8f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe",
            () -> new HoeItem(MythicTiers.TOPAZ, -3, 0f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",
            () -> new ShovelItem(MythicTiers.TOPAZ, 1.5f, -3.0f,
                    new Item.Properties().fireResistant()));
    
    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet",
            () -> new ArmorItem(MythicArmorMaterials.TOPAZ, EquipmentSlot.HEAD, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate",
            () -> new ArmorItem(MythicArmorMaterials.TOPAZ, EquipmentSlot.CHEST, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TOPAZ_LEGGING = ITEMS.register("topaz_leggings",
            () -> new ArmorItem(MythicArmorMaterials.TOPAZ, EquipmentSlot.LEGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots",
            () -> new ArmorItem(MythicArmorMaterials.TOPAZ, EquipmentSlot.FEET, new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
