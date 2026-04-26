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
public class PA03 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        double tarifa, sueldoNormal, sueldoExtra,total;
        int horas;
        
        System.out.println("Ingrese tarifa por horas:");
        tarifa = lector.nextDouble();
        System.out.println("Ingrese horas trabajadas:");
        horas = lector.nextInt();
        
        int  horasNormales = (horas <=40 ) ? horas : 40 ;
        int  horasExtras = (horas > 40 ) ? ( horas - 40): 0;
        
        sueldoNormal = horasNormales * tarifa ;
        sueldoExtra = horasExtras * tarifa * 1.5;
         
        total = sueldoNormal + sueldoExtra;
        
        //Operrador ternario para bono
         double  bono = (total > 1500)? 100: 0;
         double  totalFinal = total + bono;
         
         System.out.println("\n---- BOLETA DE PAGO -----");
         System.out.printf("Sueldo normal : S/ % .2f\n", sueldoNormal);
         System.out.printf("SueldoExtra  : S/ % .2f \n", sueldoExtra);
        System.out.printf("Bono : S/% .2f \n",bono);
        System.out.printf("Total a pagar : S/ % 2f\n", totalFinal);
    }
}

