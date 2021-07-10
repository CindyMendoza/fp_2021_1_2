package com.upc.cadenas;

public class Ejercicio2 {
    static String[] placas = {"APE311", "BVF240", "EPS495", "WSD588","APC221"};
    static String[] tipos = {"Camion", "Auto", "Auto","Bus", "Camion"};

    public static void main(String[] args) {
        System.out.println(obtenerCantidadVehiculos("5"));
        System.out.println(obtenerTipoMenosTransita());
    }

    private static int obtenerCantidadVehiculos(String digito){
        int contador=0;
        for(int i=0; i<placas.length; i++){
            if ( placas[i].substring(5,6).equals(digito)){
                contador++;
            }
        }
        return contador;
    }
    private static String obtenerTipoMenosTransita(){
        //necesito saber cuantos vehiculos transitan de cada tipo
        int contadorAutos=0, contadorCamiones=0, contadorBuses=0;
        for(int i=0; i < tipos.length ; i++){
            if(tipos[i].equals("Auto")){
                contadorAutos++;
            }
            if(tipos[i].equals("Camion")){
                contadorCamiones++;
            }
            if(tipos[i].equals("Bus")){
                contadorBuses++;
            }
        }
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

}
