package net.mokus.halloween.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mokus.halloween.MokusSpookySeason;

public class ModParticles {


    public static final SimpleParticleType SPOOKED_PARTICLE =
            registerParticle("spooked_particle", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType){
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MokusSpookySeason.MOD_ID,name),particleType);
    }

    public static void registerParticles(){

    }
}
