
package subastas;

import java.util.ArrayList;

/**
 *
 * @author Luisa Castibolanco
 * fecha: 27/09/22
 * funcion: Creacion del controlador producto.
 
public class ControladorProducto {

    private static ArrayList<Producto> Productos= new ArrayList();
    
    
    /**Recibe el codigo de un producto, lo busca en la lista de Productos y si existe es eliminado
     * Retorna true si fue eliminado.
     
    public boolean EliminarProducto(String codigo){
        boolean resultadoEliminacion= false;
        for (Producto Producto1 : Productos) {
            if(Producto1.getCodigo().equals(codigo)){
                 resultadoEliminacion=Productos.remove(Producto1);
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