package si.f5.qwe0412.sweetpotato.event;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;
import si.f5.qwe0412.sweetpotato.Sweetpotato;
import si.f5.qwe0412.sweetpotato.item.PotatoItems;

@EventBusSubscriber(modid = Sweetpotato.MODID)
public class LootModifier {

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        if (event.getName().equals(ResourceLocation.fromNamespaceAndPath("minecraft", "blocks/short_grass"))) {
            LootPool.Builder pool = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(PotatoItems.SWEET_POTATO.get())
                            .when(LootItemRandomChanceCondition.randomChance(0.125f)));

            event.getTable().addPool(pool.build());
        }
        if (event.getName().equals(ResourceLocation.fromNamespaceAndPath("minecraft", "blocks/tall_grass"))) {
            LootPool.Builder pool = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .add(LootItem.lootTableItem(PotatoItems.SWEET_POTATO.get())
                            .when(LootItemRandomChanceCondition.randomChance(0.125f)));

            event.getTable().addPool(pool.build());
        }
    }
}
