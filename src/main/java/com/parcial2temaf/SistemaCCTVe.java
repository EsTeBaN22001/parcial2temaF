package com.parcial2temaf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaCCTVe {
    private List<Abonado> abonados;
    private List<SolicitudArreglo> solicitudes;
    private List<Cuadrilla> cuadrillas;
    private List<Trabajador> trabajadores;
    private List<VisitaTecnica> visitas;
    private List<Modem> modems;
    private DPT dpt;
    private Gerencia gerencia;

    public SistemaCCTVe() {
        this.abonados = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
        this.cuadrillas = new ArrayList<>();
        this.trabajadores = new ArrayList<>();
        this.visitas = new ArrayList<>();
        this.modems = new ArrayList<>();
        this.dpt = new DPT();
        this.gerencia = new Gerencia();
    }

    public List<Abonado> listadoAbonados() {
        return this.abonados;
    }

    public Map<String, List<SolicitudArreglo>> informesSolicitudesPorMarca() {
        Map<String, List<SolicitudArreglo>> reporte = new HashMap<>();
        for (SolicitudArreglo s : solicitudes) {
            if (s.getModem() != null) {
                String marca = s.getModem().getMarca();
                reporte.computeIfAbsent(marca, k -> new ArrayList<>()).add(s);
            }
        }
        return reporte;
    }

    public List<Cuadrilla> informeCuadrillasOciosas() {
        List<Cuadrilla> ociosas = new ArrayList<>();
        for (Cuadrilla c : cuadrillas) {
            if (!c.tieneVisitasPendientes()) {
                ociosas.add(c);
            }
        }
        return ociosas;
    }

    public List<VisitaTecnica> visitasPorCuadrilla(Cuadrilla c) {
        if (c != null) {
            return c.getVisitas();
        }
        return new ArrayList<>();
    }

    public List<SolicitudArreglo> solicitudesSinVisita() {
        List<SolicitudArreglo> pendientes = new ArrayList<>();
        for (SolicitudArreglo s : solicitudes) {
            if (!s.tieneVisita()) {
                pendientes.add(s);
            }
        }
        return pendientes;
    }

    public List<Trabajador> trabajadoresPorCuadrilla(Cuadrilla c) {
        List<Trabajador> equipo = new ArrayList<>();
        if (c != null) {
            if (c.getLider() != null) equipo.add(c.getLider());
            if (c.getAuxiliares() != null) equipo.addAll(c.getAuxiliares());
        }
        return equipo;
    }

    public void registrarAbonado(Abonado a) {
        if (a != null && !abonados.contains(a)) {
            abonados.add(a);
        }
    }

    public void registrarSolicitud(SolicitudArreglo s) {
        if (s != null && !solicitudes.contains(s)) {
            solicitudes.add(s);
        }
    }

    public List<SolicitudArreglo> obtenerSolicitudesPendientes() {
        return solicitudesSinVisita();
    }

    public List<Cuadrilla> obtenerCuadrillasDisponibles() {
        return informeCuadrillasOciosas();
    }

    // Getters y Setters
    public List<Abonado> getAbonados() { return abonados; }
    public List<SolicitudArreglo> getSolicitudes() { return solicitudes; }
    public List<Cuadrilla> getCuadrillas() { return cuadrillas; }
    public List<Trabajador> getTrabajadores() { return trabajadores; }
    public List<VisitaTecnica> getVisitas() { return visitas; }
    public List<Modem> getModems() { return modems; }
    public DPT getDpt() { return dpt; }
    public void setDpt(DPT dpt) { this.dpt = dpt; }
    public Gerencia getGerencia() { return gerencia; }
    public void setGerencia(Gerencia gerencia) { this.gerencia = gerencia; }
}
