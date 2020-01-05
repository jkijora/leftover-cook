package eu.kijora.leftovercook.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


public  class Recipe {

//    @Id
//    @GeneratedValue
    private Long id;

//    @Column
    @Getter @Setter
    String name;

    @Getter @Setter
    List<Ingredient> ingredients;

//    @Column
    @Getter @Setter
    String linkToWeb;

}
