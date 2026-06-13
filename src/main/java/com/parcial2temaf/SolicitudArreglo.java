package com.parcial2temaf;

import java.util.Date;

public class SolicitudArreglo {
    private String codInf;
    private Date fechaInforme;
    private String problema;
    private String codigoUrgencia;
    private Modem modem;
    private Abonado abonado;
    private VisitaTecnica visitaTecnica;

    public SolicitudArreglo(String codInf, Date fechaInforme, String problema, String codigoUrgencia, Modem modem, Abonado abonado) {
        this.codInf = codInf;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.codigoUrgencia = codigoUrgencia;
        this.modem = modem;
        this.abonado = abonado;
    }

    public boolean tieneVisita() {
        return this.visitaTecnica != null;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getCodigoUrgencia() {
        return codigoUrgencia;
    }

    public void setCodigoUrgencia(String codigoUrgencia) {
        this.codigoUrgencia = codigoUrgencia;
    }

    public Modem getModem() {
        return modem;
    }

    public void setModem(Modem modem) {
        this.modem = modem;
    }

    public Abonado getAbonado() {
        return abonado;
    }

    public void setAbonado(Abonado abonado) {
        this.abonado = abonado;
    }

    public VisitaTecnica getVisitaTecnica() {
        return visitaTecnica;
    }

    public void setVisitaTecnica(VisitaTecnica visitaTecnica) {
        this.visitaTecnica = visitaTecnica;
    }
}
