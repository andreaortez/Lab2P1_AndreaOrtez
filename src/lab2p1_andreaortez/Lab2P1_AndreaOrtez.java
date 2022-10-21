/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_andreaortez;

import java.util.Scanner;

public class Lab2P1_AndreaOrtez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
    int opcion;
    do{
        System.out.println("-- MENU --");
        System.out.println("1-> MCD");
        System.out.println("2-> Sumatoria");
        System.out.println("3-> Supermercado");
        System.out.println("4-> Salir");
        System.out.print("Ingrese su opcion: ");
        opcion = leer.nextInt ();
         
        if (opcion == 1){
            System.out.println(" ");
            System.out.println("-- MCD EN PROCESO --");
            int A,B;
            System.out.print("Ingrese A: ");
            A = leer.nextInt ();
            System.out.print("Ingrese B: ");
            B = leer.nextInt();
            
            if (A<1 || B<1){
                System.out.println("Los números ingresados deben ser positivos.");
                System.out.println(" ");
            }//Fin numeros negativos
            
            else if (A>0 && B>0){
                while (A != B){
                    if (A>B){
                    A = A-B;
                }//Fin A>B
                    else if (A<B){
                        B = B-A;
                    }//Fin B>A   
                }//Fin while
                System.out.println("El MCD es: " + B);
                System.out.println(" ");
            }//Fin de validez de numeros positivos
        }//Fin opcion 1
        
        if (opcion ==2){
            System.out.println(" ");
            System.out.println("-- SUMATORIA EN PROCESO --");
            int k,n=1;
            double x, y=0;
            System.out.print("Ingrese K: ");
            k = leer.nextInt();
            
            while (k>0 && n<=k){
                x = ((double)n/((double)n+1)); 
                y += Math.pow(x,n);
                n++;
            }//Fin validacion
            
            System.out.println("Output: " + y);
            System.out.println(" ");
        }//Fin opcion 2
        
        if (opcion == 3){
            System.out.println(" ");
            System.out.println("-- SUPERMERCADO EN PROCESO --");
            int cliente, cant, cantf=0;
            double cost, total, totalf=0, desc;
            System.out.print("Ingrese el tipo del cliente [0-2]: ");
            cliente = leer.nextInt();
            System.out.print("Ingrese el precio de la unidad del producto: ");
            cost = leer.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            cant = leer.nextInt();
            
            if (cliente < 0 && cliente > 2){
                System.out.print("-- Tipo de cliente no valido --");
            }
            else 
                if (cliente == 0){
                    if (cant >= 10 && cant <= 19){
                    cantf = cant - 2;
                    }//Fin entre 10 y 19
                    
                    if (cant>20){
                        cantf = cant - 5;
                        }//Fin mayor de 20
                    
                    desc=0;
                    totalf= cantf*cost + desc;
 
                    if (cant<10){
                        totalf= cant*cost;
                    }//Fin productos menores a 10
                }//Fin cliente 0
            
            if (cliente == 1){
                if (cant >= 20 && cant <= 29){
                    cantf = cant - 2;
                    }//Fin entre 20 y 29
                    
                    if (cant>30){
                        cantf = cant - 5;
                        }//Fin mayor de 30
                    
                    total= cantf*cost;
                    
                    if (cant<20){
                        total= cant*cost;
                    }//Fin productos menores a 20
                    
                    totalf= total*.90;
            }//Fin cliente 1
            
            if (cliente == 2){
                if (cant >= 30 && cant <= 39){
                    cantf = cant - 2;
                    }//Fin entre 30 y 39
                    
                    if (cant>40){
                        cantf = cant - 5;
                        }//Fin mayor de 40
                    
                    total= cantf*cost;
                    
                    if (cant<20){
                        total= cant*cost;
                     }//Fin productos menores a 20
                        
                    totalf=total*.70;
            }//Fin cliente 2
            
            System.out.println("El total a pagar es: " + totalf);
            System.out.println(" ");
        }//Fin opcion 3
        
    }while (opcion != 4);
            
    }//Fin del main
    
}//Fin de la clase
