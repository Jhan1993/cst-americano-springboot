package com.cst.cst_americano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class CstAmericanoApplication implements CommandLineRunner {
    
    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
	SpringApplication.run(CstAmericanoApplication.class, args);
                
        // Aquí Spring Boot automáticamente configurará la conexión a la base de datos
        // utilizando las propiedades especificadas en application.properties.
        //
        // El `DataSource` es autoconfigurado por Spring Boot y estará disponible 
        // para ser inyectado en los repositorios o servicios donde se necesite acceso
        // a la base de datos.
                
    }

    //Esto nos mostrara en consoloa si la conexion a la bade de datos es exitosa
    //No es necesario para que la aplicacion se ejecute
    @Override
    public void run(String... args) {
        try (Connection connection = dataSource.getConnection()) {
            // Si la conexión es exitosa, se muestra el siguiente mensaje
            System.out.println("¡Conexión a la base de datos establecida con éxito!");
            System.out.println("URL de la base de datos: " + connection.getMetaData().getURL());
            System.out.println("Usuario conectado: " + connection.getMetaData().getUserName());
        } catch (SQLException e) {
            // Si hay un error al conectar, se muestra un mensaje de error
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
