program Nomor1;
uses crt;

var a, b, c: integer;

begin
    clrscr;
    write('Input Sebuah angka : '); readln(b);
    a := 1;
    while (a <= 10) do
    begin
        c := b * a;
        writeln(b, ' x ', a, ' = ', c);
        a := a + 1;
    end;
    readln;
end.