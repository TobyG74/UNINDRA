program kelipatan_while_do;
uses crt;

var angka, batas, poin_angka: integer;

begin
    clrscr;
    textcolor(12);
    writeln('=======================');
    writeln('   Mencari Kelipatan   ');
    writeln('=======================');
    writeln;
    write('Masukan Angka Kelipatan : ');
    readln(angka);
    write('Masukan Batasan Angka : ');
    readln(batas);
    poin_angka := angka;
    textcolor(14);
    writeln('Bilangan Kelipatan dari ', angka, ' antara 0 - ', batas);
    while (angka <= batas) do
        begin
            write(angka, ' ');
            angka := angka + poin_angka;
        end;
    readln;
end.
