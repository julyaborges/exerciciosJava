import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        double[] valores = new double[6];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i <6; i++){
            System.out.println("Digite o "+(i+1)+" valor: ");
            valores[i] = scanner.nextDouble();
        }

        for(int i=0; i < 6; i++){
            System.out.println((i)+" valor: "+valores[i]);
        }
    }
}