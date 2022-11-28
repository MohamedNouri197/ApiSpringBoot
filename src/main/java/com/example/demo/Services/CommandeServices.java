package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Commande;
import com.example.demo.Entities.Produit;
import com.example.demo.Repository.ClientRepisotory;
import com.example.demo.Repository.CommandeRepisotory;
import com.example.demo.Repository.ProduitRepisotory;
@Service
public class CommandeServices  implements ICommandeServices{

	@Autowired
	CommandeRepisotory commandeRepo;
	@Autowired
	ProduitRepisotory produitRepo;

	 @Autowired
	 ClientRepisotory clientRep;
	
	@Override
	public Commande Commander(Commande cmnd) {
	return commandeRepo.save(cmnd);
	}


	@Override
	public Commande ProduitToCommande(Long idp, Long idcom) {
		   Produit p=produitRepo.findById(idp).get();
		   System.out.println(p.toString());
		   Commande c=commandeRepo.findById(idcom).get();
		   System.out.println(c.toString());
		  /* c.getListeProd().add(p);*/
		return commandeRepo.save(c);
	}


	@Override
	public List<Commande> getAllCommande() {
		// TODO Auto-generated method stub
		return (List<Commande>) commandeRepo.findAll();
	}


	



}
