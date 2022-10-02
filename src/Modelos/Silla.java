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
public class Silla implements Serializable {

    public String codigo;
    public boolean estado;
    public String clase;
    public float precio;

    public Silla(String codigo, boolean estado, String clase, float precio) {
        this.codigo = codigo;
        this.estado = estado;
        this.clase = clase;
        this.precio = precio;
    }

    public Silla() {

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
        String resultado = "Codigo:" + this.codigo + "\n" + "Estado:" + this.estado + "\n" + "Tipo:" + this.clase + "\n" + "Precio:" + this.precio;
        return resultado;
    }
}
