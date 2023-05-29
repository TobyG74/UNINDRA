program simpleHeapSort;
uses crt;
type IntArray = array of integer;
var
  arr : IntArray;
  i,total : Integer;

procedure printArray(var arr : IntArray);
var i : Integer;
begin
  for i := 1 to High(arr) do 
      write(arr[i],' ');
    Writeln;
end;
procedure maxHeap(var arr : IntArray; total,parent : Integer);
var largest,right,left,temp : Integer;
begin
  largest := parent;
  left := 2*parent;
  right := 2*parent + 1;
 
  if(left <= total) and (arr[left] > arr[largest]) then
      largest := left;
  if(right <= total) and (arr[right] > arr[largest]) then
    largest := right;

  if(largest <> parent) then
    begin

      temp := arr[parent];
      arr[parent] := arr[largest];
      arr[largest] := temp;
      maxHeap(arr,total,largest);
    end
end;
// untuk membuat heap dari array
procedure buildHeap(var arr : IntArray);
begin
  for i := High(arr) div 2 downto 1 do
   maxHeap(arr,High(arr),i);
end;
procedure heapSort(var arr : IntArray; total : Integer);
var temp,i : Integer ;
begin
  buildHeap(arr);
  for i := total downto 1 do
  begin
    temp := arr[1];
    arr[1] := arr[i];
    arr[i] := temp;
    maxHeap(arr,i-1,1);
  end;
end;
begin
clrscr;
 write('Masukan jumlah data : ');read(total);
 SetLength(arr,total+1);
 for i := 1 to total do
    begin
      write('Masukan data ke-',i,' ');read(arr[i]);
    end;

writeln('Data yang belum di sorting : ');
printArray(arr);

heapSort(arr,High(arr));
printArray(arr);

end.