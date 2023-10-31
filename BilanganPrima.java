import java.util.Scanner;

public class BilanganPrima {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas atas rentang bilangan: ");
        int batasAtas = input.nextInt();

        System.out.println("Bilangan prima antara 2 dan " + batasAtas + " adalah:");

        for (int i = 2; i <= batasAtas; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk mengecek apakah sebuah bilangan adalah bilangan prima

    /**
     *
     * @param angka
     * @return
     */
    public static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i * i <= angka; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}