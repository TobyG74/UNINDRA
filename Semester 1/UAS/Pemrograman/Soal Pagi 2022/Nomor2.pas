program Nomor2;
uses crt;

var angka, i, hasil: longint;

begin 
    clrscr;     
    write('Input angka : '); readln(angka);
    hasil := 1 ;
    for i := 1 to angka do hasil := hasil * i;
    writeln(angka, '! = ', hasil);
    readln;
end.
