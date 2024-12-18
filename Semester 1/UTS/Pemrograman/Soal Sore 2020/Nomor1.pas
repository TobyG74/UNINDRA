program Nomor1;
uses crt;

var mangga, orang, bagi_mangga, sisa_manga: integer;

begin
    clrscr;
    write('Banyaknya Jumlah Mangga : ');  readln(mangga);
    write('Banyaknya Orang : '); readln(orang);
    writeln('====================================');
    writeln('Hasil Pembagian Mangga Perorangnya');
    writeln('====================================');
    bagi_mangga := mangga div orang;
    sisa_manga := mangga mod orang;
    writeln('Tiap Orang Mendapatkan = ', bagi_mangga);
    writeln('Sisa dari mangga tersebut = ', sisa_manga);
    readln;
end.
