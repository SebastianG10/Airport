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
public class Destino implements Serializable {

    public int codigo;
    public String pais;
    public String ciudad;
    public String descripcion;

    public Destino(int codigo, String pais, String ciudad, String descripcion) {
        this.codigo = codigo;
        this.pais = pais;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
    }

    public Destino() {

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
        String resultado = "\n" + "Codigo:" + this.codigo + "\n" + "Pais:" + this.pais + "\n" + "Ciudad:" + this.ciudad + "\n" + "Descripcion:" + this.descripcion + "\n";
        return resultado;
    }
}
