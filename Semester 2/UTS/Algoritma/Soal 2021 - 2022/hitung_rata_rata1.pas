program hitung_rata_rata1;

uses crt;

var
  bilangan: array[1..5] of integer;
  i, total: integer;
  rata_rata: real;

begin
  // mengisi nilai pada Array 1 Dimensi
  for i := 1 to 5 do
  begin
    write('Masukkan bilangan ke-', i, ': ');
    readln(bilangan[i]);
  end;

  // menghitung total nilai
  total := 0;
  for i := 1 to 5 do
  begin
    total := total + bilangan[i];
  end;

  // menghitung rata-rata nilai
  rata_rata := total / 5;

  // menampilkan hasil perhitungan
  writeln('Total bilangan: ', total);
  writeln('Rata-rata bilangan: ', rata_rata:0:2);

  readln;
end.
