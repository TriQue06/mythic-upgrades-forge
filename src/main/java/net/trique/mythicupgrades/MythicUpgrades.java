package net.trique.mythicupgrades;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.item.MythicCreativeTabs;
import net.trique.mythicupgrades.item.MythicItems;
import org.slf4j.Logger;

@Mod(MythicUpgrades.MOD_ID)
public class MythicUpgrades
{
    public static final String MOD_ID = "mythicupgrades";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MythicUpgrades() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MythicItems.register(modEventBus);
        MythicBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == MythicCreativeTabs.MYTHICITEMGROUP) {
            event.accept(MythicItems.SAPPHIRE);
            event.accept(MythicItems.SAPPHIRE_INGOT);
            event.accept(MythicItems.SAPPHIRE_APPLE);
            event.accept(MythicItems.SAPPHIRE_SWORD);
            event.accept(MythicItems.SAPPHIRE_AXE);
            event.accept(MythicItems.SAPPHIRE_PICKAXE);
            event.accept(MythicItems.SAPPHIRE_SHOVEL);
            event.accept(MythicItems.SAPPHIRE_HOE);
            
            event.accept(MythicItems.RUBY);
            event.accept(MythicItems.RUBY_INGOT);
            event.accept(MythicItems.RUBY_APPLE);
            event.accept(MythicItems.RUBY_SWORD);
            event.accept(MythicItems.RUBY_AXE);
            event.accept(MythicItems.RUBY_PICKAXE);
            event.accept(MythicItems.RUBY_SHOVEL);
            event.accept(MythicItems.RUBY_HOE);
            
            event.accept(MythicItems.JADE);
            event.accept(MythicItems.JADE_INGOT);
            event.accept(MythicItems.JADE_APPLE);
            event.accept(MythicItems.JADE_HELMET);
            event.accept(MythicItems.JADE_CHESTPLATE);
            event.accept(MythicItems.JADE_LEGGING);
            event.accept(MythicItems.JADE_BOOTS);
            
            event.accept(MythicItems.TOPAZ);
            event.accept(MythicItems.TOPAZ_INGOT);
            event.accept(MythicItems.TOPAZ_APPLE);
            event.accept(MythicItems.TOPAZ_SWORD);
            event.accept(MythicItems.TOPAZ_AXE);
            event.accept(MythicItems.TOPAZ_PICKAXE);
            event.accept(MythicItems.TOPAZ_SHOVEL);
            event.accept(MythicItems.TOPAZ_HOE);
            event.accept(MythicItems.TOPAZ_HELMET);
            event.accept(MythicItems.TOPAZ_CHESTPLATE);
            event.accept(MythicItems.TOPAZ_LEGGING);
            event.accept(MythicItems.TOPAZ_BOOTS);

            event.accept(MythicBlocks.SAPPHIRE_ORE);
            event.accept(MythicBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(MythicBlocks.SAPPHIRE_BLOCK);
            event.accept(MythicBlocks.TOUGH_SAPPHIRE_BLOCK);
            event.accept(MythicBlocks.RUBY_ORE);
            event.accept(MythicBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(MythicBlocks.RUBY_BLOCK);
            event.accept(MythicBlocks.TOUGH_RUBY_BLOCK);
            event.accept(MythicBlocks.JADE_ORE);
            event.accept(MythicBlocks.DEEPSLATE_JADE_ORE);
            event.accept(MythicBlocks.JADE_BLOCK);
            event.accept(MythicBlocks.TOUGH_JADE_BLOCK);
            event.accept(MythicBlocks.TOPAZ_ORE);
            event.accept(MythicBlocks.DEEPSLATE_TOPAZ_ORE);
            event.accept(MythicBlocks.TOPAZ_BLOCK);
            event.accept(MythicBlocks.TOUGH_TOPAZ_BLOCK);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

        }
    }
}
