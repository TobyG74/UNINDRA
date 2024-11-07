# UAP PSBD 2023

## Soal

[Klik di sini](https://drive.google.com/drive/u/1/folders/1EnVjkbL9_BSAdWl8YQDVYD3_dEIbpA6x) untuk melihat soal UAP PSBD 2023

## Jawaban

1. Buatlah database dengan nama anda ditambahkan 3 digit npm terakhir!

```sql
CREATE DATABASE TOBI_612;
```

2. Buatlah tabel dibawah ini!

-   TABEL KARYAWAN

```sql
CREATE TABLE KARYAWAN (
    IDKARYAWAN VARCHAR(6) PRIMARY KEY,
    NAMA VARCHAR(50),
    ALAMAT VARCHAR(50)
);
INSERT INTO KARYAWAN VALUES
('K1A023', 'Rita Rosita', 'Bandung'),
('K1A011', 'Nagib askar', 'Bogor'),
('K2B032', 'Ibrahim', 'Bekasi'),
('K2B453', 'Yusi Afriani', 'Tanggerang'),
('K2B235', 'Aisyah', 'Tanggerang');
```

-   TABEL GAJI

```sql
CREATE TABLE GAJI (
    IDKARYAWAN VARCHAR(6),
    GOLONGAN VARCHAR(2),
    GAJI_POKOK INT,
    TUNJANGAN INT,
    FOREIGN KEY (IDKARYAWAN) REFERENCES KARYAWAN(IDKARYAWAN)
);
INSERT INTO GAJI VALUES
('K1A023', '1A', 3000000, 1500000),
('K1A011', '1A', 2500000, 1000000),
('K2B032', '2B', 2000000, 550000),
('K2B453', '2B', 2000000, 550000),
('K2B235', '2B', 2000000, 550000);
```

-   TABEL STATUS

```sql
CREATE TABLE STATUS (
    GOLONGAN VARCHAR(2) PRIMARY KEY,
    STATUS VARCHAR(20),
    FOREIGN KEY (GOLONGAN) REFERENCES GAJI(GOLONGAN)
);
INSERT INTO STATUS VALUES
('1A', 'Tetap'),
('2B', 'Honor');
```

3. Rubahlah field “IDKARYAWAN” menjadi “ID_KARYAWAN” pada Tabel Karyawan!

```sql
ALTER TABLE KARYAWAN CHANGE IDKARYAWAN ID_KARYAWAN VARCHAR(6);
```

4. Tambahkan field “TELP” pada Tabel Karyawan setelah field “ALAMAT”!

```sql
ALTER TABLE KARYAWAN ADD COLUMN TELP VARCHAR(15) AFTER ALAMAT;
```

5. Isilah field “TELP” dengan record yang anda inginkan!

```sql
UPDATE KARYAWAN
SET TELP = CASE
    WHEN IDKARYAWAN = 'K1A023' THEN '081234567890'
    WHEN IDKARYAWAN = 'K1A011' THEN '081234567891'
    WHEN IDKARYAWAN = 'K2B032' THEN '081234567892'
    WHEN IDKARYAWAN = 'K2B453' THEN '081234567893'
    WHEN IDKARYAWAN = 'K2B235' THEN '081234567894'
END
WHERE IDKARYAWAN IN ('K1A023', 'K1A011', 'K2B032', 'K2B453', 'K2B235');
```

6. Tampilkan Nama Karyawan yang gaji pokoknya dibawah “2500000”!

```sql
SELECT NAMA
FROM KARYAWAN
JOIN GAJI ON KARYAWAN.IDKARYAWAN = GAJI.IDKARYAWAN
WHERE GAJI_POKOK < 2500000;
```

7. Tampilkan Nama Karyawan, Gaji pokok dan Status Yang Tunjangannya > 550000”!

```sql
SELECT NAMA, GAJI_POKOK, STATUS
FROM KARYAWAN
JOIN GAJI ON KARYAWAN.IDKARYAWAN = GAJI.IDKARYAWAN
JOIN STATUS ON GAJI.GOLONGAN = STATUS.GOLONGAN
WHERE TUNJANGAN > 550000;
```

8. Tampilkan Nama Karyawan Yang Statusnya Tetap!

```sql
SELECT NAMA
FROM KARYAWAN
JOIN GAJI ON KARYAWAN.IDKARYAWAN = GAJI.IDKARYAWAN
JOIN STATUS ON GAJI.GOLONGAN = STATUS.GOLONGAN
WHERE STATUS = 'Tetap';
```

9. Tampilkan Total Gaji Pokok dan Rata-rata Tunjangan!

```sql
SELECT SUM(GAJI_POKOK) AS Total_Gaji_Pokok, AVG(TUNJANGAN) AS Rata_Rata_Tunjangan
FROM GAJI;
```

10. Tampilkan Hari, Tanggal dan Waktu sekarang (tampilan 3 kolom)!

```sql
SELECT DAYNAME(NOW()) AS Hari, CURDATE() AS Tanggal, CURRENT_TIME() AS Waktu;
```
