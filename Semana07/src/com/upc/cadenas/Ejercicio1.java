package com.upc.cadenas;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Hola";
        System.out.println(cadena.substring(0,1));//H
        System.out.println(cadena.substring(0,3));//Hol
        //ola
        System.out.println(cadena.substring(1,4));//ola
        //substring(desde, hasta)
        //substring(inicio, inicio + desplazamiento(incluye inicio)
        //ol
        System.out.println(cadena.substring(1,3));//posicion=1, posicion + despl = 1 + 2 =3
        //a
        System.out.println(cadena.substring(3,4));//posicion=3, posicion+despl = 4
        //l  2, 2+1 = 1, 3


    }
}
