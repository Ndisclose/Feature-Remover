package net.Ndisclose.feature_remover.item;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.item.ItemStack;

import java.util.ListIterator;

public class LootRemoval {


    public static void initialize() {
        LootTableEvents.MODIFY_DROPS.register(
                (lootTable,context, drops) -> {
                    ListIterator<ItemStack> iterator = drops.listIterator();
                    while (iterator.hasNext()) {
                        ItemStack stack = iterator.next();
                        ItemStack sanitized = SanitizeItemStack.sanitizeStack(stack);
                        if (sanitized.isEmpty()) {
                            iterator.remove();
                        } else {
                            iterator.set(sanitized);
                        }
                    }
                }
        );
    }
}
