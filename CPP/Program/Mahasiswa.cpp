// Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
#include <iostream>
#include <string>
#include <vector>

// Using standard namespace
using namespace std;

// Membuat kelas Mahasiswa
class Mahasiswa {
    /* Private variabel*/
    private:
        string nama;
        string nim;
        string jurusan;
        string fakultas;
        
    /* Fungsi Public*/
    public:

        /* Setter dan Getter*/

        void setNama(string name) {
            // Set Nama
            nama = name;
        }
        string getNama() {
            // Get Nama
            return nama;
        }
        void setNIM(string id) {
            // Set NIM
            nim = id;
        }
        string getNIM() {
            // Get NIM
            return nim;
        }
        void setJurusan(string major) {
            // Set Jurusan
            jurusan = major;
        }
        string getJurusan() {
            // Get Jurusan
            return jurusan;
        }
        void setFakultas(string faculty) {
            // Set Fakultas
            fakultas = faculty;
        }
        string getFakultas() {
            // Get Fakultas
            return fakultas;
        }
};

/* Membuat kelas data mahasiswa */
// Kelas ini berguna untuk menyimpan semua data mahasiswa dan
// menjalankan fungsi yang tambah, ubah, hapus, dan tampil
class DataMahasiswa {

    // membuat semacam list yang digunakan untuk menampung data
    private:
        vector<Mahasiswa> data; 
        // alasan menggunakan vektor adalah dapat mengakses data menggunakan indeks
        

    // Kelas public yang berisi fitur yang nanti bisa digunakan
    public:

        // Fungsi untuk menambahkan data
        void tambahData(Mahasiswa mhs) {
            data.push_back(mhs); // memasukkan data kedalam vektor
            cout << ">> Data mahasiswa telah ditambahkan." << endl;
        }

        // Fungsi untuk mengubah data
        void ubahData(int index, Mahasiswa mhs) {
            if (index < data.size()) {
                // jika indeks yang dimasukkan benar (tidak lebih dari jumlah data)

                data[index] = mhs; // memasukkan data pada indeks yang dipilih
                cout << ">> Data mahasiswa telah diubah." << endl;
            } else {
                // jika indeks yang dimasukkan salah
                cout << ">> Indeks data tidak valid." << endl;
            }
        }

        // Fungsi untuk menghapus data
        void hapusData(int index) {
            if (index < data.size()) {
                // jika indeks yang dimasukkan benar (tidak lebih dari jumlah data)

                data.erase(data.begin() + index); // mengeluarkan data pada indeks yang dipilih
                cout << ">> Data mahasiswa telah dihapus." << endl;
            } else {
                // jika indeks yang dimasukkan salah
                cout << ">> Indeks data tidak valid." << endl;
            }
        }

        // Fungsi untuk menampilkan data
        void tampilkanData() {
            if (data.empty()) {
                // jika data masih kosong
                cout << ">> Belum ada data mahasiswa." << endl;
            } else {
                // jika data tidak kosong

                cout << "           Daftar Mahasiswa           " << endl;
                cout << "--------------------------------------" << endl;
                // Looping untuk mencetak sebanyak data
                for (int i = 0; i < data.size(); i++) {
                    cout << i+1 << ".Nama    : " << data[i].getNama() << endl;
                    cout <<       "  NIM     : " << data[i].getNIM() << endl;
                    cout <<       "  Jurusan : " << data[i].getJurusan() << endl;
                    cout <<       "  Fakultas: " << data[i].getFakultas() << endl;
                    cout << endl;
                }
            }
        }
};