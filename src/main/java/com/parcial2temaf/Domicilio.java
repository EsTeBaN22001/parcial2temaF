package com.parcial2temaf;

public class Domicilio {
    private String calleA;
    private String calleB;
    private int altura;
    private String barrio;

    public Domicilio(String calleA, String calleB, int altura, String barrio) {
        this.calleA = calleA;
        this.calleB = calleB;
        this.altura = altura;
        this.barrio = barrio;
    }

    public String getCalleA() {
        return calleA;
    }

    public void setCalleA(String calleA) {
        this.calleA = calleA;
    }

    public String getCalleB() {
        return calleB;
    }

    public void setCalleB(String calleB) {
        this.calleB = calleB;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
