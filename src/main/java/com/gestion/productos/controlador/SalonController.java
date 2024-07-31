package com.gestion.productos.controlador;
import com.gestion.productos.servicio.SalonServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SalonController {

    @Autowired
    SalonServicio salonServicio;


}
