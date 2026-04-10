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
public class BoletoViaje {
    public static void main(String[] args) {
        String nombre, origen, destino;
        int edad;
        double precio;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Nombre del pasajero: ");
        nombre = lector.nextLine();

        System.out.print("Origen: ");
        origen = lector.nextLine();

        System.out.print("Destino: ");
        destino = lector.nextLine();

        System.out.print("Edad: ");
        edad = lector.nextInt();

        System.out.print("Precio: ");
        precio = lector.nextDouble();

        System.out.println("\n--- BOLETO ---");
        System.out.println("Pasajero: " + nombre.toUpperCase());
        System.out.println("Ruta: " + origen.toLowerCase() + " -> " + destino.toLowerCase());
        System.out.println("Edad: " + edad);
        System.out.println("Precio: S/ " + precio);   
    }
}

