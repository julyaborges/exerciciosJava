import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];
        double pares = 0;
        double impares = 0;

        for(int i=0; i < 10; i++){
            System.out.println("Digite um valor: ");
            valores[i] = scanner.nextDouble();

            if(valores[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
    }

    System.out.println("Voce digitou "+pares+" numeros pares e "+impares+" impares");
}
}
