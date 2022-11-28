package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Categorie;
import com.example.demo.Services.CategorieServices;

@RestController
public class CategorieController {
   
	@Autowired
  CategorieServices CatServices;
	@PostMapping("/AddCategorie")
	public Categorie addCategorie ( @RequestBody Categorie  c) {
		return CatServices.addCategorie(c);
		
	}
	
	@PostMapping("/AddProduitToCategorie/{idcat}/{idp}")
	public Categorie AddProduitToCategorie(@PathVariable("idcat") Long idcat,@PathVariable("idp") Long idp) {
		
		return CatServices.AddProduitToCategorie(idcat, idp);
	}
	
	
	
	
}
