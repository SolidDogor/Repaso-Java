/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Decaración de variables
        Scanner sc = new Scanner(System.in);
        String num1, num2;
        int opc = 0;
        //Calculadora calculadora = new Calculadora();
        
        System.out.println("--------------------------------------------");
        System.out.println("Bienvenido a la calculadora simple!");
        do{
            System.out.println("--------------------------------------------");
            System.out.println("Opciones disponibles");
            System.out.println("1.- Realizar un calculo con dos numeros");
            System.out.println("2.- Salir del programa");
            System.out.println("Ingrese su opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            
            switch (opc) {
                case 1:
                    System.out.println("A continuacion ingrese dos numeros:");
                    System.out.println("Numero 1: ");
                    num1= sc.nextLine();
                    System.out.println("Numero 2: ");
                    num2= sc.nextLine();

                    int n1 = 0, n2 = 0;
                    try {
                        n1 = Integer.parseInt(num1);
                        n2 = Integer.parseInt(num2);
                    } catch (NumberFormatException e) {
                        System.out.println("Uno de los valores ingresados no es un numero válido.");
                        break;
                    }

                    Calculadora calculadora = new Calculadora(n1, n2);

                    System.out.println("¿Que operacion desea realizar? (+, -, *, /)");
                    String op = sc.nextLine();

                    switch (op) {
                        case "+":
                            calculadora.sumar();
                            break;
                        case "-":
                            calculadora.restar();
                            break;
                        case "*":
                            calculadora.multiplicar();
                            break;
                        case "/":
                            try {
                                if (n2 == 0) throw new ArithmeticException("No se puede dividir entre cero.");
                                calculadora.dividir();
                            } catch (ArithmeticException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Operacion no valida.");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    System.out.println("--------------------------------------------");
                    break;
                default:
                    System.out.println("Opcion no valida...");;
            }
        } while(opc != 2);
                
    }
    
}
