package net.ndisclose.removal_mod.WorldGen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ndisclose.removal_mod.RemovalMod;

public class OverworldObtainableOres {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_quartz"
                    )
            );
    public static final ResourceKey<PlacedFeature> OVERWORLD_QUARTZ_PLACED =
    ResourceKey.create(
            Registries.PLACED_FEATURE,
            Identifier.fromNamespaceAndPath(
                    RemovalMod.MOD_ID,
            "overworld_quartz_placed"
                )
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NETHERITE =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_netherite"
                    )
            );
    public static final ResourceKey<PlacedFeature> OVERWORLD_NETHERITE_PLACED =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_netherite_placed"
                    )
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BASALT =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_basalt"
                    )
            );
    public static final ResourceKey<PlacedFeature> OVERWORLD_BASALT_PLACED =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_basalt_placed"
                    )
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLACKSTONE =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_blackstone"
                    )
            );
    public static final ResourceKey<PlacedFeature> OVERWORLD_BLACKSTONE_PLACED =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_blackstone_placed"
                    )
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GLOWSTONE =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_glowstone"
                    )
            );
    public static final ResourceKey<PlacedFeature> OVERWORLD_GLOWSTONE_PLACED =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            RemovalMod.MOD_ID,
                            "overworld_glowstone_placed"
                    )
            );
}
