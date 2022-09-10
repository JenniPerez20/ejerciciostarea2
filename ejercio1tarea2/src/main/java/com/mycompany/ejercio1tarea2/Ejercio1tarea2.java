

package com.mycompany.ejercio1tarea2;

import java.util.Scanner;

public class Ejercio1tarea2 {

    public static void main(String[] args) {
        
        Scanner pn = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = pn.nextInt();
        
        if (num>0){
            System.out.println("El numero ingresado es positivo");
        }
        else
        {
            System.out.println("El numero ingresado en negativo");
        }
    }
}
