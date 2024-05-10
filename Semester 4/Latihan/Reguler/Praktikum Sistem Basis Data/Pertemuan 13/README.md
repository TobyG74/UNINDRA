# Latihan Pertemuan 13

### BUAT DATABASE PENJUALAN

```sql
CREATE DATABASE Penjualan;
```

### Aktifkan database penjualan, kemudian buat tabel pelanggan dan order

```sql
USE Penjualan;

CREATE TABLE Pelanggan (
P_ID INT PRIMARY KEY,
Nama VARCHAR(30),
Alamat VARCHAR(30),
Kota VARCHAR(30)
);

CREATE TABLE Ordered (
O_ID INT PRIMARY KEY,
NoOrder VARCHAR(10),
PID INT,
FOREIGN KEY (PID) REFERENCES Pelanggan(P_ID)
);
```

-   Masukkan data ke dalam tabel Pelanggan

```sql
INSERT INTO Pelanggan VALUES
(1, 'Hani', 'Jl. Bunga', 'Jakarta Timur'),
(2, 'Stefan', 'Jl. Ikan', 'Jakarta Barat'),
(3, 'Pipit', 'Jl. Buah', 'Jakarta Selatan');
```

-   Masukkan data ke dalam tabel Order

```sql
INSERT INTO Order VALUES
(1, '77895', 3),
(2, '44678', 3),
(3, '22456', 1),
(4, '24562', 1),
(5, '34764', 15);
```

1. Menampilkan nama dan nomor order yang diurutkan berdasarkan nama (dengan perintah inner join)!

```sql
SELECT Pelanggan.Nama, Ordered.NoOrder
FROM Pelanggan
INNER JOIN Ordered
ON Pelanggan.P_ID = Ordered.PID
ORDER BY Pelanggan.Nama;
```

2. Menampilkan nama dan nomor order yang diurutkan berdasarkan nama (dengan perintah left join)!

```sql
SELECT Pelanggan.Nama, Ordered.NoOrder
FROM Pelanggan
LEFT JOIN Ordered
ON Pelanggan.P_ID = Ordered.PID
ORDER BY Pelanggan.Nama;
```

3. Menampilkan nama dan nomor order yang diurutkan berdasarkan nama (dengan perintah right join)!

```sql
SELECT Pelanggan.Nama, Ordered.NoOrder
FROM Pelanggan
RIGHT JOIN Ordered
ON Pelanggan.P_ID = Ordered.PID
ORDER BY Pelaanggan.Nama;
```
