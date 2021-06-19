package com.upc.repetitivas;

public class Ejercicio4 {
    /*
    El sueldo de una trabajador se inicia en 500 soles
    y en cada mes se incrementa en 20%.
    Cuanto meses pasará para que gane por lo menos 1500 soles?
     */
    public static void main(String[] args) {
        double sueldo=500;//contrato
        int meses=1; //al fin del mes
        while (sueldo<1500){
            sueldo = sueldo + 0.20*sueldo;
            meses++;//2
        }
        System.out.println("Meses:"+ meses);
    }
}
