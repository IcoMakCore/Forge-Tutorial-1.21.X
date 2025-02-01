package net.icomak.tutorialmod.item;

import net.icomak.tutorialmod.TutorialMod;
import net.icomak.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("alexandrite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.tutorialmod.alexandrite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Here add items to be displayed

                        // Alexandrite
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());

                        output.accept(ModItems.CHISEL.get());

                    }).build());

    // ALEXANDRITE BLOCKS
    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("alexandrite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get()))
                    // This tab is going to appear before the blocks tab
                    .withTabsBefore(ALEXANDRITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.alexandrite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Here add items to be displayed

                        // Alexandrite
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.MAGIC_BLOCK.get());




                    }).build());

    // CARCASTAGNO ITEMS
    public static final RegistryObject<CreativeModeTab> CARCASTAGNO_ITEMS_TAB = CREATIVE_MODE_TABS.register("carcastagno_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CARCASTAGNO_SHARD.get()))
                    // This tab is going to appear before the blocks tab
                    .withTabsBefore(ALEXANDRITE_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.carcastagno_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Here add items to be displayed

                        // CARCASTAGNO
                        output.accept(ModItems.CARCASTAGNO_SHARD.get());

                    }).build());









    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
