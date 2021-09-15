package principal;

public class Aula {
    public static void main(String[] args) {

        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

        // Para o método padrão
        System.out.println("\nNo método padrão\n");
        System.out.print("\nArray integerArray contains: \n");
        printArray(integerArray);
        System.out.printf("\nArray doubleArray contains: \n");
        printArray(doubleArray);
        System.out.printf("\nArray characterArray contains: \n");
        printArray(characterArray);

        int indiceB = 1;
        int indiceA = 4;
        // Para o método sobrecarregado
        System.out.println("\n\nNo método sobrecarregado");
        System.out.print("\nArray integerArray contains: \n");
        try {
            printArray(integerArray, indiceB, indiceA);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.printf("\nArray doubleArray contains: \n");
        try {
            printArray(doubleArray, indiceB, indiceA);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.printf("\nArray characterArray contains: \n");
        try {
            printArray(characterArray, indiceB, indiceA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método padrão
    public static <T> void printArray(T[] inputArray) {

        for (T element : inputArray)
            System.out.printf("%s ", element);
    }

    // Método sobrecarregado
    public static <T> void printArray(T[] inputArray, int indiceBaixo, int indiceAlto) throws Exception {

        if (indiceBaixo <= 0 && indiceAlto <= 0) {
            throw new ExcecaoDeIndiceInvalido();
            // System.out.println("Índice Inválido!");
        } else {
            for (int element = indiceBaixo; element >= indiceAlto; element++) {
                System.out.println("Elementos: " + inputArray[element]);
            }
        }
    }
}