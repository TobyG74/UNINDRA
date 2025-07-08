# 📊 Latihan PWL Pertemuan 5

## Cara Menjalankan Program

1. Pastikan Sudah Menginstall XAMPP di PC / Komputer
2. Buka XAMPP Control Panel
3. Start Apache
4. Pindahkan folder `Pertemuan 5` ke dalam folder `htdocs` pada direktori instalasi XAMPP, biasanya terletak di `C:\xampp\htdocs`.
5. Buka browser dan akses folder tersebut dengan mengetikkan URL berikut:

```
http://localhost/Pertemuan%205/
```

6. Klik pada file `soal.php` untuk menjalankan program.

```
http://localhost/Pertemuan%205/soal.php
```

## 📁 Struktur File

```
Pertemuan 5/
├── README.md           # Dokumentasi ini
└── soal.php           # Generator Tabel Dinamis
```

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan latihan ini, mahasiswa diharapkan dapat:

1. **Memahami** penggunaan perulangan `for` dalam PHP
2. **Mengimplementasikan** nested loop untuk struktur tabel
3. **Menangani** input form dengan method POST
4. **Membuat** tabel HTML secara dinamis
5. **Menerapkan** conditional rendering dengan PHP
6. **Mengintegrasikan** HTML, CSS, dan PHP dalam satu file

---

## 📝 Detail Program

### 🔧 **Fitur Generator Tabel (`soal.php`)**

**Deskripsi:** Program untuk membuat tabel HTML secara dinamis berdasarkan input jumlah baris dan kolom dari user.

#### 🎛️ **Input Form:**

-   **Jumlah Baris** - Input number untuk menentukan jumlah baris tabel
-   **Jumlah Kolom** - Input number untuk menentukan jumlah kolom tabel
-   **Button "Buat Tabel"** - Submit form untuk generate tabel

#### 📊 **Output Tabel:**

-   Tabel HTML dengan border
-   Setiap cell berisi teks "OKE"
-   Ukuran tabel sesuai dengan input user
-   Layout responsif dalam container

#### 🔄 **Alur Program:**

1. User mengisi jumlah baris dan kolom
2. Submit form dengan method POST
3. PHP memproses input menggunakan nested loop
4. Generate tabel HTML sesuai dimensi yang diminta
5. Tampilkan hasil di sebelah form input

---

## 💻 Konsep Teknis yang Dipelajari

### 1. **Nested Loop (Perulangan Bersarang)**

```php
// Struktur nested loop untuk tabel
for ($i = 1; $i <= $kolom; $i++) {        // Loop untuk baris
    echo "<tr>";
    for ($j = 1; $j <= $baris; $j++) {    // Loop untuk kolom
        echo "<td>OKE</td>";
    }
    echo "</tr>";
}
```

**Penjelasan:**

-   **Outer loop** (`$i`) mengontrol jumlah baris (`<tr>`)
-   **Inner loop** (`$j`) mengontrol jumlah kolom (`<td>`)
-   Setiap iterasi outer loop membuat satu baris tabel
-   Setiap iterasi inner loop membuat satu cell dalam baris

### 2. **Form Handling dengan POST**

```php
// Cek apakah form sudah disubmit
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $baris = $_POST['baris'];
    $kolom = $_POST['kolom'];
    // Process data...
}
```

**Keunggulan POST:**

-   Data tidak terlihat di URL
-   Dapat mengirim data dalam jumlah besar
-   Lebih aman untuk form input

### 3. **Conditional Rendering**

```php
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Render tabel hanya jika form sudah disubmit
    echo "<td>";
    // Generate table...
    echo "</td>";
}
?>
```

### 4. **HTML Table Generation**

```php
// Struktur tabel HTML yang dihasilkan
echo "<table border='1' cellpadding='5' cellspacing='0'>";
    echo "<tr>";
        echo "<td>OKE</td>";
    echo "</tr>";
echo "</table>";
```

**Attributes yang digunakan:**

-   `border='1'` - Memberikan border pada tabel
-   `cellpadding='5'` - Jarak antara content dan border cell
-   `cellspacing='0'` - Jarak antar cell

---

## 🎮 Cara Penggunaan

### 📝 **Langkah-langkah:**

1. **Buka program** di browser
2. **Isi form input:**
    - Masukkan jumlah baris (contoh: 3)
    - Masukkan jumlah kolom (contoh: 4)
3. **Klik "Buat Tabel"**
4. **Lihat hasil** tabel yang terbentuk di sebelah kanan

### 💡 **Contoh Input/Output:**

#### Input:

-   **Jumlah Baris:** 3
-   **Jumlah Kolom:** 4

#### Output:

```
| OKE | OKE | OKE |
| OKE | OKE | OKE |
| OKE | OKE | OKE |
| OKE | OKE | OKE |
```

_(Tabel 4 baris × 3 kolom)_

### 🔢 **Test Cases:**

| Baris | Kolom | Hasil       | Keterangan       |
| ----- | ----- | ----------- | ---------------- |
| 1     | 1     | 1×1 tabel   | Tabel minimal    |
| 3     | 3     | 3×3 tabel   | Tabel persegi    |
| 5     | 2     | 2×5 tabel   | Tabel horizontal |
| 2     | 6     | 6×2 tabel   | Tabel vertikal   |
| 10    | 10    | 10×10 tabel | Tabel besar      |

---

## 🔍 Analisis Kode

### 📊 **Struktur Layout:**

```html
<table border="1">
    <tr>
        <td>
            <!-- Form Input -->
            <form method="post">...</form>
        </td>
        <td>
            <!-- Tabel Hasil (Conditional) -->
            <?php if ($_POST) { /* Generate table */ } ?>
        </td>
    </tr>
</table>
```

### 🧮 **Kompleksitas Algorithm:**

-   **Time Complexity:** O(n×m)
    -   n = jumlah baris, m = jumlah kolom
-   **Space Complexity:** O(1)
    -   Hanya menggunakan variabel sederhana
-   **Scalability:** Linear dengan ukuran input

---

**Happy Coding! 🚀**

---

_Follow IG: [@ini.tobz](https://www.instagram.com/@ini.tobz)_
