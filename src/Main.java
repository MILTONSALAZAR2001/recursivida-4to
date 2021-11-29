public class Main {
    public static void main(String[] args) {


        /*
        int[] vector = {10, 8, 6, 3, 2, 2, 1, 0};
        System.out.println(Ejercicios.indiceVector(vector, 0));
        System.out.println(Ejercicios.indiceVector(vector));

         */
        int[] vector = {1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
        int valorBuscado = 9;
        System.out.println(Ejercicios.busquedaBinaria(vector,valorBuscado));
    }
}
