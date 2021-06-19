package com.upc.repetitivas;

public class Ejercicio6 {
    /*
   Desarrollar los siguientes métodos:
  1) Que reciba un número positivo entero y retorne la suma de sus dígitos
  2) Que retorne la suma de los cuadrados los n primeros numero enteros desde 1.
     1^2 + 2^2 + 3^2 + .......n^2
  3) Que retorne la suma de los cubos de los n primeros números múltiplos de 3.
      3^3 + 6^3 + 9^3 ....+ n términos
  */
    public static void main(String[] args) {
        System.out.println(obtenerSumaDigitos(233));
    }
    private static int obtenerSumaDigitos(int numero){
        int digito, suma = 0;
        while (numero>0){
            digito = numero % 10;//3,1,2
            suma+=digito;//3+1+2
            numero = numero /10 ;//diversos cocientes 21,2
        }
        return suma;
    }
}
