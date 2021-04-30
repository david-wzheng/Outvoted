package io.github.how_bout_no.outvoted.entity.util;

import io.github.how_bout_no.outvoted.entity.BarnacleEntity;
import io.github.how_bout_no.outvoted.entity.GluttonEntity;
import io.github.how_bout_no.outvoted.entity.MeerkatEntity;
import io.github.how_bout_no.outvoted.entity.WildfireEntity;
import io.github.how_bout_no.outvoted.init.ModEntityTypes;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class MobAttributes {
    public static void init() {
        FabricDefaultAttributeRegistry.register(ModEntityTypes.WILDFIRE.get(), WildfireEntity.setCustomAttributes());
        FabricDefaultAttributeRegistry.register(ModEntityTypes.GLUTTON.get(), GluttonEntity.setCustomAttributes());
        FabricDefaultAttributeRegistry.register(ModEntityTypes.BARNACLE.get(), BarnacleEntity.setCustomAttributes());
        FabricDefaultAttributeRegistry.register(ModEntityTypes.MEERKAT.get(), MeerkatEntity.setCustomAttributes());
    }
}
