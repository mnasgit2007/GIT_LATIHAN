import java.util.Scanner;

public class PerbandinganBilangan {

    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua bilangan bulat
        System.out.print("Masukkan bilangan bulat pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan bilangan bulat kedua: ");
        int b = scanner.nextInt();

        // Melakukan perbandingan dan mencetak hasilnya
        System.out.println(a + " == " + b + ": " + (a == b) + " (Apakah " + a + " sama dengan " + b + "?)");
        System.out.println(a + " != " + b + ": " + (a != b) + " (Apakah " + a + " tidak sama dengan " + b + "?)");
        System.out.println(a + " > " + b + ": " + (a > b) + " (Apakah " + a + " lebih besar dari " + b + "?)");
        System.out.println(a + " >= " + b + ": " + (a >= b) + " (Apakah " + a + " lebih besar atau sama dengan " + b + "?)");
        System.out.println(a + " < " + b + ": " + (a < b) + " (Apakah " + a + " lebih kecil dari " + b + "?)");
        System.out.println(a + " <= " + b + ": " + (a <= b) + " (Apakah " + a + " lebih kecil atau sama dengan " + b + "?)");

        // Menutup Scanner
        scanner.close();
    }
}
