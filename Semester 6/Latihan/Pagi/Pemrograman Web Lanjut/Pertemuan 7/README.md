# Latihan Pemrograman Web Lanjut - Pertemuan 7

[Klik Disini](https://docs.google.com/presentation/d/1kvj45knIKb1E9kDck10CQI8HOV0ONunJ/edit?usp=drive_link&ouid=106423248853148034800&rtpof=true&sd=true) Untuk Melihat Materi & Latihan Pertemuan 7

## Cara Menjalankan Program

1. Pastikan Sudah Menginstall XAMPP di PC / Komputer
2. Buka XAMPP Control Panel
3. Start Apache
4. Pindahkan folder `Pertemuan 7` ke dalam folder `htdocs` pada direktori instalasi XAMPP, biasanya terletak di `C:\xampp\htdocs`.
5. Buka browser dan akses folder tersebut dengan mengetikkan URL berikut:

```
http://localhost/Pertemuan%207/
```

6. Klik pada file yang ingin dijalankan, misalnya `soal1.php`, `soal2.php`, dll.

```
http://localhost/Pertemuan%207/soal1.php
http://localhost/Pertemuan%207/soal2.php
```

## 📁 Struktur File

```
Pertemuan 7/
├── README.md           # Dokumentasi ini
├── soal1.php          # Sistem Perhitungan Kartu Hasil Studi (KHS)
└── soal2.php          # Program Perhitungan Determinan Persamaan Kuadrat
```

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan latihan ini, mahasiswa diharapkan dapat:

1. **Memahami** penggunaan function dalam PHP untuk modularitas kode
2. **Mengimplementasikan** sistem perhitungan dengan bobot nilai yang berbeda
3. **Menangani** validasi input numerik dengan batasan tertentu
4. **Membuat** sistem grading otomatis berdasarkan kriteria nilai
5. **Menerapkan** perhitungan matematika (determinan) dalam aplikasi web
6. **Mengoptimalkan** kode dengan menggunakan function untuk reusability
7. **Memformat** output dengan styling dan warna yang informatif

---

## 📋 Detail Soal

### 🆔 Soal 1: Sistem Perhitungan Kartu Hasil Studi (KHS) (`soal1.php`)

**Deskripsi:** Program aplikasi web untuk menghitung nilai KHS (Kartu Hasil Studi) mahasiswa berdasarkan nilai tugas, UTS, dan UAS dengan sistem bobot yang berbeda.

#### 🔧 **Fitur Program:**

-   **Input Data Mahasiswa** - Form input untuk nama, NIM, dan mata kuliah
-   **Input Nilai** - Input nilai tugas, UTS, UAS dengan validasi 0-100
-   **Sistem Bobot** - Perhitungan dengan bobot: Tugas 20%, UTS 30%, UAS 50%
-   **Grading Otomatis** - Konversi nilai ke grade A, B, C, D
-   **Status Kelulusan** - Penentuan status lulus/tidak lulus
-   **Visual Feedback** - Tampilan warna berbeda untuk setiap grade

#### 📊 **Output Program:**

```
Data Mahasiswa:
Nama: Tobi SAPUTRA
NIM: 202243502612
Mata Kuliah: Pemrograman Web Lanjut

Rincian Nilai:
Nilai Tugas: 95 (Bobot 20%)
Nilai UTS: 95 (Bobot 30%)
Nilai UAS: 90 (Bobot 50%)

Perhitungan KHS:
Rumus: Tugas×0.2 + UTS×0.3 + UAS×0.5
Perhitungan: 95×0.2 + 95×0.3 + 90×0.5
Perhitungan: 19 + 28.5 + 45

Hasil Akhir:
Nilai KHS: 92.5
Grade: A
Status: LULUS
```

#### 💡 **Konsep yang Dipelajari:**

-   Function dalam PHP untuk modularitas kode
-   Sistem perhitungan dengan bobot yang berbeda
-   Conditional statements untuk grading
-   Input validation dengan PHP
-   Dynamic styling berdasarkan hasil

---

### 🎫 Soal 2: Program Perhitungan Determinan Persamaan Kuadrat (`soal2.php`)

**Deskripsi:** Program aplikasi web untuk menghitung determinan persamaan kuadrat ax² + bx + c = 0 dan menentukan jenis akar serta interpretasi geometris kurva.

#### 🔧 **Fitur Program:**

-   **Input Koefisien** - Form input untuk nilai a, b, dan c persamaan kuadrat
-   **Perhitungan Determinan** - Kalkulasi D = b² - 4ac dengan rumus matematika
-   **Interpretasi Kurva** - Analisis posisi kurva (atas/garis/bawah)
-   **Jenis Akar** - Penentuan akar real berbeda, sama, atau kompleks
-   **Perhitungan Akar** - Menghitung nilai akar-akar persamaan
-   **Visualisasi Grafis** - Deskripsi visual posisi parabola

#### 📊 **Output Program:**

```
Input Nilai:
a = 1
b = 5
c = 6

Persamaan Kuadrat:
1x² + 5x + 6 = 0

Perhitungan Determinan:
Rumus: D = b² - 4ac
Substitusi: D = (5)² - 4×(1)×(6)
Perhitungan: D = 25 - 24

Hasil Akhir:
Nilai Determinan (D): 1
Keterangan: Kurva di Atas Garis
Jenis Akar: Memiliki 2 akar real berbeda

Akar-akar Persamaan:
x₁ = -2, x₂ = -3
```

#### 💡 **Konsep yang Dipelajari:**

-   Implementasi rumus matematika dalam PHP
-   Conditional logic untuk interpretasi hasil
-   Function untuk modularitas perhitungan
-   Switch-case untuk penentuan warna/status
-   Mathematical functions (sqrt, abs) dalam PHP

---

## 🔍 Konsep Teknis yang Dipelajari

### 1. **Function dalam PHP**

#### Membuat Function untuk Perhitungan:

```php
// Function untuk menghitung KHS
function hitungKHS($tugas, $uts, $uas) {
    $khs = ($tugas * 0.2) + ($uts * 0.3) + ($uas * 0.5);
    return round($khs, 2);
}

// Function untuk menentukan grade
function tentukanGrade($nilaiKHS) {
    if ($nilaiKHS >= 90) return "A";
    elseif ($nilaiKHS >= 80) return "B";
    elseif ($nilaiKHS >= 60) return "C";
    else return "D";
}
```

#### Function untuk Determinan:

```php
// Function perhitungan determinan
function hitungDeterminan($a, $b, $c) {
    return ($b * $b) - (4 * $a * $c);
}

// Function interpretasi hasil
function tentukanPosisiKurva($determinan) {
    if ($determinan > 0) return "Kurva di Atas Garis";
    elseif ($determinan == 0) return "Berada di Garis Kurva";
    else return "Di Bawah Garis Kurva";
}
```

### 2. **Sistem Perhitungan dengan Bobot**

#### Implementasi Bobot KHS:

```php
// Bobot: Tugas 20%, UTS 30%, UAS 50%
$khs = ($tugas * 0.2) + ($uts * 0.3) + ($uas * 0.5);

// Validasi range nilai
if ($nilai < 0 || $nilai > 100) {
    echo "Error: Nilai harus antara 0-100!";
}
```

### 3. **Mathematical Functions dalam PHP**

```php
// Perhitungan akar kompleks
if ($determinan < 0) {
    $real = -$b / (2 * $a);
    $imajiner = sqrt(abs($determinan)) / (2 * $a);
    echo $real . " ± " . $imajiner . "i";
}

// Pembulatan hasil
$hasil = round($nilai, 2); // 2 desimal
```

### 4. **Switch-Case untuk Styling**

```php
// Menentukan warna berdasarkan grade
function warnaGrade($grade) {
    switch ($grade) {
        case 'A': return 'green';
        case 'B': return 'blue';
        case 'C': return 'orange';
        case 'D': return 'red';
        default: return 'black';
    }
}
```

---

**Happy Coding! 🚀**

---

_Follow IG: [@ini.tobz](https://www.instagram.com/@ini.tobz)_
