

package com.mycompany.ejercicio2tarea2;

import java.util.Scanner;

public class Ejercicio2tarea2 {

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1= num.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2= num.nextInt();
        
        if(num1== num2){
             System.out.println("Los numeros son iguales");
        }
        else{
        System.out.println("Los numeros no son igauels");          
        }
    }
}
