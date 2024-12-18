# Latihan Pertemuan 11

[KLIK DISINI UNTUK MELIHAT SOAL](https://docs.google.com/presentation/d/1kdjtjX2-EJ1tpaRjUaP6BrJjKG2ypK5F/edit#slide=id.p9)

1. Buat tabel Mahasiswa, Nilai dan Matakuliah

-   Mahasiswa

```sql
CREATE TABLE Mahasiswa (
NPM VARCHAR(12),
Nama VARCHAR(30),
Alamat VARCHAR(15),
JnsKel CHAR(1),
TglLahir DATE);
```

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

-   Nilai

```sql
CREATE TABLE Nilai (
NPM VARCHAR(12),
KodeMK VARCHAR(10),
Mid INT,
Final INT);
```

```sql
INSERT INTO Nilai VALUES
('201143500121', 'KK021', 80, 90),
('201143500165', 'KD132', 90, 95),
('201143500228', 'KK021', 70, 80),
('201143500234', 'KU122', 90, 80),
('201143500326', 'KU122', 75, 80),
('201143500429', 'KD132', 90, 0),
('201143500693', 'KD132', 45, 40),
('201143500694', 'KK021', 55, 60);
```

-   Matakuliah

```sql
CREATE TABLE Matakuliah (
KodeMK VARCHAR(10),
NamaMK VARCHAR(30),
SKS INT);
```

```sql
INSERT INTO Matakuliah VALUES
('KK021', 'Sistem Informasi', 3),
('KD132', 'Algoritma', 2),
('KU122', 'Komunikasi Data', 2);
```

2. Tampilkan nama mahasiswa dan nama matakuliah yang nilai midnya antara 70 sampai 80!

```sql
SELECT Mahasiswa.Nama, Matakuliah.NamaMK FROM Mahasiswa, Nilai, Matakuliah WHERE Mahasiswa.NPM = Nilai.NPM AND Nilai.KodeMK = Matakuliah.KodeMK AND Nilai.Mid BETWEEN 70 AND 80;
```

3. Tampilkan nama mahasiswa yang mengambil mata kuliah komunikasi data!

```sql
SELECT Mahasiswa.Nama FROM Mahasiswa, Nilai, Matakuliah WHERE Mahasiswa.NPM = Nilai.NPM AND Nilai.KodeMK = Matakuliah.KodeMK AND Matakuliah.NamaMK = 'Komunikasi Data';
```

4. Tampilkan nama mahasiswa, nilai Finalnya, dan nama mata kuliahnya!

```sql
SELECT Mahasiswa.Nama, Nilai.Final, Matakuliah.NamaMK FROM Mahasiswa, Nilai, Matakuliah WHERE Mahasiswa.NPM = Nilai.NPM AND Nilai.KodeMK = Matakuliah.KodeMK;
```

5. Tampilkan nama mahasiswa yang nilai MID kurang dari 80 dan mengambil mata kuliah algoritma

```sql
SELECT Mahasiswa.Nama FROM Mahasiswa, Nilai, Matakuliah WHERE Mahasiswa.NPM = Nilai.NPM AND Nilai.KodeMK = Matakuliah.KodeMK AND Nilai.Mid < 80 AND Matakuliah.NamaMK = 'Algoritma';
```

6. Tampilkan kelas yang nilai FINALnya di atas 80 atau yang jumlah sksnya 3!

```sql
SELECT Matakuliah.NamaMK FROM Matakuliah, Nilai WHERE Matakuliah.KodeMK = Nilai.KodeMK AND Nilai.Final > 80 OR Matakuliah.SKS = 3;
```
