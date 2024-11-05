program segitiga_angka_latihan2;
uses crt;
var baris, kolom: byte;

begin
    clrscr;
    for baris := 5 downto 1 do
    begin
        for kolom := 5 downto baris do
        begin
            write(kolom, ' ');
        end;
        writeln;
    end;
    readln;
end.
