package com.upc.arreglos;

public class Ejercicio4 {

    private static int notas[] = {10,13,18,19,20,18};
    private static String nombres[] = {"Luis", "Carlos", "Karen", "Pepe", "Miguel", "Alicia"};

    private  static String obtenerElNombreMayorNota(){
        int maximo =0;
        String nombreMaximo=null;
        for(int i=0; i<notas.length; i++){
            if(notas[i]>maximo){
                maximo = notas[i];
                nombreMaximo = nombres[i];
            }
        }
        return nombreMaximo;
    }

    public static void main(String[] args) {
        System.out.println(obtenerElNombreMayorNota());
    }
}
