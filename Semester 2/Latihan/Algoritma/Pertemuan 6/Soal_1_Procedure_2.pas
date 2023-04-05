program rumus_luas_persegi_panjang;
uses crt;

var panjang, lebar: integer;

// MENYIMPAN HASIL PERKALIAN KE VARIABLE RESULT
procedure hitung(p, l: integer);
var result: integer;
begin
    result := p * l;
    writeln('Luas Persegi Panjang : ', result);
end;

begin
    clrscr;
    write('Masukkan Panjang : '); readln(panjang);
    write('Masukkan Lebar : '); readln(lebar);
    // NILAI DARI PANJANG & LEBAR DIMASUKAN KEDALAM PROCEDURE
    hitung(panjang, lebar);
    // BAGIAN PROGRAM SELANJUTNYA DIJALANKAN OLEH PROCEDURE
    readln;
end.
