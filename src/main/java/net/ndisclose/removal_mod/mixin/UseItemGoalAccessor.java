package net.ndisclose.removal_mod.mixin;

import net.minecraft.world.entity.ai.goal.UseItemGoal;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(UseItemGoal.class)
public interface UseItemGoalAccessor {
    @Accessor("item")
    ItemStack getItem();
}