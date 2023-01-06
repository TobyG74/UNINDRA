program nomor4;
uses crt;

var a, b: integer;

begin
    clrscr;
    for a := 1 to 3 do
    begin
        for b := 1 to 5 do
        begin
            if (a mod 2 = 0) and (b mod 2 = 0) then write('X ')
            else if (a mod 2 = 1) and (b mod 2 = 1) then write('X ')
            else write('O ');
        end;
        writeln;
    end;
    readln;
end.