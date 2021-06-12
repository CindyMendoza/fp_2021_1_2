package com.upc.selectivas;

public class Ejercicio3 {
    public static void main(String[] args) {
        double precioMatricula =0;
        //pedir ingresar por teclado costoTaller, cantidadTalleres, cantidaReferidos
        precioMatricula = calcularCostoMatriculados(1000,11,20);//1000:costo de un taller
        System.out.println("El precio de la matricula es : " + precioMatricula);

    }

    private static double calcularDescuentoTalleres(int cantidadTalleres, double costo){
        double descuento=0;
        if (cantidadTalleres>=2 && cantidadTalleres<=4){
            descuento=0.05*costo;
        }else if (cantidadTalleres>=5 && cantidadTalleres<=7){
            descuento=0.10*costo;
        }else if (cantidadTalleres>=8 && cantidadTalleres<=10){
            descuento=0.15*costo;
        }
        return descuento;
    }

    private static double calcularDescuentoRef(int cantidadRef, double costo){
        double descuento=0;
        if (cantidadRef>=2 && cantidadRef<=5){
            descuento=0.07 * costo;
        }else if (cantidadRef>=6 && cantidadRef<=8){
            descuento=0.10 * costo;
        }else if (cantidadRef>=9 && cantidadRef<=10){
            descuento=(0.12 * costo) + 20;
        }
        return descuento;
    }
    private static double calcularCostoMatriculados(double costoTaller, int cantidadTalleres, int cantidadRef ){
        double precio=0;
        precio = (costoTaller * cantidadTalleres)  -
                calcularDescuentoTalleres(cantidadTalleres, costoTaller)*cantidadTalleres-
                calcularDescuentoRef(cantidadRef, costoTaller)*cantidadTalleres;
        return precio;
    }
}
