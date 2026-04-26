/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class PA04 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int opcion;
        double area;
        
        System.out.println("----Calculadora de Areas-----");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Rectangulo");
        System.out.print("Seleccione opcion:");
        opcion = lector .nextInt();
        
        switch (opcion){
            case 1:
                System.out.print("Ingrese radio: ");
                double r = lector.nextDouble();
                area = 3.1416 * r * r;
                System.out.printf("Area del Circulo: %2f\n" , area);
                break;
                
            case 2:
                System.out.print("Ingrese lado: ");
                double lado = lector.nextDouble ();
                area = lado * lado;
                System.out.printf("Area del Cuadrado: %.2f\n",area);
                break;
               
            case 3:
                System.out.print("Ingrese base:  ");
                double base = lector.nextDouble ();
                System.out.print("Ingrese altura: ");
                double altura = lector.nextDouble ();
                area = (base * altura )/2 ;
                System.out.printf("Area del Triangulo: %.2f\n",area);
                break;
                
            case 4:
                System.out.print("Ingrese base: ");
                double b = lector.nextDouble ();
                System.out.print("Ingrese aluta: ");
                double h = lector.nextDouble ();
                area = b * h;
                System.out.printf("Area del Rectangulo: %.2f\n", area);
                break;
                
            default :
                System.out.println("Figura Invalida");
                
        }
    }
}
