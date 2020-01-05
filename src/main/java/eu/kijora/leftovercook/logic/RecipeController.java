package eu.kijora.leftovercook.logic;

import eu.kijora.leftovercook.bo.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class RecipeController {

    @Autowired
    private DatabaseRecipeService databaseRecipeService;
    @Autowired 
    private IngredientsRepository ingredientsRepository;

    @GetMapping(value = "/")
    public String defaultWelcome() {
        return "Welcome";
    }

    @GetMapping(value = "recipes")
    public String getAllRecipes() {
        return "all the recipes";
    }

    @GetMapping(value = "ingredients")
    public String getAllIngredients() {

        List<Ingredient> all = ingredientsRepository.findAll();
        return "all the ingredients:\n" + all.toString();
    }



}
