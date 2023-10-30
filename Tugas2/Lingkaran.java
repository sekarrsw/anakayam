package Tugas2;

/**
        * Kelas ini digunakan untuk menghitung dan mengukur luas lingkaran.
        */
public class Lingkaran {
    /**
     * Metode ini menerima jari-jari lingkaran sebagai argumen dan mengembalikan luas lingkaran.
     *
     * @param jariJari Jari-jari lingkaran yang akan dihitung luasnya.
     * @return Luas lingkaran.
     */
    public static double hitungLuas(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah. Tidak digunakan dalam program ini.
     */
    public static void main(String[] args) {
        double jariJari = 5.0; // Ganti nilai jari-jari sesuai dengan kebutuhan.
        double luas = hitungLuas(jariJari);

        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
    }
}