program Nomor3;
uses crt;

var a, b, genap, ganjil: integer;

begin
    clrscr;
    write('Input batasan angka : '); readln(b);
    writeln('============================');
    write('Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari 20 adalah : ');
    for a := 1 to b do
    begin
        if (a mod 3 = 0) or (a mod 5 = 0) then
        begin
            write(a, ' ');
            if (a mod 2 = 0) then
            begin
                genap := genap + 1;
            end
            else
            begin
                ganjil := ganjil + 1;
            end;
        end;
    end;
    writeln;
    writeln('Jumlah angka genap : ', genap);
    writeln('Jumlah angka ganjil : ', ganjil);
    readln;
end.
