package com.upc.secuenciales;

import java.util.Scanner;

public class Ejercicio1b {
    public static double calcularAreaTriangulo(double base, double altura){
        double area;
        area = base*altura/2;
        return  area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;
        area = calcularAreaTriangulo(20,10);
        System.out.printf("Resultado:%.2f", area);
    }
}
