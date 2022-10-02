/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Aeropuerto;
import Modelos.MisExcepciones;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class AeropuertoControlador implements Serializable{

    Aeropuerto LaNubia;

    public AeropuertoControlador(String nombre, String ubicacion, String correo, int telefono) {
        LaNubia = new Aeropuerto(nombre, ubicacion, correo, telefono);
        LaNubia.generarAerolineas();
        LaNubia.generarDestino();
        LaNubia.generarAdministrador();
        LaNubia.generarPromociones();
        LaNubia.generarClientes();
        LaNubia.generarVuelo();
    }

    public void RegistrarCliente(String nombre, int documento, String direccion, String contraseña, int cuentaBancaria, String tipo, String correo, int telefono) throws MisExcepciones{
        LaNubia.RegistrarCliente(nombre, documento, direccion, contraseña, cuentaBancaria, tipo, correo, telefono);
    }

    public int IniciarSesion(int documento, String contraseña) throws MisExcepciones{
        int bandera = LaNubia.IniciarSesion(documento, contraseña);
        return bandera;
    }

    public boolean IniciarSesionAdministrador(String usuario, String contraseña) throws MisExcepciones{
        boolean bandera = LaNubia.IniciarSesionAdministrador(usuario, contraseña);
        return bandera;
    }

    public String consultarDestinos() throws MisExcepciones{
        String resultado = LaNubia.consultarDestinos();
        return resultado;
    }

    public double calcularIngresos() throws MisExcepciones{
        double resultado = LaNubia.CalcularIngresos();
        return resultado;
    }

    public String mostrarPromociones() throws MisExcepciones{
        String resultado = LaNubia.mostrarPromociones();
        return resultado;
    }

    public String mostrarPromocionesCliente() throws MisExcepciones{
        String resultado = LaNubia.mostrarPromocionesCliente();
        return resultado;
    }

    public void modificarPromociones(String concepto, int codigo, Date fechaInicio, Date fechaFin) throws MisExcepciones{
        LaNubia.modificarPromociones(concepto, codigo, fechaInicio, fechaFin);
    }

    public String ConsultarVueloA(int codigoDestino) throws MisExcepciones{
        String resultado = LaNubia.ConsultarVueloA(codigoDestino);
        return resultado;
    }

    public float consultarPrecios(String clase, Date fecha, int codigoDestino) throws MisExcepciones{
        float resultado = LaNubia.consultarPrecios(clase, fecha, codigoDestino);
        return resultado;
    }

    public String ConsultarVueloB(String clase, Date fecha, int codigoDestino) throws MisExcepciones{
        String resultado = LaNubia.ConsultarVueloB(clase, fecha, codigoDestino);
        return resultado;
    }

    public void reservarTiquete(int documento, int cuentaBancaria, String tipo, int telefono, String aerolinea, int codigoVuelo, Date fecha, int hora, int codigoDestino, String Pais, String Ciudad) throws MisExcepciones{
        LaNubia.reservarTiquete(documento, cuentaBancaria, tipo, telefono, aerolinea, codigoVuelo, fecha, hora, codigoDestino, Pais, Ciudad);
    }

    public String mostrarReservas(int documento) throws MisExcepciones{
        String resultado = LaNubia.mostrarReservas(documento);
        return resultado;
    }
    
    public void eliminarReserva(int documento, int codigoReserva)throws MisExcepciones{
        LaNubia.eliminarReserva(documento, codigoReserva);
    }
}
