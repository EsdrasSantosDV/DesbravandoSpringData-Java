package com.example.springdataestudo;

import com.example.springdataestudo.model.Cargo;
import com.example.springdataestudo.repository.CargoRepository;
import com.example.springdataestudo.service.CrudCargoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringDataEstudoApplication implements CommandLineRunner {

	private  final CrudCargoService cargoservice;

	private  Boolean system=true;

	public  SpringDataEstudoApplication(CrudCargoService cargoservice)
	{
		this.cargoservice=cargoservice;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataEstudoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner= new Scanner(System.in);


		while(system)
		{
			System.out.println("Qual acao?");
			System.out.println("0---sair");
			System.out.println("1---Cargo");

			int action = scanner.nextInt();

			if(action == 1)
			{
				cargoservice.inicial(scanner);

			}
			else
			{
				system=false;

			}

		}


	}
}
