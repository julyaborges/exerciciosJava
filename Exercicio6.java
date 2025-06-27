import java.util.Scanner;

public class Exercicio6{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double[] vetorA = new double[10];
        double[] vetorB = new double[10];
        double[] vetorC = new double[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o valor "+(i + 1)+" para o vetor A: ");
            vetorA[i] = scanner.nextDouble();
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o valor "+(i + 1)+" para o vetor B: ");
            vetorB[i] = scanner.nextDouble();
        }

        for(int i = 0; i < 10; i++){
           vetorC[i] = vetorA[i] - vetorB[i];
        }
        
        System.out.println("Vetor C: ");
        for(int i = 0; i < 10; i++){    
            System.out.println(vetorC[i]);
        }
    }
}