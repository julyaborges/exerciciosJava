public class ExercicioMat5 {

    public static void main(String[] args){

        int[][] matriz = new int[3][3];
        int somaLinha[] = new int[3];
        int somaColu[] = new int[3];
        int diagonalPrin = 0;
        int diagonalSec = 0;
        int somaMag = somaLinha[0];   

        //Preenchendo a matriz
        for(int i=0; i<3; i++){
            for(int j = 0; j<3; j++){
                matriz[i][j] = (int)(Math.random() * 10);
            }
        }

        //matriz
        for(int i=0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }

        //Somando as linhas e colunas
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                somaLinha[i] += matriz[i][j];
                somaColu[j] += matriz[i][j];
                diagonalPrin += matriz[i][i];
                diagonalSec += matriz[i][2-i];
            }
        }

        // Verifica linhas - Colunas - Diagonais
        boolean quadradoMag = true;
        for(int i = 0; i < 3; i++){
            if(somaLinha[i] != somaMag){
                quadradoMag = false;
            }
            if(somaColu[i] != somaMag){
                quadradoMag = false;
            }
        }

        if(diagonalPrin != somaMag || diagonalSec != somaMag){
            quadradoMag = false;
        }

        if(quadradoMag){
            System.out.println("E um quadrado magico");
        }else{
            System.out.println("Nao e um quadrado magico");
        }
    }
}