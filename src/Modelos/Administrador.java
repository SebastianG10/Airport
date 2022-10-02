/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Administrador implements Serializable {

    public String usuario;
    public String contraseña;

    ArrayList<Promocion> promociones = new ArrayList<>();

    public Administrador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;

    }

    public Administrador() {

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
        String resultado = "Usuario:" + this.usuario + "\n" + "Contraseña:" + this.contraseña;
        return resultado;
    }
}
