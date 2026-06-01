package net.ndisclose.removal_mod.mob;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.world.entity.EntityType;

public class EntityRemoval {
    public static void initialize() {
        ServerEntityEvents.ALLOW_LOAD.register(
                (entity, level, spawnReason, isLoadedFromDisk) -> {
                    if (EntityBlacklist.entity_blacklist.contains(entity.getType())) {
                        return false;
                    }
                    return true;
        }
        );
    }
}
