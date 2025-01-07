package com.actividadiii.microserviciomongodb.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "productos")
public class ProductEntity {
    @Id
    private String id;
    private String nombre;
    private Double precio;
    private Integer stock;
}
