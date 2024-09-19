package com.coderscampus.web;

import java.io.IOException;
import java.util.List;

import com.coderscampus.domain.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.service.RecipeService;

@RestController
public class RecipeController {

	private RecipeService recipeService;
	
	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@GetMapping("/all-recipes")
	public List<Recipe> allRecipes() throws IOException {
		return recipeService.getAllRecipes();
	}

	@GetMapping("/gluten-free")
	public List<Recipe> glutenFreeRecipes() throws IOException {
		return recipeService.getGlutenFreeRecipes();
	}

	@GetMapping("/vegan")
	public List<Recipe> veganRecipes() throws IOException {
		return recipeService.getVeganRecipes();
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> veganAndGlutenFreeRecipes() throws IOException {
		return recipeService.getVeganAndGlutenFreeRecipes();
	}

	@GetMapping("/vegetarian")
	public List<Recipe> vegetarianRecipes() throws IOException {
		return recipeService.getVegetarianRecipes();
	}

}
