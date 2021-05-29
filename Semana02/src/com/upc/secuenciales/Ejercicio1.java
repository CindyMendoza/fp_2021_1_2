package com.upc.secuenciales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Ingrese la base del triángulo:");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        altura = sc.nextDouble();
        area = base*altura/2;
        System.out.printf("Resultado:%.2f", area);
    }
}
