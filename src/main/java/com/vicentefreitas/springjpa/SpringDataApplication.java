package com.vicentefreitas.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vicentefreitas.springjpa.orm.Cargo;
import com.vicentefreitas.springjpa.repositories.CargoRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private final CargoRepository repository;
	
	public SpringDataApplication(CargoRepository repository) {
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setDescricao("DESENVOLVEDOR DE SOFTWARE");
		
		repository.save(cargo);
	}

}
