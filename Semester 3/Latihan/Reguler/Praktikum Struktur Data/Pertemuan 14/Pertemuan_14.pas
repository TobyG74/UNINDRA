program Pertemuan_14;
uses crt;

const MAX_ARRAY = 100;

var data: array[1..MAX_ARRAY] of integer;
    i, j, n, max, temp: integer;

begin
    clrscr;
    writeln('---=== PROGRAM SELECTION MAXIMUM DESCENDING ===---');
    writeln('Nama     : Tobi Saputra');
    writeln('NPM      : 202243502612');
    writeln('No Absen : 17');
    writeln('---------------------------------------------------');
    write('Masukkan Panjang Array : '); readln(n);
    for i := 1 to n do
    begin
        write('Masukkan Data Ke-',i,' : '); readln(data[i]);
    end;
    writeln('Data Sebelum Diurutkan : ');
    for i := 1 to n do
    begin
        write(data[i],' ');
    end;
    writeln;

    // Proses Pengurutan
    for i := 1 to n - 1  do
    begin
        max := i;
        for j := i + 1 to n dopa
        begin
            if data[j] > data[max] then
            begin
                max := j;
            end;
        end;
        temp := data[i];
        data[i] := data[max];
        data[max] := temp;
    end;

    writeln('Data Setelah Diurutkan : ');
    for i := 1 to n do
    begin
        write(data[i],' ');
    end;
    readln;
end.