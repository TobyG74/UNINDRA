program nomor2;
uses crt;

var nama, npm: string;
    pilih, r, a, t: integer;
    hasil: real;

begin
    clrscr;
    textcolor(13);
    write('Input Nama : '); readln(nama); // DEKLARASI NAMA
    write('Input NPM : '); readln(npm);
    clrscr;
    textcolor(12);
    writeln('================================');
    writeln('[1] Menghitung Luas Lingkaran');
    writeln('[2] Menghitung Luas Segitiga');
    writeln('================================');
    write('Pilih : '); readln(pilih);
    // MENGHITUNG LUAS LINGKARANG / SEGITIGA
    case (pilih) of
        1: begin
            clrscr;
            textcolor(13);
            write('Input Jari-Jari : '); readln(r);
            hasil := (22/7) * r * r;
            write('Luas Lingkaran : ', hasil:0:0);
        end;
        2: begin
            clrscr;
            textcolor(13);
            write('Input Alas : '); readln(a);
            write('Input Tinggi : '); readln(t);
            hasil := (1/2) * a * t;
        end;
    end;
    // BANYAK DATA
    textcolor(14);
    writeln('Nama : ', nama);
    writeln('Kelas : ', npm);
    write('Luas : ', hasil:0:0); // LUAS
    readln;
end.