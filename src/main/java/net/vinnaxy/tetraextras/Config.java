package net.vinnaxy.tetraextras;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

import java.util.Set;

@Mod.EventBusSubscriber(modid = TetraExtras.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    public static boolean logDirtBlock;
    public static int magicNumber;
    public static String magicNumberIntroduction;
    public static Set<Item> items;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {

    }
}
