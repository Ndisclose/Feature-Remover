package net.ndisclose.removal_mod.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.ndisclose.removal_mod.Block.BlockBlacklist;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Level.class)
public abstract class BlockRemoval {
    @Inject(
            method = "setBlock",
            at = @At("HEAD"),
            cancellable = true
    )
    private void removal_mod$BlockRemoval(
            BlockPos pos,
            BlockState state,
            int flags,
            CallbackInfoReturnable<Boolean> cir
    ) {
        if (BlockBlacklist.block_blacklist.contains(state.getBlock())) {
            cir.setReturnValue(false);
        }
    }
}
