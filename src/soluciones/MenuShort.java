/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

/**
 *
 * @author OS
 */
    import java.util.Scanner;

public class MenuShort {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        short opcion;
        double a, b;

        System.out.println("MENU:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opción: ");
        opcion = lector.nextShort();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa dos números: ");
                a = lector.nextDouble();
                b = lector.nextDouble();
                System.out.println("Resultado: " + (a + b));
               

            case 2:
                System.out.print("Ingresa dos números: ");
                a = lector.nextDouble();
                b = lector.nextDouble();
                System.out.println("Resultado: " + (a - b));
                break;

            case 3:
                System.out.print("Ingresa dos números: ");
                a = lector.nextDouble();
                b = lector.nextDouble();
                System.out.println("Resultado: " + (a * b));
                break;

            case 4:
                System.out.print("Ingresa dos números: ");
                a = lector.nextDouble();
                b = lector.nextDouble();
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("No se puede dividir entre 0");
                }
                break;

            default:
                System.out.println("Opción inválida");
        }
    }
}

