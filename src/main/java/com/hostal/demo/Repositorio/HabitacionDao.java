package com.hostal.demo.Repositorio;

import com.hostal.demo.Modelo.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionDao extends JpaRepository<Habitacion, Long> {
}
