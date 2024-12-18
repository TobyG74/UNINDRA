# Jawaban Soal UTS Reguler Praktikum Sistem Basis Data

[KLIK DISINI UNTUK MELIHAT SOAL UTS REGULER](https://drive.google.com/drive/u/1/folders/1wNA3lFnQDaot71vHpTqY_4E7qwoQbKJQR)

1. Buatlah database dengan nama anda diikuti dengan 3 digit NPM terakhir! [Bobot: 5]

```sql
CREATE DATABASE Tobi_Saputra_612;
```

2. Buatlah tabel berikut ini: [Bobot: 20]

-   Gunakan Database yang telah dibuat sebelumnya

```sql
USE Tobi_Saputra_612;
```

-   Tabel Barang

```sql
CREATE TABLE Barang (
Kd_barang VARCHAR(10) PRIMARY KEY,
Nama_barang VARCHAR(25),
Harga INT);
```

-   Tabel Transaksi

```sql
CREATE TABLE Transaksi (
Id_transaksi VARCHAR(10),
Tgl_transaksi DATE,
Kd_barang VARCHAR(10),
Quantity INT,
Jumlah INT,
FOREIGN KEY (Kd_barang) REFERENCES Barang(Kd_barang));
```

-   Memasukkan data ke dalam tabel Transaksi

```sql
INSERT INTO Transaksi VALUES
('TR01', '2024-04-10', 'BA01', 5, 240000),
('TR02', '2024-04-11', 'BA03', 2, 98000),
('TR03', '2024-04-12', 'BA01', 3, 144000),
('TR03', '2024-04-12', 'BA02', 6, 108000),
('TR04', '2024-04-13', 'BA03', 4, 196000),
('TR05', '2024-04-13', 'BA04', 10, 270000);
```

-   Memasukkan data ke dalam tabel Barang

```sql
INSERT INTO Barang VALUES
('BA01', 'Attack', 48000),
('BA02', 'Lifeboy', 18000),
('BA03', 'Zinc', 49000),
('BA04', 'Biore', 27000);
```

3. Tampilkan nama_barang dan harga barang yang memiliki harga lebih dari 20000! [Bobot: 10]

```sql
SELECT Nama_barang, Harga FROM Barang WHERE Harga > 20000;
```

4. Tampilkan tgl_transaksi, kd_barang dan jumlah dari tabel transaksi yang terdapat transaksi di tanggal 2023-04-13! [Bobot: 10]

```sql
SELECT Tgl_transaksi, Kd_barang, Jumlah FROM Transaksi WHERE Tgl_transaksi = '2024-04-13';
```

5. Ubahlah field harga menjadi harga_satuan pada tabel barang! [Bobot: 5]

```sql
ALTER TABLE Barang CHANGE COLUMN Harga Harga_satuan INT;
```

6. Tampilkan nama_barang dan harga dari tabel barang ditampilkan berurut berdasarakan harga barang secara ascending! [Bobot: 10]

```sql
SELECT Nama_barang, Harga_satuan FROM Barang ORDER BY Harga_satuan ASC;
```

7. Tampilkan data barang yang kode barangnya terdapat pada tabel transaksi dengan menggunakan klausa IN atau EXISTS! [Bobot: 10]

-   Menggunakan klausa IN

```sql
SELECT * FROM Barang WHERE Kd_barang IN (SELECT Kd_barang FROM Transaksi);
```

-   Menggunakan klausa EXISTS

```sql
SELECT * FROM Barang WHERE EXISTS (SELECT * FROM Transaksi WHERE Barang.Kd_barang = Transaksi.Kd_barang);
```

8. Tampilkan kd_barang yang quantity transaksinya paling banyak antara tgl_transaksi 2024-04-10 sampai dengan tanggal 2024-04-12! [Bobot: 10]

```sql
SELECT Kd_barang FROM Transaksi WHERE Tgl_transaksi BETWEEN '2024-04-10' AND '2024-04-12' GROUP BY Kd_barang ORDER BY SUM(Quantity) DESC LIMIT 1;
```

9. Tampilkan total jumlah transaksi berdasarkan tgl_transaksi dengan menggunakan grouping! [Bobot: 10]

```sql
SELECT Tgl_transaksi, SUM(Jumlah) AS Total_Jumlah FROM Transaksi GROUP BY Tgl_transaksi;
```

10. Tampilkan Hari, Tanggal dan Waktu saat ini berikut dengan jam, menit dan detik! [Bobot: 10]

```sql
SELECT DAYNAME(NOW()) AS Hari, CURDATE() AS Tanggal, CURRENT_TIME() AS Waktu;
```
