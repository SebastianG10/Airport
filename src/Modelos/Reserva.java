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
public class Reserva implements Serializable {

    public int codigo;
    public int documentoCliente;
    public int cuentaBancariaCliente;
    public String tipoCliente;
    public int telefonoCliente;
    public Vuelo vuelo;

    public Reserva(int codigo, int documentoCliente, int cuentaBancariaCliente, String tipoCliente, int telefonoCliente, Vuelo vuelo) {
        this.codigo = codigo;
        this.documentoCliente = documentoCliente;
        this.cuentaBancariaCliente = cuentaBancariaCliente;
        this.tipoCliente = tipoCliente;
        this.telefonoCliente = telefonoCliente;
        this.vuelo = vuelo;
    }

    public Reserva() {

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
        String resultado = "Codigo:" + this.codigo + "\n" + "Documento del cliente: " + this.documentoCliente + "\n" + "Cuenta bancaria del cliente: " + this.cuentaBancariaCliente + "\n" + "Tipo de cliente: " + this.tipoCliente + "\n" + "Telefono del cliente: " + this.telefonoCliente + "\n" + "Vuelo: " + this.vuelo + "\n";
        return resultado;
    }
}
