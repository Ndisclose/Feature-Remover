package net.ndisclose.removal_mod.WorldGen;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.ndisclose.removal_mod.RemovalMod;

public class ModFeatures {
    public static void initialize() {
    }
    public static final Feature<NoneFeatureConfiguration> LAVA_BASALT =
            Registry.register(
                    BuiltInRegistries.FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "lava_basalt"
                    ),
                    new OverWorldLavaBasaltFeature()
            );
}
