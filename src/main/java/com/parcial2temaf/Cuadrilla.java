package com.parcial2temaf;

import java.util.ArrayList;
import java.util.List;

public class Cuadrilla {
    private int numero;
    private int cantidadTrabajadores;
    private List<String> equipamiento;
    private List<String> materiales;
    private LiderCuadrilla lider;
    private List<Trabajador> auxiliares;
    private List<VisitaTecnica> visitas;

    public Cuadrilla(int numero, LiderCuadrilla lider, List<Trabajador> auxiliares) {
        this.numero = numero;
        this.lider = lider;
        this.auxiliares = auxiliares != null ? auxiliares : new ArrayList<>();
        this.cantidadTrabajadores = 1 + this.auxiliares.size();
        this.equipamiento = new ArrayList<>();
        this.materiales = new ArrayList<>();
        this.visitas = new ArrayList<>();
    }

    public void agregarVisita(VisitaTecnica v) {
        if (v != null && !visitas.contains(v)) {
            visitas.add(v);
        }
    }

    public boolean esAsignable() {
        return this.lider != null && this.auxiliares != null && this.auxiliares.size() >= 2;
    }

    public boolean tieneVisitasPendientes() {
        for (VisitaTecnica vt : visitas) {
            if (!vt.estaFinalizada()) {
                return true;
            }
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public List<String> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<String> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public List<String> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<String> materiales) {
        this.materiales = materiales;
    }

    public LiderCuadrilla getLider() {
        return lider;
    }

    public void setLider(LiderCuadrilla lider) {
        this.lider = lider;
    }

    public List<Trabajador> getAuxiliares() {
        return auxiliares;
    }

    public void setAuxiliares(List<Trabajador> auxiliares) {
        this.auxiliares = auxiliares;
        this.cantidadTrabajadores = 1 + (auxiliares != null ? auxiliares.size() : 0);
    }

    public List<VisitaTecnica> getVisitas() {
        return visitas;
    }
}
