package com.sanchezz.gestion.empleado.repositorio;

import com.sanchezz.gestion.empleado.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}
