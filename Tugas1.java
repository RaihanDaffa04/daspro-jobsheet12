import java.util.Scanner;
public class Tugas1 {

    static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return; 
        } else {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
            return;
        }
    }

    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan: ");
        int n = input.nextInt();

        System.out.print("Deret Rekursif:");
        deretDescendingRekursif(n);
        System.out.println();
        System.out.print("Deret Iteratif:");
        deretDescendingIteratif(n);
    }
}