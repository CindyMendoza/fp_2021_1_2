package com.upc.cadenas;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] codigos ={"u201724635", "u202116648", "u202117960"};// 1, 1 + 4 = 1,5
        //imprimir la lista de codigos que ingresaron el año 2021
        for(int i=0; i< codigos.length; i++){
            if(codigos[i].substring(1,5).equals("2021")){
                System.out.println(codigos[i]);
            }
        }
    }
}
