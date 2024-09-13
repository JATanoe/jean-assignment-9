package com.coderscampus.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.Recipe;

@Service
public class RecipeService {

	private List<Recipe> recipes = new ArrayList<>();

	public void init() throws IOException {
		Reader in = new FileReader("recipes.txt");

		String[] HEADERS = { "Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes",
				"Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan",
				"Vegetarian" };

		CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
								.setHeader(HEADERS)
								.setSkipHeaderRecord(true)
								.build();

		Iterable<CSVRecord> records = csvFormat.parse(in);

		for (CSVRecord record : records) {
			Recipe recipe = new Recipe();

			recipe.setCookingMinutes(record.get(0));
			recipe.setDairyFree(record.get(1));
			recipe.setGlutenFree(record.get(2));
			recipe.setInstructions(record.get(3));
			recipe.setPreparationMinutes(record.get(4));
			recipe.setPricePerServing(record.get(5));
			recipe.setReadyInMinutes(record.get(6));
			recipe.setServings(record.get(7));
			recipe.setSpoonacularScore(record.get(8));
			recipe.setTitle(record.get(9));
			recipe.setVegan(record.get(10));
			recipe.setVegetarian(record.get(11));

			System.out.println("Loaded recipe: " + recipe.toString());

			this.recipes.add(recipe);
		}
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

}
