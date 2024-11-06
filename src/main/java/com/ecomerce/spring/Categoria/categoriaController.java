package com.ecomerce.spring.Categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class categoriaController {
    @Autowired
    private categoriaServicie cateSer;

    @GetMapping("/listarCategoria")
    public List<categoriaModel> listarCategoria()
    {
        return cateSer.getAllCategorias();
    }



}
