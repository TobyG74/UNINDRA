program Nomor1;
uses crt;

var a, b, sisa, hasil: integer;

begin
    clrscr;
    write('Input Sebuah Angka : '); readln(b);
    writeln('=======================');
    a := 1;
    while (a <= 10) do
    begin
        hasil := b div a;
        sisa := b mod a;
        writeln(b, ' : ', a, ' = ', hasil, ' sisa ', sisa);
        a := a + 1;
    end;
    readln;
end.
