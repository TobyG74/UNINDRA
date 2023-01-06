program menentukan_besar_kecil;
uses crt;

var angka1, angka2: real;

begin
    clrscr;
    textcolor(12);
    writeln('===========================');
    writeln('   Menentukan Besar Kecil  ');
    writeln('===========================');
    writeln;
    write('Masukkan Angka Pertama : ');
    readln(angka1);
    write('Masukkan Angka Kedua : ');
    readln(angka2);
    clrscr;
    textcolor(14);
    writeln('=============================');
    writeln('            HASIL            ');
    writeln('=============================');
    writeln;
    if (angka1 > angka2) then
        writeln(angka1:2:2, ' Lebih Besar dari ', angka2:2:2)
    else if (angka1 < angka2) then
        writeln(angka1:2:2, ' Lebih Kecil dari ', angka2:2:2)
    else if (angka1 = angka2) then
        writeln(angka1:2:2, ' Sama Besar dengan ', angka2:2:2);
    readln;
end.
