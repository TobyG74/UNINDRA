# Latihan PWL Pertemuan 6

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

#### Validasi dan Sanitasi:

```php
// Sanitasi XSS
$nama = htmlspecialchars($_POST['nama']);

// Validasi dengan isset
$gender = isset($_POST['gender']) ? $_POST['gender'] : '';

// Handle array (checkbox)
$hobby = isset($_POST['hobby']) ? $_POST['hobby'] : array();
```

#### Persistent Values:

```php
<!-- Mempertahankan nilai setelah submit -->
<input type="text" name="nama"
       value="<?php echo isset($_POST['nama']) ? htmlspecialchars($_POST['nama']) : ''; ?>">

<!-- Radio button selected -->
<input type="radio" name="gender" value="Laki-Laki"
       <?php echo (isset($_POST['gender']) && $_POST['gender'] == 'Laki-Laki') ? 'checked' : ''; ?>>
```

### 3. **Switch-Case untuk Harga**

```php
switch ($jenis_tiket) {
    case 'VIP':
        $harga_tiket = 500000;
        break;
    case 'Premium':
        $harga_tiket = 300000;
        break;
    case 'Regular':
        $harga_tiket = 150000;
        break;
    case 'Ekonomi':
        $harga_tiket = 75000;
        break;
    default:
        $harga_tiket = 0;
}
```

### 4. **Number Formatting**

```php
// Format angka dengan pemisah ribuan
$total = 4000000;
echo number_format($total, 0, ',', '.'); // Output: 4.000.000

// Parameter: (number, decimals, decimal_separator, thousands_separator)
```

### 5. **CSS Layout Responsive**

```css
.container {
    display: flex;
    gap: 20px;
    max-width: 1000px;
}

.form-container,
.result-container {
    width: 50%;
    border: 2px solid #333;
    padding: 20px;
}

@media (max-width: 768px) {
    .container {
        flex-direction: column;
    }

    .form-container,
    .result-container {
        width: 100%;
    }
}
```

---

## 🔒 Keamanan dan Best Practices

### ✅ **Security Measures:**

#### 1. **XSS Prevention:**

```php
// Selalu gunakan htmlspecialchars untuk output
echo htmlspecialchars($_POST['nama']);

// Atau gunakan filter_var
echo filter_var($_POST['nama'], FILTER_SANITIZE_STRING);
```

#### 2. **Input Validation:**

```php
// Validasi required
if (empty($_POST['nama'])) {
    $error = "Nama harus diisi";
}

// Validasi numeric
if (!is_numeric($_POST['jumlah_tiket'])) {
    $error = "Jumlah tiket harus berupa angka";
}

// Validasi range
if ($_POST['jumlah_tiket'] < 1 || $_POST['jumlah_tiket'] > 10) {
    $error = "Jumlah tiket antara 1-10";
}
```

#### 3. **CSRF Protection (Advanced):**

```php
// Generate CSRF token
session_start();
if (empty($_SESSION['csrf_token'])) {
    $_SESSION['csrf_token'] = bin2hex(random_bytes(32));
}

// Validate CSRF token
if ($_POST['csrf_token'] !== $_SESSION['csrf_token']) {
    die('CSRF token mismatch');
}
```

### 📝 **Code Quality:**

#### 1. **Consistent Naming:**

```php
// Gunakan snake_case untuk variabel
$nama_pemesan = $_POST['nama'];
$jenis_tiket = $_POST['jenis_tiket'];
$total_bayar = $harga * $jumlah;
```

#### 2. **Error Handling:**

```php
try {
    $total_bayar = $harga_tiket * $jumlah_tiket;
} catch (Exception $e) {
    echo "Error: " . $e->getMessage();
}
```

#### 3. **Code Documentation:**

```php
/**
 * Kalkulasi total harga tiket
 * @param string $jenis_tiket Jenis tiket yang dipilih
 * @param int $jumlah_tiket Jumlah tiket yang dipesan
 * @return int Total harga yang harus dibayar
 */
function hitungTotalHarga($jenis_tiket, $jumlah_tiket) {
    // Implementation here
}
```

---

## 🧪 Testing dan Debugging

### 🔍 **Test Cases:**

#### Form Biodata:

-   [ ] Submit dengan semua field kosong
-   [ ] Submit dengan sebagian field kosong
-   [ ] Submit dengan data valid
-   [ ] Test multiple checkbox selection
-   [ ] Test radio button selection
-   [ ] Test dropdown selection

#### Sistem Tiket:

-   [ ] Test dengan jumlah tiket = 1
-   [ ] Test dengan jumlah tiket maksimal (10)
-   [ ] Test setiap jenis tiket (VIP, Premium, Regular, Ekonomi)
-   [ ] Test kalkulasi total bayar
-   [ ] Test input invalid (huruf di jumlah tiket)
-   [ ] Test nama dengan karakter khusus

### 🐛 **Common Issues & Solutions:**

#### 1. **Form tidak submit:**

```html
<!-- Pastikan ada name attribute -->
<input type="text" name="nama" />
<!-- ✅ Correct -->
<input type="text" />
<!-- ❌ Wrong -->

<!-- Pastikan button ada di dalam form -->
<form method="POST">
    <!-- form fields -->
    <button type="submit" name="submit">Submit</button>
</form>
```

#### 2. **Data tidak tampil:**

```php
// Debug dengan var_dump
var_dump($_POST);

// Atau print_r
echo "<pre>";
print_r($_POST);
echo "</pre>";
```

#### 3. **Checkbox tidak terdeteksi:**

```php
// Checkbox mengirim array, handle dengan benar
if (isset($_POST['hobby']) && is_array($_POST['hobby'])) {
    $hobby_list = implode(', ', $_POST['hobby']);
}
```

---

**Happy Coding! 🚀**

---

_Follow IG: [@ini.tobz](https://www.instagram.com/@ini.tobz)_
