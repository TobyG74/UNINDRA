program nomor2;
uses crt;

var a, b, hasil: integer;

begin
    clrscr;
    write('Input Sebuah Angka : '); readln(b);
    writeln('==========================');
    hasil := 1;
    for a := 1 to b do
    begin
        hasil := hasil * a;
    end;
    writeln(b, ' Faktorial = ', hasil);
    readln;
end.
