package com.upc.secuenciales;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    Que calcule y muestre la fuerza de atracción gravitacional entre dos masas, M1 y M2
    situadas a una distancia R. Donde las masas se expresan en kilogramos y la distancia
    en metros y la constante de gravitación universal tiene el valor de:
     G=6.67*10-11 Nw*m2/Kg2
     */
    public static final double G = 6.67*Math.pow(10,-11);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, m1, m2, f;
        System.out.println("Ingrese M1: ");
        m1 = sc.nextDouble();
        System.out.println("Ingrese M2: ");
        m2 = sc.nextDouble();
        System.out.println("Ingrese distancia R:");
        r = sc.nextDouble();
        f = (m1*m2*G)/Math.pow(r,2);
        System.out.printf("Resultado:%.12f",f);
    }
}
