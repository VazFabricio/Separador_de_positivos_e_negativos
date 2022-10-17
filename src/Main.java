import java.util.Random;
public class Main {
    private static void exibeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(" ");
    }

    private static int[] separaNumerosNegativos(int[] arr) {
        int[] arrNegativo = new int[8];
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                j++;
                arrNegativo[j] = arr[i];
            }
        }
        return arrNegativo;
    }

    private static int[] separaNumerosPositivos(int[] arr) {
        int[] arrPositivo = new int[8];
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                j++;
                arrPositivo[j] = arr[i];
            }
        }
        return arrPositivo;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] vetor = new int[8];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(-100, 100);
        }
        System.out.println("Vetor Inicial: ");
        exibeArray(vetor);
        System.out.println("Negativos: ");
        exibeArray(separaNumerosNegativos(vetor));
        System.out.println("Positivos: ");
        exibeArray(separaNumerosPositivos(vetor));
    }
}