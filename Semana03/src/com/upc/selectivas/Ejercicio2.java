package com.upc.selectivas;

public class Ejercicio2 {
    public static String obtenerTipoNumero(int numero){
        //if else anidado, se usa para seleccionar de más de dos alternativas
        //sólo una
        String mensaje;
        if(numero>0){
            mensaje = "Es positivo";
        }else if (numero<0){
            mensaje = "Es negativo";
        }else{
           mensaje ="Es Cero";
        }
        return mensaje;
    }
    public static void main(String[] args) {
        String resultado;
        resultado = obtenerTipoNumero(0);
        System.out.println(resultado);
    }
}
