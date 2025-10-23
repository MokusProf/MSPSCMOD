package net.mokus.halloween.Items;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.mokus.halloween.effect.ModEffects;

public class ModFoodComponents {

    public static final FoodComponent GUMMY_CANDIES = new FoodComponent.Builder().snack().nutrition(1).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(ModEffects.SUGAR_FRENZY, 400),1.0f).alwaysEdible().build();

    public static final FoodComponent CANDIES = new FoodComponent.Builder().snack().nutrition(2).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(ModEffects.SUGAR_FRENZY, 200),1.0f).alwaysEdible().build();
}
