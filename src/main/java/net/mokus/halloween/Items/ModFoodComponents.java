package net.mokus.halloween.Items;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.mokus.halloween.effect.ModEffects;

public class ModFoodComponents {

    public static final FoodComponent GUMMY_CANDIES = new FoodComponent.Builder().snack().nutrition(6).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(ModEffects.SUGAR_FRENZY, 400),1.0f).alwaysEdible().build();

    public static final FoodComponent CANDIES = new FoodComponent.Builder().snack().nutrition(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(ModEffects.SUGAR_FRENZY, 200),1.0f).alwaysEdible().build();

    public static final FoodComponent CARAMEL_APPLE = new FoodComponent.Builder().snack().nutrition(8).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(ModEffects.SUGAR_FRENZY, 300),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 400, 1),1.0f).alwaysEdible().build();
}
