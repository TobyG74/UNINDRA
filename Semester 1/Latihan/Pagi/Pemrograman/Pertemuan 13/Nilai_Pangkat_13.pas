program nilai_pangkat;
uses crt;

var angka1, angka2, hasil, i: integer;

begin
  clrscr;
  writeln('=====================');
  writeln('     Nilai Pangkat   ');
  writeln('=====================');
  write('Input Angka Pertama : ');
  readln(angka1);
  write('Input Angka Kedua : ');
  readln(angka2);
  hasil := 1;
  for i := 1 to angka2 do 
    begin
        hasil := hasil * angka1;
      end;
  writeln('Hasil dari ', angka1, ' pangkat ', angka2, ' adalah ', hasil);
  end.
