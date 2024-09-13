2. Buat database sesuai nama Anda masing-masing. Contoh : Khairunnisa.db. Tulis perintah SQL (DBMS: sqlite) untuk :

```sql
sqlite3 tobi.db
```

a. Membuat tabel mahasiswa dengan kolom : NPM dan Nama Mahasiswa.

```sql
CREATE TABLE mahasiswa (
    NPM VARCHAR(12) PRIMARY KEY,
    Nama VARCHAR(50)
);
```

b. Menambahkan 5 record ke dalam tabel mahasiswa (Record pertama harus diisi sesuai NPM dan Nama masing-masing).

```sql
INSERT INTO mahasiswa VALUES
('202243502612', 'Tobi'),
('202243502613', 'Rizky'),
('202243502614', 'Dodo'),
('202243502615', 'Ishafakhri'),
('202243502616', 'Zulfahmi');
```

c. Menambahkan kolom Kelas pada tabel mahasiswa dan tambahkan kelas masing-masing mahasiswa.

```sql
ALTER TABLE mahasiswa ADD COLUMN Kelas VARCHAR(5);
UPDATE mahasiswa SET Kelas = 'RPL1' WHERE NPM = '202243502612';
UPDATE mahasiswa SET Kelas = 'RPL2' WHERE NPM = '202243502613';
UPDATE mahasiswa SET Kelas = 'RPL3' WHERE NPM = '202243502614';
UPDATE mahasiswa SET Kelas = 'RPL4' WHERE NPM = '202243502615';
UPDATE mahasiswa SET Kelas = 'RPL5' WHERE NPM = '202243502616';
```

d. Menghapus dari tabel mahasiswa yang kelasnya diawali dengan huruf “R”.

```sql
DELETE FROM mahasiswa WHERE Kelas LIKE 'R%';
```

e. Membuat tabel jenis pembayaran dengan kolom: Kode Pembayaran, Nama Pembayaran, dan Biaya.

```sql
CREATE TABLE jenis_pembayaran (
    Kode_Pembayaran VARCHAR(2) PRIMARY KEY,
    Nama_Pembayaran VARCHAR(50),
    Biaya INT
);
```

f. Menambahkan 5 record pada tabel jenis pembayaran.

```sql
INSERT INTO jenis_pembayaran VALUES
('11', 'SPP', 180000),
('14', 'UTS', 45000),
('26', 'UAS', 60000),
('16', 'Praktikum', 200000),
('05', 'Lab', 50000);
```

g. Menampilkan semua dari tabel jenis pembayaran yang biayanya lebih dari 100.000.

```sql
SELECT * FROM jenis_pembayaran WHERE Biaya > 100000;
```

h. Merubah biaya menjadi bertambah 5000 yang biayanya kurang dari 50.000.

```sql
UPDATE jenis_pembayaran SET Biaya = Biaya + 5000 WHERE Biaya < 50000;
```
