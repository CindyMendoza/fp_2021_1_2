package com.upc.arreglos;

public class Ejercicio5 {
    static String[] agentes = {"Marco", "Luis", "Pedro", "Juan"};
    static int[] unidadesVendidas = {3, 10, 8, 2};
    private static double calcularTotalUnidadesVendidas(){
        int suma = 0;
        for(int i=0; i<unidadesVendidas.length;i++){
            suma+=unidadesVendidas[i];
        }
        return suma;
    }
    private static double calcularPorcentajeAgentesSuperaronCuota(){
        int contadorVendedoresCuotaok=0;
        for (int i=0; i< unidadesVendidas.length;i++){
            if(unidadesVendidas[i]>5){
                contadorVendedoresCuotaok+=1;
            }
        }
        return ((double)contadorVendedoresCuotaok/unidadesVendidas.length)*100;
    }

    public static void main(String[] args) {
        System.out.println(calcularTotalUnidadesVendidas());
        System.out.println(calcularPorcentajeAgentesSuperaronCuota());
    }
}
