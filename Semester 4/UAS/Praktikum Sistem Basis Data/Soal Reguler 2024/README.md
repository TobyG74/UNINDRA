# Soal PSBD Reguler 2024

## Soal

[Klik di sini](https://drive.google.com/drive/u/1/folders/1VIhQvMg7ksvDQRfd9_1u0N3A1ooN2x2H) untuk melihat soal PSBD Reguler 2024

## Jawaban

1. Buatlah database dengan nama anda diikuti dengan 3 digit NPM terakhir, misal NPM 202443520077 maka nama databasenya adalah mercy077!

```sql
CREATE DATABASE Tobi612;
```

2. Buatlah tabel berikut ini:

-   TABEL STUDENT

```sql
CREATE TABLE Student (
    Id_student VARCHAR(5) PRIMARY KEY,
    Nama_student VARCHAR(50),
    Usia INT
);
INSERT INTO Student VALUES
('STU71', 'Mercy', 16),
('STU72', 'Raffi', 17),
('STU73', 'Akbar', 16),
('STU74', 'Zayn', 15),
('STU75', 'Willy', 17);

```

-   TABEL COURSE

```sql
CREATE TABLE Course (
    Id_Course VARCHAR(5) PRIMARY KEY,
    Nama_Course VARCHAR(50),
    Harga_Course INT
);
INSERT INTO Course VALUES
('CRS11', 'Graphic Design', 650000),
('CRS22', 'Accounting', 600000),
('CRS23', 'Web Developer', 700000),
('CRS24', 'Office Applications', 500000);

```

-   TABEL BOOKING

```sql
CREATE TABLE Booking (
    Id_student VARCHAR(5),
    Id_course VARCHAR(5),
    Tgl_mulai_course DATE,
    Lama_Bulan INT,
    PRIMARY KEY (Id_student, Id_course),
    FOREIGN KEY (Id_student) REFERENCES Student(Id_student),
    FOREIGN KEY (Id_course) REFERENCES Course(Id_Course)
);
INSERT INTO Booking VALUES
('STU74', 'CRS24', '2024-01-10', 1),
('STU73', 'CRS11', '2024-02-05', 3),
('STU71', 'CRS11', '2024-02-05', 3),
('STU71', 'CRS22', '2024-03-10', 3),
('STU72', 'CRS23', '2024-03-15', 3),
('STU73', 'CRS23', '2024-03-15', 3);
```

4. Tampilkan nama_student dan nama_course yang mengambil course “Web Developer”!

```sql
SELECT Nama_student, Nama_Course
FROM Student
JOIN Booking ON Student.Id_student = Booking.Id_student
JOIN Course ON Booking.Id_course = Course.Id_Course
WHERE Nama_Course = 'Web Developer';
```

5. Tampilkan total_biaya per id_course dengan menggunakan grouping dari tabel courseyang direlasikan dengan tabel booking!

-   Note: gunakan Alias serta rumus perkalian untuk menghasilkan total_biaya (lama bulan course dikalikan dengan harga course)

```sql
SELECT Id_course, SUM(Lama_Bulan * Harga_Course) AS Total_Biaya
FROM Course
JOIN Booking ON Course.Id_Course = Booking.Id_course
GROUP BY Id_course;
```

6. Tampilkan nama_student, nama_course, lama_bulan, tgl_mulai_course dan total_biaya yang tanggal mulai coursenya di bulan Maret!

```sql
SELECT Nama_student, Nama_Course, Lama_Bulan, Tgl_mulai_course, Lama_Bulan * Harga_Course AS Total_Biaya
FROM Student
JOIN Booking ON Student.Id_student = Booking.Id_student
JOIN Course ON Booking.Id_course = Course.Id_Course
WHERE MONTH(Tgl_mulai_course) = 3;
```

7. Tampilkan id_student, nama_course, lama_bulan yang memiliki lama_bulan 3 bulan ATAU total_biaya kurang dari 2000000!

```sql
SELECT Id_student, Nama_Course, Lama_Bulan
FROM Student
JOIN Booking ON Student.Id_student = Booking.Id_student
JOIN Course ON Booking.Id_course = Course.Id_Course
WHERE Lama_Bulan = 3 OR Lama_Bulan * Harga_Course < 2000000;
```

8. Tampilkan nama_student, nama_course dan total_biaya yang diurutkan berdasarkan total_biaya tertinggi (dengan perintah JOIN)!

```sql
SELECT Nama_student, Nama_Course, Lama_Bulan * Harga_Course AS Total_Biaya
FROM Student
JOIN Booking ON Student.Id_student = Booking.Id_student
JOIN Course ON Booking.Id_course = Course.Id_Course
ORDER BY Total_Biaya DESC;
```

9. Tampilkan data booking dengan id_course=“CRS23” kemudian gabungkan hasilnya dengan semua data booking dengan id_course=”CRS11” menggunakan perintah UNION!

```sql
SELECT *
FROM Booking
WHERE Id_course = 'CRS23'
UNION
SELECT *
FROM Booking
WHERE Id_course = 'CRS11';
```

10. Tampilkan data booking dengan id_course=”CRS11” yang diikuti oleh student dengan id_student=”STU71” kemudian gabungkan hasilnya dengan semua data booking dengan id_course=”CRS23” menggunakan perintah UNION!

```sql
SELECT *
FROM Booking
WHERE Id_course = 'CRS11' AND Id_student = 'STU71'
UNION
SELECT *
FROM Booking
WHERE Id_course = 'CRS23';
```
