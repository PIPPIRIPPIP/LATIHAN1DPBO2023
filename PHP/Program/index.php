<?php 
// Import Library
require ('Mahasiswa.php');

$dataMahasiswa = new DataMahasiswa();

/* Add Data */
$mahasiswa = new Mahasiswa("Ayesha", "2101990", "Ilmu Komputer", "FPMIPA", "foto/1.jpeg");
$dataMahasiswa->tambahData($mahasiswa);
$mahasiswa = new Mahasiswa("Ali", "2101991", "Ilmu Komputer", "FPMIPA", "foto/2.jpg");
$dataMahasiswa->tambahData($mahasiswa);
$mahasiswa = new Mahasiswa("Firdaus", "2101992", "Ilmu Komputer", "FPMIPA", "foto/3.jpeg");
$dataMahasiswa->tambahData($mahasiswa);

/* Tampil Data */
$dataMahasiswa->tampilkanData();

/* Ubah data*/
$mahasiswa = new Mahasiswa("Ali Firdaus", "2101991", "Ilmu Komputer", "FPMIPA", "foto/2.jpg");
$indeksUbah = 1;
$dataMahasiswa->ubahData($indeksUbah, $mahasiswa);

/* Hapus data */
$indeksUbah = 2;
$dataMahasiswa->hapusData($indeksUbah);

/* Tampil Data */
echo ">> Data setelah diubah dan hapus" . "<br/>";
$dataMahasiswa->tampilkanData();

?>