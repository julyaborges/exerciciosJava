import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        int pares = 0;
        int impares = 0;

        for(int i=0; i < 10; i++){
            System.out.println("Digite um valor: ");
            valores[i] = scanner.nextInt();

            if(valores[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
    }

    System.out.println("Voce digitou "+pares+" numeros pares e "+impares+" impares");
}
}
