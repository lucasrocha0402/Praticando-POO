package org.example.questao1;

import java.util.Scanner;

public class EstruturaDeProgramacaoUm {
   public static void main(String[] args){
       // a classe scanner serve para receber dados vindo do console
       Scanner leitor = new Scanner(System.in);
       System.out.println("Escreva o valor de A");
       // fazendo com que a variavel a receba o valor pela classe scanner
       int valorA = leitor.nextInt();
       System.out.println("Escreva o valor de b");
       int valorB = leitor.nextInt();

       System.out.println("Os números ímpares entre " +valorA+ " e " +valorB+ " são: ");

       //operador condicional if(se) o resto da divisão da variavel a por dois for igual a 0, o valor de a deve
       if (valorA%2==0)
           valorA+=1;
       else
           valorA+=2;
       if (valorB>valorA)
           while (valorB>valorA){
               System.out.println(valorA +"");
               valorA+=2;
           }
       else System.out.println("Nenhum");
   }
}
