package com.upc.repetitivas;

public class Ejercicio2 {
    public static void main(String[] args) {
        //calcular la suma de numeros desde el 1 al 20
        int suma=0; //acumulador, sumador ==>  acumulador = acumulador + incremento(variable) ==> acumulador+=incremento
        for(int i=1; i<=20; i++){
            suma+=i;//1+2+3+4+ ... + 20
        }
        System.out.println(suma);//10
        suma =0;
        for(int i=1; i<21; i++){
            suma= suma + i;//1+2+3+4+...+ 20
        }
        System.out.println(suma);//10
    }
}
