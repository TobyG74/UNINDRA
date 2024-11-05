# Latihan Modul PSBD

[KLIK DISINI UNTUK MELIHAT SOAL](https://drive.google.com/file/d/16PRk_Q7TXAGH8zX826WjqipCJTulvsRw/view?usp=drive_link)

## Latihan Halaman 15

1. Buatlah database dengan nama Latihan1!

```sql
CREATE DATABASE Latihan1;
```

-   Gunakan database Latihan1!

```sql
USE Latihan1;
```

2. Buatlah tabel Mahasiswa dengan field NPM, Nama, Alamat, Jen_Kel, TglLahir, dan Prodi!

```sql
CREATE TABLE Mahasiswa (
NPM VARCHAR(12),
Nama VARCHAR(30),
Alamat VARCHAR(15),
Jen_Kel CHAR(1),
TglLahir DATE,
Prodi VARCHAR(15));
```

3. Rubahlah field Jen_Kel menjadi JnsKel pada Tabel Mahasiswa!

```sql
ALTER TABLE Mahasiswa CHANGE Jen_Kel JnsKel CHAR(1);
```

4. Hapuslah field Prodi pada tabel mahasiswa!

```sql
ALTER TABLE Mahasiswa DROP COLUMN Prodi;
```

5. Rubahlan size kolom nama menjadi size 25 pada tabel Mahasiswa!

```sql
ALTER TABLE Mahasiswa MODIFY COLUMN Nama VARCHAR(25);
```

6. Tambahkan kolom kota setelah kolom alamat pada tabel Mahasiswa!

```sql
ALTER TABLE Mahasiswa ADD COLUMN Kota VARCHAR(15) AFTER Alamat;
```

7. Tambahkan kolom Telepon pada tabel mahasiswa!

```sql
ALTER TABLE Mahasiswa ADD COLUMN Telepon VARCHAR(15);
```

8. Jadikanh field NPM pada tabel mahasiswa sebagai primary key!

```sql
ALTER TABLE Mahasiswa ADD PRIMARY KEY (NPM);
```

9. Rubahlah Tabel Mahasiswa menjadi tabel mhs!

```sql
RENAME TABLE Mahasiswa TO mhs;
```

10. Rubahlah database Latihan1 menjadi database Latihan!

-   Ini Error karena tidak bisa merename database di MySQL
-   Kamu hanya bisa membuat database baru dan menghapus database lama, seperti :

```sql
CREATE DATABASE Latihan;
RENAME TABLE Latihan1.mhs TO Latihan.mhs;
DROP DATABASE Latihan1;
USE Latihan;
```

## Latihan Halaman 19 - 20

1. Buatlah database dengan nama Anda!

```sql
CREATE DATABASE Tobi;
```

2. Buatlah tabel dengan nama Buku pada database nama Anda sesuai dengan struktur tabel dibawah ini!

```sql
CREATE TABLE Buku (
KdBuku VARCHAR(4),
NamaBuku VARCHAR(30),
Pengarang VARCHAR(20),
JmlBuku INT(3),
KdPenerbit VARCHAR(6));
```

3. Isilah data pada tabel buku!

```sql
INSERT INTO Buku VALUES
('B001', 'Bawang Merah', 'Mira', 25, 'PIM201'),
('B002', 'Anak Asuh', 'Mira', 14, 'PIM201'),
('B003', 'Buah Hati', 'Mita', 12, 'PBK101'),
('B004', 'Pendekar Sakti', 'Anwar', 21, 'PBK101'),
('B005', 'Si Penolong Cilik', 'Selly', 18, 'PIM201');
```

4. Jadikan field KbBuku pada tabel buku sebagai primary key!

```sql
ALTER TABLE Buku ADD PRIMARY KEY (KdBuku);
```

5. Rubahlah field NamaBuku menjadi field Judul pada tabel Buku!

```sql
ALTER TABLE Buku CHANGE NamaBuku Judul VARCHAR(30);
```

6. Rubahlah nama pengarang untuk buku “Pendekar Sakti” menjadi “Anwar Sanusi”!

```sql
UPDATE Buku SET Pengarang = 'Anwar Sanusi' WHERE Judul = 'Pendekar Sakti';
```

7. Tambahkah data pada tabel buku dengan data: Kode buku B006, Judul: Si kancil yang cerdik, pengarang: Iriawati, jumlah=28, kode penerbit : PBK101!

```sql
INSERT INTO Buku VALUES ('B006', 'Si Kancil yang Cerdik', 'Iriawati', 28, 'PBK101');
```

8. Tampilkan data buku dengan kode penerbit ‘PBK101’!

```sql
SELECT * FROM Buku WHERE KdPenerbit = 'PBK101';
```

9. Tampilkan Judul dan JmlBuku untuk buku yang pengarangnya bernama ‘Mira’!

```sql
SELECT Judul, JmlBuku FROM Buku WHERE Pengarang = 'Mira';
```

10. Hapuslah data untuk buku yang berjudul ‘Anak Asuh’!

```sql
DELETE FROM Buku WHERE Judul = 'Anak Asuh';
```

## Latihan Halaman 26 - 27

-   Membuat Database

```sql
CREATE DATABASE Tobi_26;
USE Tobi_26;
```

1. Buatlah Tabel di bawah ini:

-   Membuat Tabel Mahasiswa

```sql
CREATE TABLE Mahasiswa (
NPM VARCHAR(12) PRIMARY KEY,
Nama VARCHAR(30),
Alamat VARCHAR(30),
JnsKel CHAR(1),
TglLahir DATE
);

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

-   Membuat Tabel Matakuliah

```sql
CREATE TABLE MataKuliah (
KD_MK VARCHAR(10) PRIMARY KEY,
Nama_MataKuliah VARCHAR(30),
SKS INT
);

INSERT INTO MataKuliah VALUES
('KD123', 'Interaksi Manusia dan Komputer', 3),
('KK020', 'Praktikum Sistem Basis Data', 2),
('KK021', 'Sistem Basis Data', 1),
('KK034', 'Manajemen Proyek', 3),
('KK077', 'Metode Numerik', 3),
('KU122', 'Ilmu Budaya Dasar', 2);
```

-   Membuat Tabel Nilai

```sql
CREATE TABLE Nilai (
NPM VARCHAR(12),
KD_MK VARCHAR(12),
UTS INT,
UAS INT
FOREIGN KEY (NPM) REFERENCES Mahasiswa(NPM),
FOREIGN KEY (KD_MK) REFERENCES MataKuliah(KD_MK)
);

INSERT INTO Nilai VALUES
('201143500439', 'KK021', 60, 75),
('201143500121', 'KD123', 70, 90),
('201143500234', 'KK021', 50, 40),
('201143500165', 'KU122', 90, 80),
('201143500228', 'KU122', 75, 75),
('201143500326', 'KD123', 80, 0),
('201143500439', 'KD123', 40, 30);
```

2. Tampilkan NPM dan Nama untuk mahasiswa berjenis kelamin ‘Perempuan’!

```sql
SELECT NPM, Nama FROM Mahasiswa WHERE JnsKel = 'P';
```

3. Tampilkan data mahasiswa dengan namamahasiswa diurutkan secara Descending!

```sql
SELECT * FROM Mahasiswa ORDER BY Nama DESC;
```

4. Tampilkan Nama matakuliah dan SKS untuk nama matakuliah yang mengandung karakter ‘P’!

```sql
SELECT Nama_MataKuliah, SKS FROM MataKuliah WHERE Nama_MataKuliah LIKE '%P%';
```

5. Tampilkan Nama, alamat dan jenis kelamin untuk mahasiswa yang namanya mengandung 8 karakter!

```sql
SELECT Nama, Alamat, JnsKel FROM Mahasiswa WHERE LENGTH(Nama) = 8;
```

6. Tampilkan kolom SKS pada tabel matakuliah dengan tidak ada pengulangan data!

```sql
SELECT DISTINCT SKS FROM MataKuliah;
```

7. Tampilkan NPM dan UTS mahasiswa untuk nilai UTS diatas 60!

```sql
SELECT NPM, UTS FROM Nilai WHERE UTS > 60;
```

8. Tampilkan NPM dan UAS mahasiswa untuk nilai UAS antara 70 sampai 90!

```sql
SELECT NPM, UAS FROM Nilai WHERE UAS BETWEEN 70 AND 90;
```

9. Tampilkan data pada tabel Mahasiswa yang mana data pada kolom NPMnya tercantum pada tabel Nilai!

```sql
SELECT * FROM Mahasiswa WHERE NPM IN (SELECT NPM FROM Nilai);
```

10. Tampilkan data pada tabel Mahasiswa yang mana data pada kolom NPMnya tidak tercantum pada tabel Nilai!

```sql
SELECT * FROM Mahasiswa WHERE NPM NOT IN (SELECT NPM FROM Nilai);
```

## Latihan Halaman 32 - 33

-   Membuat Database

```sql
CREATE DATABASE Tobi_32;
USE Tobi_32;
```

-   Membuat Tabel Mahasiswa

```sql
CREATE TABLE Mahasiswa (
NPM VARCHAR(12) PRIMARY KEY,
Nama VARCHAR(30),
Alamat VARCHAR(30),
JnsKel CHAR(1),
TglLahir DATE
);

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

-   Membuat Tabel Matakuliah

```sql
CREATE TABLE MataKuliah (
KD_MK VARCHAR(10) PRIMARY KEY,
Nama_MataKuliah VARCHAR(30),
SKS INT
);

INSERT INTO MataKuliah VALUES
('KD123', 'Interaksi Manusia dan Komputer', 3),
('KK020', 'Praktikum Sistem Basis Data', 2),
('KK021', 'Sistem Basis Data', 1),
('KK034', 'Manajemen Proyek', 3),
('KK077', 'Metode Numerik', 3),
('KU122', 'Ilmu Budaya Dasar', 2);
```

-   Membuat Tabel Nilai

```sql
CREATE TABLE Nilai (
NPM VARCHAR(12),
KD_MK VARCHAR(12),
UTS INT,
UAS INT
FOREIGN KEY (NPM) REFERENCES Mahasiswa(NPM),
FOREIGN KEY (KD_MK) REFERENCES MataKuliah(KD_MK)
);

INSERT INTO Nilai VALUES
('201143500439', 'KK021', 60, 75),
('201143500121', 'KD123', 70, 90),
('201143500234', 'KK021', 50, 40),
('201143500165', 'KU122', 90, 80),
('201143500228', 'KU122', 75, 75),
('201143500326', 'KD123', 80, 0),
('201143500439', 'KD123', 40, 30);
```

1. Tampilkan nilai Rata-rata UTS pada tabel Nilai!

```sql
SELECT AVG(UTS) AS Rata_rata_UTS FROM Nilai;
```

2. Tampilkan jumlah total nilai UAS pada tabel Nilai!

```sql
SELECT SUM(UAS) AS Jumlah_total_UAS FROM Nilai;
```

3. Tampilkan nilai terendah dari nilai UAS pada tabel Nilai!

```sql
SELECT MIN(UAS) AS Nilai_terendah_UAS FROM Nilai;
```

4. Tampilkan rata-rata dan jumlah nilai UAS untuk mata kuliah ‘KD123’!

```sql
SELECT AVG(UAS) AS Rata_rata_UAS, SUM(UAS) AS Jumlah_UAS FROM Nilai WHERE KD_MK = 'KD123';
```

5. Tampilkan KD_MK dan jumlah KD_MK dari masing-masing KD_MK matakuliah!

```sql
SELECT KD_MK, COUNT(KD_MK) AS Jumlah_KD_MK FROM Nilai GROUP BY KD_MK;
```

6. Tampilkan KD_MK dan jumlah KD_MK dari masing-masing KD_MK yang mempunyai jumlah lebih dari 2!

```sql
SELECT KD_MK, COUNT(KD_MK) AS Jumlah_KD_MK FROM Nilai GROUP BY KD_MK HAVING COUNT(KD_MK) > 2;
```

7. Tampilkan KD_MK dan jumlah total nilai UTS dari masing-masing KD_MK!

```sql
SELECT KD_MK, SUM(UTS) AS Jumlah_UTS FROM Nilai GROUP BY KD_MK;
```

8. Tampilkan NPM dan nilai UTS pada tabel nilai yang nilai UTS-nya 50 sampai dengan 70!

```sql
SELECT NPM, UTS FROM Nilai WHERE UTS BETWEEN 50 AND 70;
```

9. Tampilkan NPM dan nilai UAS pada tabel nilai yang nilai UAS-nya 60 sampai dengan 80!

```sql
SELECT NPM, UAS FROM Nilai WHERE UAS BETWEEN 60 AND 80;
```

10. Tampilkan NPM dan nilai UTS pada tabel nilai yang nilai UTS-nya bukan 50 sampai dengan 75!

```sql
SELECT NPM, UTS FROM Nilai WHERE UTS NOT BETWEEN 50 AND 75;
```

## Latihan Halaman 41

1. Apa perintah untuk menampilkan tanggal setelah ditambah 2 bulan (“2012-05-06”)

```sql
SELECT DATE_ADD('2012-05-06', INTERVAL 2 MONTH);
```

2. Apa perintah menampilkan tanggal & waktu sekarang

```sql
SELECT NOW();
```

3. Tampilkan nama hari dari tanggal “2012-05-06”

```sql
SELECT DAYNAME('2012-05-06');
```

4. Tampilkan nama bulan dari tanggal “2012-05-06”

```sql
SELECT MONTHNAME('2012-05-06');
```

5. Tampilkan nilai penanggalan “2010-05-06” dengan format (nama hari, nama bulan, nilai hari, nilai tahun dengan 4 digit)

```sql
SELECT DAYNAME('2010-05-06') AS Nama_Hari, MONTHNAME('2010-05-06') AS Nama_Bulan, DAY('2010-05-06') AS Nilai_Hari, YEAR('2010-05-06') AS Nilai_Tahun;
```

## Latihan Halaman 46

1. Tampilkan nilai ASCII dari “A”!

```sql
SELECT ASCII('A') AS Nilai_ASCII;
```

2. Tampilkan jumlah karakter dari string “Praktikum Sistem Basis Data”! Diket : S1 =”ALBY PUTRA FAHRI”

```sql
SELECT LENGTH('Praktikum Sistem Basis Data') AS Jumlah_Karakter;
```

3. Tampilkan pengambilan string dari S1 dengan hasil PUTRA!

-   Bisa menggunakan substring atau mid
-   Menggunakan substring

```sql
SELECT SUBSTRING('ALBY PUTRA FAHRI', 5, 6) AS Hasil_PUTRA;
```

-   Menggunakan mid

```sql
SELECT MID('ALBY PUTRA FAHRI', 5, 6) AS Hasil_PUTRA;
```

4. Tampilkan pengambilan string dari S1 dengan hasil AL!

-   Bisa menggunakan substring atau left
-   Menggunakan substring

```sql
SELECT SUBSTRING('ALBY PUTRA FAHRI', 1, 2) AS Hasil_AL;
```

-   Menggunakan left

```sql
SELECT LEFT('ALBY PUTRA FAHRI', 2) AS Hasil_AL;
```

5. Tampilkan pengambilan string dari S1 dengan hasil FAHRI!

-   Bisa menggunakan substring atau right
-   Menggunakan substring

```sql
SELECT SUBSTRING('ALBY PUTRA FAHRI', 12, 5) AS Hasil_FAHRI;
```

-   Menggunakan right

```sql
SELECT RIGHT('ALBY PUTRA FAHRI', 5) AS Hasil_FAHRI;
```

## Latihan Halaman 55

-   Membuat Database

```sql
CREATE DATABASE Tobi_55;
USE Tobi_55;
```

-   Membuat Tabel Departement

```sql
CREATE TABLE Departement (
Departement_id CHAR(2) NOT NULL PRIMARY KEY,
Departement_name VARCHAR(20) NOT NULL,
Manager_id CHAR(3) NOT NULL
);

INSERT INTO Departement VALUES
('10', 'Administration', '101'),
('20', 'IT', '103');
```

-   Membuat Tabel Employee

```sql
CREATE TABLE Employee (
Employee_id CHAR(3) NOT NULL PRIMARY KEY,
Name VARCHAR(20) NOT NULL,
Salary INT NOT NULL,
Manager_id CHAR(3) NOT NULL,
Departement_id CHAR(2) NOT NULL,
FOREIGN KEY (Manager_id) REFERENCES Manager(Manager_id),
FOREIGN KEY (Departement_id) REFERENCES Departement(Departement_id)
);

INSERT INTO Employee VALUES
('100', 'Steven', 8000, '101', '10'),
('101', 'Lexa', 10000, '101', '10'),
('102', 'Bruce', 9000, '103', '20'),
('103', 'Diana', 11000, '103', '20'),
('104', 'Bruce', 8500, '103', '20');
```

1. Tampilkan nama employee yan memiliki salary lebih dari 9000

```sql
SELECT Employee.Name FROM Employee WHERE Employee.Salary > 9000;
```

2. Tampilkan id dan nama dari employee yang memiliki nama diakhiri dengan huruf n

```sql
SELECT Employee.Employee_id, Employee.Name FROM Employee WHERE Employee.Name LIKE '%n';
```

3. Hitung jumlah employee yang memilki nama Bruce

```sql
SELECT COUNT(Employee.Name) AS Jumlah_Bruce FROM Employee WHERE Employee.Name = 'Bruce';
```

4. Tampilkan id department dan nama departement dari employee yang bernama Lexa

```sql
SELECT Departement.Departement_id, Departement.Departement_name FROM Departement, Employee WHERE Departement.Departement_id = Employee.Departement_id AND Employee.Name = 'Lexa';
```

5. Tampilkan id department yang total salary semua employee yang bekerja pada department tersebut lebih dari 20000

```sql
SELECT Employee.Departement_id FROM Employee GROUP BY Employee.Departement_id HAVING SUM(Employee.Salary) > 20000;
```

## Latihan Halaman 57

-   Membuat Database

```sql
CREATE DATABASE Tobi_57;
USE Tobi_57;
```

-   Membuat Tabel Mahasiswa

```sql
CREATE TABLE Mahasiswa (
NPM VARCHAR(8) PRIMARY KEY,
Nama VARCHAR(30),
Alamat VARCHAR(30)
);

INSERT INTO Mahasiswa VALUES
('12196076', 'Alya', 'Bogor'),
('11196779', 'Didi', 'Jakarta'),
('12196324', 'Tata', 'Depok'),
('10196839', 'Vinka', 'Bekasi'),
('12196999', 'Sely', 'Jakarta'),
('10196778', 'Dhani', 'Bogor');
```

-   Membuat Tabel Matakuliah

```sql
CREATE TABLE MataKuliah (
KD_MK VARCHAR(10) PRIMARY KEY,
Nama_MK VARCHAR(25),
SKS INT,
Semester INT
);

INSERT INTO Matakuliah VALUES
('KK021', 'Sistem Basis Data', 2, 3),
('KD132', 'SIM', 3, 3),
('KU122', 'Pancasila', 2, 2);
```

-   Membuat Tabel Nilai

```sql
CREATE TABLE Nilai (
NPM VARCHAR(8),
KD_MK VARCHAR(10),
MID INT,
FINAL INT,
FOREIGN KEY (NPM) REFERENCES Mahasiswa(NPM),
FOREIGN KEY (KD_MK) REFERENCES Matakuliah(KD_MK)
)

INSERT INTO Nilai VALUES
('12196076', 'KK021', 60, 70),
('11196779', 'KK021', 80, 90),
('12196324', 'KK021', 50, 40),
('10196839', 'KU122', 90, 80),
('12196999', 'KD132', 75, 75),
('10196778', 'KD132', 80, 0),
('12196076', 'KD132', 40, 30);
```

1. Tampilkan nama mahasiwa dan nama matakuliah yang nilai midnya antara 70 sampai 80

```sql
SELECT Mahasiswa.Nama, MataKuliah.Nama_MK FROM Mahasiswa, MataKuliah, Nilai WHERE Mahasiswa.NPM = Nilai.NPM AND MataKuliah.KD_MK = Nilai.KD_MK AND Nilai.MID BETWEEN 70 AND 80;
```

2. Tampilkan nama mahasiswa yang mengambil matakuliah Sistem Basis Data

```sql
SELECT Mahasiswa.Nama FROM Mahasiswa, MataKuliah, Nilai WHERE Mahasiswa.NPM = Nilai.NPM AND MataKuliah.KD_MK = Nilai.KD_MK AND MataKuliah.Nama_MK = 'Sistem Basis Data';
```

3. Tampilkan nama mahasiswa, nilai final dan nama matakuliah

```sql
SELECT Mahasiswa.Nama, Nilai.FINAL, MataKuliah.Nama_MK FROM Mahasiswa, MataKuliah, Nilai WHERE Mahasiswa.NPM = Nilai.NPM AND MataKuliah.KD_MK = Nilai.KD_MK;
```

4. Tampilkan nama mahasiswa yang nilai mid kurang dari 80 dan mengambil matakuliah sistem basis data

```sql
SELECT Mahasiswa.Nama FROM Mahasiswa, MataKuliah, Nilai WHERE Mahasiswa.NPM = Nilai.NPM AND MataKuliah.KD_MK = Nilai.KD_MK AND Nilai.MID < 80 AND MataKuliah.Nama_MK = 'Sistem Basis Data';
```

## Latihan Halaman 63

-   Membuat Database Animal

```sql
CREATE DATABASE Animal;
USE Animal;
```

-   Buat table berikut dan cari JOIN, LEFT JOIN, RIGHT JOIN, FULL JOIN

```sql
CREATE TABLE Animal (
Id INT PRIMARY KEY,
Animal VARCHAR(20)
)
INSERT INTO Animal VALUES
(1, 'Cat'),
(2, 'Dog'),
(3, 'Cow');
CREATE TABLE Food (
Id INT PRIMARY KEY,
Food VARCHAR(20)
)
INSERT INTO Food VALUES
(1, 'Milk'),
(2, 'Bone'),
(3, 'Grass');
```

-   JOIN

```sql
SELECT Animal.Animal, Food.Food FROM Animal JOIN Food ON Animal.Id = Food.Id;
```

-   LEFT JOIN

```sql
SELECT Animal.Animal, Food.Food FROM Animal LEFT JOIN Food ON Animal.Id = Food.Id;
```

-   RIGHT JOIN

```sql
SELECT Animal.Animal, Food.Food FROM Animal RIGHT JOIN Food ON Animal.Id = Food.Id;
```

-   FULL JOIN

```sql
SELECT Animal.Animal, Food.Food FROM Animal FULL JOIN Food ON Animal.Id = Food.Id;
```
