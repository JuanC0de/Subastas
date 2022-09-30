package subastas;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Luisa Castiblanco
 * fecha: 27/09/22
 * funcion: creacion de metodos y atributos de la clase productos
 */
public class Producto {
    private String codigo;
    private String nombre;
    private float valorInicial;
    private String fechaPublicacion;
    private String descripcion;
    private String fechaCompra;
    private String clienteCompra;
    private ArrayList<String[]> historialSubasta = new ArrayList<String[]>();

    public Producto(String Codigo,String nombre, float valorInicial, String fechaPublicacion, String descripcion, String fechaCompra, String clienteCompra) {
        this.codigo= codigo;
        this.nombre = nombre;
        this.valorInicial = valorInicial;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.fechaCompra = fechaCompra;
        this.clienteCompra = clienteCompra;
    }
    
    
    //Método que recibe un Array y lo agrega al array de historial
    public void agregarCliente(String[] nuevoCliente){
        historialSubasta.add(nuevoCliente);
    }
    
    public ArrayList<String[]> getHistorialSubasta() {
        return historialSubasta;
    }

    public void setHistorialSubasta(ArrayList<String[]> historialSubasta) {
        this.historialSubasta = historialSubasta;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(float valorInicial) {
        this.valorInicial = valorInicial;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getClienteCompra() {
        return clienteCompra;
    }

    public void setClienteCompra(String clienteCompra) {
        this.clienteCompra = clienteCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
