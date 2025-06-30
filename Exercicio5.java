import java.util.Scanner;

public class Exercicio5{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[15];
        int soma = 0;
        int mediaGeral;

        for(int i = 0; i < 15; i++){
            System.out.println("Digite a nota do aluno " + (i + 1));
            notas[i] = scanner.nextInt();
            soma += notas[i];
        }
        mediaGeral = soma / notas.length;
        System.out.println("Media geral: " + mediaGeral);
     
    }
}