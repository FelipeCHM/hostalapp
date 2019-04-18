package com.hostal.demo.Repositorio;

import com.hostal.demo.Modelo.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioDao extends JpaRepository<Servicio,Long> {
}
