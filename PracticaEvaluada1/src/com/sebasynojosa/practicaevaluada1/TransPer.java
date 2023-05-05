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
public class TransPer extends Transporte{
    private int personas; 
    
    public TransPer(){
        super(1);
        this.personas = 1;
    }

    public TransPer(int horas, int personas) {
        super(horas);
        this.personas = personas;
    }

    @Override
    public double calcularExtra() {
        // Transporte Colectivo
        if (personas > 9)
            return (this.horas*EXTRA_PERSONA_COLEC);
        // Transporte No Colectivo
        return (this.horas * EXTRA_PERSONA_NO_COLEC);
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }
    
    @Override
    public String toString() {
        return "Transporte{" + "horas = " + horas + ", personas = " + personas + ", coste = " + calcularExtra() + "}";
    }
    
}
