/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ListaContactos {
    ArrayList<Contacto> listaContactos;
    
    public ListaContactos(){
        this.listaContactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }
        
    public void agregarContacto(Contacto c) {
        listaContactos.add(c);
        System.out.println("Contacto agregado exitosamente.");
        System.out.println("-----------------------------");
    }

    public void mostrarContactos() {
        if (listaContactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
        } else {
            for (Contacto c : listaContactos) {
                System.out.println(c);
                System.out.println("-----------------------------");
            }
        }
    }

    public void buscarPorNombre(String nom) {
        boolean encontrado = false;
        for (Contacto c : listaContactos) {
            if (nom.equalsIgnoreCase(c.getNombre())) {
                System.out.println("Contacto encontrado!");
                System.out.println("Telefono: " + c.getTelefono());
                System.out.println("Correo: " + c.getCorreo());
                System.out.println("-----------------------------");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado a nadie con ese nombre.");
        }
    }

}
