# Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi LATIHAN 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Import lIbrary
from Mahasiswa import Mahasiswa
from Mahasiswa import DataMahasiswa

dataMahasiswa = DataMahasiswa()
pilihan = "" # variabel untuk menyimpan masukkan fitur yang dipilih

# Melakukan looing sampai user memilih fitur keluar
while pilihan != "5":
    # Tampilan pilihan fitur
    print("\n")
    print("+---------------------+")
    print("|        MENU         |")
    print("+---------------------+")
    print("|1. Tambah data       |")
    print("|2. Ubah data         |")
    print("|3. Hapus data        |")
    print("|4. Tampilkan data    |")
    print("|5. Keluar            |")
    print("+---------------------+")
    pilihan = input("Masukkan fitur yang ingin Anda jalankan: ")

    if pilihan == "1":
    # Jika pilihan user adalah no 1
        # Meminta masukkan user untuk fitur tambah data
        nama = input("Masukkan Nama: ")
        nim = input("Masukkan NIM: ")
        jurusan = input("Masukkan Jurusan: ")
        fakultas = input("Masukkan Fakultas: ")

        # Set mahasiswa dengan masukkan yang sudah diberikan
        mahasiswa = Mahasiswa(nama, nim, jurusan, fakultas)
        # Menjalankan fungsi tambah data
        dataMahasiswa.tambahData(mahasiswa)

    elif pilihan == "2":
    # Jika pilihan user adalah nomor 2
        # Meminta masukkan user untuk mengubah data
        indeksUbah = int(input("Masukkan indeks data yang ingin diubah: ")) - 1
        if indeksUbah < 0 or indeksUbah >= dataMahasiswa.jumlahData():
            # Jika indeks yang diberikan tidak valid maka akan kelaur dari fitur
            print(">> Indeks data tidak valid")
            continue
        nama = input("Masukkan Nama: ")
        nim = input("Masukkan NIM: ")
        jurusan = input("Masukkan Jurusan: ")
        fakultas = input("Masukkan Fakultas: ")

        # Set mahasiswa dengan masukkan yang sudah diberikan
        mahasiswa = Mahasiswa(nama, nim, jurusan, fakultas)
        # Menjalankan fungsi ubah data
        dataMahasiswa.ubahData(indeksUbah, mahasiswa)

    elif pilihan == "3":
    # jika pilihan user adalah nomor 3
        indeksHapus = int(input("Masukkan indeks data yang ingin dihapus: ")) - 1
        if indeksHapus < 0 or indeksHapus >= dataMahasiswa.jumlahData():
            # Jika indeks yang diberikan tidak valid maka akan kelaur dari fitur
            print(">> Indeks data tidak valid")
            continue

        # // menjalankan fungsi hapus data
        dataMahasiswa.hapusData(indeksHapus)

    elif pilihan == "4":
    # jika pilihan user adalah nomor 4
        # mejalankan fungsi tampil data
        dataMahasiswa.tampilkanData()

    elif pilihan == "5":
    # // jika pilihan user adalah nomor 5
        # // keluar dari looping
        print("Terima kasih sudah menggunakan program ini.")
        break

    else:
        # jika masukkan user tidak sesuai dengan daftar fitur yang tersedia
        print("Pilihan tidak valid!")
