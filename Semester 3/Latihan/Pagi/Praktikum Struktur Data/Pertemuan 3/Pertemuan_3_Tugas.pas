program Pertemuan_3_Tugas;
uses crt;

type dataMahasiswa = record
    nim, nama, grade: string;
    tugas, uts, uas, akhir: real;
end;

var i, jumlah: integer;
    data: array of dataMahasiswa;

begin
    clrscr;
    write('Masukkan jumlah mahasiswa: '); readln(jumlah);
    setlength(data, jumlah);
    writeln('----------------------------------------------------------------------------------');
    for i := 0 to jumlah - 1 do
    begin
        with data[i] do
        begin
            writeln('Mahasiswa ke-', i + 1);
            write('Masukkan NIM: '); readln(nim);
            write('Masukkan Nama: '); readln(nama);
            write('Masukkan Nilai Tugas: '); readln(tugas);
            write('Masukkan Nilai UTS: '); readln(uts);
            write('Masukkan Nilai UAS: '); readln(uas);
            akhir := (tugas * 0.2) + (uts * 0.3) + (uas * 0.5);
            if (akhir >= 80) then
                grade := 'A'
            else if (akhir >= 70) then
                grade := 'B'
            else if (akhir >= 60) then
                grade := 'C'
            else if (akhir >= 50) then
                grade := 'D'
            else
                grade := 'E';
            writeln;
        end;
    end;
    writeln('----------------------------------------------------------------------------------');
    writeln('NIM':10, 'Nama':20, 'Tugas':10, 'UTS':10, 'UAS':10, 'Akhir':10, 'Grade':10);
    writeln('----------------------------------------------------------------------------------');
    for i := 0 to jumlah - 1 do
    begin
        with data[i] do
        begin
            writeln(nim:10, nama:20, tugas:10:2, uts:10:2, uas:10:2, akhir:10:2, grade:8);
        end;
    end;
    readln;
end.
