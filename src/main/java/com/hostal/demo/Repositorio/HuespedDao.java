package com.hostal.demo.Repositorio;

import com.hostal.demo.Modelo.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HuespedDao extends JpaRepository<Huesped, Long> {
}
