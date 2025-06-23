package ejercicio10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ListaLibros {
    ArrayList<Libro> listaLibros;
    
    public ListaLibros(){
        this.listaLibros = new ArrayList<>();
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public void agregarLibro(Libro l) {
        listaLibros.add(l);
        System.out.println("Libro agregado exitosamente.");
        System.out.println("-----------------------------");
    }

    public void mostrarLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Libro l : listaLibros) {
                l.mostrarInfo();
                System.out.println("-----------------------------");
            }
        }
    }
    
    public void buscarLibro(String titulo) {
        boolean encontrado = false;
        if (listaLibros.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else  {
            for (Libro l : listaLibros) {
                if(l.getTitulo().equals(titulo)){
                    System.out.println("-----------------------------");
                    System.out.println("Libro encontrado!");
                    l.mostrarInfo();
                    System.out.println("-----------------------------");
                    encontrado = true;
                }   
            }
        }
        
        if(!encontrado){
            System.out.println("No se encontro el libro.");
        }
    }
}
