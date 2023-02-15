# Membuat kelas mahasiswa
class Mahasiswa:

    # Private 
    __nama = ""
    __nim = ""
    __jurusan = ""
    __fakultas = ""

    # Public
    def __init__(self, nama = "", nim = "", jurusan = "", fakultas = ""):
        self.__nama = nama
        self.__nim = nim
        self.__jurusan = jurusan
        self.__fakultas = fakultas

    # Getter
    # Get nama
    def get_nama(self):
        return self.__nama
    # Get nim
    def get_nim(self):
        return self.__nim
    # get jurusan
    def get_jurusan(self):
        return self.__jurusan
    # get fakultas
    def get_fakultas(self):
        return self.__fakultas
    
    def __str__(self):
        return f"Nama: {self.get_nama()}\n  NIM: {self.get_nim()}\n  Jurusan: {self.get_jurusan()}\n  Fakultas: {self.get_fakultas()}"

# Membuat kelas data mahasiswa
# Kelas ini berguna untuk menyimpan semua data mahasiswa dan
# menjalankan fungsi yang tambah, ubah, hapus, dan tampil
class DataMahasiswa:
    # Menyimpan data mahasiswa
    def __init__(self):
        self.dataMahasiswa = []

    # Fungsi untuk menambah data
    def tambahData(self, mahasiswa):
        self.dataMahasiswa.append(mahasiswa)
        print(">> Data berhasil ditambahkan")

    # Fungsi untuk mengubah data
    def ubahData(self, indeks, mahasiswa):
        self.dataMahasiswa[indeks] = mahasiswa
        print(">> Data berhasil diubah")

    # Fungsi untuk menghapus data
    def hapusData(self, indeks):
        self.dataMahasiswa.pop(indeks)
        print(">> Data berhasil dihapus")

    # Fungsi untuk menampilkan data
    def tampilkanData(self):
        print("           Daftar Mahasiswa           ")
        print("--------------------------------------")
        for i, mahasiswa in enumerate(self.dataMahasiswa):
            print(f"{i+1}.{mahasiswa}")
            

    # Fungsi untuk mengetahui jumlah data
    def jumlahData(self):
        return len(self.dataMahasiswa)