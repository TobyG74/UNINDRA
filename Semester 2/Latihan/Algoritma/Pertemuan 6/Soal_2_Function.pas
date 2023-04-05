program rumus_luas_segitiga;
uses crt;

var alas, tinggi: integer;
    hasil: real;

// MENYIMPAN HASIL DARI RUMUS KE VARIABLE RESULT
function hitung(alas, tinggi: integer): real;
begin
    hitung := (1/2) * alas * tinggi;
end;

begin
    clrscr;
    write('Masukkan Alas : '); readln(alas);
    write('Masukkan Tinggi : '); readln(tinggi);
    // NILAI DARI ALAS & TINGGI DIPROSES OLEH FUNCTION
    hasil := hitung(alas, tinggi);
    writeln('Luas Segitiga : ', hasil:2:2);
    readln;
end.
