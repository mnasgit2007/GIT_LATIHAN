import java.util.Scanner;

public class OperasiDuaAngka {

    public static void main(String[] args) {
        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input dua angka integer dari pengguna
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        // Operasi aritmatika
        int sum = a + b;           // Penjumlahan
        int difference = a - b;     // Pengurangan
        int product = a * b;        // Perkalian
        int quotient = a / b;       // Pembagian (integer division)
        int remainder = a % b;      // Modulo (sisa bagi)

        // Mencetak hasil ke konsol
        System.out.println("Hasil Penjumlahan (a + b)    : " + sum);
        System.out.println("Hasil Pengurangan (a - b)    : " + difference);
        System.out.println("Hasil Perkalian (a * b)      : " + product);
        System.out.println("Hasil Pembagian (a / b)      : " + quotient);
        System.out.println("Sisa Pembagian (a % b)       : " + remainder);

        // Menutup Scanner
        scanner.close();
    }
}
