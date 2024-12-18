program Nomor4;
uses crt;

var data: array [1..4] of integer;
    i: integer;

begin
    clrscr;
    for i := 1 to 4 do
    begin
        write('Input Bilangan ke-',i,' : '); readln(data[i]);
    end;
    writeln('================================');
    for i := 1 to 4 do write(data[i], ' ');
    readln;
end.