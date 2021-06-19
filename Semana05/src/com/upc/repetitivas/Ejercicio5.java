package com.upc.repetitivas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Ingresa nota:");
            nota = scanner.nextInt();
        }while (nota<0 || nota>20);
        System.out.println("OK!!");
    }
}
