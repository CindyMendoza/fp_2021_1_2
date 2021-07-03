package com.upc.cadenas;

public class Ejercicio7 {
    static String[] codigos = {"AR000101", "PE125610", "CH452315", "BR521317", "BR123620", "PE752124",
            "AR124511", "PE262405", "PE563222", "BR452102", "AR455210"};

    public static void main(String[] args) {
        System.out.println(obtenerCantidadProductos("AR"));
        System.out.println(mayorCorrelativo("AR"));
        System.out.println("------------------------");
        System.out.println(obtenerMontoAlmacenaje());
    }

    private static int obtenerCantidadProductos(String nacionalidad) {
        int contador = 0;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i].substring(0, 2).equals(nacionalidad)) {
                contador++;
            }
        }
        return contador;
    }

    private static int mayorCorrelativo(String nacionalidad) {
        int maximo = 0;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i].substring(0, 2).equals(nacionalidad)) {
                if (Integer.parseInt(codigos[i].substring(2, 6)) > maximo) {
                    maximo = Integer.parseInt(codigos[i].substring(2, 6));
                }
            }
        }
        return maximo;
    }

    private static int obtenerMontoAlmacenaje() {
        int suma = 0;
        int valor = 0;
        for (int i = 0; i < codigos.length; i++) {
            valor = Integer.parseInt(codigos[i].substring(6, 8));
            suma += valor;
        }
        return suma;
    }
}
