// Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DataMahasiswa dataMahasiswa = new DataMahasiswa();
        int pilihan = 0; // variabel untuk menyimpan pilihan fitur

        // Melakukan looing sampai user memilih fitur keluar
        while (pilihan != 5) {
            // Tampilan pilihan fitur
            System.out.println();
            System.out.println("+---------------------+");
            System.out.println("|        MENU         |");
            System.out.println("+---------------------+");
            System.out.println("|1. Tambah data       |");
            System.out.println("|2. Ubah data         |");
            System.out.println("|3. Hapus data        |");
            System.out.println("|4. Tampilkan data    |");
            System.out.println("|5. Keluar            |");
            System.out.println("+---------------------+");
            System.out.print("Masukkan fitur yang ingin Anda jalankan: ");

            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                // Jika pilihan user adalah no 1
                    /* Meminta masukkan user untuk fitur tambah data */
                    input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = input.nextLine();
                    System.out.print("Masukkan Fakultas: ");
                    String fakultas = input.nextLine();

                    // Set mahasiswa dengan masukkan yang sudah diberikan
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, fakultas);

                    // Menjalankan fungsi tambah data
                    dataMahasiswa.tambahData(mahasiswa);
                    break;
                case 2:
                // Jika pilihan user adalah nomor 2
                    /* Meminta masukkan user untuk mengubah data*/
                    System.out.print("Masukkan indeks data yang ingin diubah: ");
                    int indeksUbah = input.nextInt();
                    if (indeksUbah < 1 || indeksUbah > dataMahasiswa.jumlahData()) {
                        // Jika indeks yang diberikan tidak valid maka akan keluar dari fitur
                        System.out.println("Indeks data tidak valid.");
                        break;
                    }
                    input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nimBaru = input.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusanBaru = input.nextLine();
                    System.out.print("Masukkan Fakultas: ");
                    String fakultasBaru = input.nextLine();

                    // Set mahasiswa dengan masukkan yang sudah diberikan
                    Mahasiswa mahasiswaBaru = new Mahasiswa(namaBaru, nimBaru, jurusanBaru, fakultasBaru);

                    // Menjalankan fungsi ubah data
                    dataMahasiswa.ubahData(indeksUbah - 1, mahasiswaBaru);
                    break;
                case 3:
                // jika pilihan user adalah nomor 3
                    /* Meminta masukkan user untuk menghapus data*/
                    System.out.print("Masukkan indeks data yang ingin dihapus: ");
                    int indeksHapus = input.nextInt()-1;
                    if (indeksHapus < 0 || indeksHapus >= dataMahasiswa.jumlahData()) {
                        // Jika indeks yang diberikan tidak valid maka akan keluar dari fitur
                        System.out.println("Indeks data tidak valid.");
                        break;
                    }

                    // menjalankan fungsi hapus data
                    dataMahasiswa.hapusData(indeksHapus);
                    break;
                case 4:
                // jika pilihan user adalah nomor 4
                    // mejalankan fungsi tampil data
                    dataMahasiswa.tampilkanData();
                    break;
                case 5:
                // jika pilihan user adalah nomor 5
                    // keluar dari looping
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    return;
                default:
                    // jika masukkan user tidak sesuai dengan daftar fitur yang tersedia
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
