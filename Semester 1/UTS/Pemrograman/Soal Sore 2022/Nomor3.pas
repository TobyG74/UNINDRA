program Nomor3;
uses crt;

var total, lama_pinjam: longint;
    besaran: real;

begin
    clrscr;
    write('Total Pinjaman : '); readln(total);
    write('Lama Pinjam (bulan) : '); readln(lama_pinjam);
    besaran := total / lama_pinjam;
    writeln('Besaran Angsuran per bulan : ', round(besaran));
    readln;
end.
