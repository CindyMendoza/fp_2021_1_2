package com.upc.cadenas;

public class Ejercicio2a {
    static String[]autos={"Camion","Auto","Auto","Bus","Bus","Auto"};// 1,3,3,2,2,3
    static int calcularOcurrencias(String vehiculo){
        int cont=0;
        for (int i=0;i<autos.length ;i++ ) {
            if(autos[i].equals(vehiculo))
                cont++;
        }return cont;
    }

    private static String obtenerTipoMenosTransita(){
        //necesito saber cuantos vehiculos transitan de cada tipo
        int contadorAutos=0, contadorCamiones=0, contadorBuses=0;
        contadorAutos = calcularOcurrencias("Auto");
        contadorBuses = calcularOcurrencias("Bus");
        contadorCamiones = calcularOcurrencias("Camion");
        String tipoVehiculo=null;
        if(contadorAutos<contadorCamiones && contadorAutos<contadorBuses){
            tipoVehiculo = "Auto";
        } else if (contadorCamiones<contadorBuses && contadorCamiones<contadorAutos){
            tipoVehiculo = "Camion";
        }else if (contadorBuses < contadorCamiones && contadorBuses < contadorAutos){
            tipoVehiculo = "Bus";
        }
        return tipoVehiculo;
    }

    static String menorTipoVehiculoTransitadoXX(){
        int menor=10000000;//supuesto falso
        String menorTipo = null;
        for (int i=0;i<autos.length ;i++ ) {
           if(calcularOcurrencias(autos[i]) < menor){
               menor = calcularOcurrencias(autos[i]);
               menorTipo = autos[i];
           }
        }
        return menorTipo;
    }

    public static void main(String[] args) {
        System.out.println(obtenerTipoMenosTransita());
        System.out.println(menorTipoVehiculoTransitadoXX());
    }

}
