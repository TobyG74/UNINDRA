Credit : Tobz

---

1. Membuat tabel barang

```sql
CREATE TABLE barang (
    kode_barang varchar(4),
    nama_barang varchar(20),
    stok integer
);
INSERT INTO barang VALUES ('M753', 'Monitor', 3);
INSERT INTO barang VALUES ('M142', 'Keyboard', 18);
INSERT INTO barang VALUES ('M123', 'Mouse', 35);
INSERT INTO barang VALUES ('H789', 'Harddisk', 5);
INSERT INTO barang VALUES ('F239', 'Flashdisk', 21);
```

2. Menampilkan semua dari tabel barang

```sql
SELECT * FROM barang;
```

3. Menampilkan nama barang dan stok yang kode barangnya diawali dengan huruf ‘M’

```sql
SELECT nama_barang, stok FROM barang WHERE kode_barang LIKE 'M%';
```

4. Menampilkan semua yang nama barangnya diakhiri dengan huruf ‘k’

```sql
SELECT * FROM barang WHERE nama_barang LIKE '%k';
```

5. Merubah stok menjadi 30 yang kode barangnya M123

```sql
UPDATE barang SET stok = 30 WHERE kode_barang = 'M123';
```

6. Menambahkan kolom harga pada tabel barang, kemudian tambahkan masing-masing nilai harganya

```sql
ALTER TABLE barang ADD COLUMN harga integer;
UPDATE barang SET harga = 1000000 WHERE kode_barang = 'M753';
UPDATE barang SET harga = 200000 WHERE kode_barang = 'M142';
UPDATE barang SET harga = 150000 WHERE kode_barang = 'M123';
UPDATE barang SET harga = 500000 WHERE kode_barang = 'H789';
UPDATE barang SET harga = 100000 WHERE kode_barang = 'F239';
```

7. Menghapus dari tabel barang yang nama barangnya mengandung huruf ‘b’

```sql
DELETE FROM barang WHERE nama_barang LIKE '%b%';
```

8. Menampilkan kode barang dan nama barang yang harganya lebih dari 500.000

```sql
SELECT kode_barang, nama_barang FROM barang WHERE harga > 500000;
```

9. Merubah stok menjadi bertambah 5 yang stoknya kurang dari 10

```sql
UPDATE barang SET stok = stok + 5 WHERE stok < 10;
```

10. Menampilkan semua dari tabel barang

```sql
SELECT * FROM barang;
```
