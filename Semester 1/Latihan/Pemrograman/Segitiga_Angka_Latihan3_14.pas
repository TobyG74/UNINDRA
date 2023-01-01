program segitiga_angka_latihan3;
uses crt;
var baris, kolom: byte;

begin
    clrscr;
    for baris := 5 downto 1 do
    begin
        for kolom := baris downto 1 do
        begin
            write(kolom, ' ');
        end;
        writeln;
    end;
    readln;
end.
