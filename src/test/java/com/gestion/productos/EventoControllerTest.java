package com.gestion.productos;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.gestion.productos.entidades.Evento;
import com.gestion.productos.entidades.Salon;
import com.gestion.productos.servicio.EventoServicio;
import com.gestion.productos.servicio.SalonServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest
public class EventoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EventoServicio eventoServicio;

    @MockBean
    private SalonServicio salonServicio;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testVerPaginaDeInicio() throws Exception {
        // Crear datos de prueba
        Salon salon = new Salon();
        salon.setId(1L);
        salon.setNombre("Salon A");
        salon.setCapacidad(150);
        salon.setDescripcion("Salon para fiestas familiares");

        Evento evento1 = new Evento();
        evento1.setId(1L);
        evento1.setNombre("Evento 1");
        evento1.setFecha(LocalDate.now());
        evento1.setInvitados(100);
        evento1.setSalon(salon);

        Evento evento2 = new Evento();
        evento2.setId(2L);
        evento2.setNombre("Evento 2");
        evento2.setFecha(LocalDate.now().plusDays(1));
        evento2.setInvitados(150);
        evento2.setSalon(salon);

        List<Evento> listarEventos = Arrays.asList(evento1, evento2);

        // Simular el comportamiento del servicio
        when(eventoServicio.listAll("test")).thenReturn(listarEventos);

        // Realizar la solicitud GET y verificar los resultados
        mockMvc.perform(get("/")
                        .param("palabraClave", "test"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attributeExists("palabraClave"))
                .andExpect(model().attributeExists("listarEventos"))
                .andExpect(model().attribute("palabraClave", "test"))
                .andExpect(model().attribute("listarEventos", listarEventos));
    }
}
