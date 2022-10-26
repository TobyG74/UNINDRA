program volume_balok;
uses crt;

var panjang, alas, tinggi, volume: integer;

begin
    clrscr;
    writeln('=========================');
    writeln(' Menghitung Volume Balok ');
    writeln('=========================');
    write('Masukkan Panjang : ');
    readln(panjang);
    write('Masukkan Alas : ');
    readln(alas);
    write('Masukkan Tinggi : ');
    readln(tinggi);
    volume := panjang * alas * tinggi;
    writeln('Volume Balok : ', volume);
    readln;
end.
