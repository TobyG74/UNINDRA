program Pertemuan_4;
uses crt;

type data = record
        nama: string;
        npm: string;
        kelas: string;
    end;
    pointerMahasiswa = ^data;

var mahasiswa: array of pointerMahasiswa;
    i, jumlah: integer;

begin
    clrscr;
    write('Masukkan jumlah mahasiswa: '); readln(jumlah);
    setLength(mahasiswa, jumlah);
    writeln;
    writeln('-- Input Data --');
    for i := 1 to jumlah do
    begin
        new(mahasiswa[i]);
        write('Masukkan nama ke-', i, '  : '); readln(mahasiswa[i]^.nama);
        write('Masukkan npm ke-', i, '   : '); readln(mahasiswa[i]^.npm);
        write('Masukkan kelas ke-', i, ' : '); readln(mahasiswa[i]^.kelas);
        writeln;
    end;
    writeln('-- Data Mahasiswa --');
    for i := 1 to jumlah do
    begin
        writeln('Nama ke-', i, '  : ', mahasiswa[i]^.nama);
        writeln('NPM ke-', i, '   : ', mahasiswa[i]^.npm);
        writeln('Kelas ke-', i, ' : ', mahasiswa[i]^.kelas);
        dispose(mahasiswa[i]);
        writeln;
    end;
    readln;
end.
