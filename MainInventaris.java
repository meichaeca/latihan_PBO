class Barang {

    // 1. Atribut
    public String kodeBarang;
    public String namaBarang;
    public int stok;
    public double harga;

    // 2. Constructor dengan 4 parameter
    public Barang(String kode, String nama, int stokAwal, double hargaBarang) {
        this.kodeBarang = kode;
        this.namaBarang = nama;
        this.stok = stokAwal;
        this.harga = hargaBarang;
    }

    // 3. Method Overloading - Versi 1
    public void tambahStok() {
        this.stok = this.stok + 1;
    }

    // 3. Method Overloading - Versi 2
    public void tambahStok(int jumlah) {
        this.stok = this.stok + jumlah;
    }

    // 4. Method dengan Return Value
    public double hitungTotalNilaiStok() {
        return this.stok * this.harga;
    }

    // Method Tambahan
    public void tampilkanInfo() {
        System.out.println("Kode : " + this.kodeBarang);
        System.out.println("Nama : " + this.namaBarang);
        System.out.println("Stok : " + this.stok + " unit");
        System.out.println("Harga: Rp " + this.harga);
        System.out.println("Nilai Total Stok: Rp " + hitungTotalNilaiStok());
        System.out.println();
    }
}


public class MainInventaris {

    public static void main(String[] args) {

        // Membuat objek (Instansiasi)
        Barang brg1 = new Barang("B001", "Laptop Dell", 10, 7500000);
        Barang brg2 = new Barang("B002", "Mouse Logitech", 50, 150000);

        // Tampilkan info awal
        System.out.println("=== DATA AWAL ===");
        brg1.tampilkanInfo();
        brg2.tampilkanInfo();

        // Method Overloading
        brg1.tambahStok();
        brg2.tambahStok(20);

        // Tampilkan info setelah stok ditambah
        System.out.println("=== SETELAH TAMBAH STOK ===");
        brg1.tampilkanInfo();
        brg2.tampilkanInfo();
    }
}