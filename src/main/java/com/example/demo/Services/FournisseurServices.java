package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Fournisseur;
import com.example.demo.Entities.Produit;
import com.example.demo.Repository.FournisseurRepisotory;
import com.example.demo.Repository.ProduitRepisotory;
@Service
public class FournisseurServices implements IFournisseurServices {

	@Autowired
	FournisseurRepisotory FournisseurRepo;
	
	@Autowired
	ProduitRepisotory ProduitRepo;
	
	@Override
	public Fournisseur AddFournisseur(Fournisseur f) {
		
		return FournisseurRepo.save(f);
	}

	@Override
	public Fournisseur FourAddPoduit(Long idf, Long idp) {
		Produit p= ProduitRepo.findById(idp).get();
		Fournisseur f=FournisseurRepo.findById(idf).get();
	/*	f.getListeProduits().add(p);
		;*/
		return FournisseurRepo.save(f);
	}

	
}
