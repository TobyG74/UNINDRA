program ArrayDuaDimensi;
uses crt;
const
  baris = 2; 
  kolom = 2; 

var
  arr: array[1..baris, 1..kolom] of Integer;
  i, j: Integer;

begin
clrscr;
  WriteLn('Program Array Dua Dimensi');

  // Input
  for i := 1 to baris do
  begin
    for j := 1 to kolom do
    begin
      Write('Masukkan nilai untuk baris ', i, ', kolom ', j, ': ');
      Readln(arr[i,j]);
    end;
  end;

  // output
  WriteLn('Nilai-nilai yang dimasukkan adalah: ');

  for i := 1 to baris do
  begin
    for j := 1 to kolom do
    begin
      Write(arr[i,j], ' ');
    end;
    WriteLn;
  end;

end.
