package net.ndisclose.removal_mod.Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.ndisclose.removal_mod.item.ItemBlacklist;

import java.util.Set;
import java.util.stream.Collectors;

public class BlockBlacklist {
    public static final Set<Block> block_blacklist = ItemBlacklist.item_blacklist.stream().map(item -> Block.byItem(item)).filter(block -> block != Blocks.AIR).collect(Collectors.toSet());
}
