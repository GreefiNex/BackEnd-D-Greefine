import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENILAIAN MAHASISWA ===");

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan Mata Kuliah: ");
        String mataKuliah = input.nextLine();

        System.out.print("Nilai Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double uas = input.nextDouble();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, mataKuliah, tugas, uts, uas);

        mhs.tampilkanData();

        input.close();
    }
}
