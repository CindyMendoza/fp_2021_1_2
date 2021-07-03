package com.upc.cadenas;

public class Ejercicio6 {
    static String[] codigos = {"AB101005", "AB102020", "AB103001"};
    //los tres ultimos caracteres del código indica el precio del producto
    //calcular el monto total de los precios de los productos

    public static void main(String[] args) {
        System.out.println(obtenerSumaPrecios());//26
    }
    private static int obtenerSumaPrecios(){
        int suma =0 ;
        for(int i=0; i<codigos.length;i++){
            suma += Integer.parseInt(codigos[i].substring(5,8));
        }
        return suma;
    }
}
