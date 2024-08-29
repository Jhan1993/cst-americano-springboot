package com.cst.cst_americano.model;

import jakarta.persistence.*;

//Aqui estara representada nuestra base de datos, la clase @Entity la representara

@Entity
@Table(name = "cliente")
public class Cliente {

    //Cada campo de la clase corresponderá a una columna en la tabla.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_doc", nullable = false)
    private String tipoDoc;

    @Column(name = "numero_documento", nullable = false, unique = true)
    private String numeroDocumento;

    @Column(name = "nombre_cliente", nullable = false)
    private String nombreCliente;

    @Column(name = "apellido_cliente", nullable = false)
    private String apellidoCliente;

    @Column(name = "ciudad_cliente", nullable = false)
    private String ciudadCliente;

    @Column(name = "direccion_cliente", nullable = false)
    private String direccionCliente;

    @Column(name = "telefono_cliente", nullable = false)
    private String telefonoCliente;

    @Column(name = "correo_cliente", nullable = false)
    private String correoCliente;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }
}
