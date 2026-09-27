public class mahasiswa {
    // Atribut 
        public String nim;
        public String nama;
        public int sks;
        public double ipk;

    // Constructor (4 Parameter)
    public mahasiswa (String nim, String nama, int sks, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
        this.ipk = ipk;
    }

    //Method Overloading versi 1
    // Parameter : double nilaiAkhir
    // Rumus: ipk = (ipk + nilaiAkhir)/2
    public double hitungIPKSemester(double nilaiAkhir) {
        this.ipk = (this.ipk + nilaiAkhir) / 2.0;
        return this.ipk;
    }

    //Method Overloading versi 2
    // Parameter: double nilaiAkhir, int bobotSks
    // Rumus: ipk = (( ipk * sks) + (nilaiAkhir * bobotSks)) / (sks + bobotSks)
    // Kemudian update total sks = sks + bobotSks
    public double hitungIPKSemester(double nilaiAkhir, int bobotSks) {
        this.ipk = ((this.ipk * this.sks) + (nilaiAkhir * bobotSks)) / (this.sks + bobotSks);
        this.sks = this.sks + bobotSks;
        return this.sks;
    }

    //Method untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("NIM       : " + this.nim);
        System.out.println("Nama      : " + this.nama);
        System.out.println("Total SKS : " + this.sks);
        System.out.println("IPK       : " + this.ipk);
        System.out.println("-----------------------------------");
    }
}

