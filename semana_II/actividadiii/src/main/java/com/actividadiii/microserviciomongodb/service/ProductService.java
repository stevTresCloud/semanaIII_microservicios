package com.actividadiii.microserviciomongodb.service;

import com.actividadiii.microserviciomongodb.entity.ProductEntity;
import com.actividadiii.microserviciomongodb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> listarTodos() {
        return productRepository.findAll();
    }

    public ProductEntity guardar(ProductEntity producto) {
        return productRepository.save(producto);
    }

    public ProductEntity obtenerPorId(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        productRepository.deleteById(id);
    }

//    public ProductEntity actualizar(String id, ProductEntity productEntity){
//        productEntity.setId(id);
//        return productRepository.save(productEntity);
//    }
}