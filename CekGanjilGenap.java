import java.util.Scanner;

public class CekGanjilGenap {

    public static void main(String[] args) {
        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan angka antara 1 - 10: ");
        int angka = scanner.nextInt();

        // Memeriksa dan mencetak apakah angka ganjil, genap, atau di luar jangkauan
        if (angka >= 1 && angka <= 10) {
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah genap.");
            } else {
                System.out.println(angka + " adalah ganjil.");
            }
        } else {
            System.out.println("Angka di luar jangkauan.");
        }

        // Menutup Scanner
        scanner.close();
    }
}
