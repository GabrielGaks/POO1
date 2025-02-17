/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
     System.out.println("\t----*Calculadora*----");// println serve para 'printar' e pular uma linha
     System.out.println("\t [1],Soma(+)");
     System.out.println("\t [2],Subtracao (-)");
     System.out.println("\t [3],Multiplicacao(*)");
     System.out.println("\t [4],Divisao(%)");
     System.out.println("\t [5],Sair");
     System.out.println("\t =====================");//t serve para dar um 'tab' nos elementos 
     Scanner scan = new Scanner(System.in);//Declaração do Scanner.System.in serve para determinar a entrada no sistema 
     System.out.print("\t Digite a opcao desejada:");
     int opcao = scan.nextInt();//Declaração da variavel que ira conter o scanner. 
     //O Nextint() significa que o programa pegara o proximo número inteiro
     System.out.println("\t =====================");
     System.out.printf("\t A opcao escolhida foi: %d \n",opcao);//%d serve para dizer aonde o elemento desejado sera inserido. 
     //O printf significa que voce esta printando algo formatado
     System.out.println("\t ===================== ");
     if(opcao == 1){// == significa igualdade em java , apenas um = torna o elemento um booleano
        System.out.println("\t Voce deseja somar");
         }
     else if(opcao == 2){
         System.out.println("\t Voce deseja subtrair");
     }
     else if(opcao ==3){
         System.out.println("\t Voce deseja multiplicar");
     }
     else if(opcao == 4){
         System.out.println("\t Voce deseja dividir");
    }
    else if(opcao == 5){
         System.out.println("\t Saindo....");
    }else{
        System.out.println("\t Opcao errada,escolha outra opcao");
    }//Para manter uma corrente de if em um unico bloco utiliza-se if, else if e finalmente else .
    
    System.out.println("\t =====================");//
    System.out.print("\t Digite sua idade: ");
    Scanner idade = new Scanner(System.in);
    int id = idade.nextInt();
    System.out.printf("\t Sua idade e correspondente a %d",id);
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    

}
