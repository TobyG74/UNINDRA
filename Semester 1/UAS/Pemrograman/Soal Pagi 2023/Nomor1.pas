program Nomor1;
uses crt;

var angka, i: integer;

begin
    clrscr;
    write('Masukkan sebuah angka: '); readln(angka);
    writeln('=============================');
    for i := 1 to 10 do
    begin
        if (i mod 2 <> 0) then
            writeln(angka, ' : ', i, ' = ', angka div i, ' sisa ', angka mod i)
        else
            writeln(angka, ' * ', i, ' = ', angka * i);
    end;
    readln;
end.