package org.example.questao2;

import java.util.Scanner;

public class EstruturaDeProgramacaoDois {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double salarioAjustado, somaSalario = 0f, somaSalarioAjustados= 0f;

        //usando operador while com o true recebendo um nome de um funcionário e continuando o código e um false se receber um FIM
        while(true) {
            System.out.println("Escreva aqui o nome do funcionário");
            String nomeFuncionario = leitor.next();

           if (nomeFuncionario.equalsIgnoreCase("fim"))
               break;

            System.out.println("Escreva aqui o valor do salário atual desse funcionário");
            double salarioFuncionario = leitor.nextDouble();

            //somando e atribuindo o valor da soma salario com o salario do funcionario
             somaSalario += salarioFuncionario;

            if (salarioFuncionario > 150)
                if (salarioFuncionario >= 300)
                    if (salarioFuncionario >= 600)
                        salarioAjustado = salarioFuncionario * 1.10;
                    else salarioAjustado = salarioFuncionario * 1.15;
                else salarioAjustado = salarioFuncionario * 1.20;
            else salarioAjustado = salarioFuncionario * 1.25;

            // somando e atribuindo soma salario ajustado com o salario ajustado
            somaSalarioAjustados += salarioAjustado;
            System.out.println(nomeFuncionario + ", salário atual: " + salarioFuncionario + ", salário ajustado: " + salarioAjustado);
        }
        System.out.println("Soma dos salários atuais: " +somaSalario+", soma dos salários ajustados: " + somaSalarioAjustados+". Diferença: "+(somaSalarioAjustados-somaSalario+"."));
    }
}
