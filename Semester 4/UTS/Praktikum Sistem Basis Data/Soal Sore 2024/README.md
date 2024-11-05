# Jawaban Soal UTS Ekstensi Praktikum Sistem Basis Data

[KLIK DISINI UNTUK MELIHAT SOAL UTS EKSTENSI](https://drive.google.com/drive/u/1/folders/1Musrr3mzm5DZiM154nVjJnVrjBx7XTGR)

1. Buatlah database dengan nama anda diikuti dengan 3 digit NPM terakhir! [Bobot: 5]

```sql
CREATE DATABASE Tobi_Saputra_612;
```

2. Buatlah tabel berikut ini: [Bobot: 20]

-   Gunakan Database yang telah dibuat sebelumnya

```sql
USE Tobi_Saputra_612;
```

-   Tabel Student

```sql
CREATE TABLE Student (
Id_student VARCHAR(10) PRIMARY KEY,
Nama_student VARCHAR(25),
Usia INT);
INSERT INTO Student VALUES
('ST21', 'Amar', 16),
('ST22', 'Fandy', 17),
('ST23', 'Zaky', 16),
('ST24', 'Madina', 15);
```

-   Tabel Course

```sql
CREATE TABLE Course (
Id_student VARCHAR(10),
Kd_course VARCHAR(10),
Tgl_mulai_course DATE,
Tgl_akhir_course DATE,
Biaya INT,
FOREIGN KEY (Id_student) REFERENCES Student(Id_student));
INSERT INTO Course VALUES
('ST23', 'CR03', '2023-03-01', '2023-06-30', 500000),
('ST24', 'CR03', '2023-03-01', '2023-06-30', 500000),
('ST21', 'CR03', '2023-03-01', '2023-09-30', 1000000),
('ST21', 'CR02', '2023-04-15', '2023-07-15', 700000),
('ST22', 'CR02', '2023-04-15', '2023-07-15', 700000),
('ST22', 'CR05', '2023-05-10', '2023-07-10', 600000),
('ST23', 'CR05', '2023-05-15', '2023-08-15', 900000);
```

3. Tampilkan nama_student dan usia ditampilkan berurut berdasarakan usia secara descending! [Bobot: 10]

```sql
SELECT Nama_student, Usia FROM Student ORDER BY Usia DESC;
```

4. Tampilkan kd_course, tgl_mulai_course, tgl_akhir_course dan biaya dari tabel course yang tanggal akhir coursenya di bulan juli! [Bobot: 10]

```sql
SELECT Kd_course, Tgl_mulai_course, Tgl_akhir_course, Biaya FROM Course WHERE MONTH(Tgl_akhir_course) = 7;
```

5. Tampilkan id_student, kd_course dan biaya dari tabel course yang diikuti oleh id_student = “ST23”! [Bobot: 5]

```sql
SELECT Id_student, Kd_course, Biaya FROM Course WHERE Id_student = 'ST23';
```

6. Tampilkan data student yang id_student terdapat pada tabel course dengan menggunakan klausa IN atau EXISTS! [Bobot: 10]

-   Menggunakan klausa IN

```sql
SELECT * FROM Student WHERE Id_student IN (SELECT Id_student FROM Course);
```

-   Menggunakan klausa EXISTS

```sql
SELECT * FROM Student WHERE EXISTS (SELECT * FROM Course WHERE Student.Id_student = Course.Id_student);
```

7. Tampilkan data course yang mengeluarkan biaya course paling banyak! [Bobot: 10]

```sql
SELECT * FROM Course WHERE Biaya = (SELECT MAX(Biaya) FROM Course);
```

8. Tampilkan total biaya course per kd_course dengan menggunakan grouping! [Bobot: 10]

```sql
SELECT Kd_course, SUM(Biaya) AS Total_Biaya FROM Course GROUP BY Kd_course;
```

9. Tambahkan field alamat setelah field nama_student pada tabel student, kemudian ubah isi alamat dari salah satu student! [Bobot: 10]

```sql
ALTER TABLE Student ADD COLUMN Alamat VARCHAR(50) AFTER Nama_student;
UPDATE Student SET Alamat = 'Jl. Jambu, No. 01' WHERE Id_student = 'ST21';
UPDATE Student SET Alamat = 'Jl. Pepaya, No. 02' WHERE Id_student = 'ST22';
UPDATE Student SET Alamat = 'Jl. Nangka, No. 03' WHERE Id_student = 'ST23';
UPDATE Student SET Alamat = 'Jl. Pisang, No. 04' WHERE Id_student = 'ST24';
```

10. Tampilkan Hari, Tanggal dan Waktu saat ini (tampilan 3 kolom)! [Bobot: 10]

```sql
SELECT DAYNAME(NOW()) AS Hari, CURDATE() AS Tanggal, CURTIME() AS Waktu;
```
