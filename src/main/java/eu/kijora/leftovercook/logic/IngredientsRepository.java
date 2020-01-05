package eu.kijora.leftovercook.logic;

import eu.kijora.leftovercook.bo.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientsRepository extends JpaRepository<Ingredient, Long> {
}
