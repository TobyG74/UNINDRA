2. Buat database sesuai nama Anda masing-masing. Contoh: Khairunnisa.db [Bobot: 40] Tulis perintah SQL (DBMS: sqlite) untuk:

a. Membuat tabel mahasiswa dengan kolom: NPM, Nama Mahasiswa, dan Kelas

```sql
CREATE TABLE mahasiswa (
    NPM VARCHAR(12) PRIMARY KEY,
    Nama VARCHAR(50),
    Kelas VARCHAR(10)
);
```

b. Menambahkan 5 record ke dalam tabel mahasiswa (Record pertama harus diisi sesuai NPM dan Nama masing-masing)

```sql
INSERT INTO mahasiswa VALUES
('202243502612', 'Tobi', 'R37'),
('202243502613', 'Rizky', 'R37'),
('202243502614', 'Ishafakhri', 'R37'),
('202243502615', 'Ridwan', 'R37'),
('202243502616', 'Zulfahmi', 'R37');
```

c. Menampilkan nama dan kelas dari tabel mahasiswa yang namanya mengandung huruf p atau m.

```sql
SELECT Nama, Kelas
FROM mahasiswa
WHERE Nama LIKE '%p%' OR Nama LIKE '%m%';
```

d. Membuat tabel mata kuliah dengan kolom: Kode Mata Kuliah dan Nama Mata Kuliah

```sql
CREATE TABLE mata_kuliah (
    Kode_Mata_Kuliah VARCHAR(10) PRIMARY KEY,
    Nama_Mata_Kuliah VARCHAR(50)
);
```

e. Menambahkan 5 record ke dalam tabel mata kuliah

```sql
INSERT INTO mata_kuliah VALUES
('KK43H319', 'Statistika Dasar'),
('KK43H330', 'Pemrograman'),
('KK43H331', 'Bahasa Inggris'),
('KK43H339', 'Praktikum Struktur Data'),
('KK43H340', 'Struktur Data');
```

f. Menambahkan kolom SKS pada tabel mata kuliah dan tambahkan SKS masing-masing mata kuliah.

```sql
ALTER TABLE mata_kuliah
ADD COLUMN SKS INT;
```

```sql
UPDATE mata_kuliah
SET SKS = CASE
    WHEN Kode_Mata_Kuliah = 'KK43H319' THEN 3
    WHEN Kode_Mata_Kuliah = 'KK43H330' THEN 3
    WHEN Kode_Mata_Kuliah = 'KK43H331' THEN 4
    WHEN Kode_Mata_Kuliah = 'KK43H339' THEN 2
    WHEN Kode_Mata_Kuliah = 'KK43H340' THEN 3
END;
```

g. Menghapus dari tabel mata kuliah yang sksnya lebih dari 3.

```sql
DELETE FROM mata_kuliah WHERE SKS > 3;
```

h. Membuat tabel penilaian dengan kolom: NPM, Kode Mata Kuliah, Nilai Tugas, Nilai UTS, dan Nilai UAS

```sql
CREATE TABLE penilaian (
    NPM VARCHAR(12),
    Kode_Mata_Kuliah VARCHAR(10),
    Nilai_Tugas INT,
    Nilai_UTS INT,
    Nilai_UAS INT,
    PRIMARY KEY (NPM, Kode_Mata_Kuliah),
    FOREIGN KEY (NPM) REFERENCES mahasiswa(NPM),
    FOREIGN KEY (Kode_Mata_Kuliah) REFERENCES mata_kuliah(Kode_Mata)
);
```
