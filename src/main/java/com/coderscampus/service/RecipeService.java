package com.coderscampus.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.Recipe;

import jakarta.annotation.PostConstruct;

@Service
public class RecipeService {

	private List<Recipe> recipes = new ArrayList<>();
	
	@Autowired
	private FileService fileService;

	@PostConstruct
	public void loadRecipes() throws IOException {
		Iterable<CSVRecord> records = fileService.readFile();

		for (CSVRecord record : records) {
			Recipe recipe = new Recipe();

			recipe.setCookingMinutes(Integer.parseInt(record.get(0)));
			recipe.setDairyFree(Boolean.parseBoolean(record.get(1)));
			recipe.setGlutenFree(Boolean.parseBoolean(record.get(2)));
			recipe.setInstructions(record.get(3));
			recipe.setPreparationMinutes(Double.parseDouble(record.get(4)));
			recipe.setPricePerServing(Double.parseDouble(record.get(5)));
			recipe.setReadyInMinutes(Integer.parseInt(record.get(6)));
			recipe.setServings(Integer.parseInt(record.get(7)));
			recipe.setSpoonacularScore(Double.parseDouble(record.get(8)));
			recipe.setTitle(record.get(9));
			recipe.setVegan(Boolean.parseBoolean(record.get(10)));
			recipe.setVegetarian(Boolean.parseBoolean(record.get(11)));

			recipes.add(recipe);
		}
	}

	public List<Recipe> getAllRecipes() throws IOException {
		return recipes.stream()
				.collect(Collectors.toList());
	}

	public List<Recipe> getGlutenFreeRecipes() throws IOException {
		return recipes.stream()
				.filter(Recipe::getGlutenFree)
				.collect(Collectors.toList());
	}

	public List<Recipe> getVeganRecipes() throws IOException {
		return recipes.stream()
				.filter(Recipe::getVegan)
				.collect(Collectors.toList());
	}

	public List<Recipe> getVeganAndGlutenFreeRecipes() throws IOException {
		return recipes.stream()
				.filter(recipe -> recipe.getVegan() && recipe.getGlutenFree())
				.collect(Collectors.toList());
	}

	public List<Recipe> getVegetarianRecipes() throws IOException {
		return recipes.stream()
				.filter(Recipe::getVegetarian)
				.collect(Collectors.toList());
	}

}
