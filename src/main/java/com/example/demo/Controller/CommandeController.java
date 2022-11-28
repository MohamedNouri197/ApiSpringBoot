package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Commande;
import com.example.demo.Services.CommandeServices;

@RestController
public class CommandeController {

	@Autowired
	CommandeServices cmdServices;
	
	@PostMapping("/Commander")
	public Commande Commander(@RequestBody Commande cmd) {
	return cmdServices.Commander(cmd);
	}

	@GetMapping("/getAllCommande")
	public List<Commande> getAllCommande(){
		return cmdServices.getAllCommande();
	}
	
	
}
