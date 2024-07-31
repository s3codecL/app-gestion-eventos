package com.gestion.productos.repositorio;

import com.gestion.productos.entidades.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventoRepositorio extends JpaRepository <Evento, Long>{

    @Query("SELECT p from Evento p WHERE" +
            " CONCAT(p.id , p.nombre , p.fecha)"
            + "LIKE %?1%")

    public List<Evento> findAll(String palabraClave);
}
