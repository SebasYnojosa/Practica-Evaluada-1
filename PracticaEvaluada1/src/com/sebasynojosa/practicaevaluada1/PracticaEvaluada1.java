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
public class PracticaEvaluada1 {
    public static void informeSueldos(Conductor[] conductores) {
        for (Conductor c : conductores) {
            System.out.println("CI: " + c.getCedula() + 
                    "/ Nombre: " + c.getNombre() + 
                    "/ Apellido: " + c.getApellido() + 
                    "/ Sueldo: " + c.getSueldo() +
                    "/ Horas Totales: " + c.getHorasTotales());
        }
    }

    public static void main(String[] args) {
        // Instancia de dos conductores 
        Conductor[] conductores = new Conductor[2];
        
        conductores[0] = new Conductor();
        conductores[1] = new Conductor(30212705, "Pedro", "Picapiedras", 40);
        
        // Informe de sueldos inicial
        informeSueldos(conductores);
        
        // Instanciamos transportes
        Transporte trans1 = new TransPer();
        Transporte trans2 = new TransMerc();
        Transporte trans3 = new TransMercPel();
        Transporte trans4 = new TransPer(3, 10);
        Transporte trans5 = new TransMerc(5, 8);
        Transporte trans6 = new TransMercPel(2, 12);
        
        // Le agregamos los transportes a los conductores
        conductores[0].agregarTransporte(trans1);
        conductores[0].agregarTransporte(trans4);
        conductores[0].agregarTransporte(trans5);
        conductores[1].agregarTransporte(trans2);
        conductores[1].agregarTransporte(trans3);
        conductores[1].agregarTransporte(trans6);
        
        // Nuevo informe de sueldos
        System.out.println("------------------------------------------------------------------------------------------------------");
        informeSueldos(conductores);
        
        // Lista de TMPs de los conductores
        System.out.println("------------------------------------------------------------------------------------------------------");
        conductores[0].mostrarListaTMPs();
        conductores[1].mostrarListaTMPs();
    }
    
}
