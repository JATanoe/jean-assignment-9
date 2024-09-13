package com.coderscampus.domain;

public class Recipe {

	private Integer cookingMinutes;
	private Boolean dairyFree;
	private Boolean glutenFree;
	private String instructions;
	private Double preparationMinutes;
	private Double pricePerServing;
	private Integer readyInMinutes;
	private Integer servings;
	private Double spoonacularScore;
	private String title;
	private Boolean vegan;
	private Boolean vegetarian;

	public Integer getCookingMinutes() {
		return cookingMinutes;
	}

	public void setCookingMinutes(String cookingMinutes) {
		this.cookingMinutes = Integer.parseInt(cookingMinutes);
	}

	public Boolean getDairyFree() {
		return dairyFree;
	}

	public void setDairyFree(String dairyFree) {
		this.dairyFree = Boolean.parseBoolean(dairyFree);
	}

	public Boolean getGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(String glutenFree) {
		this.glutenFree = Boolean.parseBoolean(glutenFree);
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Double getPreparationMinutes() {
		return preparationMinutes;
	}

	public void setPreparationMinutes(String preparationMinutes) {
		this.preparationMinutes = Double.parseDouble(preparationMinutes);
	}

	public Double getPricePerServing() {
		return pricePerServing;
	}

	public void setPricePerServing(String pricePerServing) {
		this.pricePerServing = Double.parseDouble(pricePerServing);
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(String readyInMinutes) {
		this.readyInMinutes = Integer.parseInt(readyInMinutes);
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(String servings) {
		this.servings = Integer.parseInt(servings);
	}

	public Double getSpoonacularScore() {
		return spoonacularScore;
	}

	public void setSpoonacularScore(String spoonacularScore) {
		this.spoonacularScore = Double.parseDouble(spoonacularScore);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getVegan() {
		return vegan;
	}

	public void setVegan(String vegan) {
		this.vegan = Boolean.parseBoolean(vegan);
	}

	public Boolean getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(String vegetarian) {
		this.vegetarian = Boolean.parseBoolean(vegetarian);
	}

	@Override
	public String toString() {
		return "Recipe [cookingMinutes=" + cookingMinutes + ", dairyFree=" + dairyFree + ", glutenFree=" + glutenFree
				+ ", instructions=" + instructions + ", preparationMinutes=" + preparationMinutes + ", pricePerServing="
				+ pricePerServing + ", readyInMinutes=" + readyInMinutes + ", servings=" + servings
				+ ", spoonacularScore=" + spoonacularScore + ", title=" + title + ", vegan=" + vegan + ", vegetarian="
				+ vegetarian + "]";
	}

}
