package eu.kijora.leftovercook.bo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RecipeRequest  {

    @Getter @Setter
    List<Ingredient> ingredients;
}
