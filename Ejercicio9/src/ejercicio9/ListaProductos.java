/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ListaProductos {
    ArrayList<Producto> listaProductos;

    public ListaProductos() {
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public void agregarProducto(Producto p) {
        listaProductos.add(p);
        System.out.println("Producto agregado exitosamente.");
        System.out.println("-----------------------------");
    }

    public void mostrarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : listaProductos) {
                System.out.println(p);
                System.out.println("-----------------------------");
            }
        }
    }
    
}
