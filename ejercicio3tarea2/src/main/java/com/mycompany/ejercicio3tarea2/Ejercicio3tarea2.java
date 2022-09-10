
package com.mycompany.ejercicio3tarea2;

import java.util.Scanner;

public class Ejercicio3tarea2 {

    public static void main(String[] args) {
        
        Scanner mm = new Scanner(System.in);
        
        
        System.out.println("Ingrese el primer numero");
        int num1 = mm.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = mm.nextInt();
        
        if (num1>num2){
            System.out.println(num1+" y "+num2);
        }
        else{
            System.out.println(num2+" y "+num1);
        }
    }
}
