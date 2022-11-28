package com.example.demo.Repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entities.Fournisseur;

public interface FournisseurRepisotory extends CrudRepository<Fournisseur, Long> {

}
