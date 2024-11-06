package com.ecomerce.spring.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoRepositorie extends JpaRepository<productoModel, Long> {
}
