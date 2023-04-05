program menentukan_nilai_akhir_mahasiswa;
uses crt;

type data_mahasiswa = record 
        nama, npm: string;
        nilai_tugas, nilai_uts, nilai_uas, nilai_akhir: real;
    end;

var mahasiswa: array [1..100] of data_mahasiswa;
    jumlah_mahasiswa, i: integer;

// MENGHITUNG NILAI AKHIR
function hitungNilai(tugas, uts, uas: real): real;
begin
    hitungNilai := (0.20 * tugas) + (0.30 * uts) + (0.50 * uas);
end;

// INPUT DATA MAHASISWA KE ARRAY
procedure inputData;
begin
    for i :=1 to jumlah_mahasiswa do
    begin
        with mahasiswa[i] do
        begin
            writeln('Mahasiswa ke-', i);
            write('Masukkan Nama : '); readln(nama);
            write('Masukkan NPM : '); readln(npm);
            write('Masukkan Nilai Tugas : '); readln(nilai_tugas);
            write('Masukkan Nilai UTS : '); readln(nilai_uts);
            write('Masukkan Nilai UAS : '); readln(nilai_uas);
            // MENGHITUNG NILAI AKHIR MENGGUNAKAN FUNCTION
            nilai_akhir := hitungNilai(nilai_tugas, nilai_uts, nilai_uas);
        end;
    end;
end;

// PRINT DATA MAHASISWA DARI ARRAY
procedure printData;
begin
    clrscr;
    writeln('=====================================================================');
    writeln('| NO |      NAMA      |          NPM           |     NILAI AKHIR    |');
    writeln('=====================================================================');
    for i :=1 to jumlah_mahasiswa do
    begin
        with mahasiswa[i] do
        begin
            gotoxy(4,3+i); write(i);
            gotoxy(12,3+i); write(nama);
            gotoxy(32,3+i); write(npm);
            gotoxy(56,3+i); write(nilai_akhir:0:2);
        end;
    end;
    writeln;
    writeln('=====================================================================');
end;

begin
    clrscr;
    write('Masukkan Jumlah Mahasiswa : '); readln(jumlah_mahasiswa);
    // MENJALANKAN PROCEDURE INPUT
    inputData;
    // MENJALANKAN PROCEDURE PRINT SETELAH PROCEDURE INPUT
    printData;
    readln;
end.
