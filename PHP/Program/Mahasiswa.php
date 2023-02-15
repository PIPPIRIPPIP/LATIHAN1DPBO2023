<?php 

// Membuar kelas mahasiswa
class Mahasiswa {
    // Variabel tampungan data
    public $nama;
    public $nim;
    public $jurusan;
    public $fakultas;
    public $foto;
    
    public function __construct($nama = "", $nim = "", $jurusan = "", $fakultas = "", $foto = "") {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->jurusan = $jurusan;
        $this->fakultas = $fakultas;
        $this->foto = $foto;
    }
}
    

// Membuat kelas untuk meyimpan data
class DataMahasiswa {
    // Membuat array
    private $data = array();
    
    // Fungsi tambah data
    public function tambahData($mahasiswa) {
        array_push($this->data, $mahasiswa);
    }
    
    // Fungsi ubah data
    public function ubahData($indeks, $mahasiswa) {
        $this->data[$indeks] = $mahasiswa;
    }
    
    // Fungsi hapus data
    public function hapusData($indeks) {
        array_splice($this->data, $indeks, 1);
    }
    
    // Fungsi tampil data
    public function tampilkanData() {
        echo "Daftar Mahasiswa" . "<br/>";
        echo "-----------------------" . "<br/>";

        // Melakukan looping sebanyak data yang berada di array
        $i = 1;
        foreach ($this->data as $mahasiswa) {
        echo "$i." . "<img src='" . $mahasiswa->foto. "'style='width:100px'>" . "<br/>";
        echo "  Nama     : " . $mahasiswa->nama . "<br/>";
        echo "  NIM      : " . $mahasiswa->nim . "<br/>";
        echo "  Jurusan  : " . $mahasiswa->jurusan . "<br/>";
        echo "  Fakultas : " . $mahasiswa->fakultas . "<br/><br/>";
        $i++;
        }
    }

    // Fungsi menghitung jumlah data dalam array
    public function jumlahData() {
        return count($this->data);
    }
}
?>