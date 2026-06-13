package com.parcial2temaf;

import java.util.Date;

public class VisitaTecnica {
    private int numero;
    private Domicilio ubicacion;
    private String tamaño;
    private Date fechaCreacion;
    private Date fechaReparacion;
    private String observaciones;
    private Cuadrilla cuadrilla;
    private SolicitudArreglo solicitud;

    public VisitaTecnica(int numero, Domicilio ubicacion, String tamaño, Date fechaCreacion, Cuadrilla cuadrilla, SolicitudArreglo solicitud) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
        this.fechaCreacion = fechaCreacion;
        this.cuadrilla = cuadrilla;
        this.solicitud = solicitud;
    }

    public void registrarReparacion(Date fecha, String observaciones) {
        this.fechaReparacion = fecha;
        this.observaciones = observaciones;
    }

    public boolean estaFinalizada() {
        return this.fechaReparacion != null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Domicilio getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Domicilio ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(Date fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cuadrilla getCuadrilla() {
        return cuadrilla;
    }

    public void setCuadrilla(Cuadrilla cuadrilla) {
        this.cuadrilla = cuadrilla;
    }

    public SolicitudArreglo getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(SolicitudArreglo solicitud) {
        this.solicitud = solicitud;
    }
}
