import java.util.Scanner;
import java.util.Random;

public class ExercicioMat2{

    public static void main(String[] args){

        double[][] inteiros = new double[3][5]; //Matriz 3x5
        double quantPares = 0;
        double quantImpares = 0;
        double repetidos = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int y= 0; y< 5; y++) {
                inteiros[i][y] = random.nextInt(100) + 1; // 1 a 100

              if(inteiros[i][y] %2 == 0){
                quantPares++;
              }else{
                quantImpares++;
              }

            }
        }

        System.out.println("A matriz possui elementos repetidos. Quantidade de elementos repetidos: "+ repetidos);
        System.out.println("Quantidade de números pares: "+quantPares);
        System.out.println("Quantidade de números pares: "+quantImpares);
    }
}