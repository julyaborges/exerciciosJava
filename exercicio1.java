import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int[] valores = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i <6; i++){
            System.out.println("Digite o "+(i+1)+" valor: ");
            valores[i] = scanner.nextInt();
        }

        for(int i=0; i < 6; i++){
            System.out.println((i)+" valor: "+valores[i]);
        }
    }
}