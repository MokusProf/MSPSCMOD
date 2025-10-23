package net.mokus.halloween.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.mokus.halloween.MokusSpookySeason;
import net.mokus.halloween.particle.ModParticles;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> SPOOKED_EFFECT = registerStatusEffect("spooked_effect",
            new SpookedEffect(StatusEffectCategory.HARMFUL,0xe38a1d, ModParticles.SPOOKED_PARTICLE)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(MokusSpookySeason.MOD_ID,"spooked_effect"),-0.5f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .fadeTicks(10));

    public static final RegistryEntry<StatusEffect> SUGAR_FRENZY = registerStatusEffect("sugar_frenzy",
            new SugarFrenzyEffect(StatusEffectCategory.HARMFUL,0xe38a1d, ParticleTypes.CRIT)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(MokusSpookySeason.MOD_ID,"sugar_frenzy"),1.0f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED,
                            Identifier.of(MokusSpookySeason.MOD_ID,"sugar_frenzy"),0.5f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                            Identifier.of(MokusSpookySeason.MOD_ID,"sugar_frenzy"),0.5f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MokusSpookySeason.MOD_ID,name),statusEffect);
    }

    public static void registerStatusEffects(){

    }
}
