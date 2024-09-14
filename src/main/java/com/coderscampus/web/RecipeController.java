package com.coderscampus.web;

import java.io.IOException;
import java.util.List;

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
	public List<String> allRecipes() throws IOException {
		return recipeService.getAllRecipes();
	}

	@GetMapping("/gluten-free")
	public List<String> glutenFreeRecipes() throws IOException {
		return recipeService.getGlutenFreeRecipes();
	}

	@GetMapping("/vegan")
	public List<String> veganRecipes() throws IOException {
		return recipeService.getVeganRecipes();
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<String> veganAndGlutenFreeRecipes() throws IOException {
		return recipeService.getVeganAndGlutenFreeRecipes();
	}

	@GetMapping("/vegetarian")
	public List<String> vegetarianRecipes() throws IOException {
		return recipeService.getVegetarianRecipes();
	}

}
