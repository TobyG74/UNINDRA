# Latihan Pertemuan 6

[KLIK DISINI UNTUK MELIHAT SOAL](https://docs.google.com/presentation/d/1OoHFTnKsqFSAnHHioYwuG65cUYQKItXp/edit#slide=id.p8)

-   Buatlah Tabel Nilai

```sql
CREATE TABLE Nilai (
NPM VARCHAR(10),
NamaMahasiswa VARCHAR(30),
KodeMK VARCHAR(10),
NamaMK VARCHAR(30),
UTS INT,
UAS INT,
);
```

-   Masukkan data ke dalam tabel Nilai

```sql
INSERT INTO Nilai VALUES
('1012005176', 'Kartika Rahma', 'KK021', 'Sistem Informasi', 75, 80),
('1012005179', 'Ahmad Rafii', 'KD132', 'Bahasa Inggris', 90, 95),
('1012005224', 'Ahmad Maulana', 'KK021', 'Sistem Informasi', 55, 60),
('1012005239', 'Mirnawati', 'KU122', 'Pancasila', 90, 80 ),
('1012005242', 'Ekka Supitri', 'KU122', 'Pancasila', 75, 80),
('1012005243', 'Abdul Azis', 'KD132', 'Bahasa Inggris', 90, 0),
('1012005244', 'Devi Aprianti', 'KD132', 'Bahasa Inggris', 45, 40);
```

1. Menghitung Nilai rata-rata UTS

```sql
SELECT AVG(UTS) AS RataRataUTS FROM Nilai;
```

2. Menghitung Jumlah Total Nilai UAS

```sql
SELECT SUM(UAS) AS JumlahTotalUAS FROM Nilai;
```

3. Nilai terendah dari Nilai UAS

```sql
SELECT MIN(UAS) AS NilaiTerendahUAS FROM Nilai;
```

4. Tampilkan rata-rata dan jumlah nilai UAS mata kuliah “KD132”

```sql
SELECT AVG(UAS) AS RataRataUAS, SUM(UAS) AS JumlahTotalUAS FROM Nilai WHERE KodeMK = 'KD132';
```

5. Tampilkan KD_MK dan jumlah KD_MK dari Masing-masing KD_MK

```sql
SELECT KodeMK AS KD_MK, COUNT(KodeMK) AS JumlahKD_MK FROM Nilai GROUP BY KodeMK;
```

6. Tampilkan KD_MK dari jumlah KD_MK dari masing-masing KD_MK yang mempunyai jumlah lebih dari 2

```sql
SELECT KodeMK AS KD_MK, COUNT(KodeMK) AS JumlahKD_MK FROM Nilai GROUP BY KodeMK HAVING COUNT(KodeMK) > 2;
```

7. Tampilkan KD_MK dan jumlah total nilai UTS dari masing-masing KD_MK

```sql
SELECT KodeMK AS KD_MK, SUM(UTS) AS JumlahTotalUTS FROM Nilai GROUP BY KodeMK;
```
