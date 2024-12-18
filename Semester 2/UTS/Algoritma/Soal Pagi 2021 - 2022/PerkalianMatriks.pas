program perkalian_matriks;
uses crt;
const
  MAX = 100;
type
  TArray = array[1..MAX, 1..MAX] of integer;

var
  A, B, C: TArray;
  m, n, p, q, i, j, k, x, y: integer;

begin
clrscr;
  // Baca ukuran matriks A dan B
  writeln('Masukkan ukuran matriks A (m x n):');
  writeln('Masukkan Kolom : '); read(m);
  writeln('Masukkan Baris : '); read(n);
  writeln('Masukkan ukuran matriks B (p x q):');
  writeln('Masukkan Kolom : '); read(p);
  writeln('Masukkan Baris : '); read(q);
 

  
  clrscr;
  // Baca elemen matriks A dan B
  writeln('Masukkan elemen matriks A:');
  y := 3;
  for i := 1 to m do
  begin
    x := 4;
    for j := 1 to n do
    begin
      gotoxy(x,y);
      read(A[i, j]);
      x := x + 4;
    end;
    y := y + 1;
  end;

  writeln('Masukkan elemen matriks B:');
  y := y + 3;
  for i := 1 to p do
  begin
    x := 4;
    for j := 1 to q do
    begin
      gotoxy(x,y);
      read(B[i, j]);
      x := x + 4;
    end;
    y := y + 1;
  end;

  // Hitung perkalian matriks
  for i := 1 to m do
  begin
    for j := 1 to q do
    begin
      C[i, j] := 0;
      for k := 1 to n do
      begin
        C[i, j] := C[i, j] + A[i, k] * B[k, j];
      end;
    end;
  end;

  // Tampilkan hasil perkalian matriks
  writeln('Hasil perkalian matriks A dan B adalah:');
  y := y + 3;
  for i := 1 to m do
  begin
    x := 4;
    for j := 1 to q do
    begin
      gotoxy(x,y);
      write(C[i, j], ' ');
      x := x + 4;
    end;
    y := y + 1;
    writeln;
  end;

  readln;
end.
