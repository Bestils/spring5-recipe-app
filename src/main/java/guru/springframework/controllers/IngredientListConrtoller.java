package guru.springframework.controllers;

import guru.springframework.services.IngredientServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 6/1/17.
 */
@Slf4j
@Controller
public class IngredientListConrtoller {

    private final IngredientServiceImpl recipeService;

    public IngredientListConrtoller(IngredientServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/Ingredients", "/ingredients"})
    public String getIndexPage(Model model) {
log.debug("Getting Index Page");

        model.addAttribute("recipes", recipeService.getIngredients());

        return "Ingredients";
    }
}
