program gravitational_sort;
uses crt;

const
  MAX_SIZE = 100;

type
  TIntArray = array of Integer;

var
  arrLength: Integer;
  dataArray: TIntArray;

// Gravitational sorting
procedure gravitationalSorting(var arr: TIntArray);
var
  i, j, force: Integer;
begin
  for i := 0 to High(arr) do
  begin
    force := 0;
    for j := 0 to High(arr) do
    begin
      if arr[j] < arr[i] then
        Inc(force);
      if arr[j] > arr[i] then
        Dec(force);
    end;
    while force <> 0 do
    begin
      if force > 0 then
      begin
        Dec(force);
        Dec(arr[i]);
      end
      else
      begin
        Inc(force);
        Inc(arr[i]);
      end;
    end;
  end;

  // Sorting the array using bubble sort
  for i := 0 to High(arr) - 1 do
  begin
    for j := 0 to High(arr) - 1 - i do
    begin
      if arr[j] > arr[j + 1] then
      begin
        force := arr[j];
        arr[j] := arr[j + 1];
        arr[j + 1] := force;
      end;
    end;
  end;
end;

// Procedure for creating array
procedure createArray(length: Integer);
var
  i: Integer;
begin
  SetLength(dataArray, length);
  for i := 0 to length - 1 do
    dataArray[i] := Random(100);
end;

// Procedure for printing array
procedure printArray(arr: TIntArray);
var
  i: Integer;
begin
  for i := 0 to High(arr) do
    write(arr[i], ' ');
  writeln;
end;

// Main program
begin
  clrscr;
  textcolor(12);
  write('Input jumlah data: ');
  readln(arrLength);

  createArray(arrLength);

  writeln('Data sebelum di sorting:');
  printArray(dataArray);

  writeln('Data setelah di sorting:');
  gravitationalSorting(dataArray);
  printArray(dataArray);

  readln;
end.