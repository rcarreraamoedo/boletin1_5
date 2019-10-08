/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Teclea millas: ");
         double millas = sc.nextDouble();
         double milla = 1852;
         System.out.println(" metros = "+(millas*milla));
    }
    
}
