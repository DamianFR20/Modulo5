/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

class Circulo extends Formas {
    private double radio;

    @Override
    public void dibujar() {
        System.out.println(" círculo es de color " + color);
    }

    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}