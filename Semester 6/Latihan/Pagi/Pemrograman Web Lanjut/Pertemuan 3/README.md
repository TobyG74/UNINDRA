# Latihan Pemrograman Web Lanjut - Pertemuan 3

[Klik Disini](https://docs.google.com/presentation/d/1TKC1FkwJWoPmrIRnthGE1uvqT8T0xbXU/edit?usp=drive_link&ouid=106423248853148034800&rtpof=true&sd=true) Untuk Melihat Materi & Latihan Pertemuan 3

## Cara Menjalankan Program

1. Pastikan Sudah Menginstall XAMPP di PC / Komputer
2. Buka XAMPP Control Panel
3. Start Apache
4. Pindahkan folder `Pertemuan 3` ke dalam folder `htdocs` pada direktori instalasi XAMPP, biasanya terletak di `C:\xampp\htdocs`.
5. Buka browser dan akses folder tersebut dengan mengetikkan URL berikut:

```
http://localhost/Pertemuan%203/
```

6. Klik pada file yang ingin dijalankan, misalnya `Aritmatika.php`, `Penugasan.php`, dll.

```
http://localhost/Pertemuan%203/Aritmatika.php
http://localhost/Pertemuan%203/Penugasan.php
http://localhost/Pertemuan%203/Bitwise.php
http://localhost/Pertemuan%203/Perbandingan.php
http://localhost/Pertemuan%203/Logika.php
```

## 📁 Struktur File

```
Pertemuan 3/
├── README.md           # Dokumentasi ini
├── Aritmatika.php      # Contoh operator aritmatika
├── Penugasan.php       # Contoh operator penugasan
├── Bitwise.php         # Contoh operator bitwise
├── Perbandingan.php    # Contoh operator perbandingan
└── Logika.php          # Contoh operator logika
```

## 🔢 1. Operator Aritmatika (`Aritmatika.php`)

File ini mendemonstrasikan penggunaan operator aritmatika dasar dalam PHP:

### Operator yang Dibahas:

-   **Penjumlahan (+)** - Menambahkan dua nilai
-   **Pengurangan (-)** - Mengurangi nilai kedua dari nilai pertama
-   **Perkalian (\*)** - Mengalikan dua nilai
-   **Pembagian (/)** - Membagi nilai pertama dengan nilai kedua
-   **Modulus (%)** - Sisa hasil bagi
-   **Pangkat (**)\*\* - Memangkatkan nilai (PHP 5.6+)

### Contoh Output:

```
Penjumlahan: 10 + 3 = 13
Pengurangan: 10 - 3 = 7
Perkalian: 10 * 3 = 30
Pembagian: 10 / 3 = 3.33
Modulus: 10 % 3 = 1
Pangkat: 10 ** 3 = 1000
```

## 📝 2. Operator Penugasan (`Penugasan.php`)

File ini menjelaskan berbagai cara melakukan penugasan nilai dalam PHP:

### Operator yang Dibahas:

-   **Assignment (=)** - Penugasan nilai dasar
-   **Addition Assignment (+=)** - Menambah dan assign
-   **Subtraction Assignment (-=)** - Mengurangi dan assign
-   **Multiplication Assignment (\*=)** - Mengalikan dan assign
-   **Division Assignment (/=)** - Membagi dan assign
-   **Modulus Assignment (%=)** - Modulus dan assign
-   **Concatenation Assignment (.=)** - Menggabungkan string
-   **Increment/Decrement (++/--)** - Pre dan post increment/decrement

### Fitur Khusus:

-   Demonstrasi perbedaan pre-increment dan post-increment
-   Contoh penugasan dengan string dan array
-   Penjelasan tentang operator compound assignment

## 🔧 3. Operator Bitwise (`Bitwise.php`)

File ini mendemonstrasikan operasi pada level bit dalam PHP:

### Operator yang Dibahas:

-   **AND (&)** - Operasi AND pada setiap bit
-   **OR (|)** - Operasi OR pada setiap bit
-   **XOR (^)** - Operasi XOR pada setiap bit
-   **NOT (~)** - Operasi NOT (complement)
-   **Left Shift (<<)** - Geser bit ke kiri
-   **Right Shift (>>)** - Geser bit ke kanan

### Contoh Praktis:

-   **Sistem Permission** - Menggunakan bitwise untuk mengelola hak akses (READ, WRITE, EXECUTE)
-   **Representasi Binary** - Menampilkan representasi binary dari setiap operasi
-   **Flag Manipulation** - Cara menambah, menghapus, dan mengecek flag

### Contoh Permission System:

```php
$READ = 4;     // 100
$WRITE = 2;    // 010
$EXECUTE = 1;  // 001

$permissions = $READ | $WRITE;  // Memberikan READ dan WRITE
// Hasil: 110 (6)
```

## ⚖️ 4. Operator Perbandingan (`Perbandingan.php`)

File ini menjelaskan berbagai cara membandingkan nilai dalam PHP:

### Operator yang Dibahas:

-   **Equal (==)** - Membandingkan nilai saja
-   **Identical (===)** - Membandingkan nilai dan tipe data
-   **Not Equal (!=)** - Tidak sama nilai
-   **Not Identical (!==)** - Tidak sama nilai atau tipe
-   **Less Than (<)** - Kurang dari
-   **Greater Than (>)** - Lebih besar dari
-   **Less Than or Equal (<=)** - Kurang dari atau sama dengan
-   **Greater Than or Equal (>=)** - Lebih besar dari atau sama dengan
-   **Spaceship Operator (<=>)** - Perbandingan tiga arah (PHP 7+)

### Fitur Khusus:

-   Perbedaan antara `==` dan `===`
-   Contoh sistem grading otomatis
-   Perbandingan string secara alfabetis
-   Penggunaan spaceship operator

## 🧠 5. Operator Logika (`Logika.php`)

File ini mendemonstrasikan operasi logika boolean dalam PHP:

### Operator yang Dibahas:

-   **AND (&&)** - Kedua kondisi harus benar
-   **OR (||)** - Salah satu kondisi benar
-   **NOT (!)** - Membalik nilai boolean
-   **XOR (xor)** - Salah satu benar, tapi tidak keduanya
-   **AND (and)** - Alternatif dengan precedence berbeda
-   **OR (or)** - Alternatif dengan precedence berbeda

### Contoh Praktis:

-   **Sistem Validasi Login** - Menggunakan operator logika untuk autentikasi
-   **Short-circuit Evaluation** - Bagaimana PHP mengevaluasi kondisi
-   **Operator Precedence** - Urutan evaluasi operator

### Contoh Validasi Login:

```php
if ($username_valid && $password_valid && $is_active) {
    echo "LOGIN BERHASIL";
} else {
    echo "LOGIN GAGAL";
}
```

## 🚀 Cara Menjalankan

1. **Pastikan PHP sudah terinstall** di sistem Anda
2. **Buka terminal/command prompt** dan navigasi ke folder ini
3. **Jalankan file individual**:
    ```bash
    php Aritmatika.php
    php Penugasan.php
    php Bitwise.php
    php Perbandingan.php
    php Logika.php
    ```
4. **Atau buka di web server** jika ingin melihat output HTML

## 🎯 Tujuan Pembelajaran

Setelah mempelajari dan menjalankan semua file ini, Anda diharapkan dapat:

1. **Memahami** berbagai jenis operator dalam PHP
2. **Menggunakan** operator yang tepat untuk situasi yang tepat
3. **Menerapkan** operator dalam program nyata
4. **Membedakan** antara operator yang mirip (seperti `==` vs `===`)
5. **Mengoptimalkan** kode dengan menggunakan operator yang efisien

## 📚 Materi Tambahan

### Tips Penting:

-   Selalu gunakan `===` untuk perbandingan yang strict
-   Hati-hati dengan operator precedence dalam ekspresi kompleks
-   Operator bitwise sangat berguna untuk optimasi dan flag management
-   Short-circuit evaluation dapat meningkatkan performa kode

### Best Practices:

-   Gunakan parentheses untuk memperjelas precedence
-   Pilih operator yang paling sesuai dengan konteks
-   Dokumentasikan kode yang menggunakan operator bitwise
-   Test edge cases terutama untuk operator perbandingan

**Happy Coding! 🚀**

---

_Follow IG: [@ini.tobz](https://www.instagram.com/@ini.tobz)_
