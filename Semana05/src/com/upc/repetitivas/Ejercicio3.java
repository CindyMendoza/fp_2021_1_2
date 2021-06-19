package com.upc.repetitivas;

public class Ejercicio3 {
    //este metodo suma del 1 a n
    public static int sumar(int n){
        int suma=0;
        for(int i=1; i<=n; i++){
            suma+=i;
        }
        return suma;
    }
    public static int sumarPares(int n){//de 1 a n
        int suma=0;
        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                suma+=i;
            }
        }
        return suma;//de pares
    }
    public static void main(String[] args) {
        System.out.println(sumar(20));//210
        System.out.println(sumar(100));
        System.out.println(sumarPares(4));//6
    }
}
