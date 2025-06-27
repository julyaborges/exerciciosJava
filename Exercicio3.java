import java.util.Scanner;

public class Exercicio3{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];
        double maiorValor = 0;
        double menorValor = 0;

       for(int i = 0; i < 10; i++){
        System.out.println("Digite um valor: ");
        valores[i] = scanner.nextDouble();

        if(valores[i] > maiorValor){
            maiorValor = valores[i];
        }else if(valores[i] < menorValor || valores[i] < maiorValor){
            menorValor = valores[i];
        }
       }

       System.out.println("Maior elemento do vetor: "+maiorValor+" Menor elemento: "+menorValor);
    }
}