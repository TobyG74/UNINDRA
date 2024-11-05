program Nomor4;
uses crt;

var a, b, baris, kolom: integer;

begin
    clrscr;
    write('Input jumlah baris : '); readln(baris);
    write('Input jumlah kolom : '); readln(kolom);
    writeln('==============================');
    for a := 1 to baris do
    begin
        for b := 1 to kolom do
        begin
            if (a mod 2 = 0) and (b mod 2 = 0) then write('X ')
            else if (a mod 2 = 1) and (b mod 2 = 1) then write('X ')
            else write('O ');
        end;
        writeln;
    end;
    readln;
end.