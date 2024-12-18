program Pertemuan_2_Tugas_2;
uses crt;

const baris = 3; kolom = 3;

var i, j, k: integer;
    matrix_a, matrix_b, matrix_hasil : array[1..baris,1..kolom] of integer;

begin
    clrscr;
    // Matrix A
    writeln('Matrix A : ');
    matrix_a[1,1] := 2;
    matrix_a[1,2] := 1;
    matrix_a[1,3] := 2;
    matrix_a[2,1] := 1;
    matrix_a[2,2] := 1;
    matrix_a[2,3] := 1;
    matrix_a[3,1] := 2;
    matrix_a[3,2] := 1;
    matrix_a[3,3] := 2;
    for i := 1 to baris do
    begin
        for j := 1 to kolom do
        begin
            write(matrix_a[i,j], ' ');
        end;
        writeln;
    end;
    writeln;
    // Matrix B
    writeln('Matrix B : ');
    matrix_b[1,1] := 1;
    matrix_b[1,2] := 2;
    matrix_b[1,3] := 3;
    matrix_b[2,1] := 1;
    matrix_b[2,2] := 2;
    matrix_b[2,3] := 3;
    matrix_b[3,1] := 1;
    matrix_b[3,2] := 2;
    matrix_b[3,3] := 3; 
    for i := 1 to baris do
    begin
        for j := 1 to kolom do
        begin
            write(matrix_b[i,j], ' ');
        end;
        writeln;
    end;
    writeln;
    // Proses Perkalian
    for i := 1 to baris do
    begin
        for j := 1 to kolom do
        begin
            matrix_hasil[i,j] := 0;
            for k := 1 to kolom do
            begin
                matrix_hasil[i,j] := matrix_hasil[i,j] + (matrix_a[i,k] * matrix_b[k,j]);
            end;
        end;
    end;
    // Tampilkan Hasil
    writeln('Hasil Perkalian Matrix A dan B : ');
    for i := 1 to baris do
    begin
        for j := 1 to kolom do
        begin
            write(matrix_hasil[i,j], ' ');
        end;
        writeln;
    end;
    readln;
end.
