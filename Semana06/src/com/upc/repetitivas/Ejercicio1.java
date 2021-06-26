package com.upc.repetitivas;

public class Ejercicio1 {
   /*
   El Hospital “Mi Buen Jesús”, lo contrata para que implemente un programa informático,
   que permita al personal médico calcular en cuantos días un paciente puede eliminar de su cuerpo
   la medicina ingerida.
    El caso específico es el siguiente: Un paciente recibe una cantidad de una medicina.
    Cada día el 20% de la cantidad de medicina presente en su cuerpo es eliminada.
    El programa debe calcular:
    a.	Cuanta medicina queda en el cuerpo después del día D
    b.	Cuantos días tardará el cuerpo en eliminar el X% o más de la cantidad original
        de la medicina que tenía en el cuerpo.
    Ejemplo para la parte b
    Para 80 unidades de medicina y eliminar el 60% de esta medicina,es decir para eliminar
    como mínimo 48 unidades de medicina, debe pasar 5 días.
    */
    public static void main(String[] args) {
        System.out.println(medicinaEnElCuerpo(100,4));
        System.out.println(medicinaRestante(4,100));
        System.out.println(medicinasobrantew(4,100));
        System.out.println("*******************");
        System.out.println(diasEnEliminarMedicina(80,60));
        System.out.println(calcularDias(0.6,80));
        System.out.println(diaseneliminar(80,60));
        System.out.println(numeroDias(0.6,80));
    }
    private static double medicinaEnElCuerpo(double medicina, int dias){
        int contadorDias=0;//contará los días que van transcurriendo
        double medicinaRestante = medicina;
        while (contadorDias<dias) {//contadorDias menor a la cantidad de dias máximo
            medicinaRestante = medicinaRestante - medicinaRestante * 0.20;
            contadorDias++;//1,2...
        }
        return  medicinaRestante;
    }

    private static double diasEnEliminarMedicina(double medicina, double porcentaje){
        double medicinaAEliminar = medicina*porcentaje/100; //48
        double sumaMedicinaAEliminar = 0;
        int contdias =0;
        double aEliminar = 0;
        while (medicinaAEliminar > sumaMedicinaAEliminar){
            aEliminar = medicina * 0.20;//16, 12.8
            medicina = medicina - aEliminar;//medicina restante 64, 51.2
            sumaMedicinaAEliminar = sumaMedicinaAEliminar + aEliminar;//16+12.8
            contdias++;//1,2
        }
        return contdias;
    }


    public static double medicinaRestante (int diaD, double cantMedicina){
        double medRest = cantMedicina;
        for (int i = 0; i < diaD; i++) {
            medRest = medRest * (1-0.2);
        }
        return medRest;
    }
    public static double medicinasobrantew(int cantidaddedias, double cantidadmedicina){
        double medicinasobrante;
        while(cantidaddedias > 0){
            cantidadmedicina = cantidadmedicina - (cantidadmedicina * 0.2);//1,2,3...
            cantidaddedias--;//9,8,7...1,0
        }
        medicinasobrante = cantidadmedicina;
        return medicinasobrante;
    }

    public static int calcularDias(double porcentajeObjetivo, double cantidadMedicina){
        double cantidadAEliminar = cantidadMedicina*porcentajeObjetivo;
        double eliminado = 0;
        int contadorDias = 0;
        while(eliminado < cantidadAEliminar) {
            eliminado += cantidadMedicina*0.2;//suma de parciales
            cantidadMedicina-=cantidadMedicina*0.2;//medicina restante
            contadorDias++;
        }
        return contadorDias;
    }

    public static int diaseneliminar(double cantidamedicina, double porcentajeaeliminar){
        double basedivisorporcentaje = 100;
        double cantidadmedicinarestante = cantidamedicina*(1-(porcentajeaeliminar/basedivisorporcentaje));
        int contadordia=0;
        while(cantidamedicina>cantidadmedicinarestante){
            cantidamedicina = cantidamedicina - (cantidamedicina * 0.2);
            contadordia++;
        }
        return  contadordia;
    }

    public static int numeroDias (double porcentElimnado, double cantMedicina){
        double medRest = cantMedicina;
        int cantDias = 0;
        while( (cantMedicina - medRest) < porcentElimnado*cantMedicina ){
            medRest = medRest * (1 - 0.2);
            cantDias++;
        }
        return cantDias;
    }



}
