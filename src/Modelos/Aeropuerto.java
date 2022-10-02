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
public class Aeropuerto implements Serializable {

    public String nombre;
    public String ubicacion;
    public String correo;
    public int telefono;

    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Destino> destinos = new ArrayList<>();
    public ArrayList<Vuelo> vuelos = new ArrayList<>();
    public ArrayList<Aerolinea> aerolineas = new ArrayList<>();
    public ArrayList<Administrador> administradores = new ArrayList<>();
    public ArrayList<Promocion> promociones = new ArrayList<>();

    public Aeropuerto(String nombre, String ubicacion, String correo, int telefono) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Aeropuerto() {

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
        String resultado = "Nombre:" + this.nombre + "\n" + "Ubicacion:" + this.ubicacion + "\n" + "Correo:" + this.correo + "Telefono:" + this.telefono;
        return resultado;
    }

    /**
     * Registrar clientes y guardalos en un ArrayList de la Clase Aeropuerto.
     *
     * @param nombre nombre del nuevo cliente
     * @param documento documento del nuevo cliente
     * @param direccion direccion del nuevo cliente
     * @param contraseña contraseña para iniciar sesion del nuevo cliente
     * @param cuentaBancaria cuenta bancaria del nuevo cliente
     * @param tipo tipo de usario del nuevo cliente
     * @param correo correo del nuevo clientse
     * @param telefono telefono del nuevo cliente
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 1/05/2019
     * @version 1
     */
    public void RegistrarCliente(String nombre, int documento, String direccion, String contraseña, int cuentaBancaria, String tipo, String correo, int telefono) throws MisExcepciones {
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
            if (cuentaBancaria < 0) {
                throw new MisExcepciones("La cuenta bancaria no puede tener números negativos");
            }
            if (cantidadTelefono < 7 || cantidadTelefono > 8) {
                throw new MisExcepciones("El telefono ingresado no es valido");
            }
            Cliente nuevoCliente = new Cliente(nombre, documento, direccion, contraseña, cuentaBancaria, tipo, correo, telefono);
            clientes.add(nuevoCliente);
        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }

    }

    /**
     * Este metodo genera nuevos Clientes que son intruducidos en el ArrayList
     * que hay en la clase Aeropuerto.
     *
     * @param vacio
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 30/04/2019
     * @version 1
     */
    public void generarClientes() {
        clientes.add(new Cliente("Juan", 1, "Cr38B", "1", 123, "Premium", "Juan@gmail.com", 12345));
        clientes.add(new Cliente("Pedro", 2, "Cr33B", "2", 143, "Normal", "Pedro@gmail.com", 123125));
    }

    /**
     * Este metodo genera nuevos Aerolineas que son intruducidas al ArrayList
     * que hay en la clase Aeropuerto.
     *
     * @param vacio
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 30/04/2019
     * @version 1
     */
    public void generarAerolineas() {
        aerolineas.add(new Aerolinea("Avianca", 1, 90000000, 8785332));
        aerolineas.add(new Aerolinea("Air Colombia", 2, 70000000, 8784435));
        aerolineas.add(new Aerolinea("American Airlines", 3, 120000000, 8786462));
        aerolineas.add(new Aerolinea("Air Mexico", 4, 90000000, 8784492));
        aerolineas.add(new Aerolinea("Air España", 5, 150000000, 8784450));
    }

    /**
     * Este metodo genera nuevos Destinos que son intruducidos al ArrayList que
     * hay en la clase Aeropuerto.
     *
     * @param vacio
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 30/04/2019
     * @version 1
     */
    public void generarDestino() {
        destinos.add(new Destino(201, "EE.UU", "New York", "Conocida como la capital del mundo, es un centro de cultura y atraccion, alberga una gran cantidad de museos sobre arte, fotografia, arquitectura, tecnologia, historia natural, television y radio, ademas cuanta con las la zonas más famosos del Mundo y tiene el Central Park."));
        destinos.add(new Destino(202, "Alemania", "Berlín", "Conocida como una ciudad historia por su pasada, Berlín es uno de los destino más visitados del mundo. Seduce por la extraordinaria variades de sus monumentos, por la riqueza de su vida cultural y por un estilo de vida con mucha variedad y relajado al mismo tiempo."));
        destinos.add(new Destino(203, "Reino Unido", "Londres", "Ciudad diversa, colorista, cosmopolita, deslumbrante. Una ciudad que cuenta con una histora de más de dos mil años, pero en la que se funde lo moderno y futurista con una gran profusión de artes y espectáculos, fué fundada por los romas como Londinium en el año 43."));
        destinos.add(new Destino(204, "Australia", "Sídney", "Es una de las grandes urbes, con mayor calidad de vida del mundo gracias a suss buenos servicios, magnifico clima, nivel ecónomico y modelo urbanístico en el que destaca la gran cantidad de parques, zonas verdes que se encuentran en el centro y en la periferia de la ciudad."));
        destinos.add(new Destino(205, "Francia", "Chamonix", "Situada al pie del Mon Blanc, en un paraje natural excepcional, Chamonix es una ciudad de montaña que combina el confort moderno y la autenticidad de un valle alpino. Te llevamos a descrubir esta estacion pilifacética."));
        destinos.add(new Destino(206, "República Checa", "Praga", "Es la ciudad con mayor conjunto declarado Patrimonio de la Humanidad. Es una de las capitales más liricas y embrujadoras de Europa Central, apoyadada en su belleza y acervo cultural, que ha trancendido tiempo y espacio para resplandace a nivel Mundial"));
        destinos.add(new Destino(207, "Islandia", "Reikiavik", "Cuneta con ciertos encantos turisticos que son dignos de visitar. La moderna iglesia de Hallgrims o la  catedral luterana, la galeria nacional o el museo de Historia Natural, las casas de Reykjavik están construidas con aluminio u hormigon blanco y son muy coloristas, hay recorridas para todos los gustos."));
        destinos.add(new Destino(208, "Cuba", "La Habana", "La ciudad cuenta con un centro histórico de la Haban vieja, con sus museos, galerias de arte y centros recreativos y culturales; sistema de fotificaciones: el Castillo de la Real fuerza, el castillo de los tres reyes del Morro y la Fortaleza de San Carlos de la Cabeña; plaza de la revolucion, entre otros."));
        destinos.add(new Destino(209, "Irlanda", "Dublin", "Gracias al animado centro de la ciudad y a los verdes parajes de los alrededores, Dublín es capaz de atraer a todo tipo de turistas, tanto a los amantes de la naturaleza como a los declarados urbanistras,  es literatura, cuna y lugar de inspiracion de grandes escritores."));
        destinos.add(new Destino(210, "EE.UU", "San Diego", "Sandiego es famosa por sus atracciones aptas para toda la familia, como por sus hermosas playas y su entorno natural. El SeaWorld de San Diego, un acuario y parque zoológico marino que ocupa casi 9 hectáreas, tiene entre sus habitantes a la sorprendente ballena asesina Shamu y ofrece encuentro cercanos con delfines, rayas y otras increibles criaturas marinas."));

    }

    /**
     * Este metodo genera nuevas Promociones que son intruducidas al ArrayList
     * que hay en la clase Aeropuerto.
     *
     * @param vacio
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 30/04/2019
     * @version 1
     */
    public void generarPromociones() {
        promociones.add(new Promocion(1, "2x1", new Date(12 / 05 / 2019), new Date(31 / 06 / 2019)));
        promociones.add(new Promocion(2, "10% de descuento", new Date(12 / 05 / 2019), new Date(12 / 06 / 2019)));
    }

    /**
     * Este metodo genera un nuevo Administrador que es intruducido al ArrayList
     * que hay en la clase Aeropuerto.
     *
     * @param vacio
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 30/04/2019
     * @version 1
     */
    public void generarAdministrador() {
        administradores.add(new Administrador("Administrador", "123"));
    }

    /**
     * Este metodo genera nuevos Vuelos que son intruducidos al ArrayList que
     * hay en la clase Aeropuerto.
     *
     * @param vacio
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 30/04/2019
     * @version 1
     */
    public void generarVuelo() {
        vuelos.add(new Vuelo("Avianca", 1, 20, new Date(12 / 05 / 2019), 5, new Destino(201, "EE.UU", "New york", "Conocida como la capital del mundo, es un centro de cultura y atracción")));
        vuelos.add(new Vuelo("Avianca", 2, 20, new Date(2 / 07 / 2019), 7, new Destino(202, "Alemania", "Berlín", "Es uno de los destinos más visitados del mundo, seduce por su gran variedad de monumentos")));
        vuelos.add(new Vuelo("Air Colombia", 3, 20, new Date(11 / 8 / 2019), 11, new Destino(204, "Australia", "Sídney", "Una de las grandes urbes, con gran calidad de vida debido a sus buenos servicios")));
        vuelos.add(new Vuelo("Air Colombia", 4, 20, new Date(12 / 04 / 2019), 2, new Destino(208, "Cuba", "La Habana", "Es una ciudad historica, cuenta con museos,galerias de arte, centro recreativos y culturales")));
        vuelos.add(new Vuelo("American Airlines", 5, 20, new Date(19 / 02 / 2019), 4, new Destino(205, "Francia", "Chamonix", "Es un paraje natural que convina el confort moderno con la autencidad de un valle alpino")));
        vuelos.add(new Vuelo("American Airlines", 6, 20, new Date(22 / 12 / 2019), 6, new Destino(204, "Australia", "Sídney", "Una de las grandes urbes, con gran calidad de vida debido a sus buenos servicios")));
        vuelos.add(new Vuelo("Air Mexico", 7, 20, new Date(28 / 05 / 2019), 9, new Destino(205, "Francia", "Chamonix", "Es un paraje natural que convina el confort moderno con la autencidad de un valle alpino")));
        vuelos.add(new Vuelo("Air Mexico", 8, 20, new Date(13 / 8 / 2019), 10, new Destino(203, "Reino Unido", "Londres", "Es una ciudad que cuenta con una historia de mas de dos mil años pero en la que se funde lo moderno y futurista")));
        vuelos.add(new Vuelo("Air España", 9, 20, new Date(1 / 02 / 2019), 11, new Destino(206, "Republica Checa", "Praga", "Es la ciudad con mayor conjunto declarado Patrimonio de la Humanidad, es una de las capitales mas liricas y embrujadores de Europa Central")));
        vuelos.add(new Vuelo("Air España", 10, 20, new Date(3 / 03 / 2019), 12, new Destino(202, "Alemania", "Berlín", "Es uno de los destinos más visitados del mundo, seduce por su gran variedad de monumentos")));
        vuelos.add(new Vuelo("Air España", 11, 20, new Date(7 / 7 / 2019), 16, new Destino(207, "Islandia", "Reikiavik", "")));
    }

    /**
     * Este metodo consulta vuelos que estan relacionados a el codigo de un
     * modelo Destino en particular.
     *
     * @param codigoDestino es el codigo que tiene un destino
     * @return String son los vuelos que se muestran despues de ejecutar el
     * método
     * @author Sebastian Garcia & Daniel Lemus
     * @since 2/05/2019
     * @version 1
     */
    public String ConsultarVueloA(int codigoDestino) throws MisExcepciones {
        String resultado = "";
        try {
            if (codigoDestino < 201) {
                throw new MisExcepciones("No hay destinos con codigos menores a 201");
            }

            for (int i = 0; i < vuelos.size(); i++) {
                if (codigoDestino == vuelos.get(i).destino.codigo) {
                    resultado += vuelos.get(i).toString();
                }

            }

        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }
        return resultado;
    }

    /**
     * Este metodo consulta vuelos que estan relacionados a una clase del modelo
     * Silla, una fecha del modelo Vuelo y a un Codigo de un modelo Destino en
     * particular.
     *
     * @param codigoDestino es el codigo que tiene un destino
     * @param clase es la clase que tiene una Silla(Economica, Ejecutiva y
     * Primera clase)
     * @param fecha es la fecha que tiene como atribuco el modelo Vuelo
     * @return String son los vuelos que se muestran despues de ejecutar el
     * método
     * @author Sebastian Garcia & Daniel Lemus
     * @since 3/05/2019
     * @version 1
     */
    public String ConsultarVueloB(String clase, Date fecha, int codigoDestino) throws MisExcepciones {
        String resultado = "";
        try {
            if (codigoDestino < 201) {
                throw new MisExcepciones("No hay destinos con codigos menores a 201");
            }
            for (int i = 0; i < vuelos.size(); i++) {
                for (int j = 0; j < vuelos.get(i).sillas.size(); j++) {
                    if (clase.equals(vuelos.get(i).sillas.get(j).clase)) {
                        if (fecha == vuelos.get(i).fecha) {
                            if (codigoDestino == vuelos.get(i).codigo) {
                                resultado += vuelos.get(i).toString();
                            }
                        }
                    }
                }
            }
        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }

        return resultado;
    }

    /**
     * Este metodo consulta vuelos que estan relacionados a una clase del modelo
     * Silla, una fecha del modelo Vuelo y a un Codigo de un modelo Destino en
     * particular.
     *
     * @param codigoDestino es el codigo que tiene un destino
     * @param clase es la clase que tiene una Silla(Economica, Ejecutiva y
     * Primera clase)
     * @param fecha es la fecha que tiene como atribuco el modelo Vuelo
     * @return float son los precios que se obtienen al ejecutar el metodo
     * @author Sebastian Garcia & Daniel Lemus
     * @since 4/05/2019
     * @version 1
     */
    public float consultarPrecios(String clase, Date fecha, int codigoDestino) throws MisExcepciones {
        float resultado = 0;

        try {

            if (codigoDestino < 201) {
                throw new MisExcepciones("No hay destinos con codigos menores a 201");
            }
            for (int i = 0; i < vuelos.size(); i++) {
                for (int j = 0; j < vuelos.get(i).sillas.size(); j++) {
                    if (clase.equals(vuelos.get(i).sillas.get(j).clase)) {
                        if (fecha == vuelos.get(i).fecha) {
                            if (codigoDestino == vuelos.get(i).codigo) {
                                resultado += vuelos.get(i).sillas.get(j).precio;
                            }
                        }
                    }
                }
            }

        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }
        return resultado;
    }

    /**
     * Este metodo calcula las ganancias del aeropuerto apartir de las
     * comisiones que le cobra a las aerolineas por pertencer a el, las cuales
     * tiene un 15%.
     *
     * @param vacio
     * @return Double es la ganancia que obtiene el aeropuerto al ejecutar el
     * metodo
     * @author Sebastian Garcia & Daniel Lemus
     * @since 5/05/2019
     * @version 1
     */
    public double CalcularIngresos() {
        double ingresosTotales = 0;
        double ingresos = 0;

        for (int i = 0; i < aerolineas.size(); i++) {
            ingresos = (double) ((aerolineas.get(i).ingresosMensuales * 15) / 100);
            ingresosTotales += ingresos;
        }
        return ingresosTotales;

    }

    /**
     * Este metodo muestra las promociones a un Adminastro,las cuales estan
     * guardadas en el aerpuerto,
     *
     *
     * @param vacio
     * @return String son las promociones que se obitienen al realizar el metodo
     * @author Sebastian Garcia & Daniel Lemus
     * @since 6/05/2019
     * @version 1
     */
    public String mostrarPromociones() {
        String resultado = "";
        for (int i = 0; i < promociones.size(); i++) {
            resultado += promociones.get(i).toString();
        }
        return resultado;
    }

    /**
     * Este metodo muestra las promociones a un Cliente, las cuales estan
     * guardadas en el aerpuerto,
     *
     *
     * @param vacio
     * @return String son las promociones que se obitienen al realizar el metodo
     * @author Sebastian Garcia & Daniel Lemus
     * @since 7/05/2019
     * @version 1
     */
    public String mostrarPromocionesCliente() {
        String resultado = "";
        for (int i = 0; i < promociones.size(); i++) {
            resultado += "\n" + "Concepto: " + promociones.get(i).concepto + "\n" + "Fecha de Inicio: " + promociones.get(i).fechaInicio + "\n" + "Fecha Fin" + promociones.get(i).fechaFin + "\n";
        }
        return resultado;
    }

    /**
     * Este metodo busca los usuario en el sistema, y si estos estan los envia a
     * un menu según su tipo (Premium,Normal)
     *
     *
     * @param documento es el documento que el usuario ingresa y que lo
     * identifica en el sistema
     * @param contraseña es la contraseña que esta relacionada al documento del
     * Cliente y que permite darle segudarid al usuario
     * @return boolean es la respuesta del sistema de si el usuario se escuentra
     * o no registrado
     * @author Sebastian Garcia & Daniel Lemus
     * @since 8/05/2019
     * @version 1
     */
    public int IniciarSesion(int documento, String contraseña) throws MisExcepciones {
        int bandera = 0;
        String documentoCantidad = documento + "";
        int cantidad = documentoCantidad.length();
        try {
            if (cantidad < 10 || cantidad > 11) {
                throw new MisExcepciones("El documento ingresado no es correcto");
            }
            if (documento < 0) {
                throw new MisExcepciones("El documento no puede tener números negativos");
            }
            for (int i = 0; i < clientes.size(); i++) {
                if (documento == clientes.get(i).documento) {
                    if (contraseña.equals(clientes.get(i).contraseña)) {
                        if ("Premium".equals(clientes.get(i).tipo)) {
                            bandera = 1;
                        }
                        if ("Normal".equals(clientes.get(i).tipo)) {
                            bandera = 2;
                        }
                    }
                }

            }
        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }

        return bandera;
    }

    /**
     * Este metodo verifica que el usuario y la contraseña del Administrador
     * sean correctos para enviarlo a un menu
     *
     *
     * @param usuario es el nombre que utiliza el Administrador para ingresar
     * sesion
     * @param contraseña es la contraseña que esta relacionada al nombre del
     * Administrador
     * @return boolean es la respuesta del sistema de si el Administrador es
     * correcto o no
     * @author Sebastian Garcia & Daniel Lemus
     * @since 9/05/2019
     * @version 1
     */
    public boolean IniciarSesionAdministrador(String usuario, String contraseña) {
        boolean bandera = false;
        for (int i = 0; i < administradores.size(); i++) {
            if (usuario.equals(administradores.get(i).usuario)) {
                if (contraseña.equals(administradores.get(i).contraseña)) {
                    bandera = true;
                }
            }
        }
        return bandera;
    }

    /**
     * Este metodo muestra a los usuarios los destinos que estan guardados en el
     * Aerpuerto
     *
     * @param vacio
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 10/05/2019
     * @version 1
     */
    public String consultarDestinos() {
        String resultado = "";
        for (int i = 0; i < destinos.size(); i++) {
            resultado += destinos.get(i).toString();
        }
        return resultado;

    }

     /**
     * Este metodo modifca los atribitudos que el Administrador desee cambiar de
     * la promocio
     *
     * @param concepto es el nombre o descripcion de esta
     * @param codigo es el codigo de la promocion que las identefica de las
     * otras
     * @param fechaInicio es la fecha en la que se lanza la promocion
     * @param fechaFin es la fecha en la que caduca la promocion
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 11/05/2019
     * @version 1
     */
    public void modificarPromociones(String concepto, int codigo, Date fechaInicio, Date fechaFin) throws MisExcepciones{
        boolean ban = false;
        try{
            if (codigo < 0) {
                throw new MisExcepciones("No hay codigos menores a 1");
            }
          for (int i = 0; i < promociones.size(); i++) {
            if (codigo == promociones.get(i).codigo) {
                promociones.get(i).concepto = concepto;
                promociones.get(i).fechaInicio = fechaInicio;
                promociones.get(i).fechaFin = fechaFin;
                ban = true;
            }
        }
        if (ban = false) {
            JOptionPane.showMessageDialog(null, "No se Encuentra");
        }  
        }catch(InputMismatchException D){
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }
        
    }

     /**
     * Este metodo reserva vuelos
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
    public void reservarTiquete(int documento, int cuentaBancaria, String tipo, int telefono, String aerolinea, int codigoVuelo, Date fecha, int hora, int codigoDestino, String Pais, String Ciudad) throws MisExcepciones {
        String documentoCantidad = documento + "";
        int cantidad = documentoCantidad.length();
        try {
            if (cantidad < 10 || cantidad > 11) {
                throw new MisExcepciones("El documento ingresado no es correcto");
            }
            if (documento < 0) {
                throw new MisExcepciones("El documento no puede tener números negativos");
            }
            if (cuentaBancaria < 0) {
                throw new MisExcepciones("La cuenta bancaria no puede tener números negativos");
            }
            if (codigoVuelo < 0) {
                throw new MisExcepciones("No hay vuelos con codigos menores a 1");
            }
            if (codigoDestino < 201) {
                throw new MisExcepciones("No hay destinos con codigos menores a 201");
            }
            for (int i = 0; i < clientes.size(); i++) {
                if (documento == clientes.get(i).documento) {
                    clientes.get(i).reservarTiquete(documento, cuentaBancaria, tipo, telefono, aerolinea, codigoVuelo, fecha, hora, codigoDestino, Pais, Ciudad);

                }

            }
        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }

    }

    /**
     * Este metodo muestras las reservas que tiene un cliente
     *
     * @param documento es el documento del cliente
     * @return String son las reservas que tiene el cliente
     * @author Sebastian Garcia & Daniel Lemus
     * @since 13/05/2019
     * @version 1
     */
    public String mostrarReservas(int documento) throws MisExcepciones {
        String resultado = "";
        String documentoCantidad = documento + "";
        int cantidad = documentoCantidad.length();
        try {
            if (cantidad < 10 || cantidad > 11) {
                throw new MisExcepciones("El documento ingresado no es correcto");
            }
            if (documento < 0) {
                throw new MisExcepciones("El documento no puede tener números negativos");
            }
            for (int i = 0; i < clientes.size(); i++) {
                if (documento == clientes.get(i).documento) {
                    resultado += clientes.get(i).mostrarReservas();
                }
            }
        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }

        return resultado;
    }

     /**
     * Este metodo elimna una reserva determinada que tenga el cliente
     *
     * @param documento es el documento del cliente
     * @param codigoReserva es el codigo de la reserva que tiene el cliente
     * @return vacio
     * @author Sebastian Garcia & Daniel Lemus
     * @since 14/05/2019
     * @version 1
     */
    public void eliminarReserva(int documento, int codigoReserva) throws MisExcepciones {
        String documentoCantidad = documento + "";
        int cantidad = documentoCantidad.length();
        try {
            if (cantidad < 10 || cantidad > 11) {
                throw new MisExcepciones("El documento ingresado no es correcto");
            }
            if (documento < 0) {
                throw new MisExcepciones("El documento no puede tener números negativos");
            }
            if (codigoReserva < 0) {
                throw new MisExcepciones("El codigo de la reserva no puede ser negativo");
            }
            for (int i = 0; i < clientes.size(); i++) {
                if (documento == clientes.get(i).documento) {
                    clientes.get(i).eliminarReserva(codigoReserva);
                }
            }
        } catch (InputMismatchException D) {
            JOptionPane.showMessageDialog(null, "El problema fue error de entrada: " + D.getMessage());
        }

    }
}
