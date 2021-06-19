package com.upc.repetitivas;

public class Ejercicio6 {
    /*
   Desarrollar los siguientes métodos:
  1) Que reciba un número positivo entero y retorne la suma de sus dígitos
  2) Que retorne la suma de los cuadrados los n primeros numero enteros desde 1.
     1^2 + 2^2 + 3^2 + .......n^2
  3) Calcular la siguiente suma:
      3^3 + 6^3 + 9^3 ....+ n términos
  */
    public static void main(String[] args) {
        System.out.println(obtenerSumaDigitos(233));
        System.out.println(sumaCuadrados(10));
        System.out.println("Suma cubos:" + sumarCubos1(2));
        System.out.println("Suma cubos:" + sumarCubos2(2));
        System.out.println("Suma cubos:" + sumarCubos3(2));
    }
    public static double sumarCubos1(int cantidadTerminos){
        double suma=0;
        int contador=3;
        for (int i = 1; i <= cantidadTerminos; i++) {
            suma = suma + Math.pow(contador,3);// 3^3 + 6^3
            contador = contador + 3;
        }
        return suma;
    }

    public static double sumarCubos2(int num){ //num cantidad de terminos
        double suma=0;
        for (int i = 1; i <= num; i++) {
            suma = suma + Math.pow(i*3,3);//3^3 + 6^3
        }
        return suma;
    }
    public static double sumarCubos3(int cantidadTerminos){
        double suma=0;
        int base=1;
        int contadorTerminos=0;
        while (true){
            base++;
            if (base % 3 ==0){
                suma+= Math.pow(base,3);
                contadorTerminos++;
            }
            if (contadorTerminos==cantidadTerminos){
                break;//sale del while
            }
        }
        return suma;
    }
    private static int sumaCuadrados(int n){
        int suma = 0;
        for(int i=1; i<=n; i++){
            suma+=Math.pow(i,2);
        }
        return suma;
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
