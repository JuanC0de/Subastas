
package subastas;

import java.util.ArrayList;

/**
 * Versión: 1.0
 * @author Juan Andrés Bolaño Ospina
 * Date: 26/09/2022
 * Descripción: controlador que guarda una lista de clientes 
 * Constructor para crear un nuevo cliente
 * Manipular información de los clientes
 */
public class ControladorCliente {
    private ArrayList<Cliente> Clientes= new ArrayList();

    //Método que crea un nuevo Cliente y lo agrega a la lista
    public void CrearCliente(String nombre, long cedula, long telefono, String direccion, int edad, String correo) {
        Cliente nuevoCliente= new Cliente( nombre, cedula, telefono, direccion, edad, correo);
        Clientes.add(nuevoCliente);
    }
    
    //Devuelve el array con la lista de clientes.
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    
}
