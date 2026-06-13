package com.parcial2temaf;

import java.util.Date;
import java.util.List;

public class DPT {

    public VisitaTecnica generarVisita(SolicitudArreglo solicitud, Cuadrilla cuadrilla) {
        if (solicitud == null || cuadrilla == null) return null;

        Domicilio ubicacion = solicitud.getAbonado() != null ? solicitud.getAbonado().getDomicilio() : null;
        
        // Simulación de generación de número de visita
        int numeroVisita = (int) (Math.random() * 10000);
        String tamaño = "Estándar"; 
        
        VisitaTecnica visita = new VisitaTecnica(numeroVisita, ubicacion, tamaño, new Date(), cuadrilla, solicitud);
        
        solicitud.setVisitaTecnica(visita);
        cuadrilla.agregarVisita(visita);
        
        return visita;
    }

    public void asignarCuadrillaDiaria(List<Cuadrilla> cuadrillas) {
        if (cuadrillas == null) return;

        for (Cuadrilla c : cuadrillas) {
            LiderCuadrilla lider = c.getLider();
            if (lider != null) {
                lider.setEstadoLibreOcupado("Ocupado");
                lider.recibirRecordatorio("Tienen visitas programadas para el día de hoy.");
            }

            if (c.getAuxiliares() != null) {
                for (Trabajador aux : c.getAuxiliares()) {
                    aux.setEstadoLibreOcupado("Ocupado");
                }
            }
        }
    }
}
