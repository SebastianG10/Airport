/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Vuelo implements Serializable {

    public String aerolinea;
    public int codigo;
    public int numeroSillas;
    public Date fecha;
    public int hora;
    public Destino destino;

    ArrayList<Silla> sillas = new ArrayList<>();
    ArrayList<Tiquete> tiquetes = new ArrayList<>();

    public Vuelo(String aerolinea, int codigo, int numeroSillas, Date fecha, int hora, Destino destino) {
        this.aerolinea = aerolinea;
        this.codigo = codigo;
        this.numeroSillas = numeroSillas;
        this.fecha = fecha;
        this.hora = hora;
        this.destino = destino;
    }

    public Vuelo() {

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
        String resultado = "\n" + "Aerolinea:" + this.aerolinea + "\n" + "Codigo:" + this.codigo + "\n" + "Numero de Silas:" + this.numeroSillas + "\n" + "Fecha:" + this.fecha + "\n" + "Hora:" + this.hora + "\n" + "Destino:" + this.destino.toString() + "\n";
        return resultado;
    }

      /**
     * Este metodo genera sillas.
     *
     * @param vacio
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 30/04/2019
     * @version 1
     */
    public void agregarSillas() {
        sillas.add(new Silla("F1", true, "Economica", 400000));
        sillas.add(new Silla("F2", true, "Economica", 400000));
        sillas.add(new Silla("F3", true, "Economica", 400000));
        sillas.add(new Silla("F4", true, "Economica", 400000));
        sillas.add(new Silla("F5", true, "Economica", 400000));

        sillas.add(new Silla("F6", true, "Ejecutiva", 600000));
        sillas.add(new Silla("F7", true, "Ejecutiva", 600000));
        sillas.add(new Silla("F8", true, "Ejecutiva", 600000));
        sillas.add(new Silla("F9", true, "Ejecutiva", 600000));
        sillas.add(new Silla("F10", true, "Ejecutiva", 600000));

        sillas.add(new Silla("F11", true, "PrimeraClase", 800000));
        sillas.add(new Silla("F12", true, "PrimeraClase", 800000));
        sillas.add(new Silla("F13", true, "PrimeraClase", 800000));
        sillas.add(new Silla("F14", true, "PrimeraClase", 800000));
        sillas.add(new Silla("F15", true, "PrimeraClase", 800000));

    }
}
