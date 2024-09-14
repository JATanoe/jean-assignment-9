package com.coderscampus.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

@Service
public class FileService {

	private String fileName;

	public FileService() {
	}

	public FileService(String fileName) {
		this.fileName = fileName;
	}

	public Iterable<CSVRecord> readFile() throws IOException {
		Reader in = new FileReader(fileName);

		String[] HEADERS = { "Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes",
				"Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan",
				"Vegetarian" };

		CSVFormat csvFormat = CSVFormat.DEFAULT
				.builder()
				.setHeader(HEADERS)
				.setSkipHeaderRecord(true)
				.setIgnoreSurroundingSpaces(true)
				.setEscape('\\')
				.setTrailingDelimiter(true)
				.build();

		 return csvFormat.parse(in);
	}
	
}
