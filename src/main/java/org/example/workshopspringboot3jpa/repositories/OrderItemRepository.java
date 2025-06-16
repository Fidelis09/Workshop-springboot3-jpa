package org.example.workshopspringboot3jpa.repositories;

import org.example.workshopspringboot3jpa.entities.OrderItem;
import org.example.workshopspringboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}