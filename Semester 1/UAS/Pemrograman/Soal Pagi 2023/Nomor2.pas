program Nomor2;
uses crt;

var atas, bawah, kelipatan, total, i: integer;

begin
    clrscr;
    write('Input Kelipatan : '); readln(kelipatan);
    write('Input Batas Bawah : '); readln(bawah);
    write('Input Batas Atas : '); readln(atas);
    writeln('==========================');
    if (bawah mod kelipatan = 0) then
        i := bawah
    else
        i := (bawah div kelipatan) + bawah;
    write('Output : ');
    repeat 
        write(i, ' ');
        total := total + i; 
        i := i + kelipatan;
    until (i > atas);
    writeln;
    writeln('Total : ', total);
    readln;
end.