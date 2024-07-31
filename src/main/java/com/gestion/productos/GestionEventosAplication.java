package com.gestion.productos;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Aplicacion de ejemplo para registrar eventos",
                description = "Aplicacion para el curso de Devops",
                version = "v1",
                contact = @Contact(
                        name = "Cristopher Vergara",
                        email = "cristopher.vergara.colombo@outlook.com",
                        url = "https://www.linkedin.com/in/cristophervergaracolombo/"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "El proyecto se encuentra en GitHub",
                url = "https://github.com/colombo1986"
        )
)
public class GestionEventosAplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionEventosAplication.class, args);
    }


}
