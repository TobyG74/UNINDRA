program konvesi_celcius;
uses crt;

var celcius, pilih: integer;
    hasil: real;
    
begin
    clrscr;
    writeln('[1] Celcius ke Reamur');
    writeln('[2] Celcius ke Fahrenheit');
    writeln('[3] Celcius ke Kelvin');
    writeln('[4] Exit');
    write('Pilih Konversi [1/2/3/4] : ');
    readln(pilih);
    { SIMPLE IF STATEMENT }
    if (pilih = 1) then
        begin
            { CELCIUS KE REAMUR }
            clrscr;
            write('Masukkan Suhu Celcius : ');
            readln(celcius);
            hasil := 4/5 * celcius;
            writeln('Hasil : ', hasil:2:2, ' Reamur');
            readln;
        end
    else if (pilih = 2) then
        begin
            { CELCIUS KE FAHRENHEIT }
            clrscr;
            write('Masukkan Suhu Celcius : ');
            readln(celcius);
            hasil := (celcius * 1.8) + 32;
            writeln('Hasil : ', hasil:2:2, ' Fahrenheit');
            readln;
        end
    else if (pilih = 3) then
        begin
            { CELCIUS KE KELVIN }
            clrscr;
            write('Masukkan Suhu Celcius : ');
            readln(celcius);
            hasil := celcius + 273;
            writeln('Hasil : ', hasil:0:0, ' Kelvin');
            readln;
        end
    else if (pilih = 4) then
        exit
    else
        writeln('Pilihan tersebut tidak ada!');
end.
