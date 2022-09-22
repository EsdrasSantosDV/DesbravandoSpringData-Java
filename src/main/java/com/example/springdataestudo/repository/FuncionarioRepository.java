package com.example.springdataestudo.repository;


import com.example.springdataestudo.model.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
}
