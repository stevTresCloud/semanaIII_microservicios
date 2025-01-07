package com.semana_iii.actividadiii.microservicio_mysql.repository;

import com.semana_iii.actividadiii.microservicio_mysql.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
