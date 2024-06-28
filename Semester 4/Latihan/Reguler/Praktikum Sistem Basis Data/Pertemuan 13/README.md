# Latihan Pertemuan 13

### BUAT DATABASE PENJUALAN

```sql
CREATE DATABASE Tobi_P13;
```

- Menggunakan Database Penjualan

```sql
USE Tobi_P13;
```

### Aktifkan database penjualan, kemudian buat tabel pelanggan dan order

[KLIK DISINI UNTUK MELIHAT SOAL](https://docs.google.com/presentation/d/1uJabBw_gWTJLXq_6YN2I5QoK4dc3ghy7/edit#slide=id.p15)

```sql
CREATE TABLE Pelanggan (
P_Id INT PRIMARY KEY,
Nama VARCHAR(30),
Alamat VARCHAR(30),
Kota VARCHAR(30)
);

CREATE TABLE Ordered (
O_Id INT PRIMARY KEY,
NoOrder VARCHAR(10),
P_Id INT
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
INSERT INTO Ordered VALUES
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
ON Pelanggan.P_Id = Ordered.P_Id
ORDER BY Pelanggan.Nama;
```

2. Menampilkan nama dan nomor order yang diurutkan berdasarkan nama (dengan perintah left join)!

```sql
SELECT Pelanggan.Nama, Ordered.NoOrder
FROM Pelanggan
LEFT JOIN Ordered
ON Pelanggan.P_Id = Ordered.P_Id
ORDER BY Pelanggan.Nama;
```

3. Menampilkan nama dan nomor order yang diurutkan berdasarkan nama (dengan perintah right join)!

```sql
SELECT Pelanggan.Nama, Ordered.NoOrder
FROM Pelanggan
RIGHT JOIN Ordered
ON Pelanggan.P_Id = Ordered.P_Id
ORDER BY Pelanggan.Nama;
```
