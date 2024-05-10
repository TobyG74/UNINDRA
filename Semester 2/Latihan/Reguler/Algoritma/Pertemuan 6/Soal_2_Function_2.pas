program menentukan_ganjil_genap;
uses crt;

var angka: integer;
    hasil: string;

// RETURN NILAI KE STRING
function hitung(a: integer): string;
begin
    if (a mod 2 = 0) then hitung := 'genap'
    else hitung := 'ganjil';   
end;

begin
    clrscr;
    write('Masukkan Angka : '); readln(angka);
    // MENYIMPAN NILAI DARI FUNCTION hitung KE VARIABLE hasil
    hasil := hitung(angka);
    if (hasil = 'genap') then writeln('Angka yang anda masukkan merupakan bilangan genap')
    else writeln('Angka yang anda masukkan merupakan bilangan ganjil');
    readln;
end.
