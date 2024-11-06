package com.ecomerce.spring.Categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoriaServicie {
    @Autowired
    private categoriaRepositorie catRep;
    public List<categoriaModel> getAllCategorias()
    {
        return catRep.findAll();
    }

}
