package com.upc.selectivas;

import java.util.Scanner;

public class Ejercicio4 {
    /*
       Calcular el sueldo neto de un trabajador, sabiendo
       que tiene un sueldo básico y que recibe un bono
       de 50 soles por hijo, adicionalmente se le descuenta
       el 13% por afp.
       - calcularBono(numeroHijos)
       - calcularDescuentoAFP(sueldoBasico)
       - calcularSueldoNeto(numeroHijos, sueldoBasico)
       ** un método puede llamar o invocar a otro método
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroHijos;
        double sueldoBasico, bono, descuentoAFP;
        System.out.print("Ingrese Sueldo Basico:");
        sueldoBasico = scanner.nextDouble();
        System.out.print("Ingresar Número de Hijos:");
        numeroHijos = scanner.nextInt();
        System.out.println("Sueldo Neto:" + calcularSueldoNeto(numeroHijos, sueldoBasico));
    }
    public static double calcularBono(int numeroHijos){ //el nombre del método debe iniciarse en mínuscula, y ser un verbo
        return (numeroHijos*50);
    }
    public  static double calcularDescuentoAFP(double sueldoBasico){
        double descuento;
        descuento = sueldoBasico*0.13;
        return descuento;
    }
    public  static  double calcularSueldoNeto(int numeroHijos, double sueldoBasico){
        double neto;
        neto = sueldoBasico + calcularBono(numeroHijos) - calcularDescuentoAFP(sueldoBasico);
        return neto;
    }
}
