package com.upc.secuenciales;

import java.util.Scanner;

public class Ejercicio3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, d, m;
        System.out.println("Ingrese x1: ");
        x1 = sc.nextDouble();
        System.out.println("Ingrese y1: ");
        y1 = sc.nextDouble();
        System.out.println("Ingrese x2: ");
        x2 = sc.nextDouble();
        System.out.println("Ingrese y2: ");
        y2 = sc.nextDouble();
        d = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        m = (y2-y1)/(x2-x1);
        System.out.printf("Resultado distancia entre 2 puntos: %.2f \n",d);
        System.out.printf("Resultado angulo con la horizontal: %.2f",m);
    }
}
