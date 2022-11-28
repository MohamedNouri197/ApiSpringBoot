package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Client;
@Repository
public interface IClientServices {
public Client AddClient(Client c);
public List<Client> getAllClient();
}
