package com.upc.cadenas;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Pedro", "Felipe"};
        System.out.println(nombres[0]);//Carlos
        System.out.println(nombres[0].substring(0,1));//C
        System.out.println("**************************");
        //Imprimir la primera letra de cada nombre de la cadena
        for(int i=0; i<nombres.length;i++){
            System.out.println(nombres[i].substring(0,1));
        }

    }
}
