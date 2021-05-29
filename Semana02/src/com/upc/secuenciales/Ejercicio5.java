package com.upc.secuenciales;

import java.util.Scanner;

public class Ejercicio5 {
        public static double calcularAreaTerreno(double lado_a, double lado_b, double lado_c){
            double area_triangulo, area_rectangulo, area;
            area_triangulo = (lado_b * (lado_a - lado_c)) / 2;
            area_rectangulo = lado_b * lado_c;
            area = area_triangulo + area_rectangulo;
            return  area;
        }
        public static void main(String[] args)
        {
            System.out.println("********* EJERCICIO 01 *********");
            Scanner teclado = new Scanner(System.in);
            double lado_a, lado_b, lado_c, area;
            System.out.print("Ingrese el lado A: ");
            lado_a = teclado.nextDouble();
            System.out.print("Ingrese el lado B: ");
            lado_b = teclado.nextDouble();
            System.out.print("Ingrese el lado C: ");
            lado_c = teclado.nextDouble();
            area = calcularAreaTerreno(lado_a,lado_b,lado_c);
            System.out.print("El área total es: " + area + "m²");
    }
}
