package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Produit;
import com.example.demo.Services.ProduitServices;

@RestController
public class ProduitController {
 
	@Autowired
	ProduitServices prodServices;
	@PostMapping("/AddProduit")
	public Produit AddProduit( @RequestBody Produit p) {
		return prodServices.AddProduit(p);
		
	}
	@GetMapping("/FindAllProduits")
	public List <Produit> FindAllProduits(){
		return prodServices.FindAllProducts();
	}
	
	
	
}
