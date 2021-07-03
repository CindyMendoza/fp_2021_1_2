package com.upc.cadenas;

public class Ejercicio5 {

    public static void main(String[] args) {
        String[] codigos = {"u201724635", "u202116648", "u202117960"};
        System.out.println("Longitud del arreglo:" + obtenerCantidadElementosArreglo(codigos));
        String[] temporal = obtenerCodigos2021(codigos);
        for( int i=0; i< temporal.length;i++){
            System.out.println(temporal[i]);//"u202116648", "u202117960", null
        }
    }

    private static String[] obtenerCodigos2021(String[] codigos){
        String[] temporal = new String[codigos.length];
        int j = 0;
        for(int i=0; i< codigos.length; i++){
            if(codigos[i].substring(1,5).equals("2021")){
                temporal[j] = codigos[i];
                j++;
            }
        }
        return temporal;
    }
    private static int obtenerCantidadElementosArreglo(String[] codigos){
        return codigos.length;
    }
}
