import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[6];

        for(int i = 0; i < 6; i++){
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }
        System.out.println("Vetor invertido: ");

        for(int i = valores.length-1; i >= 0; i--){
            System.out.println(valores[i]);
        }
    }
}