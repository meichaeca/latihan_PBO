class MainAkademik {
    public static void main(String[] args) {
        // membuat 2 objek mahasiswa menggunakan constructor
        mahasiswa mhs1 = new mahasiswa("SI2023001", "Ramanda Rayyan", 20, 3.80);
        mahasiswa mhs2 = new mahasiswa("SI2023002", "Meicha Heli", 20, 3.50);

        // Tampilkan data mahasiswa Sebelum update nilai
        System.out.println("=== DATA MAHASISWA (SEBELUM UPDATE NILAI) ===");
        mhs1.tampilkanData();
        mhs2.tampilkanData();

        // Memanggil Method Oberloading 
        System.out.println("=== SIMULASI PENAMBAHAN NILAI SEMESTER ===");

        // Versi 1: Hanya parameter nilai (mhs1)
        System.out.println("Memproses nilai baru Ramanda Rayyan (Versi 1: Nilai 3.80)...");
        mhs1.hitungIPKSemester(3.80);

        // Versi 2: Parameter nilai dan bobot SKS (mhs2)
        System.out.println("Memproses nilai baru Meicha Heli (Versi 2: Nilai 4.00, SKS 2)...");
        mhs2.hitungIPKSemester(4.00, 2);
        
        System.out.println();

        // 4. Tampilkan Data Mahasiswa SESUDAH Update Nilai
        System.out.println("=== DATA MAHASISWA (SESUDAH UPDATE NILAI) ===");
        mhs1.tampilkanData();
        mhs2.tampilkanData();

    }
}