package org.example.questao1;

public class CountOfPositivesNegatives {
    /*
    Dado um array de inteiros.

Retorna uma matriz, onde o primeiro elemento é a contagem de números positivos e o segundo elemento é a soma dos números negativos. 0 não é positivo nem negativo.

Se a entrada for uma matriz vazia ou nula, retorne uma matriz vazia.

Exemplo
Para entrada [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], você deve retornar [10, -65].
     */
    public static int[] countPositivesSumNegatives(int[] input){
        if (input == null || input.length == 0 ) {
            int [] emptyArray = {};
            return emptyArray;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++){
            if(input[i] > 0){
                count++;
            } else if(input[i] < 0){
                sum += input[i];
            }
        }
        int[] returnValues = new int[] {count, sum};
        return returnValues;
    }
}
