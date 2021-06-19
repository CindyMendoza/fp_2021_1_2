package com.upc.repetitivas;

public class Ejercicio1 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){ // el primero sólo se ejecuta la primera vez, luego el incremento y condición se evalúa cada vezq eue se repite
            System.out.println(i);//0,1,2,....9
        }
        System.out.println("*****************");
        /// 2,3,..., 12
        for (int i=2; i<13;i++){
            System.out.println(i);//2,3...12
        }
        System.out.println("*****************");
        /// 2,3,..., 12
        for (int i = 2; i <= 12; i++) {
            System.out.println(i);
        }


    }
}
