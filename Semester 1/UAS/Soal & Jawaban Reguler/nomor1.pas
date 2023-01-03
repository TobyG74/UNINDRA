program nomor1_uas;
uses crt;

var a, b, sisa: integer;
    hasil: real;

begin
    clrscr;
    write('Input Sebuah Angka : '); readln(b);
    writeln('=======================');
    a := 1;
    while (a <= 10) do
    begin
        hasil := b / a;
        sisa := b mod a;
        writeln('14 : ', a, ' = ', round(hasil), ' sisa ', sisa);
        a := a + 1;
    end;
    readln;
end.
