package com.upc.cadenas;

public class Ejercicio2 {
    public static void main(String[] args) {
        String palabra = "Murcielago";
        //Murci  0, 0 + 5 = 0,5
        System.out.println(palabra.substring(0,5));
        //lago  6, 6 + 4 = 6, 10
        System.out.println(palabra.substring(6,10));
        //ciel 3, 7   inicio, inicio + desplazamiento = 3, 3 + 4 = 3, 7
        System.out.println(palabra.substring(3,7));



    }
}
