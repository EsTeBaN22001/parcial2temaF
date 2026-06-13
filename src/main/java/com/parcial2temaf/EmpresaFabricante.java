package com.parcial2temaf;

public class EmpresaFabricante {
    private String nombre;
    private String cuit;
    private DocumentoHardware documentoHardware;
    private DocumentoDrivers documentoDrivers;

    public EmpresaFabricante(String nombre, String cuit, DocumentoHardware documentoHardware, DocumentoDrivers documentoDrivers) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.documentoHardware = documentoHardware;
        this.documentoDrivers = documentoDrivers;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public DocumentoHardware getDocumentoHardware() {
        return documentoHardware;
    }

    public void setDocumentoHardware(DocumentoHardware documentoHardware) {
        this.documentoHardware = documentoHardware;
    }

    public DocumentoDrivers getDocumentoDrivers() {
        return documentoDrivers;
    }

    public void setDocumentoDrivers(DocumentoDrivers documentoDrivers) {
        this.documentoDrivers = documentoDrivers;
    }
}
