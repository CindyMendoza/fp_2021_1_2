package com.upc.selectivas;

public class Ejercicio5 {
    /*
       Un conocido diario ofrece suscripciones anuales a los clientes.
       Con la finalidad de promover este tipo de venta, el diario ha
       ofrecido a otras empresas de diverso índole, suscripciones a
       los trabajadores de dichas empresas con el aval de las mismas.
       Los precios de las suscripciones son las siguientes:
       -	Suscripción a la revista “Vamos”: 150 nuevos soles Anuales.
       -	Suscripción a la revista “Cosas”: 170 nuevos soles Anuales.
       -	Suscripción a la revista “Automas”: 250 nuevos soles Anuales.
       -	Suscripción a la revista “Construye”: 200 nuevos soles Anuales.
       Adicionalmente, dependiendo de la cantidad de suscripciones se
       pueden dar descuentos por volumen:
       -	De 1 a 10 suscripciones, tiene un 0% de descuento.
       -	De 11 a 100 suscripciones, tiene un 15% de descuento.
       -	De 101 a 200 suscripciones, tiene un 21% de descuento.
       -	Más de 200 suscripciones, tiene un 25% de descuento.
       Desarrollar un subprograma que permita determinar el precio de
       cada suscripción, el porcentaje de descuento dependiendo de la
       cantidad de suscripciones a adquirir, así como el total que debería
       pagar la empresa si adquiriera un determinado tipo y número de
       suscripciones
    */
    public static double calcularPrecioSuscripcionAnual(String revista) {
        double precio;
        switch (revista) {
            case "Vamos":
                precio = 150;
                break;
            case "Cosas":
                precio = 170;
                break;
            case "Automas":
                precio = 250;
                break;
            case "Construye":
                precio = 200;
                break;
            default:
                precio = 0;
        }
        return precio;
    }
    public  static  double obtenerPorcentajeDescuento(int cantidadSuscripciones){
        double descuento;
        if(cantidadSuscripciones>=1 && cantidadSuscripciones<=10){
            descuento = 0;
        }else if (cantidadSuscripciones>=11 && cantidadSuscripciones<=100){
            descuento = 0.15;
        }else if(cantidadSuscripciones>=101 && cantidadSuscripciones<=200){
            descuento = 0.21;
        }else {
            descuento = 0.25;
        }
        return descuento;
    }
    public static double calcularTotalSucripcionesEmpresa(String revista, int cantidadSuscripciones){
       double montoTotal, precioSuscripcionAnual;
       precioSuscripcionAnual = calcularPrecioSuscripcionAnual(revista);
       montoTotal = precioSuscripcionAnual*cantidadSuscripciones -
                    obtenerPorcentajeDescuento(cantidadSuscripciones)*precioSuscripcionAnual*cantidadSuscripciones;
       return  montoTotal;
    }
}
