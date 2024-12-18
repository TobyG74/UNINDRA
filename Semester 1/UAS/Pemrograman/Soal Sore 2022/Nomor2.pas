program Nomor2;
uses crt;

var a, b: integer;

begin
    clrscr;
    write('Input batasan angka : '); readln(b);
    for a := 1 to b do
    begin
        if (a mod 3 = 0) and (a mod 5 = 0) then write('kita ')
        else if (a mod 3 = 0) then write('saya ')
        else if (a mod 5 = 0) then write('kamu ')
        else write(a, ' ');
    end;
    readln;
end.