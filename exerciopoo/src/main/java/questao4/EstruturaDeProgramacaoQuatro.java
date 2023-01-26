package questao4;

import java.util.Scanner;

public class EstruturaDeProgramacaoQuatro {
    public static void main(String[] args) {

        int numeroF = 1, numeroA = 0, auxiliar;
        boolean faz = false;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite aqui o número que deseja verificar: ");
        int numero = leitor.nextInt();

        if (numero == 1)
            faz = true;
        else
            while (numero > numeroF){

                faz = ((numeroF+numeroA) == numero);

                auxiliar = numeroF;
                numeroF += numeroA;
                numeroA = auxiliar;
            }
        System.out.println("O número " +numero+(faz?"":" não")+" faz parte da sequencia de fibonacci.");
    }
}
