import java.util.Scanner;

public class Exercicio3{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        int maiorValor = 0;
        int menorValor = 0;

       for(int i = 0; i < 10; i++){
        System.out.println("Digite um valor: ");
        valores[i] = scanner.nextInt();

        if(valores[i] > maiorValor){
            maiorValor = valores[i];
        }else if(valores[i] < menorValor || valores[i] < maiorValor){
            menorValor = valores[i];
        }
       }

       System.out.println("Maior elemento do vetor: "+maiorValor+" Menor elemento: "+menorValor);
    }
}