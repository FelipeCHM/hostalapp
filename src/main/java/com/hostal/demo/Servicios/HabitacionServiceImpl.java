package com.hostal.demo.Servicios;

import com.hostal.demo.Modelo.Habitacion;
import com.hostal.demo.Repositorio.HabitacionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class HabitacionServiceImpl implements IHabitacionService {
    @Autowired
    private HabitacionDao habitacionDao;

    @PersistenceContext
    private EntityManager em;


    @Transactional(readOnly = true)
    @Override
    public List<Habitacion> buscarTodos() {
        return em.createQuery("from Habitacion").getResultList();
    }

    @Override
    public void save(Habitacion habitacion) {
        if (habitacion.getId_habitacion() != null) {
            em.merge(habitacion);
        } else {
            em.persist(habitacion);
        }

    }

    @Override
    public List<Habitacion> buscarHabitaciones(Long id) {
        return null;
    }

    @Override
    public Habitacion buscarHabitacionPorId(Long id) {
        return habitacionDao.findById(id).orElse(null);

    }

    @Override
    public void borrarHabitacionPorId(Long id) {
        Habitacion p = buscarHabitacionPorId(id);
        System.out.println("del_method");
        if(p.getId_habitacion().equals(id)){
            habitacionDao.delete(p);
            System.out.println("deleted");
        }
    }

    @Override
    public void listarEnOrdenTipo(List<Habitacion> habitaciones) {
        Collections.sort(habitaciones, new Comparator<Habitacion>() {
            @Override
            public int compare(Habitacion o1, Habitacion o2) {
                return o1.getTipo().compareToIgnoreCase(o2.getTipo());
            }
        });
    }


}
