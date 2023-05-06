program hitung_rata_rata1;

uses crt;

var
  bilangan: array[1..5] of integer;
  i, total: integer;
  rata_rata: real;

begin
  // input nilai
  for i := 1 to 5 do
  begin
    write('Masukkan bilangan ke-', i, ': ');
    readln(bilangan[i]);
  end;

  // hitung total nilai
  total := 0;
  for i := 1 to 5 do
  begin
    total := total + bilangan[i];
  end;

  // hitung rata-rata
  rata_rata := total / 5;

  // print hasil
  writeln('Total bilangan: ', total);
  writeln('Rata-rata bilangan: ', rata_rata:0:2);

  readln;
end.
