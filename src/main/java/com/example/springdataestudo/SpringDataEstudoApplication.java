package com.example.springdataestudo;

import com.example.springdataestudo.model.Cargo;
import com.example.springdataestudo.repository.CargoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataEstudoApplication implements CommandLineRunner {

	private  final CargoRepository repository;

	public  SpringDataEstudoApplication(CargoRepository repository)
	{
		this.repository=repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataEstudoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo=new Cargo();
		cargo.setDescricao("DESENVOLVEDOR DE SOFTWARE");

		//SALVA NA BASE DE DADOS
		repository.save(cargo);
	}
}
