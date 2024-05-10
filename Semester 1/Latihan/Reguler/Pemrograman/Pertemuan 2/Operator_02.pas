program latihan_pertemuan2;
uses crt;

var 
    nama, npm: String;
    soal1, soal3: Integer;
    soal2: Real;
    soal4: Integer;
    soal5: Boolean;

begin
    clrscr;
    nama := 'Tobi Saputra';
    npm := '202243502612';
    writeln('=====================');
    writeln('Nama : ', nama);
    writeln('NPM : ', npm);
    writeln('=====================');
    soal1 := 10 div 5 * 4 + 4 - 3;
    soal2 := 5 * 10 / 2 - 13 + 7;
    soal3 := ( 10 mod 3 ) + ( 5 * 3 + 3 );
    soal4 := trunc(4.5 * 2) mod 2; { Trunc untuk membulatkan tipe data real ke tipe data integer }
    soal5 := 3 + 5 * 3 < 10;
    writeln('10 div 5 * 4 + 4 - 3 = ', soal1); { Hasil 9 }
    writeln('5 * 10 / 2 - 13 + 7 = ', soal2:4:2); { Hasil 19.00 }
    writeln('( 10 mod 3 ) + ( 5 * 3 + 3 ) = ', soal3); { Hasil 19 }
    writeln('4.5 * 2 mod 2 = ', soal4); { Hasil 1 }
    writeln('3 + 5 * 3 < 10 = ', soal5); { Hasil False }
    readln;
end.
