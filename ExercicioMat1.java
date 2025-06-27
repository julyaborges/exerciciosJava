import java.util.Scanner;
import java.util.Random;

public class ExercicioMat1{

    public static void main(String[] args){

        double[][] inteiros = new double[5][5]; //Matriz 5x5
        double somaImpares = 0;
        double[] somaColu = new double[5];
        double[] somaLinha = new double[5];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int y= 0; y< 5; y++) {
                inteiros[i][y] = random.nextInt(100) + 1; // 1 a 100

                if(inteiros[i][y] %2 != 0){
                    somaImpares+= inteiros[i][y];
                }

                somaColu[y] += inteiros[i][y];
                somaLinha[i] += inteiros[i][y];
            }
        }

        System.out.println("Soma dos números impares: "+somaImpares);
        System.out.println("Soma de cada coluna");

        for(int i = 0; i < 5; i++){
            System.out.println(somaColu[i]);
        }

        System.out.println("Soma de cada linha");

        for(int i = 0; i < 5; i++){
            System.out.println(somaLinha[i]);
        }


    }
}