
package subastas;

/**
 *
 * @author Juan Andrés Bolaño
 * Fecha: 22/09/2022
 * Funcionalidad: Objeto que da forma a los clientes
 * Ultima modificación: crear atributos/crear métodos.
 */
public class Cliente {
    private String nombre;
    private long cedula;
    private long telefono;
    private String direccion;
    private int edad;
    private String correo;

    public Cliente(String nombre, long cedula, long telefono, String direccion, int edad, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.correo = correo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
