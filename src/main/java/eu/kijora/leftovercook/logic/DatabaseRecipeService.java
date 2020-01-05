package eu.kijora.leftovercook.logic;

import eu.kijora.leftovercook.bo.Recipe;
import eu.kijora.leftovercook.bo.RecipeRequest;
import eu.kijora.leftovercook.bo.RequestingRecipe;
import org.springframework.stereotype.Service;

@Service
public class DatabaseRecipeService implements RequestingRecipe {
    @Override
    public Recipe getRecipe(RecipeRequest recipeRequest) {
        return null;
    }
}
