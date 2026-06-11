package net.Ndisclose.feature_remover.item;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.Ndisclose.feature_remover.Removal.Blacklists;

public class CreativeMenuSanitization {
    public static void initialize() {
        CreativeModeTabEvents.MODIFY_OUTPUT_ALL.register((tab, output) -> {
            output.getDisplayStacks().removeIf(stack ->
                    Blacklists.getItemBlacklist().contains(stack.getItem()) || stack.isEnchanted());
            output.getSearchTabStacks().removeIf(stack ->
                    Blacklists.getItemBlacklist().contains(stack.getItem()) || stack.isEnchanted());
        });
    }
}
