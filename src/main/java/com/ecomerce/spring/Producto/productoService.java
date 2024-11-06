package com.ecomerce.spring.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productoService {

    @Autowired
    private productoRepositorie prodRepo;

    public List<productoModel> getAllproductos(){
        return prodRepo.findAll();
    }
}
