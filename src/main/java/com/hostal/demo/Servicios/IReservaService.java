package com.hostal.demo.Servicios;

import com.hostal.demo.Modelo.Reserva;

import java.util.List;

public interface IReservaService {

    List<Reserva> buscarTodos();

    void save(Reserva habitacion);

    List<Reserva> buscarReserva(Long id);

    Reserva buscarReservaPorId(Long id);

    void borrarReservaPorId(Long id);

    void listarEnOrden(List<Reserva> Reservas);
}
