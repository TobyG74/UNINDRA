program rumus_persegi;
uses crt;

var sisi, hasil: integer;

// MENYIMPAN HASIL PERKALIAN KE VARIABLE RESULT
procedure hitung(s: integer; var result: integer);
begin
    result := s * s;
end;

begin
    clrscr;
    write('Masukkan Sisi : '); readln(sisi);
    // NILAI DARI VARIABLE RESULT DI SIMPAN KE VARIABLE HASIL
    hitung(sisi, hasil);
    writeln('Luas Persegi : ', hasil);
    readln;
end.
