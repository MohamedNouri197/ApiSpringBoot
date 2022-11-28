package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Categorie;
import com.example.demo.Entities.Produit;
import com.example.demo.Repository.CategorieRepisotory;
import com.example.demo.Repository.ProduitRepisotory;
@Service
public class CategorieServices implements ICategorieServices {
 
	
	 @Autowired
	 CategorieRepisotory categorieRepo;
	
	 @Autowired
	 ProduitRepisotory produitRepo;
	
	@Override
	public Categorie addCategorie(Categorie c) {
		
		return categorieRepo.save(c);
	}


	@Override
	public Categorie AddProduitToCategorie(Long  idcat, Long  idp) {
		Categorie c=categorieRepo.findById(idcat).get();
		Produit p=produitRepo.findById(idp).get();
		 c.getProduits().add(p);
		return categorieRepo.save(c);
	}

}
