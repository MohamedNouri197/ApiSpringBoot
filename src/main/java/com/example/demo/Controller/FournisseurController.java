package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Fournisseur;
import com.example.demo.Services.FournisseurServices;

@RestController
public class FournisseurController {

	@Autowired
	FournisseurServices frsServices;
	
	@PostMapping("/AddFournisseur")
	public Fournisseur AddFournisseur( @RequestBody Fournisseur f) {
		return frsServices.AddFournisseur(f);
		
	}
	
	@PostMapping("/FourAddProduit/{idf}/{idp}")
	public Fournisseur FourAddProduit(@PathVariable("idf")Long  idf,@PathVariable("idp") Long idp) {
		
		return frsServices.FourAddPoduit(idf, idp);
	}
}
