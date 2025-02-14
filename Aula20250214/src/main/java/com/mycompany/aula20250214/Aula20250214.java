/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula20250214;

import java.util.Scanner;

/**
 *
 * @author alunolab03
 */
public class Aula20250214 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int Opção_desejada;
        System.out.println("\t----*Calculadora*---");
        System.out.println("\t|[1],Soma             |");
        System.out.println("\t|[2],Subtração        |");
        System.out.println("\t|[3],Multiplicação    |");
        System.out.println("\t|[4],Divisão          |");
        System.out.println("\t|[5],Sair             |");
        System.out.println("\t-------------------");
        System.out.print("\tDigite a opção Desejada:");
        Opção_desejada=scan.nextInt();
        System.out.println("\t-------------------");
        System.out.printf("\tA opção ecolhida foi: %d \n ",Opção_desejada);
        if (Opção_desejada>= 4 ){
            System.out.println("Opção Valida");
        }
        if(Opção_desejada < 5){
            System.out.println("Opção Invalida");
        }
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}

