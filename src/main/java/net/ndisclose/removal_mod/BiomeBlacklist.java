package net.ndisclose.removal_mod;

import net.minecraft.resources.Identifier;
import java.util.Set;

public class BiomeBlacklist {
    public static final Set<Identifier> biome_blacklist = Set.of(
            Identifier.parse("minecraft:deep_dark")
    );
}
