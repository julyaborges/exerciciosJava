public class ExercicioMat2{

  public static void main(String[] args){

    int[][]matriz = new int[3][5];
    int quantPares = 0;
    int quantImpares = 0;

    for(int i=0; i<3; i++){
      for(int j = 0; j<5; j++){
        matriz[i][j] = (int)(Math.random() * 101);

        if(matriz[i][j] %2 == 0){
          quantPares++;
        }else{
          quantImpares++;
        }
      }
    }

    //Matriz
    for(int i=0; i<3; i++){
      for(int j=0; j<5; j++){
          System.out.println("\t"+matriz[i][j]);
      }
      System.out.println("");
    }

    boolean existeRepetido=false;
    //1 Matriz
        for(int i=0; i<3; i++){
          for(int j=0; j<5; j++){
              //2 Matriz
              for(int x=0; x < 3; x++){
                for(int y = 0; y < 5; y++){
            
                  if(i == x && j == y)
                    continue;

                  if(matriz[i][j] == matriz[x][y]){
                    existeRepetido = true;
                  }
                }
              }
          }
        }

    if(existeRepetido){
      System.out.println("Tem repetido");
    }else{
      System.out.println("Não tem repetido");
    }

    System.out.println("Quantidade de numeros pares: "+quantPares);
    System.out.println("Quantidade de numeros impares: "+quantImpares);
  }
}