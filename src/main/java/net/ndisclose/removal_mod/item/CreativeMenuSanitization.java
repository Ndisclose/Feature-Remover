package net.ndisclose.removal_mod.item;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class CreativeMenuSanitization {
    public static void initialize() {
        CreativeModeTabEvents.MODIFY_OUTPUT_ALL.register((tab, output) -> {
            output.getDisplayStacks().removeIf(stack ->
                    ItemBlacklist.item_blacklist.contains(stack.getItem()) || stack.isEnchanted());
            output.getSearchTabStacks().removeIf(stack ->
                    ItemBlacklist.item_blacklist.contains(stack.getItem()) || stack.isEnchanted());
        });
    }
}
