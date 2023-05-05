/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebasynojosa.practicaevaluada1;

import java.util.ArrayList;

/**
 *
 * @author labbd
 */
public class Conductor {
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;
    private int horasTotales;
    private ArrayList<Transporte> listaTrans;
    
    public static final double SUELDO_BASE = 700.0;
    public static final double EXTRA_HORA = 5.0;
    

    public Conductor() {
        this.cedula = 12345678;
        this.nombre = "Homero";
        this.apellido = "Simpson";
        this.edad = 30;
        this.sueldo = SUELDO_BASE;
        this.horasTotales = 0;
        this.listaTrans = new ArrayList<>();
    }

    public Conductor(int cedula, String Nombre, String Apellido, int edad) {
        this.cedula = cedula;
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.edad = edad;
        this.sueldo = SUELDO_BASE;
        this.horasTotales = 0;
        this.listaTrans = new ArrayList<>();
    }
    
    public void agregarTransporte(Transporte transporte){
        listaTrans.add(transporte);
        horasTotales += transporte.getHoras();
        sueldo += (transporte.getHoras()*EXTRA_HORA) + transporte.calcularExtra();
    }
    
    // Muestra la lista de transportes peligrosos que realizo el conductor
    public void mostrarListaTMPs(){
        System.out.println("Lista de transportes de mercancias peligrosas hechas por " + nombre + apellido);
        for (Transporte t : listaTrans) 
            // Verifica si el transporte t es una instancia de la clase de transportes de mercancia peligrosa
            if (t instanceof TransMercPel) 
                System.out.println(t.toString());
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public ArrayList<Transporte> getListaTrans() {
        return listaTrans;
    }

    public void setListaTrans(ArrayList<Transporte> listaTrans) {
        this.listaTrans = listaTrans;
    }
    
    
    
    
    
}
