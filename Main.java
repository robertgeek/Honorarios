package com.mx.robertgeek;

import java.util.Scanner;

/**
 *
 * @author robert
 */
public class Main {

    public static void main(String... args) {
        ReciboDeHonorarios rh = new ReciboDeHonorarios();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.printf(
                    "------------------------Menu------------------------\n %s\n %s\n %s\n",
                    "Digite '1' si quiere calcular cantidad neta a cobrar.",
                    "Digite '2' si quiere la cantidad menos impuestos.",
                    "Digite '0' para salir.");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Digite la Cantidad Neta a Cobrar");
                    double cantidadNeta = entrada.nextDouble();
                    System.out.println("A que tipo de persona se expedira el recibo('fisica' o 'moral')");
                    String tipoPersona = entrada.next();
                    rh.calculaNetoCobrar(tipoPersona, cantidadNeta);
                    break;
                }
                case 2: {
                    System.out.println("Digite la Cantidad para deducir impuestos");
                    double cantidadMenosImpuesto = entrada.nextDouble();
                    System.out.println("A que tipo de persona se expedira el recibo('fisica' o 'moral')");
                    String tipoPersona = entrada.next();
                    rh.calculaSubtotalMenosImpuestos(tipoPersona, cantidadMenosImpuesto);
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
            System.out.println("Subtotal: " + Math.round(rh.getSubtotal() * 100) / 100.00);
            System.out.println("IVA Trasladado: " + Math.round(rh.getIvaTrasladado() * 100) / 100.00);
            System.out.println("IVA Retenido: " + Math.round(rh.getIvaRetenido() * 100) / 100.00);
            System.out.println("ISR Retenido: " + Math.round(rh.getIsrRetenido() * 100) / 100.00);
            System.out.println("Total a percibir: " + Math.round(rh.getCantidadNeta() * 100) / 100.00 +"\n");
            rh.reiniciaValores();
        } while (opcion != 0);
    }
}
