program rekening_listrik;
uses crt;

var golongan: string[2];
    meter, besar_pemakaian: integer;

begin
    clrscr;
    writeln('================================');
    writeln('        Rekening Listrik        ');
    writeln('================================');
    write('[ ! ] Input Golongan : '); readln(golongan);
    write('[ ! ] Input Meter : '); readln(meter);
    if (golongan = 'S1') or (golongan = 's1') then
        begin
            if (meter <= 20) then
                besar_pemakaian := 200
            else if (meter >= 21) and (meter <= 50) then
                besar_pemakaian := 250
            else if (meter >= 51) and (meter <= 100) then
                besar_pemakaian := 300
            else
                besar_pemakaian := 500;
        end
    else if (golongan = 'S2') or (golongan = 's2') then
        begin
            if (meter <= 20) then
                besar_pemakaian := 300
            else if (meter >= 21) and (meter <= 50) then
                besar_pemakaian := 375
            else if (meter >= 51) and (meter <= 100) then
                besar_pemakaian := 500
            else
                besar_pemakaian := 800;
        end
    else if (golongan = 'R1') or (golongan = 'r1') then
        begin
            if (meter <= 20) then
                besar_pemakaian := 400
            else if (meter >= 21) and (meter <= 50) then
                besar_pemakaian := 525
            else if (meter >= 51) and (meter <= 100) then
                besar_pemakaian := 700
            else
                besar_pemakaian := 1000;
        end
    else if (golongan = 'R2') or (golongan = 'R2') then
        begin
            if (meter <= 20) then
                besar_pemakaian := 500
            else if (meter >= 21) and (meter <= 50) then
                besar_pemakaian := 750
            else if (meter >= 51) and (meter <= 100) then
                besar_pemakaian := 1000
            else
                besar_pemakaian := 1500;
        end
    else
        writeln('[ x ] Golongan ', golongan, ' belum terdaftar!');
    writeln('[ ! ] Rekening Listrik mu sebesar ', besar_pemakaian * meter);
    readln;
end.
