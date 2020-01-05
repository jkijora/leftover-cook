package eu.kijora.leftovercook.bo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Recipe {
    @Getter @Setter
    String name;
    @Getter @Setter
    List<Ingredient> ingredients;
    @Getter @Setter
    String linkToWeb;

}
