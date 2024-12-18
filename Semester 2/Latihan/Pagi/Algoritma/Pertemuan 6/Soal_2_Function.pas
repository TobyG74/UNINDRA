program menentukan_bulan;
uses crt;

var bulan: array [1..12] of string = ('Januari', 'Februari', 'Maret', 'April', 'Mei', 'Juni', 'Juli', 'Agustus', 'September', 'Oktober', 'November', 'Desember');
    angka: integer;
    hasil: string;

// RETURN NILAI KE STRING
function tentukanBulan(b: integer): string;
begin
    if (b > 12) then tentukanBulan := 'null'
    else tentukanBulan := bulan[b];
end;

begin
    clrscr;
    write('Masukkan Angka : '); readln(angka);
    // MENYIMPAN NILAI FUNCTION hitung KE VARIABLE hasil
    hasil := tentukanBulan(angka);
    if (hasil = 'null') then writeln('Maksimal Angka 12!')
    else writeln('Bulan ke-', angka, ' adalah ', hasil);
    readln;
end.
