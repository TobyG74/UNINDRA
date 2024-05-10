program kelipatan_angka;
uses crt;

var angka, angka2, batasan_angka: integer;

begin
    clrscr;
    writeln('==============================================');
    writeln('               Kelipatan Angka                ');
    writeln('==============================================');
    write('Input angka kelipatan yang diinginkan : '); readln(angka);
    write('Input batasan angka yang ingin ditampilkan : '); readln(batasan_angka);
    angka2 := angka;
    writeln('Bilangan kelipatan ', angka, ' antara 0 - ', batasan_angka);
    while (angka <= batasan_angka) do
    begin
        write(angka, ' ');
        angka := angka + angka2;
    end;
    readln;
end.
