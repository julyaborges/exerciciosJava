public class ExercicioMat3{

    public static void main(String[] args){

        int[][] matriz = new int[4][4];

        //Preencher matriz 
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }
        //Matriz
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }
        //Diagonal Principal (Indice linha ==coluna)
        System.out.println("Diagonal Principal: ");
        for(int i=0; i<4; i++){
            System.out.println(matriz[i][i] + " ");
        }

        //Diagonal Secundaria (Indice linha ==coluna)
        System.out.println("Diagonal Secundaria: ");
        for(int i=0; i<4; i++){
            System.out.println(matriz[i][3-i] + " ");
        }

         //Diagonal Transposta (Indice linha ==coluna)
        System.out.println("Diagonal Transposta: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.println("\t"+matriz[j][i]);
            }
            System.out.println("");
    }
}
}