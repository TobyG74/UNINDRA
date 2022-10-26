program kelipatan2;
uses crt;

var i, n: integer;


begin
    clrscr;
    n := 50;
    writeln('Kelipatan 2 - ', n * 2);
    for i := 1 to n do
        begin
            write(i * 2, ' ');
        end;
    readln;
end.
