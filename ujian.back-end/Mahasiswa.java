public class Mahasiswa {
    private String nama;
    private String nim;
    private double tugas;
    private double uts;
    private double uas;

    // Constructor
    public Mahasiswa(String nama, String nim, double tugas, double uts, double uas) {
        this.nama = nama;
        this.nim = nim;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    // Hitung nilai akhir
    public double hitungNilaiAkhir() {
        return (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
    }

    // Hitung grade
    public String getGrade() {
        double nilai = hitungNilaiAkhir();

        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "A-";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "C+";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }

    // Status lulus / tidak
    public String getStatus() {
        if (hitungNilaiAkhir() >= 60) return "LULUS";
        else return "TIDAK LULUS";
    }

    // Tampilkan data
    public void tampilkanData() {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama         : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("Nilai Akhir  : " + hitungNilaiAkhir());
        System.out.println("Grade        : " + getGrade());
        System.out.println("Status       : " + getStatus());
    }
}
