program SequentialSearchP13;

const
  MAX_SIZE = 100;

type
  TArray = array[1..MAX_SIZE] of Integer;

// Fungsi untuk melakukan Sequential Search pada array
function SequentialSearch(arr: TArray; size, key: Integer): Boolean;
var
  i: Integer;
begin
  i := 1;
  while (i <= size) and (arr[i] <> key) do
    i := i + 1;
    
  if i <= size then
    SequentialSearch := True // key ditemukan
  else
    SequentialSearch := False; // key tidak ditemukan
end;

var
  arr: TArray;
  size, i, key: Integer;
  found: Boolean;
begin
  // Memasukkan ukuran array
  writeln('Masukkan ukuran array (1-100): ');
  readln(size);
  
  // Memasukkan elemen array
  writeln('Masukkan elemen array:');
  for i := 1 to size do
  begin
    write('Elemen ke-', i, ': ');
    readln(arr[i]);
  end;
  
  // Memasukkan kunci yang akan dicari
  writeln('Masukkan kunci yang akan dicari: ');
  readln(key);
  
  // Melakukan Sequential Search
  found := SequentialSearch(arr, size, key);
  
  // Menampilkan hasil pencarian
  if found then
    writeln('Kunci ditemukan dalam array.')
  else
    writeln('Kunci tidak ditemukan dalam array.');
  
  readln;
end.
