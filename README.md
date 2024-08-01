# AppManageEvents
![GitHub contributors](https://img.shields.io/github/contributors/yourusername/yourrepository)
![GitHub last commit](https://img.shields.io/github/last-commit/yourusername/yourrepository)
![GitHub issues](https://img.shields.io/github/issues/yourusername/yourrepository)
![GitHub pull requests](https://img.shields.io/github/issues-pr/yourusername/yourrepository)
![GitHub forks](https://img.shields.io/github/forks/yourusername/yourrepository?style=social)

## Introducción
**AppManageEvents** es una aplicación diseñada para gestionar eventos, permitiendo la interacción con entidades de eventos y salones. Este proyecto es realizado por un equipo de talento digital altamente cualificado.

### Presentación de Equipo
- Cristopher Vergara
- Erasto Borthomierth
- Gabriel Muñoz
- Gustavo Andrade
- Jesús Seiler
- Sixto Felipe

## CVS
Utilizamos **GitHub** para el manejo de versiones y trabajo en equipo.

## Herramientas para aplicar DevOps
- Webhooks
- Jenkins

## Stack
- Java Spring Boot
- Thymeleaf
- PostgreSQL

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

## Duración Estimada del Desarrollo
- **CRUD básico**: 2 semanas
- **UI con Thymeleaf**: 1 semana
- **Integración con PostgreSQL**: 1 semana
- **Pruebas con JUnit**: 1 semana
- **Total estimado**: 5 semanas

## Despliegue
Utilizamos un enfoque de CI/CD con Jenkins para:
- **CI**: Automatización de pruebas y construcción de la aplicación.
- **CD**: Automatización del despliegue en producción.

## Comandos
```bash
$ java -jar AppManageEvents-0.0.1-RELEASE.jar
$ mvn clean install
$ mvn spring-boot:run
