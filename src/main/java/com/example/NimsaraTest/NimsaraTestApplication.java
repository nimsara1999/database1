package com.example.NimsaraTest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NimsaraTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(NimsaraTestApplication.class, args);
		}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
