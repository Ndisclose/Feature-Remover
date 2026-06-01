package net.ndisclose.removal_mod.StructureFeature;

import net.minecraft.resources.Identifier;

import java.util.Set;

public class FeatureBlacklist {
    public static final Set<Identifier> feature_blacklist = Set.of(
            Identifier.parse("minecraft:monster_room"),
            Identifier.parse("minecraft:monster_room_deep")
    );
}
