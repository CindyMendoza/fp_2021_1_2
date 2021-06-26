package com.upc.arreglos;

public class Ejercicio3 {

    static double pesos[] = {12.4,23.5,10.4,20.1,11.5};

    private static double sumarPesos(){
        double suma=0;
        for(int i=0; i<pesos.length;i++){
            suma+=pesos[i];
        }
        return suma;
    }
    /*
    Calcular el mayor valor de todos los elementos del arreglo
     */
    private static  double calcularMayorPeso(){
        double maximo =0;
        for (int i=0; i<pesos.length; i++){
            if (pesos[i]>maximo){
                maximo = pesos[i];
            }
        }
        return maximo;
    }
    private static double calcularPromedio(){
        return sumarPesos()/pesos.length;
    }

    public static void main(String[] args) {
        //suma de pesos
        System.out.println("Suma:"+ sumarPesos());
        System.out.println("Mayor:" + calcularMayorPeso());
        System.out.println("Promedio:" + calcularPromedio());

    }
}
