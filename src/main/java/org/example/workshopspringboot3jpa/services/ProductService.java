package org.example.workshopspringboot3jpa.services;

import org.example.workshopspringboot3jpa.entities.Product;
import org.example.workshopspringboot3jpa.entities.User;
import org.example.workshopspringboot3jpa.repositories.ProductRepository;
import org.example.workshopspringboot3jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
