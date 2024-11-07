package com.ecomerce.spring.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class productoController {
    @Autowired
    private productoService prodServ;

    @GetMapping("/obtenerListaProducto")
    public List<productoModel> obtenerListaProducto(){

        return prodServ.getAllproductos();
    }
}
