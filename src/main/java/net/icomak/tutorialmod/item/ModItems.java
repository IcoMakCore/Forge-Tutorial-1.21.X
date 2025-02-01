package net.icomak.tutorialmod.item;

import net.icomak.tutorialmod.TutorialMod;
import net.icomak.tutorialmod.block.custom.FuelItem;
import net.icomak.tutorialmod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //Say to minecraft that those are our items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // Alexandrite item
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));

    // Raw Alexandrite item
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));

    // Carcastagno shard item
    public static final RegistryObject<Item> CARCASTAGNO_SHARD = ITEMS.register("carcastagno_shard",
            () -> new Item(new Item.Properties()));

    // CHISEL ITEM
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    // KHOLRABI ITEM
    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)));

    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            () -> new FuelItem(new Item.Properties(), 1200));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }






}
