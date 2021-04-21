/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestre;

import java.util.Scanner;

/**
 *
 * @author Rafael Moreno
 */
public class Trimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un metodo que lea un valor entero del 1 al 12 valide el valor y  nos diga en que trimestre 
        //del año nos encontramos (Primer trimestre, Segundo Trimestre, Tercer Trimeste, Cuarto Trimestre)
        
        Scanner entrada = new Scanner(System.in);
        
        int valor;
        
        System.out.println("Ingrese un valor del 1 al 12");
        valor = entrada.nextInt();
        
        switch (valor) {
            case 1,2:
                System.out.println("Te encuentras en el primer trimestre");
                break;
            case 3,4:
                System.out.println("Te encuentras en el segundo trimestre");
                break;
            case 5,6:
                System.out.println("Te encuentras en el tercer trimestre");
                break;
            case 7,8:
                System.out.println("Te encuentras en el cuarto trimestre");
                break;
            case 9,10:
                System.out.println("Te encuentras en el quinto trimestre");
                break;
            case 11,12:
                System.out.println("Te encuentras en el sexto trimestre");
                break;
            default:
                System.out.println("Ingrese un valor correcto");
        }
        

    }
    
}
