package questao3;

import java.util.Scanner;

public class EstruturaDeProgramacaoTres {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        int numero;
        String binario = "";

        System.out.print("Digite o número inteiro: ");
        int numeroInteiro = numero = leitor.nextInt();

        while (numeroInteiro > 0) {

            if (numeroInteiro%2==0)
            binario = "0" + binario;
        else
            binario = "1" + binario;

            numeroInteiro = numeroInteiro / 2;
        }
        System.out.println("A conversão de "+numero+" para binário é: " +binario);
    }
}
