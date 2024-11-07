program luas_segitiga;
uses crt;

var alas, tinggi: integer;
    luas: real;

procedure luas_segitiga(alas, tinggi: integer; var return_luas: real);
begin
     return_luas := (1/2) * alas * tinggi;
end;

begin
  clrscr;
  write('Masukkan Alas Segitiga : '); readln(alas);
  write('Masukkan Tinggi Segitiga : '); readln(tinggi);
  luas_segitiga(alas, tinggi, luas);
  writeln('Luas Segitiga adalah : ' + luas);
  readln;
end.
