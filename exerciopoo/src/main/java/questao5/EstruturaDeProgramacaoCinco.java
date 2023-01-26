package questao5;

import java.util.Scanner;

public class EstruturaDeProgramacaoCinco {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        boolean palindromo = true;

        System.out.println("Digite à cadeia de caractere(palavra): ");
        String palavraParaVerificar = leitor.next();

        int verificar = palavraParaVerificar.length();
        for (int i=0; i<verificar/2 && palindromo; i++){
          palindromo = (palavraParaVerificar.charAt(i)==palavraParaVerificar.charAt(verificar-i-1));
        }
        System.out.println("A sequência "+palavraParaVerificar+(palindromo?"":" não")+" é palíndromo");
    }
}
