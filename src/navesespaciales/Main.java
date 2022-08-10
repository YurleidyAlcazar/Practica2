package navesespaciales;

import java.util.Scanner;

/**
 *
 * @author Yurleidy Alcazar
 */
public class Main {

    public static void main(String[] args) {
        VehiculosLanzadera saturnov = new VehiculosLanzadera("Saturno V", 2900, "Petroleo y oxigeno liquido", 1967);//creando nave
        String entradaTeclado = "";

        NavesNoTripuladas atv = new NavesNoTripuladas("ATV Vehiculo de transferencia automatizada", 10470, "MMH y Oxido Nitrico", 2008);

        NavesTripuladas apolo = new NavesTripuladas("Apolo 11", 16448, "Queroseno e Hidrogeno Liquido", 1966);

        System.out.println("Seleccione suc tipo de nave, escriba a si es vehiculo lanzadera, escriba b si es Nave tripulada o escriba c si es Nave no tripulada");

        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.nextLine();//Respuesta usuario

        //Condicionales
        if ("a".equals(entradaTeclado)) {
            saturnov.despegar();
            for (int i = 0; i < 1000; i++) {
                i = 0;
                saturnov.despegar();
            }
        } else if ("b".equals(entradaTeclado)) {
             apolo.despegar();
            for (int i = 0; i < 1000; i++) {
                i = 0;
                apolo.despegar();
            }
        } else if ("c".equals(entradaTeclado)) {
             atv.despegar();
            for (int i = 0; i < 1000; i++) {
                i = 0;
                atv.despegar();
            }
        }
    }

}
