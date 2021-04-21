/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calan_chi_trimestres;

import java.util.Scanner;

/**
 *
 * @author TRUJEQUE
 */
public class Calan_Chi_Trimestres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
	int Valor;
	        
	System.out.println("Deme un valor del 1 al 12");
        Valor = entrada.nextInt();
	        
	switch (Valor) {
	    case 1, 2, 3:
	        System.out.println("Estas en el primer trimestre");
	        break;
	    case 4, 5, 6:
	        System.out.println("Estas en el segundo trimestre");
	        break;
	    case 7, 8, 9:
	        System.out.println("Estas en el tercer trimestre");
	        break;
	    case 10, 11, 12:
	        System.out.println("Estas en el cuarto trimestre");
	        break;
            default:
	        System.out.println("Deme un valor correcto");
        }        
    }
    
}
