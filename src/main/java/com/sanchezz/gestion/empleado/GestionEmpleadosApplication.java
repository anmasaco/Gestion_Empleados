package com.sanchezz.gestion.empleado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GestionEmpleadosApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext contex = SpringApplication.run(GestionEmpleadosApplication.class, args);
    }
}
