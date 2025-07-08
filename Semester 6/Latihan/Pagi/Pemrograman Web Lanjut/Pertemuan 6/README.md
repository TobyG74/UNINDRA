# Latihan Pemrograman Web Lanjut - Pertemuan 6

[Klik Disini](https://docs.google.com/presentation/d/1mHzkJAQ3syxengXNXnjENtS8k4vRWuee/edit?usp=drive_link&ouid=106423248853148034800&rtpof=true&sd=true) Untuk Melihat Materi & Latihan Pertemuan 6

## Cara Menjalankan Program

1. Pastikan Sudah Menginstall XAMPP di PC / Komputer
2. Buka XAMPP Control Panel
3. Start Apache
4. Pindahkan folder `Pertemuan 6` ke dalam folder `htdocs` pada direktori instalasi XAMPP, biasanya terletak di `C:\xampp\htdocs`.
5. Buka browser dan akses folder tersebut dengan mengetikkan URL berikut:

```
http://localhost/Pertemuan%206/
```

6. Klik pada file yang ingin dijalankan, misalnya `soal1.php`, `soal2.php`, dll.

```
http://localhost/Pertemuan%206/soal1.php
http://localhost/Pertemuan%206/soal2.php
```

## 📁 Struktur File

```
Pertemuan 6/
├── README.md           # Dokumentasi ini
├── soal.php           # Form Biodata dengan Method POST
└── soal2.php          # Sistem Pemesanan Tiket Bola SEA Games 2018
```

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan latihan ini, mahasiswa diharapkan dapat:

1. **Memahami** penggunaan form HTML dengan method POST
2. **Mengimplementasikan** berbagai jenis input (text, radio, checkbox, select)
3. **Menangani** data form menggunakan PHP `$_POST`
4. **Membuat** layout responsive dengan CSS
5. **Menerapkan** validasi dan keamanan input
6. **Mengkalkulasi** data numerik dalam form
7. **Memformat** output data dengan rapi

---

## 📋 Detail Soal

### 🆔 Soal 1: Form Biodata (`soal.php`)

**Deskripsi:** Program form biodata personal dengan tampilan input dan output yang ditampilkan secara bersamaan.

#### 🔧 **Fitur Form Input:**

-   **First Name** - Input text untuk nama lengkap
-   **Gender** - Radio button dengan pilihan:
    -   Laki-Laki
    -   Perempuan
-   **Hobby** - Multiple checkbox:
    -   Korespondensi
    -   Travelling
    -   Shopping
-   **Pendidikan** - Dropdown select:
    -   SD, SMP, SMA, D3, S1, S2, S3
-   **Alamat** - Input text untuk alamat lengkap

#### 📊 **Output Biodata:**

```
Biodata Anda

Nama        : [Nama yang diinput]
Gender      : [Pilihan gender]
Hobby       : [Hobby yang dipilih, dipisah koma]
Pendidikan  : [Tingkat pendidikan]
Alamat      : [Alamat lengkap]
```

#### 💡 **Konsep yang Dipelajari:**

-   Form handling dengan method POST
-   Input validation dan sanitization
-   Persistent form values
-   CSS Grid/Flexbox layout
-   Conditional PHP output

---

### 🎫 Soal 2: Sistem Tiket Bola (`soal2.php`)

**Deskripsi:** Sistem pemesanan tiket pertandingan bola SEA Games 2018 dengan kalkulasi harga otomatis.

#### 🏟️ **Info Pertandingan:**

-   **Event:** SEA Games 2018
-   **Pertandingan:** Indonesia VS Malaysia
-   **Waktu:** Pukul 15.00 WIB

#### 🔧 **Fitur Form Pemesanan:**

-   **NAMA PEMESAN** - Input text untuk nama pemesan
-   **TELP** - Input text untuk nomor telepon
-   **JENIS TIKET** - Dropdown dengan pilihan dan harga:
    -   **VIP** - Rp 500.000
    -   **Premium** - Rp 300.000
    -   **Regular** - Rp 150.000
    -   **Ekonomi** - Rp 75.000
-   **JUMLAH TIKET** - Input number (1-10 lembar)

#### 📊 **Output Data Pemesanan:**

```
DATA PEMESANAN TIKET BOLA SEA GAMES 2018
INDONESIA VS MALAYSIA
PUKUL 15.00 WIB

Nama            : [Nama pemesan]
Telp            : [Nomor telepon]
Jenis Tiket     : [Jenis yang dipilih]
Harga Tiket     : [Harga per lembar]

Banyaknya Tiket : [Jumlah tiket]
_________________________________
Total Bayar     : [Harga × Jumlah]
```

#### 💰 **Sistem Kalkulasi:**

-   **Harga per tiket** berdasarkan jenis yang dipilih
-   **Total bayar** = Harga tiket × Jumlah tiket
-   **Format angka** dengan pemisah ribuan (123.456)
-   **Validasi** jumlah tiket minimum 1, maksimum 10

#### 💡 **Konsep yang Dipelajari:**

-   Switch-case untuk penentuan harga
-   Kalkulasi matematika dalam PHP
-   Number formatting dengan `number_format()`
-   Form validation dengan HTML5 attributes
-   Dynamic pricing system

---

## 🔍 Konsep Teknis yang Dipelajari

### 1. **HTML Form Elements**

#### Input Types:

```html
<!-- Text Input -->
<input type="text" name="nama" required />

<!-- Radio Button -->
<input type="radio" name="gender" value="Laki-Laki" />

<!-- Checkbox -->
<input type="checkbox" name="hobby[]" value="Travelling" />

<!-- Select Dropdown -->
<select name="pendidikan">
    <option value="S1">S1</option>
</select>

<!-- Number Input -->
<input type="number" name="jumlah" min="1" max="10" />
```

#### Form Attributes:

-   `method="POST"` - Kirim data secara aman
-   `action=""` - Submit ke file yang sama
-   `required` - Validasi wajib diisi
-   `name` - Identifier untuk PHP

### 2. **PHP Form Handling**

#### Mengambil Data POST:

```php
// Cek apakah form sudah disubmit
if (isset($_POST['submit'])) {
    $nama = $_POST['nama'];
    $gender = $_POST['gender'];
    $hobby = $_POST['hobby']; // Array untuk checkbox
}
```

---

**Happy Coding! 🚀**

---

_Follow IG: [@ini.tobz](https://www.instagram.com/@ini.tobz)_
