program cicilan_motor;
uses crt;

var dp_motor, cicilan_tahun, cicilan_bulan: real;
    harga_motor: longint;

begin
    clrscr;
    writeln('===========================');
    writeln('       CICILAN MOTOR       ');
    writeln('===========================');
    write('[ ! ] Input Harga Motor : '); readln(harga_motor);
    dp_motor := 0.10 * harga_motor;
    cicilan_tahun := harga_motor - dp_motor;
    cicilan_bulan := cicilan_tahun / 12;
    writeln('[ ! ] DP 10% : ', dp_motor:0:0);
    writeln('[ ! ] Cicilan per Tahun : ', cicilan_tahun:0:0);
    writeln('[ ! ] Cicilan per Bulan : ', cicilan_bulan:0:0);
    readln;
end.
