package com.semana_iii.actividadiii.microservicio_mysql.service;

import com.semana_iii.actividadiii.microservicio_mysql.entity.ProductEntity;
import com.semana_iii.actividadiii.microservicio_mysql.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    public ProductEntity findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

//    public ProductEntity update(Long id, ProductEntity productEntity) {
//        productEntity.setId(id);
//        return productRepository.save(productEntity);
//    }
}
