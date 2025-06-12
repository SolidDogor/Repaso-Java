/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ListaPersonas {
    ArrayList<Persona> listaPersonas;
       
    public ListaPersonas(){
        this.listaPersonas = new ArrayList<>();
    }
    
    public ArrayList<Persona> getListaPersonas(){
        return listaPersonas;
    }
    
    public void setListaPersonas(ArrayList<Persona> listaPersonas){
        this.listaPersonas = listaPersonas;
    }
    
    public void agregarPersona(Persona p) {
        listaPersonas.add(p);
        System.out.println("Persona agregada exitosamente.");
        System.out.println("-----------------------------");
    }

    public void mostrarPersonas() {
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay personas registradas.");
        } else {
            for (Persona p : listaPersonas) {
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Apellido: " + p.getApellido());
                System.out.println("DNI: " + p.getDNI());
                System.out.println("Telefono: " + p.getNumeroTelefono());
                System.out.println("Direccion: " + p.getDireccion());
                System.out.println("-----------------------------");
            }
        }
    }

    public void buscarPorDNI(int dni) {
        boolean encontrado = false;
        for (Persona p : listaPersonas) {
            if (p.getDNI() == dni) {
                System.out.println("¡Persona encontrada!");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Apellido: " + p.getApellido());
                System.out.println("Telefono: " + p.getNumeroTelefono());
                System.out.println("Direccion: " + p.getDireccion());
                System.out.println("-----------------------------");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado a nadie con ese DNI.");
        }
    }
}
