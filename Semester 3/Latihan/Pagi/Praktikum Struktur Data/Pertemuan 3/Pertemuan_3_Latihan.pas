program Pertemuan_3_Latihan;
uses crt;

type dataMahasiswa = record
    nim: string;
    nama: string;
    usia: string;
    saudara: string;
end;

var data: array [1..100] of dataMahasiswa;
    i, jumlah: integer;

begin
    clrscr;
    // Latihan 1
    write('Banyak data yang akan dimasukkan: '); readln(jumlah);
    for i := 1 to jumlah do
    with data[i] do
    begin
        writeln('Data ke-', i);
        write('NIM: '); readln(nim);
        write('Nama: '); readln(nama);
        write('Usia: '); readln(usia);
        write('Jumlah Saudara: '); readln(saudara);
        writeln;
    end;
    // Latihan 2
    writeln('Data yang anda masukkan: ');
    writeln('  NIM         Nama          Usia        Jumlah Saudara');
    for i := 1 to jumlah do
    with data[i] do
    begin
        write(nim:4, nama:12, usia:14, saudara:16);
        writeln;
    end;
    readln; 
end.
