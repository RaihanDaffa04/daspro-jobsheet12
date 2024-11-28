import java.util.Scanner;
public class Tugas3 {

    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Input bulan : ");
        int bulan = input.nextInt(); 
        int total = Fibonacci(bulan);

        System.out.println("Total pasangan marmut pada bulan ke-" + bulan + " adalah: " + total);

    }    
}