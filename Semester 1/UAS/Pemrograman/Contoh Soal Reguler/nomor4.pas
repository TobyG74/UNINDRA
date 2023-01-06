program nomor4;
uses crt;

var a, b, c, baris, kolom: integer;

begin
    clrscr; 
    write('Input jumlah baris : '); readln(baris);
    write('Input jumlah kolom : '); readln(kolom);
    writeln('==============================');
    for a := 1 to baris do
    begin
        if (a mod 2 = 0) then
        begin
            for b := 1 to kolom do
            begin
                if (b mod 2 = 0) then write('X ')
                else write('O ');
            end;
        end
        else
        begin
            for c := 1 to kolom do
            begin
                if (c mod 2 <> 0) then write('X ')
                else write('O ');
            end;
        end;
        writeln;
    end;
    readln;
end.
