package com.upc.fundamentos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //creando el objeto Scanner, sirve para capturar datos de la consola por teclado
        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre:");
        nombre = scanner.nextLine(); //lee datos del teclado y lo almacena en la variable nombre
        System.out.println("Bienvenido " + nombre + "!");
    }
}
