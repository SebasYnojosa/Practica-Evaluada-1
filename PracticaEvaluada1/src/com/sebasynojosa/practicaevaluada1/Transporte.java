/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebasynojosa.practicaevaluada1;

/**
 *
 * @author labbd
 */
public abstract class Transporte {
    protected int horas;
    
    public static final double EXTRA_PERSONA_COLEC = 1.0;
    public static final double EXTRA_PERSONA_NO_COLEC = 0.5;
    public static final double EXTRA_TONES = 2.0;
    public static final double EXTRA_PELIGRO = 50.0;

    public Transporte() {
        this.horas = 1;
    }

    public Transporte(int horas) {
        this.horas = horas;
    }
    
    public abstract double calcularExtra();

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
    
}
