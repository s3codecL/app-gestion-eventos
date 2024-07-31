package com.gestion.productos.servicio;

import com.gestion.productos.entidades.Evento;
import com.gestion.productos.repositorio.EventoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoServicio {

    @Autowired
    private EventoRepositorio eventoRepositorio;

    public List<Evento> listAll(String palabraClave) {

        if (palabraClave != null) {
            return eventoRepositorio.findAll(palabraClave);
        }

            return eventoRepositorio.findAll();

    }

    public void save(Evento evento){
        eventoRepositorio.save(evento);
    }

    public Evento get(Long id){
        return eventoRepositorio.findById(id).get() ;
    }

    public void delete(Long id){

        eventoRepositorio.deleteById(id);
    }
}
