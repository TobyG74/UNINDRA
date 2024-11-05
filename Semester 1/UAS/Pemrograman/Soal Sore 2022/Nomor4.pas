program Nomor4;
uses crt;

type data = record 
        angka: integer;
    end;

var arr: array [1..4] of data;
    i, b, hasil: integer;

begin
    clrscr;
    b := 4;
    for i := 1 to b do
    begin
        with arr[i] do
        begin
            write('Input bilangan ke-', i, ' : '); readln(angka)
        end;
    end;
    writeln('======================');
    for i := 1 to b do
    begin
        with arr[i] do
        begin
            hasil := angka * i;
            writeln(angka, ' x ', i, ' = ', hasil);
        end;
    end;
    readln;
end.
