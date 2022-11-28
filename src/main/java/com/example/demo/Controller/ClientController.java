package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Client;
import com.example.demo.Services.ClientServices;

@RestController
public class ClientController {

	@Autowired
	ClientServices cliServices;
	
	
	@PostMapping("/addClient")
	public Client  AddClient(@RequestBody Client  c) {
		return cliServices.AddClient(c);
	}
	
	/*@PostMapping("/AjoutCommandeToClient/{idc}/{idcom}")
	public Client AjoutCommandeToClient(@PathVariable("idc") long idc,@PathVariable("idcom") long idcom) {
		
		return  cliServices.AjoutCommandeToClient(idc, idcom);
	}*/
	@GetMapping("/getAllClients")
	public List<Client> getAllClients(){
	return cliServices.getAllClient();
	}
	
	
	}
	
	
	
	
