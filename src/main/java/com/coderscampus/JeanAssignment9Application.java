package com.coderscampus;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderscampus.domain.Recipe;

@SpringBootApplication
public class JeanAssignment9Application {
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(JeanAssignment9Application.class, args);
		
//		String[] HEADERS = { "Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes",
//				"Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan", "Vegetarian" };
//
//		Reader in = new FileReader("recipes.txt");
//
//		CSVFormat csvFormat = CSVFormat.DEFAULT.builder().setHeader(HEADERS).setSkipHeaderRecord(true).build();
//
//		Iterable<CSVRecord> records = csvFormat.parse(in);
//
//		for (CSVRecord record : records) {
//			System.out.println(record.get(0) + " " + record.get(1) + " " + record.get(2) + " " + record.get(3) + " "
//					+ record.get(4) + " " + record.get(5) + " " + record.get(6) + " " + record.get(7) + " "
//					+ record.get(8) + " " + record.get(9) + " " + record.get(10) + " " + record.get(11));
//		}
	}

}
