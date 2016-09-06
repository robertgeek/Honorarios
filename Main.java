/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.robertgeek;

/**
 *
 * @author robert
 */
public class Main {

    public static void main(String... args) {
        ReciboDeHonorarios rh = new ReciboDeHonorarios();
        System.out.println("Cálculo Neto");
        rh.calculaNetoCobrar("moral", 7017.08);
        System.out.println("Subtotal: " + Math.round(rh.getSubtotal() * 100) / 100.00);
        System.out.println("IVA Trasladado: " + Math.round(rh.getIvaTrasladado() * 100) / 100.00);
        System.out.println("IVA Retenido: " + Math.round(rh.getIvaRetenido() * 100) / 100.00);
        System.out.println("ISR Retenido: " + Math.round(rh.getIsrRetenido() * 100) / 100.00);
        System.out.println("Total a percibir: " + Math.round(rh.getCantidadNeta() * 100) / 100.00);
        System.out.println("------");
        System.out.println("Calculo menos impuestos");
        rh.calculaSubtotalMenosImpuestos("moral", 7017.08);
        System.out.println("Subtotal: " + Math.round(rh.getSubtotal() * 100) / 100.00);
        System.out.println("IVA Trasladado: " + Math.round(rh.getIvaTrasladado() * 100) / 100.00);
        System.out.println("IVA Retenido: " + Math.round(rh.getIvaRetenido() * 100) / 100.00);
        System.out.println("ISR Retenido: " + Math.round(rh.getIsrRetenido() * 100) / 100.00);
        System.out.println("Total a percibir: " + Math.round(rh.getCantidadNeta() * 100) / 100.00);
    }
}
