program genap_luas_segitiga;
uses crt;
var a, t: integer;
    luas: real;

begin
	clrscr;
	write('Input Alas : '); readln(a);
	write('Input Tinggi : '); readln(t);
	luas := 0.5 * a * t;
	writeln('Luas Segitiga : ', luas:0:2);
	readln;
end.
