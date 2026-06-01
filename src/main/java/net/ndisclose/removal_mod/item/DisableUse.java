package net.ndisclose.removal_mod.item;

import net.fabricmc.fabric.api.event.player.BlockEvents;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;

public class DisableUse {
    public static void initialize() {
        UseItemCallback.EVENT.register((player, level, hand) -> {
            ItemStack stack = player.getItemInHand(hand);
            if (ItemBlacklist.item_blacklist.contains(stack.getItem())) {
                return InteractionResult.FAIL;
            }
            return InteractionResult.PASS;
        });
    }
}
