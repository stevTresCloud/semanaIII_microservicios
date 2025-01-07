package com.actividadiii.microserviciomongodb.repository;

import com.actividadiii.microserviciomongodb.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}