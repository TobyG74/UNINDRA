program Pertemuan_2_Tugas_1.pas;
uses crt;

var jumlah, i: integer;
    data: array [1..100] of integer;

begin
    clrscr;
    write('Masukkan jumlah data: '); readln(jumlah);
    writeln('------------------------------');
    for i := 1 to jumlah do
    begin
        write('Masukkan Nilai ', i, ': '); readln(data[i]);
    end;
    writeln('------------------------------');
    writeln('Data yang anda masukan: ');
    for i := 1 to jumlah do
    begin
        writeln('Nilai ', i, ': ', data[i]);
    end;
    readln;
end.
