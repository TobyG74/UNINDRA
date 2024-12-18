program Nomor4;
uses crt;

var a, b, c: integer;

begin
    clrscr;
    write('Input Bilangan : '); readln(b);
    writeln('Bilangan yang merupakan kelipatan 3 atau 5 adalah : ');
    a := 1;
    while (a < b) do
    begin
        if (a mod 3 = 0) or (a mod 5 = 0) then
        begin
            write(a, ' ');
            c := c + a;
        end;
        a := a + 1;
    end;
    writeln;
    writeln('Jumlah seluruh bilangan : ', c);
    readln;
end.
