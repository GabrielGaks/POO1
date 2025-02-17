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
        int OPC; 
        do{System.out.println("\t----*Calculadora*---");
        System.out.println("\t|[1],Soma             |");
        System.out.println("\t|[2],Subtração        |");
        System.out.println("\t|[3],Multiplicação    |");
        System.out.println("\t|[4],Divisão          |");
        System.out.println("\t|[5],Sair             |");
        System.out.println("\t-------------------");
        System.out.print("\tDigite a opção Desejada:");
        OPC=scan.nextInt(); 
        System.out.println("\t-------------------"); 
        // System.out.printf("\t A opção ecolhida foi: %d \n ",Opção_desejada);
        System.out.print("\t Digite o primeiro numero: ");
        int n1;
        n1=scan.nextInt();
        System.out.println("\t-------------------"); 
        System.out.print("\t Digite o segundo numero: ");       
        int n2;
        n2=scan.nextInt();
        System.out.println("\t-------------------");   

        
        switch(OPC){
            case 1:
                int soma;
                soma= n1 + n2;
                System.out.printf("\t Somando os caracteres %d e %d %n ",n1,n2);
                System.out.println("\t-------------------");
                System.out.printf("\t O resultado da soma é: %d %n",soma);
                break;
            case 2:
                System.out.println("\t Subtraindo os caracteres");
                System.out.println("\t-------------------");
                break;
            case 3:
                System.out.println("\t Multiplicando os caracteres");
                System.out.println("\t-------------------");
                break;
            case 4:
                System.out.println("\t Dividindo caracteres");
                System.out.println("\t-------------------");
                break;
            case 5:
                System.out.println("\t Saindo do programa....");
                System.out.println("\t-------------------");
                break;
            default:
                System.err.print("\t Voce digitou uma opcao incorreta");
        }
        
        
        
        }while(OPC !=5 );
        

        

 
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}

