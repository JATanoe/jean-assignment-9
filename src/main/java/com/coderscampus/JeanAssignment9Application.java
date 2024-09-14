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
	}

}
