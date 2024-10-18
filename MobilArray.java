public class MobilArray {

    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array dengan merek-merek mobil
        String[] merekMobil = {"Mitsubishi", "Tesla", "Honda", "Nissan", "Kia", "Hyundai"};

        // Mencetak setiap merek mobil dalam array
        System.out.println("Daftar Merek Mobil:");
        for (int i = 0; i < merekMobil.length; i++) {
            System.out.println(merekMobil[i]);
        }
    }
}
