package com.parcial2temaf;

public class DocumentoDrivers {
    private String version;
    private String linkDescarga;

    public DocumentoDrivers(String version, String linkDescarga) {
        this.version = version;
        this.linkDescarga = linkDescarga;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLinkDescarga() {
        return linkDescarga;
    }

    public void setLinkDescarga(String linkDescarga) {
        this.linkDescarga = linkDescarga;
    }
}
