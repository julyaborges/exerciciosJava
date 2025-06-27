import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[6];
        double[] pares = new double[6];
        double[] impares = new double[6];
        double somaPares = 0;
        double somaImpares = 0;

        for(int i=0; i < 6; i++){
            System.out.println("Digite um valor: ");
            numeros[i] = scanner.nextDouble();

            if(numeros[i] % 2 == 0){
                pares[i] = numeros[i];
                somaPares += numeros[i];
            }else{
                impares[i] = numeros[i];
                somaImpares++;
            }
        }

        System.out.println("Numeros pares digitados: ");
        for(int i = 0; i < pares.length; i++){
            if(pares[i] != 0){
                System.out.println(pares[i]);
            }            
        }

        System.out.println("Numeros impares digitados: ");
        for(int i = 0; i < impares.length; i++){
            if(impares[i] != 0){
                System.out.println(impares[i]);
            }            
        }

        System.out.println("Soma dos numeros pares digitados: "+somaPares);
        System.out.println("Quantidade de numeros impares digitados: "+somaImpares);
    }
}
