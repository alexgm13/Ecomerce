package com.ecomerce.spring.Categoria;

import jakarta.persistence.*;
import lombok.Data;
import com.ecomerce.spring.Producto.productoModel;

import java.util.List;

@Entity
@Data
@Table(name = "categoria")
public class categoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;
    private String catNom;
    private String urlImg;

    @OneToMany(cascade = CascadeType.ALL)
    private List<productoModel> producto;
}
