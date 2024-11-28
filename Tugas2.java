import java.util.Scanner;

public class Tugas2 {

    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        } else {
            int tambah = hitungPenjumlahan(n - 1);
            System.out.print("+" + n);
            return n + tambah;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input bilangan: ");
        int bilangan = input.nextInt();

        int total = hitungPenjumlahan(bilangan);
        System.out.println(" = " + total);
    }
}
