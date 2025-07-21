/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Alejandro
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dia: ");
        int dia = sc.nextInt();
        sc.nextLine();
                
        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Ingrese el anio: ");
        int anio = sc.nextInt();
        sc.nextLine();
        
        // Intentamos crear un objeto LocalDate con la fecha ingresada
        try {
            // Crear la fecha ingresada por el usuario
            LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);

            // Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Comparar las fechas
            if (fechaIngresada.isEqual(fechaActual)) {
                System.out.println("Fecha correcta!");
            } else if (fechaIngresada.isBefore(fechaActual)) {
                System.out.println("Fecha atrasada...");
                // Calcular los días que han pasado
                long diasPasados = ChronoUnit.DAYS.between(fechaIngresada, fechaActual);
                System.out.println("Han pasado " + diasPasados + " dias desde la fecha ingresada.");
            } else if (fechaIngresada.isAfter(fechaActual)) {
                System.out.println("Fecha adelantada...");
                // Calcular los días que faltan
                long diasFaltantes = ChronoUnit.DAYS.between(fechaActual, fechaIngresada);
                System.out.println("Faltan " + diasFaltantes + " dias para llegar a la fecha ingresada.");
            }

        } catch (DateTimeException e) {
            System.out.println("La fecha ingresada es invalida.");
        }

    }
    
}
