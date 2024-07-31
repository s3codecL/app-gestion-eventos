package com.gestion.productos.controlador;

import com.gestion.productos.entidades.Evento;
import com.gestion.productos.entidades.Salon;
import com.gestion.productos.servicio.EventoServicio;
import com.gestion.productos.servicio.SalonServicio;
import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EventoControlador {

    private static final Logger logger = LoggerFactory.getLogger(EventoControlador.class);

    @Autowired
    private EventoServicio eventoServicio;

    @Autowired
    private SalonServicio salonServicio;

    @Operation(summary = "Obtiene la lista de eventos en la pagina de inicio y filtra por palabra clave")
    @ApiResponse(responseCode = "200", description = "HTTP STATUS 200")
    @RequestMapping(value ="/" ,method = RequestMethod.GET)
    public String verPaginaDeInicio(Model modelo, @Param("palabraClave") String palabraClave){

        List<Evento> listarEventos = eventoServicio.listAll(palabraClave);

        modelo.addAttribute("palabraClave", palabraClave);
        modelo.addAttribute("listarEventos", listarEventos);

        return "index" ;
    }

    @Operation(summary = "Redirige a una nueva pagina para registrar un evento")
    @ApiResponse(responseCode = "200", description = "HTTP STATUS 200")
    @RequestMapping(value = "/nuevo" ,method = RequestMethod.GET)
    public String mostrarFormularioDeRegistrarProducto(Model modelo){

        logger.info("=========================Pagina para registrar el evento =======================");


        List<Salon> salones = salonServicio.salonList();

        Evento evento = new Evento();
        modelo.addAttribute("evento" , evento);
        modelo.addAttribute("salones", salones);

        logger.info("=========================Evento nuevo =======================");
        logger.info("evento ==>: {}", evento.toString());

        return "eventos/nuevo_evento";

    }

    @Operation(summary = "Guarda un nuevo evento")
    @ApiResponse(responseCode = "200", description = "HTTP STATUS 200")
    @RequestMapping(value ="guardar" ,method = RequestMethod.POST)
    public String guardarEvento(@ModelAttribute("evento") Evento evento){

        logger.info("=========================Nuevo evento a guardar =======================");
        logger.info("evento ==>: {}", evento.toString());
        logger.info("===============================================");

        eventoServicio.save(evento);
        return "redirect:/" ;
    }

    @Operation(summary = "Edita un evento")
    @ApiResponse(responseCode = "200", description = "HTTP STATUS 200")
    @RequestMapping(value = "/editar/{id}")
    public ModelAndView mostrarFormularioDeEditarEvento(@PathVariable(name = "id") Long id){

        ModelAndView modelo = new ModelAndView("eventos/editar_evento");
        Evento evento = eventoServicio.get(id);
        List<Salon> salones = salonServicio.salonList();


        modelo.addObject("salones", salones);
        modelo.addObject("evento",evento);

        logger.info("=========================evento editado =======================");
        logger.info("evento ==>  : {}", evento.toString());
        logger.info("================================================");


        return modelo ;
    }


    @RequestMapping("/eliminar/{id}")
    public String EliminarProducto(@PathVariable(name = "id") Long id){

        logger.info("=========================Nuevo evento a eliminar =======================");
        logger.info("Se obtiene el ID a eliminar : {}", id);
        logger.info("================================================");
        eventoServicio.delete(id);
        return "redirect:/" ;
    }

}