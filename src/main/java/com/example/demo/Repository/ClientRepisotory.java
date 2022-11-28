package com.example.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Client;
public interface ClientRepisotory extends CrudRepository<Client, Long> {

}
