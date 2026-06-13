package com.parcial2temaf;

public class LiderCuadrilla extends Trabajador {

    public LiderCuadrilla(int id, String nombre, String puesto, String estado) {
        super(id, nombre, puesto, estado);
    }

    public void dirigirTrabajadores() {
        System.out.println("El líder " + getNombre() + " está coordinando las tareas con los auxiliares.");
    }

    public void recibirRecordatorio(String msg) {
        System.out.println("Recordatorio recibido por el líder " + getNombre() + ": " + msg);
    }

    public void consultarDocumentacion(Modem modem) {
        if (modem != null && modem.getFabricante() != null) {
            EmpresaFabricante fab = modem.getFabricante();
            System.out.println("Consultando manual del módem: " + modem.getMarca());
            if (fab.getDocumentoHardware() != null) {
                System.out.println("Hardware: " + fab.getDocumentoHardware().getTitulo());
            }
            if (fab.getDocumentoDrivers() != null) {
                System.out.println("Drivers Versión: " + fab.getDocumentoDrivers().getVersion());
            }
        } else {
            System.out.println("No hay especificaciones técnicas disponibles para este módem.");
        }
    }

    public void informarReparacion(VisitaTecnica visita, String obs) {
        if (visita != null) {
            visita.registrarReparacion(new java.util.Date(), obs);
            System.out.println("El líder " + getNombre() + " ha reportado la finalización de la visita Nro: " + visita.getNumero());
        }
    }
}
