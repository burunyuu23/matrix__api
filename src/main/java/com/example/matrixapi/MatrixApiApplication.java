package com.example.matrixapi;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MatrixApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatrixApiApplication.class, args);
	}

	@Bean
	public Gson gson() {
		return new Gson();
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	};

}
