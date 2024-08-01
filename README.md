![AppManageEvents](https://github.com/s3codecL/app-gestion-eventos/blob/main/src/assets/AppManageEvents-logo-resized.png)

![GitHub contributors](https://img.shields.io/github/contributors/yourusername/yourrepository)
![GitHub last commit](https://img.shields.io/github/last-commit/yourusername/yourrepository)
![GitHub issues](https://img.shields.io/github/issues/yourusername/yourrepository)
![GitHub pull requests](https://img.shields.io/github/issues-pr/yourusername/yourrepository)
![GitHub forks](https://img.shields.io/github/forks/yourusername/yourrepository?style=social)

![Linux](https://img.shields.io/badge/Linux-FCC624?&logo=linux&logoColor=black)
![Ubuntu](https://img.shields.io/badge/Ubuntu-E95420?&logo=ubuntu&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-0078D6?&logo=windows&logoColor=white)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?&logo=spring&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?&logo=Apache%20Maven&logoColor=white)

![Jenkins](https://img.shields.io/badge/jenkins-%232C5263.svg?&logo=jenkins&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?&logo=docker&logoColor=white)
![SonarQube](https://img.shields.io/badge/SonarQube-black?&logo=sonarqube&logoColor=4E9BCD)

![Slack](https://img.shields.io/badge/Slack-4A154B?&logo=slack&logoColor=white)
![Notion](https://img.shields.io/badge/Notion-%23000000.svg?&logo=notion&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?&logo=github&logoColor=white)



## Introducción

**AppManageEvents** es un sistema robusto diseñado para facilitar la gestión integral de eventos. Este proyecto nace de la necesidad de ofrecer una solución eficiente que permita a los organizadores de eventos manejar desde la logística hasta la interacción con los participantes de manera fluida y centralizada.

La aplicación permite la creación, modificación, visualización y eliminación de eventos, así como la gestión de salones, incluyendo especificaciones de capacidad y descripción detallada. Está construido utilizando tecnologías de punta como Java con Spring Boot para el backend y Apache Maven para la gestión de proyectos, asegurando así un desarrollo ágil y un despliegue eficiente.

**AppManageEvents** destaca por su capacidad para adaptarse a diferentes entornos operativos, lo que lo hace especialmente versátil para ser desplegado en diversas plataformas como Linux, Ubuntu y Windows. Gracias a su arquitectura orientada a microservicios y su enfoque en la integración y entrega continua (CI/CD) utilizando herramientas como Jenkins y Docker, el proyecto garantiza un alto rendimiento y una escalabilidad excepcional.

Ideal para organizaciones que buscan optimizar la gestión de sus eventos, **AppManageEvents** ofrece una interfaz intuitiva y un conjunto de funcionalidades que mejoran la experiencia tanto de los organizadores como de los asistentes, asegurando que cada evento se ejecute sin contratiempos y alcanzando el éxito esperado.

### Presentación de Equipo
- Cristopher Vergara
- Erasto Borthomierth
- Gabriel Muñoz
- Gustavo Andrade
- Jesús Seiler
- Sixto Felipe

## Herramientas DevOps
- ![Jenkins](https://img.shields.io/badge/jenkins-%232C5263.svg?&logo=jenkins&logoColor=white)
- ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?&logo=docker&logoColor=white)
- ![SonarQube](https://img.shields.io/badge/SonarQube-black?&logo=sonarqube&logoColor=4E9BCD)

## Stack Tecnológico
- ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?&logo=openjdk&logoColor=white)
- ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?&logo=spring&logoColor=white)
- ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?&logo=Apache%20Maven&logoColor=white)

## Sistemas Operativos Soportados
- ![Linux](https://img.shields.io/badge/Linux-FCC624?&logo=linux&logoColor=black)
- ![Ubuntu](https://img.shields.io/badge/Ubuntu-E95420?&logo=ubuntu&logoColor=white)
- ![Windows](https://img.shields.io/badge/Windows-0078D6?&logo=windows&logoColor=white)


## Pruebas
Utilizamos **JUnit** para las pruebas unitarias.

## Requerimientos
### Entidades / Funciones Clave de la Aplicación
#### CRUD para Gestión de Eventos:
##### Entidades:
- **Evento**:
    - Id
    - Nombre
    - Fecha
    - Invitados
- **Salón**:
    - Id
    - Descripción
    - Capacidad

##### Funcionalidades:
- CRUD básico para eventos.
- Listar todos los eventos.
- CRUD básico para salones.
- Asignar salones a eventos.

### Funcionalidades Adicionales
- Registrar evento.
- Asignar salón para el evento.
- Editar evento.
- Eliminar evento.

## Cronograma de Desarrollo
- **CRUD básico**: 2 semanas
- **UI con Thymeleaf**: 1 semana
- **Integración con PostgreSQL**: 1 semana
- **Pruebas con JUnit**: 1 semana
- **Total estimado**: 5 semanas

## Despliegue
Utilizamos un enfoque de CI/CD con Jenkins para:
- **CI**: Automatización de pruebas y construcción de la aplicación.
- **CD**: Automatización del despliegue en producción.

## Comunicación y Documentación
- ![Slack](https://img.shields.io/badge/Slack-4A154B?&logo=slack&logoColor=white) - comunicación interna.
- ![Notion](https://img.shields.io/badge/Notion-%23000000.svg?&logo=notion&logoColor=white) - gestión de tareas y documentación del proyecto.
- ![GitHub](https://img.shields.io/badge/github-%23121011.svg?&logo=github&logoColor=white) - control de versiones y colaboración en código.

## Clonar y Configurar el Proyecto
Para clonar y ejecutar este proyecto, necesitarás Git, JDK y Maven instalados en tu máquina. Desde tu terminal:

```bash
# Clonar este repositorio
git clone https://github.com/yourusername/AppManageEvents.git
# Ir al directorio del repositorio
cd AppManageEvents
# Instalar dependencias
mvn install
# Compilar el proyecto
mvn clean package


# Importante
$ java -jar AppManageEvents-0.0.1-RELEASE.jar
$ mvn clean install
$ mvn spring-boot:run
```

## Ejecución del Proyecto en IntelliJ IDEA
Para ejecutar el proyecto en IntelliJ IDEA, sigue estos pasos:

- [x] 1. Abrir IntelliJ IDEA y seleccionar File > Open.... 
- [ ] 2. Navegar hasta el directorio donde se encuentra el proyecto y seleccionarlo.
- [ ] 3. Esperar a que IntelliJ IDEA termine de indexar el proyecto y reconozca el archivo pom.xml.
- [ ] 4. Configurar el JDK adecuado en File > Project Structure > Project.
- [ ] 5. Abrir la clase que contiene el método main (generalmente Application.java o similar).
- [ ] 6. Ejecutar el proyecto haciendo clic derecho sobre el archivo y seleccionando Run 'Application'.
- [ ] 7. Verificar que la aplicación se esté ejecutando accediendo al navegador en http://localhost:8080.
   
Comandos para Levantar el Proyecto
Para iniciar el servidor de desarrollo directamente desde la línea de comandos, puedes usar:
```bash

mvn spring-boot:run
```
