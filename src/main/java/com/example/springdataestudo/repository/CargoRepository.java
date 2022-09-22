package com.example.springdataestudo.repository;

import com.example.springdataestudo.model.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends CrudRepository<Cargo,Integer> {


}
