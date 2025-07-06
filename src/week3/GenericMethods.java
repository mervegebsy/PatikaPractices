package week3;

public class GenericMethods {

    // Generic metot tanımı
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);
    }
}

