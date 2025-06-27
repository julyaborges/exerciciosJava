import java.util.Scanner;

public class Exercicio5{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[15];
        double soma = 0;
        double mediaGeral;

        for(int i = 0; i < 15; i++){
            System.out.println("Digite a nota do aluno " + (i + 1));
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        mediaGeral = soma / notas.length;
        System.out.println("Media geral: " + mediaGeral);
     
    }
}