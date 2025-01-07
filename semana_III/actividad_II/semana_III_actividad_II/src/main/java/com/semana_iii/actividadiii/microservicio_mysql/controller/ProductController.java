package com.semana_iii.actividadiii.microservicio_mysql.controller;

import com.semana_iii.actividadiii.microservicio_mysql.entity.ProductEntity;
import com.semana_iii.actividadiii.microservicio_mysql.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductEntity> findAll() {
        return productService.findAll();
    }

    @PostMapping
    public ProductEntity save(@RequestBody ProductEntity productEntity) {
        return productService.save(productEntity);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<ProductEntity> update(@PathVariable Long id, @RequestBody ProductEntity productEntity) {
//        ProductEntity updatedProduct = productService.update(id, productEntity);
//        if (updatedProduct == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(updatedProduct);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> findById(@PathVariable Long id) {
        ProductEntity productEntity = productService.findById(id);
        if (productEntity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        productService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
