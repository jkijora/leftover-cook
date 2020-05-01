package eu.kijora.leftovercook.logic;

import eu.kijora.leftovercook.bo.Ingredient;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class RecipeController {

    @Autowired
    private DatabaseRecipeService databaseRecipeService;
    @Autowired 
    private IngredientsRepository ingredientsRepository;

    @GetMapping(value = "/")
    public String defaultWelcome() {
        log.debug("Main endpoint hit");
        return "Welcome";
    }

    @GetMapping(value = "recipes")
    public String getAllRecipes() throws IOException {
        Document document = Jsoup.connect("http://onet.pl/").get();
        return "all the recipes" + document.toString();
    }

    @GetMapping(value = "ingredients")
    public String getAllIngredients() {

        List<Ingredient> all = ingredientsRepository.findAll();
        return "all the ingredients:\n" + all.toString();
    }



}
