# Latihan Petemuan 4

[KLIK DISINI UNTUK MELIHAT SOAL](https://docs.google.com/presentation/d/1XvSzn8lGMbpxOicjFn_FzTm7OlUmswBD/edit#slide=id.p15)

1. Buatlah Tabel Mahasiswa

```sql
CREATE TABLE Mahasiswa (
NPM VARCHAR(12),
Nama VARCHAR(30),
Alamat VARCHAR(15),
JnsKel CHAR(1),
TglLahir DATE);
```

-   Masukkan data ke dalam tabel Mahasiswa

```sql
INSERT INTO Mahasiswa VALUES
('201143500121', 'Desi Maryati', 'Bekasi', 'P', '1991-09-24'),
('201143500165', 'Firdaus', 'Jakarta', 'L', '1991-05-18'),
('201143500228', 'Gandi', 'Depok', 'L', '1991-07-10'),
('201143500234', 'Endah Haryati', 'Depok', 'P', '1991-05-15'),
('201143500326', 'Hilda', 'Bogor', 'P', '1991-02-08'),
('201143500429', 'Andi', 'Jakarta', 'L', '1991-06-12'),
('201143500693', 'Riswandi', 'Bekasi', 'L', '1990-10-08'),
('201143500694', 'Indar Hari', 'Bogor', 'L', '1990-12-30');
```

2. Buatlah Tabel MataKuliah

```sql
CREATE TABLE MataKuliah (
KD_MK VARCHAR(10),
Nama_MataKuliah VARCHAR(30),
SKS INT);
```

-   Masukkan data ke dalam tabel MataKuliah

```sql
INSERT INTO MataKuliah VALUES
('KD123', 'Interaksi Manusia dan Komputer', 3),
('KK020', 'Praktikum Sistem Basis Data', 2),
('KK021', 'Sistem Basis Data', 1),
('KK034', 'Manajemen Proyek', 3),
('KK077', 'Metode Numerik', 3),
('KU122', 'Ilmu Budaya Dasar', 2);
```

3. Tampilkan Informasi mahasiswa yang berjenis kelamin perempuan!

```sql
SELECT * FROM Mahasiswa WHERE JnsKel = 'P';
```

4. Tampilkan data matakuliah yang nama matakuliahnya mengandung huruf “k”!

```sql
SELECT * FROM MataKuliah WHERE Nama_MataKuliah LIKE '%k%';
```

5. Tampilkan NPM dan Nama Mahasiswa yang namanya berawalan huruf “A”!

```sql
SELECT NPM, Nama FROM Mahasiswa WHERE Nama LIKE 'A%';
```

6. Tampilkan Nama, JnsKel dan TglLahir pada data mahasiswa yang nama mahasiswanya terurut ascending (Menaik)!

```sql
SELECT Nama, JnsKel, TglLahir FROM Mahasiswa ORDER BY Nama ASC;
```

7. Rubahlah data mahasiswa yang bernama Gandi menjadi “Muhammad Gandi”!

```sql
UPDATE Mahasiswa SET Nama = 'Muhammad Gandi' WHERE Nama = 'Gandi';
```

8. Hapuslah data mahasiswa yang bernama “Hilda”;

```sql
DELETE FROM Mahasiswa WHERE Nama = 'Hilda';
```
