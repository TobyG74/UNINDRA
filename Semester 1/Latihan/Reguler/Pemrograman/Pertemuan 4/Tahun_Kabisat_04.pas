program tahun_kabisat;
uses crt;

var tahun: integer;
    result: real;

begin
    clrscr;
    textcolor(12);
    writeln('============================');
    writeln('  Menentukan Tahun Kabisat  ');
    writeln('============================');
    writeln;
    textcolor(14);
    write('Input Tahun : ');
    readln(tahun);
    result := tahun mod 4;
    clrscr;
    if (result = 0) then
        writeln('Tahun ', tahun, ' merupakan Tahun Kabisat')
    else 
        writeln('Tahun ', tahun, ' bukan merupakan Tahun Kabisat');
    readln;
end.
