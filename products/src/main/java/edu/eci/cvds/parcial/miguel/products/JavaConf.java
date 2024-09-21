package edu.eci.cvds.parcial.miguel.products;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase de configuracion de inyeccion de dependencias, como en este caso lo puede ser el arraylist de productos.
 */
@Configuration
@ComponentScan
public class JavaConf {

    @Bean
    public ProductManager ProductManager(ArrayList<Product> products){
        return new ProductManager(new ArrayList<>());
    }


    /* Ejemplo que use de guia
    public AuditService auditService() {
        AuditService auditService = new AuditService("INFO");
        return auditService;
    }
     */
}
