package guru.springframework.services;

import guru.springframework.domain.Ingredient;
import guru.springframework.repositories.IngredientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
@Slf4j
@Service
public class IngredientServiceImpl {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    public Set<Ingredient> getIngredients() {
        log.debug("I'm in the service");

        Set<Ingredient> IngredientSet = new HashSet<>();
        ingredientRepository.findAll().iterator().forEachRemaining(IngredientSet::add);
        return IngredientSet;
    }


    public Ingredient findById(Long i) {
        Optional<Ingredient> IngredientOptional = ingredientRepository.findById(i);

        if(!IngredientOptional.isPresent()) {
            throw new RuntimeException("Ingredient not found!");
        }

        return IngredientOptional.get();
    }


}
