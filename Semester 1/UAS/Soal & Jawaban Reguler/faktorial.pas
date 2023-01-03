program faktorial;
uses crt;

var
    angka, i , hasil : integer;

begin 
clrscr;
writeln('input angka : '); read(angka);

hasil := 1 ;
for i := 1 to angka do
begin
    hasil := hasil * i;
end;

writeln(angka, '! = ', hasil);

readln;
end.