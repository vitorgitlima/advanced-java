package generics;


public class ArrayUtilsSemGenerics {

    public static <T> T getElemento(T[] array, int index) {

        if (index >= array.length || index < 0) {
            return null;
        }

        return array[index];
    }

    public static void main(String[] args) {

        // Array de Object
        Integer[] integers = {1, 2, 3};
        String[] strings = {"texto 1", "texto 2", "texto 3"};

        // Chamada do método
        Integer primeiroOjeto = getElemento(integers, 0);
        System.out.println("Primeiro objeto: " + primeiroOjeto);

        // Tentativa de ar4mazenar o resultado em uma String (ClassCatException)
        String primeiraString = getElemento(strings, 0);
        System.out.println(primeiraString);
    }
}
