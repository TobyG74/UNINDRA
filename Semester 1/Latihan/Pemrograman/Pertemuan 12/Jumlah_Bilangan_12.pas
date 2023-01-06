program jumlah_bilangan;
uses crt;

var i, n, jumlah: integer;

begin
    clrscr;
    writeln('=====================');
    writeln('   Jumlah Bilangan   ');
    writeln('=====================');
    write('Masukan Bilangan : ');
    readln(n);
    jumlah := 0;
    for i := 1 to n do
        begin
            write(i, ' ');
            jumlah := jumlah + i;
        end;
    writeln;
    writeln('Jumlah seluruh angka : ', jumlah);
    readln;
end.
