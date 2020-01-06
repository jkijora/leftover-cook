package eu.kijora.leftovercook.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
public @Data class Ingredient {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @Getter @Setter
    private String name;

    @Column
    @Getter @Setter
    private boolean vegan;

    @Transient
    @Getter @Setter
    private Priority priority;

    @Getter @Setter
    private FoodType foodType;

    @Getter @Setter
    @ManyToMany
    private Set<Recipe> recipes;

    //---CONSTRUCTORS---
    public Ingredient(){};

    public Ingredient(String name) {
        this.name = name;
        this.vegan = false;
        this.priority = Priority.OPTIONAL;
        this.foodType = FoodType.OTHER;
    }

    public Ingredient(String name, boolean vegan) {
        this.name = name;
        this.vegan = vegan;
        this.priority = Priority.OPTIONAL;
        this.foodType = FoodType.OTHER;

    }

    public Ingredient(String name, boolean vegan, Priority priority) {
        this.name = name;
        this.vegan = vegan;
        this.priority = priority;
        this.foodType = FoodType.OTHER;
    }

    public Ingredient(Long id, String name, boolean vegan, Priority priority, FoodType foodType) {
        this.id = id;
        this.name = name;
        this.vegan = vegan;
        this.priority = priority;
        this.foodType = foodType;
    }
    //------
}
