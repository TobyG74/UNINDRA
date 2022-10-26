program segitiga_angka_lt2;
uses crt;

var i, j, angka: integer;

{ BERURUT KIRI KE KANAN }
begin
    clrscr;
    writeln('=============================');
    writeln('     SEGITIGA ANGKA LT 2     ');
    writeln('=============================');
    write('Input Angka : ');
    readln(angka);
    for i := angka downto 1 do
    begin
        for j := angka downto i do
        begin
            write(j, ' ');
        end;
        writeln;
    end;
end.
