# Latihan Pemrograman Web Lanjut - Pertemuan 4

[Klik Disini](https://docs.google.com/presentation/d/1OhTZgfqgW9rHHW4hG77BgFxucpJ2NAPP/edit?usp=drive_link&ouid=106423248853148034800&rtpof=true&sd=true) Untuk Melihat Materi & Latihan Pertemuan 4

## Cara Menjalankan Program

1. Pastikan Sudah Menginstall XAMPP di PC / Komputer
2. Buka XAMPP Control Panel
3. Start Apache
4. Pindahkan folder `Pertemuan 4` ke dalam folder `htdocs` pada direktori instalasi XAMPP, biasanya terletak di `C:\xampp\htdocs`.
5. Buka browser dan akses folder tersebut dengan mengetikkan URL berikut:

```
http://localhost/Pertemuan%204/
```

6. Klik pada file yang ingin dijalankan, misalnya `soal1.php`, `soal2.php`, dll.

```
http://localhost/Pertemuan%204/soal1.php
http://localhost/Pertemuan%204/soal2.php
http://localhost/Pertemuan%204/soal3.php
http://localhost/Pertemuan%204/soal4.php
```

## 📁 Struktur File

```
Pertemuan 4/
├── README.md           # Dokumentasi ini
├── soal1.php          # Konversi nilai angka ke huruf
├── soal2.php          # Pengecekan bilangan positif/negatif/nol
├── soal3.php          # Pengecekan bilangan genap/ganjil
└── soal4.php          # Konversi angka dengan switch-case
```

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan latihan ini, mahasiswa diharapkan dapat:

1. **Memahami** penggunaan struktur kontrol `if-else` dalam PHP
2. **Mengimplementasikan** operator perbandingan untuk validasi kondisi
3. **Menggunakan** operator modulus untuk pengecekan bilangan genap/ganjil
4. **Menerapkan** struktur kontrol `switch-case` untuk multiple kondisi
5. **Membandingkan** efisiensi antara `if-else` dan `switch-case`

## 📝 Detail Soal

### 🔢 Soal 1: Konversi Nilai Angka ke Huruf (`soal1.php`)

**Deskripsi:** Program untuk mengkonversi nilai numerik menjadi grade huruf berdasarkan range tertentu.

**Range Nilai:**

-   **A:** Nilai >= 85 dan <= 100 (Sangat Baik)
-   **B:** Nilai >= 70 dan <= 84 (Baik)
-   **C:** Nilai >= 60 dan < 70 (Cukup)
-   **D:** Nilai >= 50 dan < 60 (Kurang)
-   **E:** Nilai < 50 (Sangat Kurang)

**Fitur:**

-   ✅ Validasi input numerik
-   ✅ Tabel konversi yang informatif
-   ✅ Color coding untuk setiap grade
-   ✅ Testing dengan multiple values
-   ✅ Sistem grading yang realistis

**Operator yang Digunakan:**

-   `>=` (Lebih besar atau sama dengan)
-   `<=` (Lebih kecil atau sama dengan)
-   `<` (Lebih kecil dari)
-   `&&` (Logical AND)

---

### ➕➖ Soal 2: Pengecekan Positif/Negatif/Nol (`soal2.php`)

**Deskripsi:** Program untuk mengidentifikasi jenis bilangan berdasarkan nilainya terhadap nol.

**Kategori Bilangan:**

-   **Positif:** Bilangan > 0
-   **Negatif:** Bilangan < 0
-   **Nol:** Bilangan = 0

**Fitur:**

-   ✅ Support untuk integer dan float
-   ✅ Validasi input numerik
-   ✅ Penjelasan konsep matematika
-   ✅ Contoh aplikasi dalam kehidupan nyata
-   ✅ Color coding untuk setiap kategori

**Operator yang Digunakan:**

-   `>` (Lebih besar dari)
-   `<` (Lebih kecil dari)
-   `==` (Sama dengan)

---

### 🎯 Soal 3: Pengecekan Genap/Ganjil (`soal3.php`)

**Deskripsi:** Program untuk menentukan apakah bilangan termasuk genap atau ganjil menggunakan operator modulus.

**Logika Pengecekan:**

-   **Genap:** Bilangan % 2 == 0 (sisa bagi = 0)
-   **Ganjil:** Bilangan % 2 == 1 (sisa bagi = 1)

**Fitur:**

-   ✅ Demonstrasi operator modulus (%)
-   ✅ Tabel sisa pembagian
-   ✅ Contoh aplikasi praktis
-   ✅ Konversi otomatis float ke integer
-   ✅ Penjelasan konsep matematik

**Operator yang Digunakan:**

-   `%` (Modulus - sisa pembagian)
-   `==` (Perbandingan sama dengan)

**Contoh Aplikasi:**

-   Sistem ganjil-genap kendaraan
-   Pembagian kelompok
-   Nomor rumah
-   Sistem antrian

---

### 🔄 Soal 4: Konversi dengan Switch-Case (`soal4.php`)

**Deskripsi:** Program komprehensif yang mendemonstrasikan berbagai penggunaan `switch-case` untuk konversi data.

**4 Jenis Konversi:**

#### 1. 📅 Konversi Angka ke Nama Bulan (1-12)

-   Bahasa Indonesia dan Inggris
-   Informasi jumlah hari per bulan
-   Validasi input range

#### 2. 🗓️ Konversi Angka ke Nama Hari (1-7)

-   Bahasa Indonesia dan Inggris
-   Klasifikasi weekday vs weekend
-   Color coding untuk jenis hari

#### 3. ⭐ Sistem Rating Bintang (1-5)

-   Representasi visual dengan emoji bintang
-   Kategori penilaian
-   Keterangan detail untuk setiap rating

#### 4. 🔢 Konversi Angka ke Kata (0-9)

-   Bahasa Indonesia dan Inggris
-   Angka Romawi
-   Format tabel yang rapi

**Keunggulan Switch-Case:**

-   ✅ Lebih efisien untuk multiple kondisi
-   ✅ Kode lebih mudah dibaca dan maintain
-   ✅ Optimasi compiler yang lebih baik
-   ✅ Struktur yang lebih terorganisir

---

## 🚀 Cara Menjalankan Program

### Opsi 1: Terminal/Command Prompt

```bash
# Navigasi ke folder Pertemuan 4
cd "c:\Tobz\UNINDRA\Semester 6\Latihan\Pagi\Pemrograman Web Lanjut\Pertemuan 4"

# Jalankan setiap file
php soal1.php
php soal2.php
php soal3.php
php soal4.php
```

### Opsi 2: Web Server (Recommended)

1. **Start web server** (XAMPP/WAMP/LARAGON)
2. **Copy folder** ke dalam `htdocs` atau `www`
3. **Akses via browser:**
    - `http://localhost/Pertemuan4/soal1.php`
    - `http://localhost/Pertemuan4/soal2.php`
    - `http://localhost/Pertemuan4/soal3.php`
    - `http://localhost/Pertemuan4/soal4.php`

### Opsi 3: VS Code Live Server

1. **Install extension** Live Server di VS Code
2. **Right-click** pada file PHP
3. **Pilih** "Open with Live Server"

---

## 🔍 Konsep yang Dipelajari

### 1. **Struktur Kontrol IF-ELSE**

```php
if (kondisi1) {
    // Aksi jika kondisi1 benar
} elseif (kondisi2) {
    // Aksi jika kondisi2 benar
} else {
    // Aksi default
}
```

### 2. **Operator Perbandingan**

| Operator | Nama             | Contoh      | Keterangan            |
| -------- | ---------------- | ----------- | --------------------- |
| `==`     | Equal            | `$a == $b`  | Sama nilai            |
| `===`    | Identical        | `$a === $b` | Sama nilai dan tipe   |
| `!=`     | Not equal        | `$a != $b`  | Tidak sama nilai      |
| `<`      | Less than        | `$a < $b`   | Kurang dari           |
| `>`      | Greater than     | `$a > $b`   | Lebih besar dari      |
| `<=`     | Less or equal    | `$a <= $b`  | Kurang atau sama      |
| `>=`     | Greater or equal | `$a >= $b`  | Lebih besar atau sama |

### 3. **Operator Logika**

| Operator | Nama | Contoh       | Keterangan             |
| -------- | ---- | ------------ | ---------------------- |
| `&&`     | AND  | `$a && $b`   | Kedua kondisi benar    |
| `\|\|`   | OR   | `$a \|\| $b` | Salah satu benar       |
| `!`      | NOT  | `!$a`        | Membalik nilai boolean |

### 4. **Struktur Switch-Case**

```php
switch ($variable) {
    case 'nilai1':
        // Aksi untuk nilai1
        break;
    case 'nilai2':
        // Aksi untuk nilai2
        break;
    default:
        // Aksi default
        break;
}
```

---

## 💡 Tips dan Best Practices

### ✅ **DO (Lakukan)**

-   Gunakan `===` untuk perbandingan strict
-   Selalu sertakan `break;` dalam switch-case
-   Validasi input sebelum pemrosesan
-   Gunakan `default:` dalam switch-case
-   Beri komentar pada logika yang kompleks

### ❌ **DON'T (Hindari)**

-   Menggunakan `==` untuk perbandingan boolean
-   Lupa `break;` dalam switch-case (fall-through)
-   Nested if-else yang terlalu dalam
-   Hard-coding values tanpa konstanta
-   Mengabaikan edge cases

### 🎯 **Kapan Menggunakan IF vs SWITCH**

**Gunakan IF-ELSE ketika:**

-   Kondisi melibatkan range nilai
-   Perbandingan dengan operator `<`, `>`, `<=`, `>=`
-   Kondisi kompleks dengan multiple operator
-   Boolean logic yang kompleks

**Gunakan SWITCH-CASE ketika:**

-   Membandingkan satu variabel dengan banyak nilai eksact
-   Nilai yang dibandingkan adalah konstanta
-   Banyak kondisi dengan nilai discrete
-   Performa menjadi pertimbangan penting

---

## 🧪 Testing dan Validasi

### Test Cases yang Disertakan:

#### Soal 1 (Konversi Nilai):

-   Nilai perfect: 100, 95
-   Nilai batas: 85, 84, 70, 69, 60, 59, 50, 49
-   Nilai ekstrem: 0, negatif

#### Soal 2 (Positif/Negatif):

-   Bilangan positif: 15, 3.5, 100
-   Bilangan negatif: -8, -12.7, -0.5
-   Bilangan nol: 0, 0.0

#### Soal 3 (Genap/Ganjil):

-   Bilangan genap: 2, 4, 10, 100
-   Bilangan ganjil: 1, 3, 15, 99
-   Edge case: 0

#### Soal 4 (Switch-Case):

-   Semua nilai valid untuk setiap konversi
-   Nilai di luar range untuk testing default case

---

**Happy Coding! 🚀**

---

_Follow IG: [@ini.tobz](https://www.instagram.com/@ini.tobz)_
