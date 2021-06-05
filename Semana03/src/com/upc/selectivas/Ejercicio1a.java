package com.upc.selectivas;

public class Ejercicio1a {

    public static String obtenerMensajeMayorEdad(int edad){//metodo, funcion, subprograma, modulo, subrutina
        //if else para seleccionar de dos alternativas sólo una
        if(edad>=18){
           return "Es mayor de edad";
        }else {
           return "Es menor de edad";
        }
    }

    public static String obtenerMensajeMayorEdad2(int edad){
        //if else para seleccionar de dos alternativas sólo una
        String mensaje;
        if(edad>=18){
             mensaje = "Es mayor de edad";
        }else {
            mensaje = "Es menor de edad";
        }
        return mensaje;
    }
    public static void main(String[] args) {
        System.out.println(obtenerMensajeMayorEdad(20));
        System.out.println(obtenerMensajeMayorEdad(10));
        System.out.println(obtenerMensajeMayorEdad2(20));
    }
}
