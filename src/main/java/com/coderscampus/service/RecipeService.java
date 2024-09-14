package com.coderscampus.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.Recipe;

@Service
public class RecipeService {

	private List<Recipe> recipes = new ArrayList<>();
	
	@Autowired
	private FileService fileService;

	public void loadData() throws IOException {
		fileService.readFile();
	}

//	public List<String> getAllRecipes() throws IOException {
//		loadData();
//		return recipes.stream()
//				.map(Recipe::toString)
//				.collect(Collectors.toList());
//	}
//
//	public List<String> getGlutenFreeRecipes() throws IOException {
//		loadData();
//		return recipes.stream()
//				.filter(Recipe::getGlutenFree)
//				.map(Recipe::toString)
//				.collect(Collectors.toList());
//	}
//
//	public List<String> getVeganRecipes() throws IOException {
//		loadData();
//		return recipes.stream()
//				.filter(Recipe::getVegan)
//				.map(Recipe::toString)
//				.collect(Collectors.toList());
//	}
//
//	public List<String> getVeganAndGlutenFreeRecipes() throws IOException {
//		loadData();
//		return recipes.stream()
//				.filter(recipe -> recipe.getVegan() && recipe.getGlutenFree())
//				.map(Recipe::toString)
//				.collect(Collectors.toList());
//	}
//
//	public List<String> getVegetarianRecipes() throws IOException {
//		loadData();
//		return recipes.stream()
//				.filter(Recipe::getVegetarian)
//				.map(Recipe::toString)
//				.collect(Collectors.toList());
//	}

}
