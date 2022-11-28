package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Categorie;
public interface CategorieRepisotory extends CrudRepository<Categorie, Long> {

}
