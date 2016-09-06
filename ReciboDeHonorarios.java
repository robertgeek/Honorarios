/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.robertgeek;

/**
 *
 * @author consulta
 */
public class ReciboDeHonorarios {

    private String tipo;
    private double subtotal;
    private double ivaTrasladado;
    private double ivaRetenido;
    private double isrRetenido;
    private double cantidadNeta;
    private final double IVA = 0.16;
    private final double ISR = 0.10;

    public void calculaNetoCobrar(String tipo, double cantidad) {
        if (tipo.equals("fisica")) {
            setSubtotal(cantidad / 1.16);
            setIvaTrasladado(getSubtotal() * IVA);
            setCantidadNeta(getSubtotal() + getIvaTrasladado());
        } else {
            setSubtotal(cantidad / 0.953333);
            setIvaTrasladado(getSubtotal() * IVA);
            setIvaRetenido((getIvaTrasladado() / 3) * 2);
            setIsrRetenido(getSubtotal() * ISR);
            setCantidadNeta((getSubtotal() + getIvaTrasladado()) - (getIvaRetenido() + getIsrRetenido()));
        }
    }

    public void calculaSubtotalMenosImpuestos(String tipo, double subtotal) {
        if (tipo.equals("fisica")) {
            setSubtotal(subtotal);
            setIvaTrasladado(subtotal * IVA);
            setCantidadNeta(subtotal + getIvaTrasladado());
        } else {
            setSubtotal(subtotal);
            setIvaTrasladado(subtotal * IVA);
            setIvaRetenido((getIvaTrasladado() / 3) * 2);
            setIsrRetenido(subtotal * ISR);
            setCantidadNeta((subtotal + getIvaTrasladado()) - (getIvaRetenido() + getIsrRetenido()));
        }
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the ivaTrasladado
     */
    public double getIvaTrasladado() {
        return ivaTrasladado;
    }

    /**
     * @param ivaTrasladado the ivaTrasladado to set
     */
    public void setIvaTrasladado(double ivaTrasladado) {
        this.ivaTrasladado = ivaTrasladado;
    }

    /**
     * @return the ivaRetenido
     */
    public double getIvaRetenido() {
        return ivaRetenido;
    }

    /**
     * @param ivaRetenido the ivaRetenido to set
     */
    public void setIvaRetenido(double ivaRetenido) {
        this.ivaRetenido = ivaRetenido;
    }

    /**
     * @return the isrRetenido
     */
    public double getIsrRetenido() {
        return isrRetenido;
    }

    /**
     * @param isrRetenido the isrRetenido to set
     */
    public void setIsrRetenido(double isrRetenido) {
        this.isrRetenido = isrRetenido;
    }

    /**
     * @return the cantidadNeta
     */
    public double getCantidadNeta() {
        return cantidadNeta;
    }

    /**
     * @param cantidadNeta the cantidadNeta to set
     */
    public void setCantidadNeta(double cantidadNeta) {
        this.cantidadNeta = cantidadNeta;
    }
}
