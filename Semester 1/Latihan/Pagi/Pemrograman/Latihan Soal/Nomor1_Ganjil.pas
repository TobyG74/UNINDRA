program ganjil_luas_lingkaran;
uses crt;
var r: integer;
    luas: real;

begin
    clrscr;
    write('Input Jari-Jari : '); readln(r);
    luas := 3.14 * r * r;
    writeln('Luas Segitiga : ', luas:0:2);
    readln;
end.
