package com.hostal.demo.Repositorio;

import com.hostal.demo.Modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaDao extends JpaRepository<Reserva, Long> {
}
