package net.trique.mythicupgrades.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.trique.mythicupgrades.MythicUpgrades;

@Mod.EventBusSubscriber(modid = MythicUpgrades.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MythicCreativeTabs {
    public static CreativeModeTab MYTHICITEMGROUP;

    @SubscribeEvent
    public static void registerCreativeModTabs(CreativeModeTabEvent.Register event) {
         MYTHICITEMGROUP = event.registerCreativeModeTab(new ResourceLocation(MythicUpgrades.MOD_ID, "mythicitemgroup"),
                 builder -> builder.icon(() -> new ItemStack(MythicItems.SAPPHIRE.get())).title(Component.literal("Mythic Upgrades")));
    }
}
