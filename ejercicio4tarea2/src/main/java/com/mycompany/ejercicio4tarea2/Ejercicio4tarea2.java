

package com.mycompany.ejercicio4tarea2;

import java.util.Scanner;

public class Ejercicio4tarea2 {

    public static void main(String[] args) {
        
        Scanner mm2 = new Scanner(System.in);
        
        
        System.out.println("Ingrese el primer numero:");
        int num1 = mm2.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        int num2 = mm2.nextInt();
        
        System.out.println("Ingrese el tercer numero:");
        int num3 = mm2.nextInt();
        
        if((num1>num2)&&(num2>num3)){
            System.out.println("Orden: "+num1+" - "+num2+" - "+num3);
        }
        else if((num1>num3)&&(num3>num2))
        {
            System.out.println("Orden: "+num1+" - "+num3+" - "+num2);
        }
        else if((num2>num1)&&(num1>num3))
        {
            System.out.println("Orden: "+num2+" - "+num1+" - "+num3);
        }
        else if((num2>num3)&&(num3>num1))
        {
            System.out.println("Orden: "+num2+" - "+num3+" - "+num1);
        }
        else if((num3>num1)&&(num1>num2))
        {
            System.out.println("Orden: "+num3+" - "+num1+" - "+num2);
        }
        else 
        {
            System.out.println("Orden: "+num3+" - "+num2+" - "+num1);
        }
    }
}
