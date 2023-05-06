program inputAngka;

var
  arr: array of Integer;
  n, i: Integer;

begin
  Write('Masukkan jumlah elemen ');
  Readln(n);

  SetLength(arr, n);

  for i := 0 to n-1 do
  begin
    Write('Masukkan elemen ke-', i+1, ': ');
    Readln(arr[i]);
  end;

  WriteLn('Elemen-elemen array adalah:');

  for i := 0 to n-1 do
  begin
    WriteLn(arr[i]);
  end;

end.
