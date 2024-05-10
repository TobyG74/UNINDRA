program nomor3;
uses crt;

type data_luas = record
    jari, alas, tinggi: integer;
    segitiga, lingkaran: real;
end;

var data: array [1..20] of data_luas; // Maks Array
    pilih, banyak_data, i: integer;
    nama, npm: string;

begin
    clrscr;
    write('Input Nama : '); readln(nama); // DEKLARASI NAMA
    write('Input NPM : '); readln(npm);
    clrscr;
    textcolor(12);
    writeln('================================');
    writeln('[1] Menghitung Luas Lingkaran');
    writeln('[2] Menghitung Luas Segitiga');
    writeln('================================');
    textcolor(13);
    write('Pilih : '); readln(pilih);
    case (pilih) of
        1: begin
            clrscr;
            write('Ingin Menghitung Berapa Lingkaran : '); readln(banyak_data);
            clrscr;
            textcolor(12);
            writeln('===========================');
            writeln('           Input           ');
            writeln('===========================');
            for i := 1 to banyak_data do
            begin
                with data[i] do
                begin
                    textcolor(12);
                    writeln('Lingkaran ke-', i);
                    write('Input Jari-Jari : '); readln(jari);
                    lingkaran := (22/7) * jari * jari;
                    writeln;
                end; 
            end;
            clrscr;
            textcolor(14);
            writeln('===========================');
            writeln('           Hasil           ');
            writeln('===========================');
            writeln('Nama : ', nama);
            writeln('Kelas : ', npm);
            for i := 1 to banyak_data do
            begin
                with data[i] do
                begin
                    textcolor(12);
                    writeln('Lingkaran ke-', i);
                    writeln('Luas Lingkaran', lingkaran:0:2);
                    writeln;
                end; 
            end;
        end;
        2: begin
            clrscr;
            write('Ingin Menghitung Berapa Segitiga : '); readln(banyak_data);
            clrscr;
            textcolor(12);
            writeln('===========================');
            writeln('           Input           ');
            writeln('===========================');
            writeln;
            for i := 1 to banyak_data do
            begin
                with data[i] do
                begin
                    writeln('Segitiga ke-', i);
                    write('Input Alas : '); readln(alas);
                    write('Input Tinggi : '); readln(tinggi);
                    segitiga := (1/2) * alas * tinggi;
                    writeln;
                end; 
            end;
            clrscr;
            textcolor(14);
            writeln('===========================');
            writeln('           Hasil           ');
            writeln('===========================');
            writeln('Nama : ', nama);
            writeln('Kelas : ', npm);
            writeln;
            for i := 1 to banyak_data do
            begin
                with data[i] do
                begin
                    writeln('Segitiga ke-', i);
                    writeln('Luas Segitiga', segitiga:0:2);
                    writeln;
                end; 
            end;
        end;
    end;
    readln;
end.