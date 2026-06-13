package com.parcial2temaf;

public class Trabajador {
    private int id;
    private String nombre;
    private String puesto;
    private String estadoLibreOcupado;

    public Trabajador(int id, String nombre, String puesto, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.estadoLibreOcupado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEstadoLibreOcupado() {
        return estadoLibreOcupado;
    }

    public void setEstadoLibreOcupado(String estadoLibreOcupado) {
        this.estadoLibreOcupado = estadoLibreOcupado;
    }
}
