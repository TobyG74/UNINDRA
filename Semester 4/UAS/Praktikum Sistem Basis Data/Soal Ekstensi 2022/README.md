# UAS PSBD Sore 2022

## Soal

[Klik di sini](https://drive.google.com/drive/folders/1dE34oGGq-3si18GGL1awMpSe0htzGKnq?usp=drive_link) untuk melihat soal UAS PSBD Sore 2022

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
    ALAMAT VARCHAR(50),
);
INSERT INTO KARYAWAN VALUES
('K1A023', 'Yusi Afriani', 'Bandung'),
('K1B011', 'Robi Chandra', 'Bogor'),
('K2B032', 'Ibrahim', 'Bekasi'),
('K2B453', 'Miranda', 'Tanggerang'),
('K2B235', 'Kirana', 'Tanggerang');
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
('K1A023', '1A', 3500000, 1500000),
('K1B011', '1B', 3000000, 1000000),
('K2B032', '2B', 2500000, 700000),
('K2B453', '2B', 2500000, 700000),
('K2B235', '2B', 2500000, 700000);
```

-   TABEL STATUS

```sql
CREATE TABLE STATUS (
    GOLONGAN VARCHAR(2) PRIMARY KEY,
    Status VARCHAR(20),
    FOREIGN KEY (GOLONGAN) REFERENCES GAJI(GOLONGAN)
);
INSERT INTO STATUS VALUES
('1A', 'Tetap'),
('2B', 'Honor');
```

3. Rubahlah field “IDKARYAWAN” menjadi “ID_KARYAWAN” pada Tabel Karyawan!

```sql
ALTER TABLE KARYAWAN
CHANGE COLUMN IDKARYAWAN ID_KARYAWAN VARCHAR(6);
```

4. Tambahkan field “TELP” pada Tabel Karyawan setelah field “ALAMAT”!

```sql
ALTER TABLE KARYAWAN
ADD COLUMN TELP VARCHAR(15)
AFTER ALAMAT;
```

5. Isilah field “TELP” dengan record yang anda inginkan!

```sql
UPDATE KARYAWAN
SET TELP = CASE
    WHEN ID_KARYAWAN = 'K1A023' THEN '081234567890'
    WHEN ID_KARYAWAN = 'K1B011' THEN '081234567891'
    WHEN ID_KARYAWAN = 'K2B032' THEN '081234567892'
    WHEN ID_KARYAWAN = 'K2B453' THEN '081234567893'
    WHEN ID_KARYAWAN = 'K2B235' THEN '081234567894'
    ELSE TELP
END
WHERE ID_KARYAWAN IN ('K1A023', 'K1B011', 'K2B032', 'K2B453', 'K2B235');
```

6. Tampilkan Nama Karyawan dan Alamat yang gaji pokoknya diatas > 250000!

```sql
SELECT NAMA, ALAMAT
FROM KARYAWAN
JOIN GAJI ON KARYAWAN.ID_KARYAWAN = GAJI.IDKARYAWAN
WHERE GAJI_POKOK > 2500000;
```

7. Tampilkan Nama Karyawan, Gaji pokok dan Status Yang Tunjangannya < 1000000”!

```sql
SELECT NAMA, GAJI_POKOK, STATUS
FROM KARYAWAN
JOIN GAJI ON KARYAWAN.ID_KARYAWAN = GAJI.IDKARYAWAN
JOIN STATUS ON GAJI.GOLONGAN = STATUS.GOLONGAN
WHERE TUNJANGAN < 1000000;
```

8. Tampilkan Nama Karyawan Yang Beralamat di Tanggerang!

```sql
SELECT NAMA
FROM KARYAWAN
WHERE ALAMAT = 'Tanggerang';
```

9. Tampilkan Total Gaji Pokok dan Rata-rata Tunjangan!

```sql
SELECT SUM(GAJI_POKOK) AS Total_Gaji_Pokok, AVG(TUNJANGAN) AS Rata_Rata_Tunjangan
FROM GAJI;
```

10. Tampilkan Hari, Tanggal dan Waktu sekarang (tampilan 3 kolom)!

```sql
SELECT DAYNAME(NOW()) AS Hari, DATE(NOW()) AS Tanggal, TIME(NOW()) AS Waktu;
```
