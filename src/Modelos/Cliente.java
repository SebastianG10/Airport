/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Cliente implements Serializable {

    public String nombre;
    public int documento;
    public String direccion;
    public String contraseña;
    public int cuentaBancaria;
    public String tipo;
    public String correo;
    public int telefono;

    ArrayList<Reserva> reservas = new ArrayList<>();

    public Cliente(String nombre, int documento, String direccion, String contraseña, int cuentaBancaria, String tipo, String correo, int telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
        this.contraseña = contraseña;
        this.cuentaBancaria = cuentaBancaria;
        this.tipo = tipo;
        this.correo = correo;
        this.telefono = telefono;

    }

    public Cliente() {

    }

    /**
     * Este metodo modifca los atribitudos que el Administrador desee cambiar de
     * la promocio
     *
     * @param documento es el documento que identifica al cliente
     * @param cuentaBancaria es el numero de la cuenta bancaria que esta
     * relaciona al cliente
     * @param tipo es el tipo de cliente(Premium,Normal)
     * @param telefono es el numero del telefono del cliente
     * @param aerolinea es la aerolinea a la que pertenece el vuelo que se desea
     * reservar
     * @param codigoVuelo es el codigo que identifica al vuelo que se va
     * reservar
     * @param fecha es la fecha del vuelo que se va reservar
     * @param hora es la hora del vuelo que se va reservar
     * @param codigoDestino es el codigo que identifica el destino del vuelo
     * @param pais es el pais del destino
     * @param ciudad es la ciudad del destino
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemusd
     * @since 12/05/2019
     * @version 1
     */
    public void reservarTiquete(int documento, int cuentaBancaria, String tipo, int telefono, String aerolinea, int codigoVuelo, Date fecha, int hora, int codigoDestino, String pais, String ciudad) throws MisExcepciones {
        String documentoCantidad = documento + "";
        int cantidad = documentoCantidad.length();
        String telefonoCantidad = telefono + "";
        int cantidadTelefono = telefonoCantidad.length();
        try {
            if (cantidad > 11 || cantidad < 10) {
                throw new MisExcepciones("El documento ingresado no es correcto");
            }
            if (documento < 0) {
                throw new MisExcepciones("El documento no puede tener números negativos");
            }
            if (cantidadTelefono < 7 || cantidadTelefono > 8) {
                throw new MisExcepciones("El telefono ingresado no es valido");
            }
            if (codigoVuelo < 0) {
                throw new MisExcepciones("No hay vuelos con codigos menores a 1");
            }
            if (codigoDestino < 201) {
                throw new MisExcepciones("No hay destinos con codigos menores a 201");
            }
            if (cuentaBancaria < 0) {
                throw new MisExcepciones("La cuenta bancaria no puede tener números negativos");
            }
            reservas.add(new Reserva(reservas.size() + 1, documento, cuentaBancaria, tipo, telefono, new Vuelo(aerolinea, codigoVuelo, 20, fecha, hora, new Destino(codigoDestino, pais, ciudad, ""))));
        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }

    }

    /**
     * Este metodo muestras las reservas que tiene un cliente
     *
     * @param vacio
     * @return String son las reservas que tiene el cliente
     * @author Sebastian Garcia & Daniel Lemus
     * @since 13/05/2019
     * @version 1
     */
    public String mostrarReservas() {
        String resultado = "";
        for (int i = 0; i < reservas.size(); i++) {
            resultado += reservas.toString();
        }
        return resultado;
    }

    /**
     * Este metodo muestra y organiza los atributos de una clase
     *
     * @param vacio
     * @return String atributos de la clase
     * @author Sebastian Garcia & Daniel Lemus
     * @since 29/04/2019
     * @version 1
     */
    @Override
    public String toString() {
        String resultado = "Nombre:" + this.nombre + "\n" + "Documento:" + this.documento + "\n" + "Direccion:" + this.direccion + "\n" + "Contraseña:" + this.contraseña + "\n" + "Cuenta Bancaria:" + this.cuentaBancaria + "\n" + "Tipo:" + this.tipo + "\n" + "Correo:" + this.correo + "\n" + "Telefono:" + this.telefono;
        return resultado;
    }

    /**
     * Este metodo elimna una reserva determinada que tenga el cliente
     *
     * @param codigoReserva es el codigo de la reserva que tiene el cliente
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 14/05/2019
     * @version 1
     */
    public void eliminarReserva(int codigoReserva) throws MisExcepciones{
        try {
            if (codigoReserva < 1) {
                throw new MisExcepciones("No hay codigos de reserva menores a 1");
            }
            for (int i = 0; i < reservas.size(); i++) {
                if (codigoReserva == reservas.get(i).codigo) {
                    reservas.remove(reservas.get(i));
                }
            }

        }catch(InputMismatchException D){
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }
    }
}
