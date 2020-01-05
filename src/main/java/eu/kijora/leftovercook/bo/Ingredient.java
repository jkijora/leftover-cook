package eu.kijora.leftovercook.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

    public Ingredient(){};

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
