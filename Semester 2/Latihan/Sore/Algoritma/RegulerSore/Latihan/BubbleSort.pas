program bubble_sort_ascending;
uses crt;

const
  MAX_SIZE = 100;
var
  arrLength: Integer;
  dataArray : array of Integer;

// procedure for print array
procedure printArray(arr : array of integer);
var i : Integer;
begin
  for i := 0 to High(arr) do
     write(arr[i] , ' ');
end;
// bubble sorting
procedure bubbleSorting(arr : array of Integer) ;
var i ,j,temp,arrLength : integer;
begin
   arrLength := High(arr);
   for i := 0 to arrLength do
    begin
      for j := 0 to High(arr) - i do
      begin
          // swap array
         if arr[j] > arr[j + 1] then
           begin
           temp := arr[j];
           arr[j] := arr[j+1];
           arr[j+1] := temp;
           end;
      end;
    end;
    printArray(arr);
    
end;
// procedure for create array
procedure createArray(length : Integer);
var i : Integer;
begin
 SetLength(dataArray,length);
 for i := 0 to length - 1 do
   dataArray[i] := Random(100)
end;

// main program
begin
  clrscr;
  textcolor(12);
  
  write('input jumlah data : '); read(arrLength);
  createArray(arrLength);

  writeln('data sebelum di sorting' );
  printArray(dataArray);

  writeln('data setelah di sorting : ');
  bubbleSorting(dataArray);

end.