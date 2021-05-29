package com.upc.secuenciales;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Calcular la cantidad de billetes de 50, 20 y 10 que corresponde a una cantidad en soles
    en ese orden.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, b50, b20, b10, s;
        System.out.println("Ingresar monto:");
        n = sc.nextInt();
        b50 = n / 50;
        n = n % 50;
        b20 = n / 20;
        n = n % 20;
        b10 = n / 10;
        s = n % 10;
        System.out.println("Cantidad de billetes de 50:" + b50);
        System.out.println("Cantidad de billetes de 20:" + b20);
        System.out.println("Cantidad de billetes de 10:" + b10);
        System.out.println("Monedas en soles:" + s);
    }
}
