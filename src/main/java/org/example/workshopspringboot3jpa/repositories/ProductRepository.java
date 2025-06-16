package org.example.workshopspringboot3jpa.repositories;

import org.example.workshopspringboot3jpa.entities.Category;
import org.example.workshopspringboot3jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}