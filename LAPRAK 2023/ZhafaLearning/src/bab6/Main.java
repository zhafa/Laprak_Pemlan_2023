package bab6;

public class Main {
   public static void main(String[] args) {

      DataMahasiswa.tambahMahasiswa(new Mahasiswa("Gusti Reka", "Pendidikan Teknologi Informasi", false));
      DataMahasiswa.tambahMahasiswa(new Mahasiswa("Mando Komando", "Ilmu Komputer", true));

      // Lakukan modifikasi data tambah mahasiswa ...
      DataMahasiswa.tambahMahasiswa(new Mahasiswa("Zhafa Anbiya Ananta Farrel", "Sistem Informasi", false));
      Mahasiswa reina = new Mahasiswa("Reina Absolute", "Teknik Informatika", false);
      DataMahasiswa.tambahMahasiswa(reina);
      // Method tampilSemuaData
      DataMahasiswa.tampilSemuaData();
      // Method cariMahasiswa (jika data ada)
      DataMahasiswa.cariMahasiswa("Reina Absolute");
      DataMahasiswa.cariMahasiswa("Mando Komando");
      // Method cariMahasiswa (jika data tidak ada)
      DataMahasiswa.cariMahasiswa("Reina Absolte");
      DataMahasiswa.cariMahasiswa("Gusti Rea");
      // Method tampilMahasiswa (sebelum diupdate)
      DataMahasiswa.tampilMahasiswa(reina);
      // Method tampilMahasiswa (setelah diupdate)
      Mahasiswa reinaNamboru = new Mahasiswa("reinaNamboru", "Magister Ilmu Komputer", true);
      DataMahasiswa.updateMahasiswa(reina, reinaNamboru);
      DataMahasiswa.tampilMahasiswa(reina);
      DataMahasiswa.tampilMahasiswa(reinaNamboru);
      DataMahasiswa.tampilSemuaData();
   }
}
