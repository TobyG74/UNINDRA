program rumus_luas_segitiga;
uses crt;

var alas, tinggi: integer;
    hasil: real;

// RETURN NILAI KE REAL
function hitung(alas, tinggi: integer): real;
begin
    hitung := (1/2) * alas * tinggi;
end;

begin
    clrscr;
    write('Masukkan Alas : '); readln(alas);
    write('Masukkan Tinggi : '); readln(tinggi);
    // MENYIMPAN NILAI FUNCTION hitung KE VARIABLE hasil
    hasil := hitung(alas, tinggi);
    writeln('Luas Segitiga : ', hasil:2:2);
    readln;
end.
