package com.parcial2temaf;

import java.util.ArrayList;
import java.util.List;

public class Abonado {
    private String nombre;
    private String celular;
    private String mail;
    private boolean debitoAutomatico;
    private int password;
    private Domicilio domicilio;
    private List<SolicitudArreglo> solicitudes;

    public Abonado(String nombre, String celular, String mail, boolean debitoAutomatico, int password, Domicilio domicilio) {
        this.nombre = nombre;
        this.celular = celular;
        this.mail = mail;
        this.debitoAutomatico = debitoAutomatico;
        this.password = password;
        this.domicilio = domicilio;
        this.solicitudes = new ArrayList<>();
    }

    public boolean validarIngreso(int pass) {
        return this.password == pass;
    }

    public void cambioPassword(String newPass) {
        try {
            this.password = Integer.parseInt(newPass);
        } catch (NumberFormatException e) {
            // Manejo por si no es numérico
        }
    }

    public void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public boolean abonadosDiferentes(Abonado otro) {
        if (otro == null) return true;
        return !this.nombre.equals(otro.getNombre());
    }

    public boolean validarEmail() {
        if (this.mail == null) return false;
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return this.mail.matches(regex);
    }

    public void agregarSolicitud(SolicitudArreglo s) {
        if (s != null && !solicitudes.contains(s)) {
            solicitudes.add(s);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isDebitoAutomatico() {
        return debitoAutomatico;
    }

    public void setDebitoAutomatico(boolean debitoAutomatico) {
        this.debitoAutomatico = debitoAutomatico;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public List<SolicitudArreglo> getSolicitudes() {
        return solicitudes;
    }
}
