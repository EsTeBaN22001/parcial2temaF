package com.parcial2temaf;

public class DocumentoHardware {
    private String titulo;
    private String especificaciones;

    public DocumentoHardware(String titulo, String especificaciones) {
        this.titulo = titulo;
        this.especificaciones = especificaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }
}
