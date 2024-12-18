program nilai_tinggi_rendah;
uses crt;

var i, jumlah: integer;
  total, nilai, rendah, tinggi: real;

begin
  clrscr;
  textcolor(12);
  writeln('======================');
  writeln('   Menentukan Nilai   ');
  writeln('======================');
  total := 0;
  write('Masukan Jumlah Data : '); readln(jumlah);
  for i := 1 to jumlah do
    begin
        write('Masukan Nilai : '); readln(nilai);
        if (i = 1) then
          begin
            rendah := nilai;
            tinggi := nilai;
            end
        else
            begin
                if (nilai > tinggi) then
                  tinggi := nilai;
                if (nilai < rendah) then
                  rendah := nilai;
            end;
        total := total + nilai;
      end;
    clrscr;
    textcolor(13);
    writeln('=====================');
    writeln('   Hasil Penentuan   ');
    writeln('=====================');
    writeln('Nilai Tertinggi : ', tinggi:0:2);
    writeln('Nilai Terendah : ', rendah:0:2);
    writeln('Rata-Rata : ', (total / jumlah):0:2);
end.
