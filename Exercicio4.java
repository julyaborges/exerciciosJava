import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];

        for(int i = 0; i < 6; i++){
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextInt();
        }
        System.out.println("Vetor invertido: ");

        for(int i = 5; i >= 0; i--){
            System.out.println(valores[i]);
        }
    }
}