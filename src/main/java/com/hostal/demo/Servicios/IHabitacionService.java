package com.hostal.demo.Servicios;


import com.hostal.demo.Modelo.Habitacion;

import java.util.List;

public interface IHabitacionService{

    List<Habitacion> buscarTodos();

    void save(Habitacion habitacion);

    List<Habitacion> buscarHabitaciones(Long id);

    Habitacion buscarHabitacionPorId(Long id);

    void borrarHabitacionPorId(Long id);

    void listarEnOrdenTipo(List<Habitacion> Habitaciones);
}
