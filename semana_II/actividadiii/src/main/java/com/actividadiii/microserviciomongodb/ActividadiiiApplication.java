package com.actividadiii.microserviciomongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ActividadiiiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActividadiiiApplication.class, args);
    }

}
