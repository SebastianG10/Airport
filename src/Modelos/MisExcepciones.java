/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Daniel
 */
public class MisExcepciones extends Exception{
    
    public MisExcepciones(){
        super();
    }
    
    public MisExcepciones(String mensaje){
        super(mensaje);
    }
}
