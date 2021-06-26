package com.upc.arreglos;

public class Ejercicio2 {

    private static double sumarPesos(double pesos[]){
        double suma=0;
        for(int i=0; i<pesos.length;i++){
            suma+=pesos[i];
        }
        return suma;
    }
    /*
    Calcular el mayor valor de todos los elementos del arreglo
     */
    private static  double calcularMayorPeso(double pesos[]){
        double maximo =0;
        for (int i=0; i<pesos.length; i++){
            if (pesos[i]>maximo){
                maximo = pesos[i];
            }
        }
        return maximo;
    }
    private static double calcularPromedio(double pesos[]){
        return sumarPesos(pesos)/pesos.length;
    }

    public static void main(String[] args) {
        double pesos[] = {12.4,23.5,10.4,20.1,11.5};
        //suma de pesos
        System.out.println("Suma:"+ sumarPesos(pesos));
        System.out.println("Mayor:" + calcularMayorPeso(pesos));
        System.out.println("Promedio:" + calcularPromedio(pesos));

    }
}
