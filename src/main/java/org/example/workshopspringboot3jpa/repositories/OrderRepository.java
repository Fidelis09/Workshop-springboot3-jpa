package org.example.workshopspringboot3jpa.repositories;

import org.example.workshopspringboot3jpa.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}