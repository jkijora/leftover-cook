package eu.kijora.leftovercook.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public @Data class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    @Getter @Setter
    String name;

    @Getter @Setter
    @ManyToMany(mappedBy = "recipes")
    Set<Ingredient> ingredients;

    @Getter @Setter
    String linkToWeb;

}
