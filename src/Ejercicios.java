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


    //Busqueda binaria
    public static int busquedaBinaria(int  vector[], int dato){
        int n = vector.length;
        int centro,inf=0,sup=n-1;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(vector[centro]==dato) return centro;
            else if(dato < vector [centro] ){
                sup=centro-1;
            }
            else {
                inf=centro+1;
            }
        }
        return -1;
    }
}

