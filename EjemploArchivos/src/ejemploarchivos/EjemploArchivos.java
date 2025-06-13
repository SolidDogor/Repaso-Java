/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarchivos;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alejandro
 */
public class EjemploArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        try {
            System.out.print("Ingrese el primer numero: ");
            num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese el segundo numero: ");
            num2 = Integer.parseInt(sc.nextLine());

            int suma = num1 + num2;

            FileWriter fw = new FileWriter("resultado.txt");
            fw.write("Resultado de la suma: " + suma);
            fw.close();

            System.out.println("Suma guardada exitosamente en resultado.txt");

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresaste un valor no numerico.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }
    }
    
}
