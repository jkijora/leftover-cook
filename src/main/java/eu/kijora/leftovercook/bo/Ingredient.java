package eu.kijora.leftovercook.bo;

import lombok.Getter;
import lombok.Setter;

public class Ingredient {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private boolean vegan;
    @Getter @Setter
    private Priority priority;


    public Ingredient(String name) {
        this.name = name;
        this.vegan = false;
        this.priority = Priority.OPTIONAL;
    }

    public Ingredient(String name, boolean vegan) {
        this.name = name;
        this.vegan = vegan;
        this.priority = Priority.OPTIONAL;
    }

    public Ingredient(String name, boolean vegan, Priority priority) {
        this.name = name;
        this.vegan = vegan;
        this.priority = priority;
    }
}
