# Latihan Pertemuan 15

[KLIK DISINI UNTUK MELIHAT SOAL](https://docs.google.com/presentation/d/1ntYIdRyS6xWy6sTWvr-J4r92eRU99-ZY/edit#slide=id.p10)

### Buatlah tabel Karyawan dan Departemen!

-   Karyawan

```sql
CREATE TABLE Karyawan (
Nama VARCHAR(30),
Id_dep INT);
```

```sql
INSERT INTO Karyawan VALUES
('Agus', 10),
('Budi', 16),
('Citra', 12),
('Dani', 17);
```

-   Karyawan 2

```sql
CREATE TABLE Karyawan2 (
Nama VARCHAR(30),
Id_dep INT);
```

```sql
INSERT INTO Karyawan2 VALUES
('Dani', 17),
('Anisa', 18),
('Bagus', 12);
```

### Gabungkan tabel karyawan dengan tabel karyawan 2 mengggunakan perintah UNION dan UNION ALL

-   UNION

```sql
SELECT * FROM Karyawan
UNION
SELECT * FROM Karyawan2;
```

-   UNION ALL

```sql
SELECT * FROM Karyawan
UNION ALL
SELECT * FROM Karyawan2;
```
