package com.sanchezz.gestion.empleado.controlador;

import com.sanchezz.gestion.empleado.modelo.Empleado;
import com.sanchezz.gestion.empleado.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorio;

    @GetMapping("/empleados")
    public List<Empleado> listarEmpleados() {
        return repositorio.findAll();
    }
}
