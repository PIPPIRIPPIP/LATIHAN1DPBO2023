// Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import lIbrary
#include <iostream>
#include <string>
#include <vector>
#include <bits/stdc++.h>
#include "Mahasiswa.cpp" // library dari yang dibuat sendiri

// Using standard namespace
using namespace std;

int main() {
    DataMahasiswa dataMhs; // memanggil kelas Data Mahasiswa
    int pilihan, // variabel untuk menampung pilihan fitur
        index;  // variabel untuk menampung masukkan indeks
    string temp;// variabel untuk menamung masukkan
    Mahasiswa mhs; // memanggil kelas Mahasiswa
    
    // Melakukan looing sampai user memilih fitur keluar
    while(pilihan != 5) {
        // Tampilan pilihan fitur
        cout << endl;
        cout << "+---------------------+" << endl;
        cout << "|        MENU         |" << endl;
        cout << "+---------------------+" << endl;
        cout << "|1. Tambah data       |" << endl;
        cout << "|2. Ubah data         |" << endl;
        cout << "|3. Hapus data        |" << endl;
        cout << "|4. Tampilkan data    |" << endl;
        cout << "|5. Keluar            |" << endl;
        cout << "+---------------------+" << endl;
        cout << "Masukkan fitur yang ingin Anda jalankan: ";
        cin >> pilihan;
        
        switch (pilihan) {
            case 1:
            // Jika pilihan user adalah no 1
                /* Meminta masukkan user untuk fitur tambah data */
                cout << "Masukkan Nama: ";
                cin.ignore();
                cin >> temp;
                mhs.setNama(temp);
                cout << "Masukkan NIM: ";
                cin >> temp;
                mhs.setNIM(temp);
                cout << "Masukkan Jurusan: ";
                cin >> temp;
                mhs.setJurusan(temp);
                cout << "Masukkan Fakultas: ";
                cin >> temp;
                mhs.setFakultas(temp);
                
                // Menjalankan fungsi tambah data
                dataMhs.tambahData(mhs);
                break;
            case 2:
            // Jika pilihan user adalah nomor 2
                /* Meminta masukkan user untuk mengubah data*/
                cout << "Masukkan indeks data yang ingin diubah: ";
                cin >> index;
                cout << "Masukkan Nama: ";
                cin.ignore();
                cin >> temp;
                mhs.setNama(temp);
                cout << "Masukkan NIM: ";
                cin >> temp;
                mhs.setNIM(temp);
                cout << "Masukkan Jurusan: ";
                cin >> temp;
                mhs.setJurusan(temp);
                cout << "Masukkan Fakultas: ";
                cin >> temp;
                mhs.setFakultas(temp);

                // menjalankan fungsi ubah data
                dataMhs.ubahData(index-1, mhs);
                break;
            case 3:
            // jika pilihan user adalah nomor 3

                /* Meminta masukkan user untuk menghapus data*/
                cout << "Masukkan indeks data yang ingin dihapus: ";
                cin >> index;

                // menjalankan fungsi hapus data
                dataMhs.hapusData(index-1);
                break;
            case 4:
            // jika pilihan user adalah nomor 4
                // mejalankan fungsi tampil data
                dataMhs.tampilkanData();
                break;
            case 5:
            // jika pilihan user adalah nomor 5
                // keluar dari looping
                cout << "Terima kasih sudah menggunakan program ini." << endl;
                break;
            default:
            // jika masukkan user tidak sesuai dengan daftar fitur yang tersedia
                cout << "Pilihan tidak valid!" << endl;
                break;
        }
    }

    return 0;
}
