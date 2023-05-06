program array_1d;
uses crt;
var
  arr: array[1..5] of Integer;
  i: Integer;

begin
clrscr;
  WriteLn('Program Array 1 Dimensi');

  for i := 1 to 5 do
  begin
    Write('Masukkan angka ke-', i, ': ');
    Readln(arr[i]);
  end;

    WriteLn('Angka-angka yang dimasukkan adalah: ');
  for i := 1 to 5 do
  begin
    WriteLn(arr[i]);
  end;

end.
