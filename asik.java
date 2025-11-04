/* 
 Mahasiswa diminta untuk membuat sebuah program sistem seleksi Asisten Dosen
(Asdos) yang dapat menentukan kelayakan mahasiswa berdasarkan nilai akademik dan performa
pada beberapa mata kuliah. Program ini mensimulasikan proses penilaian akademik sederhana
yang digunakan oleh perguruan tinggi dalam menentukan calon asisten dosen.
Program diawali dengan meminta pengguna untuk memasukkan lima nilai angka,
masing-masing mewakili nilai akhir dari mata kuliah:

 Struktur Data
 Pemrograman Berorientasi Objek
 Basis Data
 Algoritma dan Pemrograman
 Rekayasa Perangkat Lunak
Nilai yang dimasukkan berada pada rentang 0 hingga 100. Setelah seluruh nilai
dimasukkan, sistem akan menghitung rata-rata keseluruhan dari kelima nilai tersebut sebagai
bentuk perhitungan IPK semester sederhana. Berdasarkan hasil rata-rata yang diperoleh, sistem
akan menentukan predikat.
prestasi akademik mahasiswa dengan ketentuan sebagai berikut:
 Nilai rata-rata ≥ 3.75 mendapat predikat A (Sangat Baik).
 Nilai rata-rata 3.50–3.74 mendapat predikat AB (Baik Sekali).
 Nilai rata-rata 3.00–3.49 mendapat predikat B (Baik).
 Nilai rata-rata 2.50–2.99 mendapat predikat BC (Cukup).
 Nilai rata-rata &lt; 2.50 mendapat predikat C (Kurang).
Setelah predikat ditentukan, sistem akan menilai apakah mahasiswa memenuhi syarat
untuk mendaftar sebagai Asisten Dosen. Mahasiswa hanya dapat melanjutkan proses seleksi
apabila memiliki predikat A (Sangat Baik) atau AB (Baik Sekali). Jika predikat yang diperoleh
di bawah ketentuan tersebut, maka sistem akan menampilkan pesan bahwa mahasiswa belum
memenuhi syarat dan program berakhir. Apabila mahasiswa memenuhi syarat, sistem akan
menampilkan daftar mata kuliah yang dapat diajukan untuk posisi asisten, yaitu:

1. Struktur Data
2. Pemrograman Berorientasi Objek
3. Basis Data
4. Algoritma dan Pemrograman
5. Rekayasa Perangkat Lunak
Mahasiswa kemudian diminta untuk memilih salah satu dari kelima mata kuliah tersebut.
Setelah pilihan ditentukan, sistem akan melakukan pemeriksaan nilai pada mata kuliah yang
dipilih untuk memastikan apakah mahasiswa memiliki nilai yang cukup tinggi pada bidang yang
diajukan.
Syarat kelulusan yang berlaku adalah bahwa nilai akhir pada mata kuliah yang dipilih
harus lebih besar atau sama dengan 75. Jika nilai mata kuliah tersebut memenuhi batas tersebut,
maka mahasiswa dinyatakan eligible untuk menjadi Asisten Dosen pada mata kuliah yang
dipilih, dan sistem akan menampilkan pesan keberhasilan. Sebaliknya, jika nilai mata kuliah
yang dipilih kurang dari 75, maka sistem akan menampilkan pesan bahwa mahasiswa belum
memenuhi syarat untuk posisi tersebut.
 */

import java.util.Scanner;

public class asik {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.println("Masukkan nilai Struktur Data: ");
        double strukturData = ns.nextDouble();

        System.out.println("Masukkan nilai Pemrograman Berorientasi Objek: ");
        double pbo = ns.nextDouble();

        System.out.println("Masukkan nilai Basis Data: ");
        double basisData = ns.nextDouble();

        System.out.println("Masukkan nilai Algoritma dan Pemrograman: ");
        double algoritma = ns.nextDouble();

        System.out.println("Masukkan nilai Rekayasa Perangkat Lunak: ");
        double rpl = ns.nextDouble();

        double rataRata = (strukturData + pbo + basisData + algoritma + rpl) / 5;
        String predikat;

        if (rataRata >= 3.75) {
            predikat = "A (Sangat Baik)";
        } else if (rataRata >= 3.50) {
            predikat = "AB (Baik Sekali)";
        } else if (rataRata >= 3.00) {
            predikat = "B (Baik)";
        } else if (rataRata >= 2.50) {
            predikat = "BC (Cukup)";
        } else {
            predikat = "C (Kurang)";
        }
    }
}