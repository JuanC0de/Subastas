
package subastas;

import java.util.ArrayList;

/**
 *
 * @author Luisa Castibolanco
 * fecha: 27/09/22
 * funcion: Creacion del controlador producto.
 
public class ControladorProducto {

    private static ArrayList<Producto> Productos= new ArrayList();
    
    
    
    /**
     * Método que recibe 4 valores y los agrega al Producto
     */
    public boolean agregarNuevoCliente(String codigo,String NombreCliente, float ValorSubastaProducto, String horaFecha){
        boolean resultadoEditar= false;
        for (Producto Producto1 : Productos) {
            if(Producto1.getCodigo().equals(codigo)){
                String [] nuevoCliente=new String[3];
                nuevoCliente[0]=NombreCliente;
                nuevoCliente[1]= Float.toString(ValorSubastaProducto);
                nuevoCliente[2]= horaFecha;
                Producto1.agregarCliente(nuevoCliente);
                resultadoEditar= true;
                break;
            }
        }
        return resultadoEditar;
        
    }
    
    /**
     * Método que recibe un codigo de producto
     * Edita la información de ese producto
     */
    public boolean EditarProducto(String codigo,String nombre, float valorInicial, String fechaPublicacion, String descripcion, String fechaCompra, String clienteCompra){
        boolean resultadoEditar= false;
        for (Producto Producto1 : Productos) {
            if(Producto1.getCodigo().equals(codigo)){
                Producto1.setNombre(nombre);
                Producto1.setValorInicial(valorInicial);
                Producto1.setFechaPublicacion(fechaPublicacion);
                Producto1.setDescripcion(descripcion);
                Producto1.setFechaCompra(fechaCompra);
                Producto1.setClienteCompra(clienteCompra);
                resultadoEditar= true;
                break;
            }
        }
        return resultadoEditar;
    }
            
    /**Recibe el codigo de un producto, lo busca en la lista de Productos y si existe es eliminado
     * Retorna true si fue eliminado.
     
    public boolean EliminarProducto(String codigo){
        boolean resultadoEliminacion= false;
        for (Producto Producto1 : Productos) {
            if(Producto1.getCodigo().equals(codigo)){
                 resultadoEliminacion=Productos.remove(Producto1);
                 resultadoEliminacion= true;
                 break;
            }
        }
        return resultadoEliminacion;
    }
    
    //Crea un objeto de tipo producto y lo agrega a la lista de productos
    public void CrearProducto(String codigo,String nombre, float valorInicial, String fechaPublicacion, String descripcion, String fechaCompra, String clienteCompra){
        Producto nuevoProducto= new Producto(codigo,nombre, valorInicial, fechaPublicacion, descripcion, fechaCompra, clienteCompra);
        Productos.add(nuevoProducto);
    }
    //Devuelve lista de productos
    public static ArrayList<Producto> getProductos() {
        return Productos;
    }
}
*/