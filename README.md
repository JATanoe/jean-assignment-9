# Recipe API Application

## Overview
This Spring Boot application provides a RESTful API for accessing and filtering recipe data. It reads recipe information from a CSV file and exposes endpoints to retrieve recipes based on various dietary preferences.

## Features
- Load and parse recipe data from a CSV file
- Retrieve all recipes
- Filter recipes by dietary restrictions:
  - Gluten-free recipes
  - Vegan recipes
  - Vegan and gluten-free recipes
  - Vegetarian recipes

## Technologies Used
- Java
- Spring Boot
- Spring MVC (REST Controllers)
- Apache Commons CSV for CSV parsing

## Data Model
The application uses a Recipe model with the following attributes:
- `cookingMinutes`: Time required for cooking (Integer)
- `dairyFree`: Whether the recipe is dairy-free (Boolean)
- `glutenFree`: Whether the recipe is gluten-free (Boolean)
- `instructions`: Step-by-step cooking instructions (String)
- `preparationMinutes`: Time required for preparation (Double)
- `pricePerServing`: Cost per serving (Double)
- `readyInMinutes`: Total time until the recipe is ready (Integer)
- `servings`: Number of servings (Integer)
- `spoonacularScore`: Rating score (Double)
- `title`: Recipe name (String)
- `vegan`: Whether the recipe is vegan (Boolean)
- `vegetarian`: Whether the recipe is vegetarian (Boolean)

## API Endpoints
The application exposes the following REST endpoints:

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/all-recipes` | GET | Returns all recipes |
| `/gluten-free` | GET | Returns only gluten-free recipes |
| `/vegan` | GET | Returns only vegan recipes |
| `/vegan-and-gluten-free` | GET | Returns recipes that are both vegan and gluten-free |
| `/vegetarian` | GET | Returns only vegetarian recipes |

All endpoints return JSON arrays of recipe objects.

## How to Run
1. Ensure you have Java 17 or later installed
2. Make sure the `recipes.txt` file is in the project root directory
3. Run the application using Maven:
   ```
   ./mvnw spring-boot:run
   ```
   or on Windows:
   ```
   mvnw.cmd spring-boot:run
   ```
4. The application will start on port 8080 (default)
5. Access the API endpoints using a web browser or tools like Postman:
   - http://localhost:8080/all-recipes
   - http://localhost:8080/gluten-free
   - http://localhost:8080/vegan
   - http://localhost:8080/vegan-and-gluten-free
   - http://localhost:8080/vegetarian

## Data Source
The application reads recipe data from a CSV file named `recipes.txt` located in the project root directory. The file should contain recipe information with the following headers:
- Cooking Minutes
- Dairy Free
- Gluten Free
- Instructions
- Preparation Minutes
- Price Per Serving
- Ready In Minutes
- Servings
- Spoonacular Score
- Title
- Vegan
- Vegetarian