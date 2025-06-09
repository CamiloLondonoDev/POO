/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividaddeaprendizaje1;

/**
 *
 * @author User
 */
public class Auto extends Vehiculo {
    private int numeroPuertas;
    private boolean esElectrico;

    // Constructor
    public Auto(String marca, String modelo, int año, int numeroPuertas, boolean esElectrico) {
        super(marca, modelo, año); // Llamada al constructor de la clase padre
        this.numeroPuertas = numeroPuertas;
        this.esElectrico = esElectrico;
    }

    // Getters y Setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean getEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    // Método sobrescrito para mostrar más información
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("¿Es eléctrico?: " + (esElectrico ? "Sí" : "No"));
    }
}

