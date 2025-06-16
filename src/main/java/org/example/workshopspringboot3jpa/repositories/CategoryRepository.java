package org.example.workshopspringboot3jpa.repositories;

import org.example.workshopspringboot3jpa.entities.Category;
import org.example.workshopspringboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}