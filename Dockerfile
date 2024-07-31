#Usar una imagen base que incluya Java 17
FROM openjdk:17-jdk-alpine

#Establecer el directorio de trabajo en el contenedor
WORKDIR /app

#Copiar el archivo JAR en el contenedor
COPY target/gestion-eventos-0.0.1-SNAPSHOT.jar /app/gestion-eventos-0.0.1-SNAPSHOT.jar

#Exponer el puerto en el que tu aplicación se ejecutará (ajusta según sea necesario)
EXPOSE 8081

#Comando para ejecutar tu aplicación
ENTRYPOINT ["java", "-jar", "/app/gestion-eventos-0.0.1-SNAPSHOT.jar"]

# CREAR IMAGEN
#docker build -t gestion-eventos:0.0.1-SNAPSHOT.jar .

# Construir la imagen
#docker build -t gestion-eventos:0.0.1 .

# Ejecutar la imagen en un contenedor
#docker run -p 8081:8081 gestion-eventos
