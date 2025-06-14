/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> caracteres = new ArrayList<>();
        Random r = new Random();
        int cantidadCaracteres, cantidadGrupo, mod;
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%&";
        
        System.out.println("Bienvenido al generador de claves!");
        System.out.println("Ingrese la cantidad de digitos que quiere que su clave tenga:");
        while (true) {
            String cantCar = sc.nextLine();
            try {
                cantidadCaracteres = Integer.parseInt(cantCar);
                if (cantidadCaracteres <= 0) {
                    System.out.println("Debe ser un numero mayor que 0. Intente de nuevo:");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero valido. Intente de nuevo:");
            }
        }

        cantidadGrupo = cantidadCaracteres / 4;
        mod = cantidadCaracteres % 4;
        
        int cantMayus = cantidadGrupo;
        int cantMinus = cantidadGrupo;
        int cantNum = cantidadGrupo;
        int cantSimbol = cantidadGrupo;

        if (mod >= 1) cantMayus++;
        if (mod >= 2) cantNum++;
        if (mod == 3) cantSimbol++;

        for (int i = 0; i < cantMayus; i++) {
            caracteres.add(mayusculas.charAt(r.nextInt(mayusculas.length())));
        }
        for (int i = 0; i < cantMinus; i++) {
            caracteres.add(minusculas.charAt(r.nextInt(minusculas.length())));
        }
        for (int i = 0; i < cantNum; i++) {
            caracteres.add(numeros.charAt(r.nextInt(numeros.length())));
        }
        for (int i = 0; i < cantSimbol; i++) {
            caracteres.add(simbolos.charAt(r.nextInt(simbolos.length())));
        }

        java.util.Collections.shuffle(caracteres);
        StringBuilder password = new StringBuilder();
        for (char c : caracteres) {
            password.append(c);
        }

        System.out.println("Tu clave generada es: " + password);
        
    }

}
