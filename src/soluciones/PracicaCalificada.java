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
public class PracicaCalificada {
    public static void main(String[] args) {
         
        Scanner lector = new Scanner(System.in);
         
        int h, m, s;
        
        System.out.println("Ingrese horas:");
        h = lector.nextInt();
        System.out.println("Ingrese minutos:");
        m = lector.nextInt();
        System.out.println("Ingrese segundos:");
        s = lector.nextInt();
        
        //Validación
        
         if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s >59){
             System.out.println("Error: hora invalida");
         } else {
             s++;
             
             if (s == 60){
                m = 0;
                m++;
             }
             if ( m == 60){
                h = 0;
                h++;             
             }
             if (h == 24){
                 h = 0;
             }
            System.out.printf(" Siguiente hora : %02d:%02d:%2d\n",h, m, s);
         }
       }
}
