import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENILAIAN MAHASISWA ===");

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Nilai Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double uas = input.nextDouble();

        // Membuat object
        Mahasiswa mhs = new Mahasiswa(nama, nim, tugas, uts, uas);

        // Output
        mhs.tampilkanData();

        input.close();
    }
}
