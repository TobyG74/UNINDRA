program Nomor3;
uses crt;

var baris, a, b: integer;

begin
    clrscr;
    write('Input jumlah baris : '); readln(baris);
    for a := baris downto 1 do
    begin
        for b := a to baris do
        begin
            if (b mod 2 <> 0) then write('X ')
            else write('O ');
        end;
        writeln;
    end;
    readln;
end.