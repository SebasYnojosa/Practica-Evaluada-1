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
public class TransMerc extends Transporte{
    private int toneladas;

    public TransMerc() {
        super(1);
        this.toneladas = 1;
    }
    

    public TransMerc(int toneladas, int horas) {
        super(horas);
        this.toneladas = toneladas;
    }
    
    
    
    @Override
    public double calcularExtra(){
        return (this.toneladas * EXTRA_TONES);
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }
    
    @Override
    public String toString() {
        return "Transporte{" + "horas=" + horas + ", toneladas = " + toneladas + ", coste = " + calcularExtra() + "}";
    }
}
