program segitiga_bintang;
uses crt;

var i, j, angka: integer;

  begin
      clrscr;
      writeln('=======================');
      writeln('   SEGITIGA BINTANG    ');
      writeln('=======================');
      write('Input Angka : ');
      readln(angka);
      for i := 1 to angka do
        begin
            for j := 1 to i do
              begin
                  write('*  ');
                end;
            writeln;
          end;
    end.
