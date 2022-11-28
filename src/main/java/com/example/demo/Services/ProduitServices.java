package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Produit;
import com.example.demo.Repository.ProduitRepisotory;
@Service
public class ProduitServices implements IProduitServices {

	@Autowired
	ProduitRepisotory produitRepo;
	
	
	@Override
	public Produit AddProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitRepo.save(p);
	}


	@Override
	public List<Produit> FindAllProducts() {
		 
		return (List<Produit>) produitRepo.findAll();
	}

}
