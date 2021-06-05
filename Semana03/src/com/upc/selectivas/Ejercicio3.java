package com.upc.selectivas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 9;//prueba unitaria
        System.out.println("Ingrese opcion:");
        opcion = sc.nextInt();
        switch (opcion) { //opcion puede ser entero, boolean, char, String(para nuevas versiones de java)
            case 1://no acepta expresiones lógicas como   case: opcion>2 da error
                System.out.println("Seleccionó la opcion 1 ");
                break;
            case 2:
                System.out.println("Seleccionó la opcion 2 ");
                break;
            case 3:
                System.out.println("Seleccionó la opcion 3 ");
                break;
            default:
                System.out.println("Fuera del rango 1-3");
                break;//es opcional para el default
        }
    }
}
