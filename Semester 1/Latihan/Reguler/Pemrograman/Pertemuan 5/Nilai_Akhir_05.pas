program menghitung_nilai_akhir;
uses crt;

var nama, npm: string;
    keterangan: char;
    tugas, uas, uts: integer;
    akhir: real;

procedure input_data_mahasiswa;
begin
    clrscr;
    textcolor(12);
    writeln('===================');
    writeln('   Data Mahasiswa  ');
    writeln('===================');
    writeln;
    write('Masukkan Nama : '); readln(nama);
    write('Masukkan NPM : '); readln(npm);
    writeln;
    writeln('Tekan "Enter" Untuk Melanjutkan');
    readln;
end;

procedure input_nilai_mahasiswa;
begin
    clrscr;
    textcolor(13);
    writeln('==========================');
    writeln('      Nilai Mahasiswa     ');
    writeln('==========================');
    writeln;
    write('Masukkan Nilai Tugas : '); readln(tugas);
    write('Masukkan Nilai UTS : '); readln(uts);
    write('Masukkan Nilai UAS : '); readln(uas);
    akhir := (0.20 * tugas) + (0.30 * uts) + (0.50 * uas);
    if (akhir >= 91) and (akhir <= 100) then
        keterangan := 'A'
    else if (akhir >= 76) and (akhir <= 90.99) then
        keterangan := 'B'
    else if (akhir >= 61) and (akhir <= 75.99) then
        keterangan := 'C'
    else if (akhir >= 41) and (akhir <= 60.99) then
        keterangan := 'D'
    else if (akhir >= 0) and (akhir <= 40.99) then
        keterangan := 'E';
    writeln;
    writeln('Tekan "Enter" Untuk Melanjutkan');
    readln;
end;

procedure hasil_data;
begin
    clrscr;
    textcolor(14);
    writeln('=========================');
    writeln('   Hasil Data Mahasiswa  ');
    writeln('=========================');
    writeln('Nama : ', nama);
    writeln('NPM : ', npm);
    writeln('Nilai Tugas : ', tugas);
    writeln('Nilai UTS : ', uts);
    writeln('Nilai UAS : ', uas);
    writeln('Nilai Akhir : ', akhir:2:2);
    writeln('Nilai Huruf : ', keterangan);
    if (akhir >= 70) then
        writeln('Selamat anda dinyatakan lulus')
    else 
        writeln('Maaf, anda dinyatakan tidak lulus');
    readln;
end;

begin
    input_data_mahasiswa;
    input_nilai_mahasiswa;
    hasil_data;
end.
