package com.upc.selectivas;

public class Ejercicio1 {
    /*
    La academia nacional de idiomas programa todos los meses dos exámenes uno escrito y otro oral.
    Estos exámenes se utilizan para determinar el nivel en el que se encuentran los alumnos con
    el propósito de determinar el nivel y con ello el costo del curso. Para ello, los niveles se
    determinan de acuerdo al siguiente cuadro:

    NIVEL	Examen escrito	        Examen oral
    Nivel 3	Mayor a 95 puntos 	    Mayor a 75 puntos
    Nivel 2	Mayor a 95 puntos	    Menor igual a 75 puntos
    Nivel 1	Menor igual a 95 puntos	Cualquier puntaje

Dependiendo del nivel asignado se determina el precio del programa mensual de acuerdo a lo siguiente:
-	Nivel 1 el precio es de S/.150.00
-	Nivel 2 el precio es de S/.250.00
-	Nivel 3 el precio es de S/.400.00

Desarrollar un subprograma que permita determinar el Nivel del alumno y otro subprograma que determine
 el precio a cobrar.
     */
    public static void main(String[] args) {
        String nivel;
        double precio;
        nivel = calculaNivel(15,16);
        precio = calcularPrecio(nivel);
        System.out.println("El precio es: " + precio);
    }

    static String calculaNivel(int examenEscrito, int examenOral) {
        String nivel;
        if (examenEscrito > 95 && examenOral > 75) {
            nivel = "Nivel1";
        } else if (examenEscrito > 95 && examenOral <= 75) {
            nivel = "Nivel2";
        } else if (examenEscrito <= 95) {
            nivel = "Nivel3";
        } else {
            nivel = "Sin Nivel";
        }
        return nivel;
    }

    static double calcularPrecio(String nivel) {
        double precio;
        switch (nivel) {
            case "Nivel1":
                precio = 150;
                break;
            case "Nivel2":
                precio = 250;
                break;
            case "Nivel3":
                precio = 400;
                break;
            default:
                precio = 0;
                break;//opcional
        }
        return  precio;
    }
}
