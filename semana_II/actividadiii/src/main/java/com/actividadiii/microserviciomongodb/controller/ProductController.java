package com.actividadiii.microserviciomongodb.controller;

import com.actividadiii.microserviciomongodb.entity.ProductEntity;
import com.actividadiii.microserviciomongodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductController {

    @Autowired
    private ProductService productoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> listarTodos() {
        return productoService.listarTodos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity guardar(@RequestBody ProductEntity producto) {
        return productoService.guardar(producto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> obtenerPorId(@PathVariable String id) {
        ProductEntity producto = productoService.obtenerPorId(id);
        return producto != null ? ResponseEntity.ok(producto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        productoService.eliminar(id);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<ProductEntity> update(@PathVariable String id, @RequestBody ProductEntity productEntity) {
//        ProductEntity updatedProduct = productoService.actualizar(id, productEntity);
//        if (updatedProduct == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(updatedProduct);
//    }
}