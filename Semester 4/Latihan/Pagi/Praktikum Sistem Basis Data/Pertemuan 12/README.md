# Latihan 1 Pertemuan 12

-   Latihan 1 Cek Di Pertemuan 11

# Latihan 2 Pertemuan 12

[KLIK DISINI UNTUK MELIHAT SOAL](https://docs.google.com/presentation/d/1K35RGmI60-m8qfCUme7vTEk2cht3k-B8/edit#slide=id.p10)

1. Buat Database dengan Nama Anda!

```sql
CREATE DATABASE Tobi_P12;
```

- Gunakan Database

```sql
USE Tobi_P12;
```

2. Silahkan buat beberapa tabel database sesuai kreasi anda, kemudian tampilkan beberapa record, sesuai field yang anda buat sendiri, selamat berkreasi !!!

-   Memesan Tiket Pesawat

```sql
CREATE TABLE Pesawat (
KodePesawat VARCHAR(10) PRIMARY KEY,
NamaPesawat VARCHAR(30),
Kelas VARCHAR(10),
Harga INT);

CREATE TABLE Penumpang (
KodePesawat VARCHAR(10),
NamaPenumpang VARCHAR(30),
Alamat VARCHAR(30),
JenisKelamin CHAR(1),
TglLahir DATE,
NoTelp VARCHAR(15),
FOREIGN KEY (KodePesawat) REFERENCES Pesawat(KodePesawat));

CREATE TABLE Penerbangan (
KodePesawat VARCHAR(10),
KotaAsal VARCHAR(30),
KotaTujuan VARCHAR(30),
TglBerangkat DATE,
JamBerangkat TIME,
TglTiba DATE,
JamTiba TIME,
FOREIGN KEY (KodePesawat) REFERENCES Pesawat(KodePesawat));
```

-   Menambahkan Data

```sql
INSERT INTO Pesawat VALUES
('PSW001', 'Garuda Indonesia', 'Ekonomi', 500000),
('PSW002', 'Lion Air', 'Ekonomi', 300000),
('PSW003', 'Sriwijaya Air', 'Bisnis', 600000),
('PSW004', 'Batik Air', 'Bisnis', 700000),
('PSW005', 'Citilink', 'Ekonomi', 200000),
('PSW006', 'Air Asia', 'Ekonomi', 250000),
('PSW007', 'Wings Air', 'Ekonomi', 150000),
('PSW008', 'Nam Air', 'Bisnis', 800000);

INSERT INTO Penumpang VALUES
('PSW001', 'Tobi Saputra', 'Bekasi', 'L', '1998-06-12', '081234567890'),
('PSW002', 'Desi Maryati', 'Bekasi', 'P', '1991-09-24', '081234567891'),
('PSW003', 'Firdaus', 'Jakarta', 'L', '1991-05-18', '081234567892'),
('PSW004', 'Gandi', 'Depok', 'L', '1991-07-10', '081234567893'),
('PSW005', 'Endah Haryati', 'Depok', 'P', '1991-05-15', '081234567894'),
('PSW006', 'Hilda', 'Bogor', 'P', '1991-02-08', '081234567895'),
('PSW007', 'Andi', 'Jakarta', 'L', '1991-06-12', '081234567896'),
('PSW008', 'Riswandi', 'Bekasi', 'L', '1990-10-08', '081234567897');

INSERT INTO Penerbangan VALUES
('PSW001', 'Jakarta', 'Bali', '2024-04-10', '08:00:00', '2024-04-10', '10:00:00'),
('PSW002', 'Jakarta', 'Surabaya', '2024-04-11', '09:00:00', '2024-04-11', '11:00:00'),
('PSW003', 'Jakarta', 'Yogyakarta', '2024-04-12', '10:00:00', '2024-04-12', '12:00:00'),
('PSW004', 'Jakarta', 'Bandung', '2024-04-13', '11:00:00', '2024-04-13', '13:00:00'),
('PSW005', 'Jakarta', 'Semarang', '2024-04-14', '12:00:00', '2024-04-14', '14:00:00'),
('PSW006', 'Jakarta', 'Malang', '2024-04-15', '13:00:00', '2024-04-15', '15:00:00'),
('PSW007', 'Jakarta', 'Medan', '2024-04-16', '14:00:00', '2024-04-16', '16:00:00'),
('PSW008', 'Jakarta', 'Pekanbaru', '2024-04-17', '15:00:00', '2024-04-17', '17:00:00');
```

3. Menampilkan nama penumpang dan tanggal penerbangan yang penerbangan nya menuju Bandung!

```sql
SELECT Penumpang.NamaPenumpang, Penerbangan.TglBerangkat FROM Penumpang, Penerbangan WHERE Penumpang.KodePesawat = Penerbangan.KodePesawat AND Penerbangan.KotaTujuan = 'Bandung';
```

4. Menampilkan nama penumpang dan harga tiket yang penerbangan nya menggunakan pesawat kelas Bisnis!

```sql
SELECT Penumpang.NamaPenumpang, Pesawat.Harga FROM Penumpang, Pesawat WHERE Penumpang.KodePesawat = Pesawat.KodePesawat AND Pesawat.Kelas = 'Bisnis';
```

5. Menampilkan nama penumpang, nama pesawat, harga tiket, jam tiba penerbangan nya yang menggunakan pesawat kelas Ekonomi!

```sql
SELECT Penumpang.NamaPenumpang, Pesawat.NamaPesawat, Pesawat.Harga, Penerbangan.JamTiba FROM Penumpang, Pesawat, Penerbangan WHERE Penumpang.KodePesawat = Pesawat.KodePesawat AND Pesawat.KodePesawat = Penerbangan.KodePesawat AND Pesawat.Kelas = 'Ekonomi';
```
