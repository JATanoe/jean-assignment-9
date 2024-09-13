package com.coderscampus.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.domain.Recipe;
import com.coderscampus.service.RecipeService;

@RestController
public class RecipeController {

	private RecipeService recipeService;
	
	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@GetMapping("")
	public String home() {
		return "This is the homepage.";
	}

	@GetMapping("/all-recipes")
	public List<String> allRecipes() {
		return recipeService.getRecipes()
				.stream()
                .map(Recipe::toString)
                .collect(Collectors.toList());
	}

	@GetMapping("/gluten-free")
	public List<String> glutenFreeRecipes() {
		return recipeService.getRecipes()
				.stream()
		        .filter(Recipe::getGlutenFree)
		        .map(Recipe::toString)
		        .collect(Collectors.toList());
	}

	@GetMapping("/vegan")
	public List<String> veganRecipes() {
		return recipeService.getRecipes()
				.stream()
                .filter(Recipe::getVegan)
                .map(Recipe::toString)
                .collect(Collectors.toList());
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<String> veganAndGlutenFreeRecipes() {
		return recipeService.getRecipes()
				.stream()
                .filter(recipe -> recipe.getVegan() && recipe.getGlutenFree())
                .map(Recipe::toString)
                .collect(Collectors.toList());
	}

	@GetMapping("/vegetarian")
	public List<String> vegetarianRecipes() {
		return recipeService.getRecipes()
				.stream()
                .filter(Recipe::getVegetarian)
                .map(Recipe::toString)
                .collect(Collectors.toList());
	}

}
