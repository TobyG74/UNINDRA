program nested_loop;
uses crt;
var i,j,x,y: integer;

begin
    clrscr;
    writeln('Masukkan Jumlah Baris : '); read(i);
    writeln('Masukkan jumlah kolom : '); read(j);

    for x := 1 to i do
        begin
        for y := 1 to j do
            begin
                write('o');
                write('x');
            end;
            writeln(' ');
        end;
    readln;
end.