package t_2_ejercicio_13;

import java.util.Scanner;


public class T_2_ejercicio_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra");
        double VALCOMP = sc.nextDouble();
        System.out.println("Ingrese el color de la bolita que sacó al pagar en caja");
        String COLOR = sc.next();
        
        double PDES = 0 ;
        switch (COLOR){
            case "blanca":
                PDES = 0;
                break;
            case "verde":
                PDES = 0.1;
                break;
            case "amarillo":
                PDES = 0.25;
                break;
            case "azul":
                PDES = 0.5;
                break;
            default:
                PDES = 1;
        }
    double VALPAG = VALCOMP - (PDES * VALCOMP) ;
    System.out.println("El cliente debe pagar $" + VALPAG);
        
        
    }
    
}
