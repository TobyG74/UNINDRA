program diskon_toko;
uses crt;

var jumlah_belanja: longint;
    jumlah_bayar: real;

begin
    clrscr;
    writeln('====================================');
    writeln('             DISKON TOKO            ');
    writeln('====================================');
    write('[ ! ] Input Jumlah Belanja : '); readln(jumlah_belanja);
    if (jumlah_belanja <= 100000) then
        jumlah_bayar := jumlah_belanja - (5/100) * jumlah_belanja
    else if (jumlah_belanja >= 100000) and (jumlah_belanja <= 200000) then
        jumlah_bayar := jumlah_belanja - (7.5/100) * jumlah_belanja
    else if (jumlah_belanja >= 200000) and (jumlah_belanja <= 300000) then
        jumlah_bayar := jumlah_belanja - (10/100) * jumlah_belanja
    else if (jumlah_belanja >= 300000) and (jumlah_belanja <= 400000) then
        jumlah_bayar := jumlah_belanja - (12.5/100) * jumlah_belanja
    else if (jumlah_belanja >= 400000) and (jumlah_belanja <= 500000) then
        jumlah_bayar := jumlah_belanja - (15/100) * jumlah_belanja
    else 
        jumlah_bayar := jumlah_belanja - (20/100) * jumlah_belanja;
    writeln('[ ! ] Total Yang Harus Dibayar : ', round(jumlah_bayar));
    readln;
end.
