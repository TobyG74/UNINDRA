# Latihan 1 Pertemuan 3

1. Buat Database dengan nama Latihan1

```sql
CREATE DATABASE Latihan1;
SHOW DATABASE Latihan1;
USE Latihan1;
```

2. Buatlah tabel Mahasiswa dengan field (NPM, Nama, Alamat, Jen_Kel, TglLahir, dan Prodi)!

```sql
CREATE TABLE Mahasiswa (NPM VARCHAR(12), Nama VARCHAR(30), Alamat VARCHAR(15), Jen_Kel CHAR(1), TglLahir DATE, Prodi VARCHAR(20));
```

-   Masukkan data ke dalam tabel Mahasiswa

```sql
INSERT INTO Mahasiswa
('201135000121', 'Aryati Abadiyah', 'Pasar Minggu', 'P', '1991-06-05', 'Informatika'),
('201135000254', 'Putri Arfiyah', 'Jagakarsa', 'P', '1990-12-14', 'Informatika'),
('201135000166', 'Arman Saputra', 'Cilandak', 'L', '1991-09-26', 'Informatika'),
('201135000321', 'Irwansyah', 'Pasar Minggu', 'L', '1990-07-15', 'Informatika'),
('201135000387', 'Kiki Damayanti', 'Bekasi', 'L', '1990-08-22', 'Informatika');
```

3. Rubahlah field Jen_Kel menjadi JnsKel pada Tabel Mahasiswa!

```sql
ALTER TABLE Mahasiswa CHANGE COLUMN Jen_Kel JnsKel CHAR(1);
```

4. Hapuslah field Prodi pada tabel mahasiswa!

```sql
ALTER TABLE Mahasiswa DROP COLUMN Prodi;
```

5. Rubahlan size kolom nama pada tabel Mahasiswa!

```sql
ALTER TABLE Mahasiswa MODIFY COLUMN Nama VARCHAR(20);
```

# Latihan 2 Pertemuan 3

1. Buat tabel dengan nama NILAI dengan field NPM, KodeMK, UTS, UAS

```sql
CREATE TABLE NILAI (NPM VARCHAR(12), KodeMK VARCHAR(10), UTS INT, UAS INT);
```

2. Buat tabel dengan nama MATAKULIAH dengan field Kd_MK, Nama_MK, SKS

```sql
CREATE TABLE MATAKULIAH (Kd_MK VARCHAR(10), Nama_MK VARCHAR(30), SKS INT);
```
