public class Ejercicios {

    //Indice Vector
    public static int  indiceVector (int[] vector,int indice) {
        int contador = 0;

        if (indice == vector.length - 1){// caso base
            if (indice == vector[indice]){
                contador ++;
            }
        }else { //llamada recursiva
            if (indice == vector[indice]){
                contador ++;
            }
            contador = contador + indiceVector(vector,indice + 1);
        }
        return contador;
    }

    //metodo auxiliar
    public static boolean indiceVector(int[] vector){
        return indiceVector(vector,0) > 0;
    }
}
