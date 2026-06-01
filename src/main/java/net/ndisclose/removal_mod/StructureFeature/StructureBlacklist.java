package net.ndisclose.removal_mod.StructureFeature;

import net.minecraft.resources.Identifier;

import java.util.Set;

public class StructureBlacklist {
    public static final Set<Identifier> structure_blacklist = Set.of(
            Identifier.parse("minecraft:ruined_portal"),
            Identifier.parse("minecraft:swamp_hut"),
            Identifier.parse("minecraft:mansion")
    );
}
