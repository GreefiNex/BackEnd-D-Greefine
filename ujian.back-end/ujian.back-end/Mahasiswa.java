public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String mataKuliah;
    private double tugas;
    private double uts;
    private double uas;


    public Mahasiswa(String nama, String nim, String jurusan, String mataKuliah,
                     double tugas, double uts, double uas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.mataKuliah = mataKuliah;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }


    public double hitungNilaiAkhir() {
        return (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
    }


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


    public String getStatus() {
        return (hitungNilaiAkhir() >= 60) ? "LULUS" : "TIDAK LULUS";
    }


    public void tampilkanData() {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama         : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("Jurusan      : " + jurusan);
        System.out.println("Mata Kuliah  : " + mataKuliah);
        System.out.println("Nilai Akhir  : " + hitungNilaiAkhir());
        System.out.println("Grade        : " + getGrade());
        System.out.println("Status       : " + getStatus());
    }
}
