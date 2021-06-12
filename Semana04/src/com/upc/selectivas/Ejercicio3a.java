package com.upc.selectivas;

import java.util.Scanner;

public class Ejercicio3a {
    public static double calcularDsctoMatriculados(int cantTallerres) {
        double dsctoMat = 0.0;
        if (cantTallerres >= 2 && cantTallerres <= 4) dsctoMat = 0.05;
        else if (cantTallerres >= 5 && cantTallerres <= 7) dsctoMat = 0.1;
        else if (cantTallerres >= 8 && cantTallerres <= 10) dsctoMat = 0.15;
        return dsctoMat;
    }

    public static double calcularDsctoReferidos(int cantReferidos) {
        double dsctoRef = 0.0;
        if (cantReferidos >= 2 && cantReferidos <= 5) dsctoRef = 0.07;
        if (cantReferidos >= 6 && cantReferidos <= 8) dsctoRef = 0.1;
        if (cantReferidos >= 9 && cantReferidos <= 10) dsctoRef = 0.12;
        return dsctoRef;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montoTotal = 0.0;
        double montoFinal = 0.0;
        int cantTalleres = 0, cantReferidos = 0;
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        String menu = "";
        double costoCurso = 0.0;
        do {
            System.out.print("");
            menu = "\n";
            menu += "******** Menú de opciones ****** :  LLeva " + cantTalleres + " cursos \n";
            menu += "1- Curso de Programación Orientado a Objetos con JAVA (S/. 300.00) \n";
            menu += "2- Desarrollo Web - FrontEnd (S/. 500.00) \n";
            menu += "3- Sistemas expertos e IA (S/. 600.00) \n";
            menu += "4- Bases de Datos e IA (S/. 700.00) \n";
            menu += "5- Big Data e IA (S/. 800.00) \n";
            menu += "6- Finalizar matricula \n";
            menu += "Seleccione una opción:";
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    montoTotal = montoTotal + 300.00;
                    cantTalleres++;
                    System.out.println("entró a la primera lleva : " + montoTotal);
                    break;
                case 2:
                    cantTalleres++;
                    montoTotal = montoTotal + 500.00;
                    System.out.println("entró a la segunda : " + montoTotal);
                    break;
                case 3:
                    cantTalleres++;
                    montoTotal = montoTotal + 600.00;
                    System.out.println("entró a la tercera : " + montoTotal);
                    break;
                case 4:
                    cantTalleres++;
                    montoTotal = montoTotal + 600.00;
                    System.out.println("entró a la cuarta : " + montoTotal);
                    break;
                case 5:
                    cantTalleres++;
                    montoTotal = montoTotal + 600.00;
                    System.out.println("entró a la quinta : " + montoTotal);
                    break;
            }
        } while (opcion != 6);
        System.out.print("Introduzca Cantidad de Referidos : ");
        cantReferidos = entrada.nextInt();
        double dsctoMat = calcularDsctoMatriculados( cantTalleres );
        double dsctoRef = calcularDsctoReferidos( cantReferidos );
        if (dsctoRef >= 9 ){
            montoFinal = montoTotal - (montoTotal*dsctoMat) - (montoTotal*dsctoRef) - 20;
        }else {
            montoFinal = montoTotal - (montoTotal*dsctoMat) - (montoTotal*dsctoRef);
        }
        System.out.println("El monto total a pagar es : " + montoFinal);
    }

}
