package com.upc.fundamentos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2;
        double promedio;
        System.out.println("Ingrese Nota1:");
        nota1 = sc.nextInt();
        System.out.println("Ingrese Nota2:");
        nota2 = sc.nextInt();
        promedio = (double)(nota1 + nota2) / 2; //(double) type casting - cambio de tipo
        System.out.println("El promedio es:" + promedio);
    }
}
