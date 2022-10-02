/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Promocion implements Serializable {

    public int codigo;
    public String concepto;
    public Date fechaInicio;
    public Date fechaFin;

    public Promocion(int codigo, String concepto, Date fechaInicio, Date fechaFin) {
        this.codigo = codigo;
        this.concepto = concepto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Promocion() {

    }

    /**
     * Este metodo muestra y organiza los atributos de una clase
     *
     * @return String atributos de la clase
     * @author Sebastian Garcia & Daniel Lemus
     * @since 29/04/2019
     * @version 1
     */
    @Override
    public String toString() {
        String resultado = "\n" + "Codigo:" + this.codigo + "\n" + "Concepto:" + this.concepto + "\n" + "Fecha de Inicio:" + this.fechaInicio + "\n" + "Fecha de Finalización:" + this.fechaFin + "\n";
        return resultado;
    }

}
