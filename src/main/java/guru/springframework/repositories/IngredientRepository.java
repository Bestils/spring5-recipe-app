package guru.springframework.repositories;

import guru.springframework.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Gladus on 07.07.2018.
 */
public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
