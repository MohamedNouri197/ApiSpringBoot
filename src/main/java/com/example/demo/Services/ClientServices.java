package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Commande;
import com.example.demo.Repository.ClientRepisotory;
import com.example.demo.Repository.CommandeRepisotory;
@Service

public class ClientServices implements IClientServices {

	@Autowired
	ClientRepisotory clientRepo;
	
	@Autowired
	CommandeRepisotory commandeRepo;
	
	@Override
	public Client AddClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepo.save(c);
	}


	@Override
	public List<Client> getAllClient() {
		  
		return (List<Client>) clientRepo.findAll();
	}

}
