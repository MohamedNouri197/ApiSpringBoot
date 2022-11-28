package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Commande;
import com.example.demo.Entities.Fournisseur;
public interface CommandeRepisotory extends CrudRepository<Commande, Long> {

}
