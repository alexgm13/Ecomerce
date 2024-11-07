package com.ecomerce.spring.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoriaRepositorie extends JpaRepository<categoriaModel, Long> {
    
}
