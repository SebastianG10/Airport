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
public class Tiquete implements Serializable {

    public int codigo;
    public Date fecha;
    public int hora;
    public Vuelo vuelo;
    public Destino destino;
    public Cliente cliente;
    public Silla silla;

    public Tiquete(int codigo, Date fecha, int hora, Cliente cliente, Silla silla, Destino destino) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.silla = silla;
        this.destino = destino;

    }

    public Tiquete() {

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
        String resultado = "Codigo:" + this.codigo + "\n" + "Fecha:" + this.fecha + "\n" + "Hora:" + this.hora + "Cliente:" + this.cliente + "Silla:" + this.silla + "Destino:" + this.destino;
        return resultado;
    }
}
