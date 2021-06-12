package com.upc.selectivas;

public class Ejercicio3b {
    static double descuentoPorTalleresMatriculados(int cantidadTalleres){
        int descuento;
        if(cantidadTalleres>=2 && cantidadTalleres<=4){
            descuento=5;
        }else if(cantidadTalleres>=5 && cantidadTalleres<=7){
            descuento=10;
        }else if(cantidadTalleres>=8 && cantidadTalleres<=10){
            descuento=15;
        }else descuento=0;

        return descuento;
    }
    public static double calcularDescuentoReferidos(int nReferidos) {
        double descuento = 0;
        if (nReferidos == 0) {
            descuento = 0;
        } else if (nReferidos >= 2 && nReferidos <= 5) {
            descuento = 5;
        } else if (nReferidos >= 6 && nReferidos <= 8) {
            descuento = 10;
        } else if (nReferidos >= 9 && nReferidos <= 10) {
            descuento = 15;
        }
        return descuento;
    }

    static double calcularCostoPorTalleres(int cantidadTalleres,int nReferidos,double montoPorTaller){
        double monto1=0;
        double descuento1=0;
        double descuento2=0;
        double montoFinal=0;

        monto1=montoPorTaller*cantidadTalleres;
        descuento1=monto1*(descuentoPorTalleresMatriculados(cantidadTalleres)*0.01);
        if(nReferidos>=9 && nReferidos<=10)
        {
            descuento2=(monto1*(calcularDescuentoReferidos(nReferidos)*0.01))+20;
        }
        else if (nReferidos!=9 && nReferidos!=10)
        {
            descuento2=monto1*(calcularDescuentoReferidos(nReferidos)*0.01);
        }
        montoFinal=monto1-(descuento1+descuento2);

        return montoFinal;
    }
    public static void main(String[] args) {

        System.out.println(descuentoPorTalleresMatriculados(6)+" %");
        System.out.println(calcularDescuentoReferidos(4)+" %");
        System.out.println(calcularCostoPorTalleres(3,9,100));
    }
}
