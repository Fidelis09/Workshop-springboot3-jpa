package org.example.workshopspringboot3jpa.services;

import org.example.workshopspringboot3jpa.entities.Order;
import org.example.workshopspringboot3jpa.entities.User;
import org.example.workshopspringboot3jpa.repositories.OrderRepository;
import org.example.workshopspringboot3jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
