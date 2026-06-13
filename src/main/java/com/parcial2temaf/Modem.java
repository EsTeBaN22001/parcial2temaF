package com.parcial2temaf;

public class Modem {
    private String serialNumber;
    private String marca;
    private String velocidad;
    private int puertosEthernet;
    private boolean puertoCoaxial;
    private String protocolo;
    private int nroLeds;
    private String firewall;
    private String estado;
    private EmpresaFabricante fabricante;

    public Modem(String serialNumber, String marca, String velocidad, int puertosEthernet,
                 boolean puertoCoaxial, String protocolo, int nroLeds, String firewall,
                 String estado, EmpresaFabricante fabricante) {
        this.serialNumber = serialNumber;
        this.marca = marca;
        this.velocidad = velocidad;
        this.puertosEthernet = puertosEthernet;
        this.puertoCoaxial = puertoCoaxial;
        this.protocolo = protocolo;
        this.nroLeds = nroLeds;
        this.firewall = firewall;
        this.estado = estado;
        this.fabricante = fabricante;
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuertosEthernet() {
        return puertosEthernet;
    }

    public void setPuertosEthernet(int puertosEthernet) {
        this.puertosEthernet = puertosEthernet;
    }

    public boolean isPuertoCoaxial() {
        return puertoCoaxial;
    }

    public void setPuertoCoaxial(boolean puertoCoaxial) {
        this.puertoCoaxial = puertoCoaxial;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public int getNroLeds() {
        return nroLeds;
    }

    public void setNroLeds(int nroLeds) {
        this.nroLeds = nroLeds;
    }

    public String getFirewall() {
        return firewall;
    }

    public void setFirewall(String firewall) {
        this.firewall = firewall;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EmpresaFabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(EmpresaFabricante fabricante) {
        this.fabricante = fabricante;
    }
}
