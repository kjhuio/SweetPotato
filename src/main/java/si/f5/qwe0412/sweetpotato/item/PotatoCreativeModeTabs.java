package si.f5.qwe0412.sweetpotato.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import si.f5.qwe0412.sweetpotato.Sweetpotato;
import si.f5.qwe0412.sweetpotato.block.PotatoBlocks;

import java.util.function.Supplier;

import static net.minecraft.world.item.CreativeModeTab.*;

public class PotatoCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sweetpotato.MODID);

    public static final Supplier<CreativeModeTab> POTATO_ITEM_TAB = TABS.register("potato_item_tab",() -> builder().icon(() -> new ItemStack(PotatoItems.SWEET_POTATO.get()))
            .title(Component.translatable("creativetab.sweetpotato.potato_item_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(PotatoItems.SWEET_POTATO);
                output.accept(PotatoItems.BAKED_SWEET_POTATO);
            })
            .build());

    public static final Supplier<CreativeModeTab> POTATO_BLOCK_TAB =
            TABS.register("potato_block_tab",() -> builder().icon(() -> new ItemStack(PotatoBlocks.SWEET_POTATO_BLOCK))
                    .title(Component.translatable("creativetab.sweetpotato.potato_block_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(PotatoBlocks.SWEET_POTATO_BLOCK);
                    })

                    .build());
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
