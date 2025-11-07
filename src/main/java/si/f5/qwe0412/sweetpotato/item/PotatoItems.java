package si.f5.qwe0412.sweetpotato.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import si.f5.qwe0412.sweetpotato.Sweetpotato;
import si.f5.qwe0412.sweetpotato.item.custom.ImokenpiItem;

public class PotatoItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Sweetpotato.MODID);

    public static final DeferredItem<Item> SWEET_POTATO = ITEMS.register("sweet_potato",() -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build())));
    public static final DeferredItem<Item> BAKED_SWEET_POTATO = ITEMS.register("baked_sweet_potato",() -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationModifier(0.6f).build())));
    public static final DeferredItem<Item> IMOKENPI = ITEMS.register("imokenpi",
            () -> new ImokenpiItem(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.4f)
                            .fast() // 食べるのが早い
                            .build())));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
