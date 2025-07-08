# Latihan Pemrograman Web Lanjut - Pertemuan 9

[Klik Disini](https://docs.google.com/presentation/d/1NCwtu2IlDAHOdxA7_POupMaf46Orq3i5/edit?usp=drive_link&ouid=106423248853148034800&rtpof=true&sd=true) Untuk Melihat Materi & Latihan Pertemuan 9

## Cara Menjalankan Program

1.  Pastikan sudah menginstal **XAMPP** di PC / Komputer Anda.
2.  Buka **XAMPP Control Panel**.
3.  **Start Apache**.
4.  Pindahkan folder proyek ini (misalnya, `Pertemuan 9` atau folder tempat Anda menyimpan file-file PHP ini) ke dalam folder `htdocs` pada direktori instalasi XAMPP, biasanya terletak di `C:\xampp\htdocs`.
5.  Buka browser dan akses folder tersebut dengan mengetikkan URL berikut:

    ```
    http://localhost/Pertemuan%209/
    ```

6.  Klik pada file `index.php` untuk membuka halaman utama sistem informasi perusahaan.
7.  Gunakan navigasi untuk mengakses halaman **Profil Perusahaan**, **Kontak Perusahaan**, **Visi dan Misi Perusahaan**, dan **Buku Tamu**

---

## 📁 Struktur File

```
Pertemuan 9/
├── README.md                 # Dokumentasi proyek ini
├── index.php                 # Halaman utama dengan navigasi
├── profile.php               # Konten Profil Perusahaan
├── contact.php               # Konten Kontak Perusahaan
├── visi_misi.php             # Konten Visi dan Misi Perusahaan
└── buku_tamu.php             # Halaman Buku Tamu dan formulirnya
```

---

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan proyek ini, diharapkan dapat:

1.  **Memahami** konsep modularitas kode PHP menggunakan `include()` atau `require()`.
2.  **Mengimplementasikan** navigasi dasar antar halaman dalam aplikasi web.
3.  **Menyajikan** informasi statis (Profil, Kontak, Visi & Misi) secara terstruktur.
4.  **Membuat** fungsionalitas buku tamu sederhana dengan penyimpanan data sementara menggunakan **PHP Session**.
5.  **Menerapkan** dasar-dasar **HTML** dan **PHP** untuk membuat antarmuka pengguna tanpa styling eksternal.

---

## 📋 Detail Konten

### 🏢 Sistem Informasi Perusahaan

Sistem ini menyediakan informasi dasar mengenai sebuah perusahaan, terbagi menjadi beberapa bagian:

-   **Profil Perusahaan**: Menjelaskan tentang nama, tanggal didirikan, deskripsi singkat, dan alamat kantor pusat perusahaan.
-   **Kontak Perusahaan**: Berisi detail kontak seperti nomor telepon, email, fax, situs web, dan jam kerja.
-   **Visi dan Misi Perusahaan**: Menjabarkan visi jangka panjang dan misi-misi yang diemban oleh perusahaan.
-   **Buku Tamu**: Memungkinkan pengunjung untuk meninggalkan pesan atau komentar. Data pesan disimpan sementara di PHP Session.

### 👋 Perkenalan Diri (`personal_intro.php`)

Selain sistem informasi perusahaan, proyek ini juga menyertakan halaman terpisah untuk perkenalan diri:

-   **Nama**: Tobi Saputra
-   **NPM**: 202243502612
-   **Universitas**: Indraprasta PGRI
-   **Kelas**: R7

---

## 🔍 Konsep Teknis yang Dipelajari

### 1. **Fungsi `include()` dan `require()`**

Digunakan untuk menyertakan file PHP lain ke dalam file utama (`index.php`), memungkinkan pemisahan logika dan konten menjadi bagian-bagian yang lebih kecil dan mudah dikelola.

```php
// Contoh penggunaan di index.php
case 'profile':
    include 'profile.php';
    break;
case 'contact':
    include 'contact.php';
    break;
case 'visi_misi':
    include 'visi_misi.php';
    break;
case 'bukutamu':
    include 'buku_tamu.php';
    break;
default:
    include 'index.php';
    break;
```

### 2. Superglobal `$_GET`

Digunakan untuk mengambil nilai dari parameter URL, yang memungkinkan navigasi antar halaman (misalnya, ?page=profile).

```php
// Mengambil nilai parameter 'page' dari URL
$page = isset($_GET['page']) ? $_GET['page'] : 'home';
```

### 3. **PHP Session** (`$_SESSION`)

Diterapkan pada fitur Buku Tamu untuk menyimpan data entri pengunjung sementara (data akan hilang setelah browser ditutup atau sesi berakhir).

```php
// Memulai session
session_start();

// Menyimpan data ke session
$_SESSION['guestbook_entries'][] = [
    'nama' => $nama,
    'email' => $email,
    'pesan' => $pesan,
    'tanggal' => date('Y-m-d H:i:s')
];
```

### 4. HTML Form Handling

Dasar-dasar pembuatan form HTML dan bagaimana PHP (melalui superglobal $\_POST) memproses data yang dikirimkan dari form.

```html
<form method="POST" action="?page=guestbook">
    <input type="text" name="nama_tamu" required />
    <textarea name="pesan_tamu"></textarea>
    <button type="submit" name="submit_guestbook">Kirim</button>
</form>
```

---

Selamat Mencoba! 🚀

---

_Follow IG: [@ini.tobz](https://www.instagram.com/@ini.tobz)_
