package com.upc.arreglos;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] notas = {12,15,20,18,13,16};//length=6
        System.out.println("Longitud:" + notas.length);
        for(int i=0; i<notas.length;i++) {
            System.out.println(notas[i]);
        }
        int suma=0;
        //calculando suma
        for (int i=0; i<notas.length;i++){//i=6
            suma+=notas[i];//suma hasta i=5, 12+_15+120...+16
        }
        System.out.println("Suma es:"+ suma);
    }
}
