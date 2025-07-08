# Latihan PWL Pertemuan 2

## Cara Menjalankan Program

1. Pastikan Sudah Menginstall XAMPP di PC / Komputer
2. Buka XAMPP Control Panel
3. Start Apache
4. Pindahkan folder `Pertemuan 2` ke dalam folder `htdocs` pada direktori instalasi XAMPP, biasanya terletak di `C:\xampp\htdocs`.
5. Buka browser dan akses folder tersebut dengan mengetikkan URL berikut:

```
http://localhost/Pertemuan%202/
```

6. Klik pada file yang ingin dijalankan, misalnya `soal.php`.

```
http://localhost/Pertemuan%202/soal.php
```

## Deskripsi

Program PHP ini mendemonstrasikan penggunaan operator perbandingan dan operator logika dalam PHP.

## Kode Program

```php
<?php
$a = 2;
$b = 1;
echo "$a == $b : ". ($a == $b);
echo "<br>$a != $b : ". ($a != $b);
echo "<br>$a > $b : ". ($a > $b);
echo "<br>$a < $b : ". ($a < $b);
echo "<br>($a == $b) && ($a > $b) : ".(($a != $b) && ($a > $b));
echo "<br>($a == $b) || ($a > $b) : ".(($a != $b) || ($a > $b));
?>
```

## Penjelasan Operator

### Operator Perbandingan

-   `==` : Equal (sama dengan)
-   `!=` : Not equal (tidak sama dengan)
-   `>` : Greater than (lebih besar dari)
-   `<` : Less than (lebih kecil dari)

### Operator Logika

-   `&&` : AND (dan)
-   `||` : OR (atau)

## Variabel

-   `$a = 2`
-   `$b = 1`

## Hasil Output

Berdasarkan nilai `$a = 2` dan `$b = 1`, hasil yang akan ditampilkan adalah:

```
2 == 1 :
2 != 1 : 1
2 > 1 : 1
2 < 1 :
(2 == 1) && (2 > 1) : 1
(2 == 1) || (2 > 1) : 1
```

## Penjelasan Hasil

1. **2 == 1** : `false` (kosong) - karena 2 tidak sama dengan 1
2. **2 != 1** : `true` (1) - karena 2 tidak sama dengan 1
3. **2 > 1** : `true` (1) - karena 2 lebih besar dari 1
4. **2 < 1** : `false` (kosong) - karena 2 tidak lebih kecil dari 1
5. **(2 != 1) && (2 > 1)** : `true` (1) - karena kedua kondisi bernilai true
6. **(2 != 1) || (2 > 1)** : `true` (1) - karena salah satu atau kedua kondisi bernilai true

## Catatan

-   Nilai `true` ditampilkan sebagai `1`
-   Nilai `false` ditampilkan sebagai string kosong
-   Output menggunakan tag `<br>` untuk line break dalam HTML

## NPM Reference

Format: 202243502612 (contoh 2 digit terakhir: 12)

**Happy Coding! 🚀**

---

_Follow IG: [@ini.tobz](https://www.instagram.com/@ini.tobz)_
