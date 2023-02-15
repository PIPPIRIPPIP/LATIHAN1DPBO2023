// Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.ArrayList;

// Membuat kelas Mahasiswa
class Mahasiswa {
    /* Private Variabble  */
    private String nama;
    private String NIM;
    private String jurusan;
    private String fakultas;
    
    /* Fungsi Public*/

    public Mahasiswa(String nama, String NIM, String jurusan, String fakultas) {
        // Konstruktor untuk menyimpan ke variabel mahasiswa
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }
    
    /* Getter */
    public String getNama() {
        return nama;
    }
    public String getNIM() {
        return NIM;
    }
    public String getJurusan() {
        return jurusan;
    }
    public String getFakultas() {
        return fakultas;
    }
}

/* Membuat kelas data mahasiswa */
// Kelas ini berguna untuk menyimpan semua data mahasiswa dan
// menjalankan fungsi yang tambah, ubah, hapus, dan tampil
class DataMahasiswa {
    /* Private */
    // membuat semacam list yang digunakan untuk menampung data
    private ArrayList<Mahasiswa> data;
    
    /* Public */
    public DataMahasiswa() {
        data = new ArrayList<Mahasiswa>();
    }
    
    // Fungsi untuk menambahkan data
    public void tambahData(Mahasiswa mhs) {
        data.add(mhs);
        System.out.println(">> Data berhasil ditambahkan.");
    }
    
    // Fungsi untuk mengubah data
    public void ubahData(int index, Mahasiswa mhs) {
        if (index < 0 || index >= data.size()) {
            // jika indeks yang dimasukkan salah
            System.out.println(">> Indeks data tidak valid.");
        } else {
            // jika indeks yang dimasukkan benar (tidak lebih dari jumlah data)

            data.set(index, mhs); // memasukkan data pada indeks yang sudah di pilih
            System.out.println(">> Data berhasil diubah.");
        }
    }
    
    // Fungsi untuk menghapus data
    public void hapusData(int index) {
        if (index < 0 || index >= data.size()) {
            // jika indeks yang dimasukkan salah
            System.out.println(">> Indeks data tidak valid.");
        } else {
            // jika indeks yang dimasukkan benar (tidak lebih dari jumlah data)

            data.remove(index); // mengeluarkan data pada indeks yang dipilih
            System.out.println(">> Data berhasil dihapus.");
        }
    }
    
    // Fungsi untuk menampilkan data
    public void tampilkanData() {
        if (data.size() == 0) {
            // jika data masih kosong
            System.out.println(">> Belum ada data yang ditambahkan.");
        } else {
            // jika data tidak kosong

            System.out.println("           Daftar Mahasiswa           ");
            System.out.println("--------------------------------------");
            // Looping untuk mencetak sebanyak data
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i+1) + ".Nama    : " + data.get(i).getNama());
                System.out.println(       "  NIM     : " + data.get(i).getNIM());
                System.out.println(       "  Jurusan : " + data.get(i).getJurusan());
                System.out.println(       "  Fakultas: " + data.get(i).getFakultas());
                System.out.println();
            }
        }
    }

    // FUngsi untuk mengetahui jumlah data dalam array
    public int jumlahData() {
        return data.size();
    }
}