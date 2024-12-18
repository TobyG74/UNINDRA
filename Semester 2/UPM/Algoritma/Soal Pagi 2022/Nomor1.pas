program Nomor1;
uses crt;

var nilai, in1, in2: integer;

function function_kali(a, b: integer): integer;
begin
    function_kali := a * b;
end;

begin
    clrscr;
    write('Masukan Angka 1 : '); readln(in1);
    write('Masukan Angka 2 : '); readln(in2);
    nilai := function_kali(in1,in2);
    writeln('Hasil Perkalian : ', nilai);
    readln;
end.
