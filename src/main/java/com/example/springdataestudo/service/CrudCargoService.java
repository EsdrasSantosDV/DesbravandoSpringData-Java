package com.example.springdataestudo.service;

import com.example.springdataestudo.model.Cargo;
import com.example.springdataestudo.repository.CargoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudCargoService {

    private Boolean system=true;
    private final CargoRepository cargoRepository;

    public CrudCargoService(CargoRepository cargoRepository)
    {
        this.cargoRepository=cargoRepository;
    }

    public void inicial(Scanner scanner){
        while (system)
        {
            System.out.println("Qual acao deseja executar");
            System.out.println("0--Sair");
            System.out.println("1--Salvar");
            System.out.println("2--Atualizar");
            System.out.println("3--Listar");
            System.out.println("4--Deletar");

            int opc= scanner.nextInt();
            switch (opc){
                case 1:
                    salvar(scanner);
                    break;
                case 2:
                    atualizar(scanner);
                    break;
                case 3:
                    visualizar();
                    break;
                case 4:
                    deletar(scanner);
                    break;
                default:
                    system=false;
                    break;
            }
        }
        salvar(scanner);
    }

    private void deletar(Scanner scanner) {
        System.out.println("Digite o Id");
        Integer id=scanner.nextInt();
        cargoRepository.deleteById(id);
        System.out.println("Deletado");
    }

    private void salvar(Scanner scanner)
    {
        System.out.println("Descricao do Cargo");
        String descricao=scanner.next();
        Cargo cargo = new Cargo();
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);
        System.out.println("Salvo");
    }

    private void atualizar(Scanner scanner)
    {
        System.out.println("Digite o Id");
        Integer id=scanner.nextInt();
        System.out.println("Descricao do Cargo");
        String descricao=scanner.next();
        Cargo cargo = new Cargo();
        cargo.setId(id);
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);
        System.out.println("Atualizado");
    }

    private void visualizar()
    {
        Iterable<Cargo> cargos=cargoRepository.findAll();

        cargos.forEach(cargo->System.out.println("\n"+cargo.toString()));

    }


}
