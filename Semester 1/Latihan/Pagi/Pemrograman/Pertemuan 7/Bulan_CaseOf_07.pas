program case_of_bulan;
uses crt;

var bulan: array [1..12] of string;
    i, select: integer;

begin
    clrscr;
    bulan[1] := 'Januari'; bulan[2] := 'Februari'; bulan[3] := 'Maret';
    bulan[4] := 'April'; bulan[5] := 'Mei'; bulan[6] := 'Juni';
    bulan[7] := 'Juli'; bulan[8] := 'Agustus'; bulan[9] := 'September';
    bulan[10] := 'Oktober'; bulan[11] := 'November'; bulan[12] := 'Desember';
    textcolor(12);
    writeln('LIST BULAN');
    for i := 1 to length(bulan) do writeln(i, '. ', bulan[i]);
    textcolor(13);
    write('Masukkan Angka (1 - 12) : ');
    readln(select);
    writeln;
    case select of 
        1: writeln('Bulan ke 1 adalah : ', bulan[1]);
        2: writeln('Bulan ke 2 adalah : ', bulan[2]);
        3: writeln('Bulan ke 3 adalah : ', bulan[3]);
        4: writeln('Bulan ke 4 adalah : ', bulan[4]);
        5: writeln('Bulan ke 5 adalah : ', bulan[5]);
        6: writeln('Bulan ke 6 adalah : ', bulan[6]);
        7: writeln('Bulan ke 7 adalah : ', bulan[7]);
        8: writeln('Bulan ke 8 adalah : ', bulan[8]);
        9: writeln('Bulan ke 9 adalah : ', bulan[9]);
        10: writeln('Bulan ke 10 adalah : ', bulan[10]);
        11: writeln('Bulan ke 11 adalah : ', bulan[11]);
        12: writeln('Bulan ke 12 adalah : ', bulan[12]);
    else
        writeln('Angka yang anda masukan tidak valid');
    end;
    readln;
end.
