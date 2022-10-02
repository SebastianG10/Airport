/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Aerolinea implements Serializable {

    public String nombre;
    public int codigo;
    public double ingresosMensuales;
    public int telefono;

    public Aerolinea(String nombre, int codigo, double ingresosMensuales, int telefono) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ingresosMensuales = ingresosMensuales;
        this.telefono = telefono;

    }

    public Aerolinea() {

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
        String resultado = "Nombre:" + this.nombre + "\n" + "Codigo" + this.codigo + "\n" + "Ingresos mensuales:" + this.ingresosMensuales + "\n" + "Telefono:" + this.telefono;
        return resultado;
    }

}
