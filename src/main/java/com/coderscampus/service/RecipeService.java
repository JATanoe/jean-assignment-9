package com.coderscampus.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.Recipe;

@Service
public class RecipeService {

	private List<Recipe> recipes = new ArrayList<>();

	String[] HEADERS = { "Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes",
			"Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan", "Vegetarian" };

	public void loadRecipes() throws IOException {
		Reader in = new FileReader("recipes.txt");

		CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
		        .setHeader(HEADERS)
				.setSkipHeaderRecord(true)
				.build();

		Iterable<CSVRecord> records = csvFormat.parse(in);

		for (CSVRecord record : records) {
			recipes.add(new Recipe(
				Integer.parseInt(record.get("cookingMinutes")), 
				Boolean.parseBoolean(record.get("dairyFree")),
				Boolean.parseBoolean(record.get("glutenFree")), 
				record.get("instructions"),
				Double.parseDouble(record.get("preparationMinutes")),
				Double.parseDouble(record.get("pricePerServing")), 
				Integer.parseInt(record.get("readyInMinutes")),
				Integer.parseInt(record.get("servings")), 
				Double.parseDouble(record.get("spoonacularScore")),
				record.get("title"), 
				Boolean.parseBoolean(record.get("vegan")),
				Boolean.parseBoolean(record.get("vegetarian"))
			));
		}
	}

	public List<Recipe> getAllRecipes() {
		System.out.println(recipes);
		return recipes;
	}

	public List<Recipe> getGlutenFreeRecipes() {
		return recipes.stream().filter(Recipe::getGlutenFree).collect(Collectors.toList());
	}

	public List<Recipe> getVeganRecipes() {
		return recipes.stream().filter(Recipe::getVegan).collect(Collectors.toList());
	}

	public List<Recipe> getVeganAndGlutenFreeRecipes() {
		return recipes.stream().filter(r -> r.getVegan() && r.getGlutenFree()).collect(Collectors.toList());
	}

	public List<Recipe> getVegetarianRecipes() {
		return recipes.stream().filter(Recipe::getVegetarian).collect(Collectors.toList());
	}

}
