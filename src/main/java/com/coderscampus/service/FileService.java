package com.coderscampus.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

@Service
public class FileService {

	private String fileName;
	private List<String> fileData = new ArrayList<>();

	public FileService() {
	}

	public FileService(String fileName) {
		this.fileName = fileName;
	}

	public void readFile() throws IOException {
		Reader in = new FileReader(fileName);

		String[] HEADERS = { "Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes",
				"Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan",
				"Vegetarian" };

		CSVFormat csvFormat = CSVFormat.DEFAULT
				.builder()
				.setHeader(HEADERS)
				.setSkipHeaderRecord(true)
				.setTrailingData(true)
				.setIgnoreSurroundingSpaces(true)
				.setQuote('"')
				.setRecordSeparator("\r\n")
				.setTrailingDelimiter(true)
				.build();

		Iterable<CSVRecord> records = csvFormat.parse(in);

		System.out.printf("%-20s %-15s %-15s %-50s %-24s %-24s %-24s %-15s %-15s %-15s %-10s %-15s%n",
				"Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes",
				"Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan",
				"Vegetarian");
		for (CSVRecord record : records) {
//			System.out.printf("%-20s %-15s %-15s %-50s %-24s %-24s %-24s %-15s %-15s %-15s %-10s %-15s%n",
//					record.get(0), record.get(1), record.get(2), record.get(3), record.get(4), record.get(5),
//					record.get(6), record.get(7), record.get(8), record.get(9), record.get(10), record.get(11));

//			fileData.add(record.get(0) + ", " + record.get(1) + ", " + record.get(2) + ", " + record.get(3)
//			 + ", " + record.get(4) + ", " + record.get(5) + ", " + record.get(6) + ", " + record.get(7)
//			 + ", " + record.get(8) + ", " + record.get(9) + ", " + record.get(10) + ", " + record.get(11));

//			System.out.println("\nParsed data: ");
			System.out.printf("%-20s %-15s %-15s %-50s %-24s %-24s %-24s %-15s %-15s %-15s %-10s %-15s%n",
					Integer.parseInt(record.get(0)), Boolean.parseBoolean(record.get(1)),
					Boolean.parseBoolean(record.get(2)), record.get(3), Double.parseDouble(record.get(4)),
					Double.parseDouble(record.get(5)), Integer.parseInt(record.get(6)), Integer.parseInt(record.get(7)),
					Double.parseDouble(record.get(8)), record.get(9), Boolean.parseBoolean(record.get(10)), Boolean.parseBoolean(record.get(11)));

		}

	}
}
