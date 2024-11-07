package com.ecomerce.spring.Producto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "producto")
public class productoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProd;
    private String nomProd;
    private String descripcion;
    private Double precio;
    private Integer stock;
    private String urlImg;


}
