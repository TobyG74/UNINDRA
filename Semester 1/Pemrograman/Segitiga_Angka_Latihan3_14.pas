program segitiga_angka_lt3;
uses crt;

var i, j, angka: integer;

begin
  clrscr;
  writeln('=============================');
  writeln('     SEGITIGA ANGKA LT 3     ');
  writeln('=============================');
  write('Input Angka : ');
  readln(angka);
  for i := angka downto 1 do
  begin
    for j := i downto 1 do
    begin
      write(j, ' ');
    end;
    writeln;
  end;
end.
