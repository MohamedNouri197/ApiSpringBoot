package com.example.demo.Services;

import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Categorie;
@Repository
public interface ICategorieServices {
public Categorie addCategorie(Categorie c);


public Categorie AddProduitToCategorie(Long idcat, Long idp);
}
