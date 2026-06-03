package net.ndisclose.removal_mod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;

public class EntityRemoval {
    public static void initialize() {
        ServerEntityEvents.ALLOW_LOAD.register(
                (entity, level, spawnReason, isLoadedFromDisk) -> {
                    if (Blacklists.ENTITY_BLACKLIST.contains(entity.getType())) {
                        return false;
                    }
                    return true;
        }
        );
    }
}
