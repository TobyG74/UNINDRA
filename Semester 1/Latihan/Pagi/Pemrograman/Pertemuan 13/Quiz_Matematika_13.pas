program quiz_matematika;
uses crt;

const soal = 10;
var quiz, i, benar, salah: integer;
    nilai: real;
    pilih: char;

label start, finish;

procedure pilihan(var select: char);
begin
    textcolor(14);
    writeln;
    write('Ingin Menghitung Kembali? [Y/n] : ');
    readln(select);
end;

procedure penjumlahan(var select: char);
var a, b, jawaban: integer;
begin
    clrscr;
    textcolor(13);
    randomize;
    benar := 0;
    salah := 0;
    writeln('======================');
    writeln('   QUIZ PERJUMLAHAN   ');
    writeln('======================');
    for i := 1 to soal do
    begin
        a := random(100);
        b := random(100);
        write('[ SOAL ', i, ' ] ', a, ' + ', b, ' : ');
        readln(jawaban);
        if (jawaban = a + b) then
            benar := benar +  1
        else
            salah := salah + 1;
    end;
    nilai := benar / soal * 100;
    writeln('Jawaban Benar : ', benar);
    writeln('Jawaban Salah : ', salah);
    writeln('Nilai : ', nilai:0:2);
    pilihan(select);
end;

procedure pengurangan(var select: char);
var a, b, jawaban: integer;
begin
    clrscr;
    textcolor(13);
    randomize;
    benar := 0;
    salah := 0;
    writeln('======================');
    writeln('   QUIZ PENGURANGAN   ');
    writeln('======================');
    for i := 1 to soal do
    begin
        a := random(100);
        b := random(100);
        write('[ SOAL ', i, ' ] ', a, ' - ', b, ' : ');
        readln(jawaban);
        if (jawaban = a - b) then
            benar := benar +  1
        else
            salah := salah + 1;
    end;
    nilai := benar / soal * 100;
    writeln('Jawaban Benar : ', benar);
    writeln('Jawaban Salah : ', salah);
    writeln('Nilai : ', nilai:0:2);
    pilihan(select);
end;

procedure perkalian(var select: char);
var a, b, jawaban: integer;
begin
    clrscr;
    textcolor(13);
    randomize;
    benar := 0;
    salah := 0;
    writeln('====================');
    writeln('   QUIZ PERKALIAN   ');
    writeln('====================');
    for i := 1 to soal do
    begin
        a := random(100);
        b := random(100);
        write('[ SOAL ', i, ' ] ', a, ' * ', b, ' : ');
        readln(jawaban);
        if (jawaban = a * b) then
            benar := benar +  1
        else
            salah := salah + 1;
    end;
    nilai := benar / soal * 100;
    writeln('Jawaban Benar : ', benar);
    writeln('Jawaban Salah : ', salah);
    writeln('Nilai : ', nilai:0:2);
    pilihan(select);
end;

procedure pembagian_mod(var select: char);
var a, b, jawaban: integer;
begin
    clrscr;
    textcolor(13);
    randomize;
    benar := 0;
    salah := 0;
    writeln('========================');
    writeln('   QUIZ PEMBAGIAN MOD   ');
    writeln('========================');
    for i := 1 to soal do
    begin
        a := random(100);
        b := random(100);
        write('[ SOAL ', i, ' ] ', a, ' mod ', b, ' : ');
        readln(jawaban);
        if (jawaban = a mod b) then
            benar := benar +  1
        else
            salah := salah + 1;
    end;
    nilai := benar / soal * 100;
    writeln('Jawaban Benar : ', benar);
    writeln('Jawaban Salah : ', salah);
    writeln('Nilai : ', nilai:0:2);
    pilihan(select);
end;

procedure pembagian_div(var select: char);
var a, b, jawaban: integer;
begin
    clrscr;
    textcolor(13);
    randomize;
    benar := 0;
    salah := 0;
    writeln('=======================');
    writeln('   QUIZ PEMBAGIAN DIV  ');
    writeln('=======================');
    for i := 1 to soal do
    begin
        a := random(100);
        b := random(100);
        write('[ SOAL ', i, ' ] ', a, ' div ', b, ' : ');
        readln(jawaban);
        if (jawaban = a div b) then
            benar := benar +  1
        else
            salah := salah + 1;
    end;
    nilai := benar / soal * 100;
    writeln('Jawaban Benar : ', benar);
    writeln('Jawaban Salah : ', salah);
    writeln('Nilai : ', nilai:0:2);
    pilihan(select);
end;

begin
    start:
    clrscr;
    textcolor(11);
    writeln('=============================');
    writeln('       QUIZ MATEMATIKA       ');
    writeln('=============================');
    textcolor(12);
    writeln('[ 1 ] Quiz Penjumlahan');
    writeln('[ 2 ] Quiz Pengurangan');
    writeln('[ 3 ] Quiz Perkalian');
    writeln('[ 4 ] Quiz Pembagian Mod');
    writeln('[ 5 ] Quiz Pembagian Div');
    writeln('[ 6 ] Exit');
    textcolor(11);
    writeln('=============================');
    write('[ ! ] Pilih Quiz : ');
    readln(quiz);
    if (quiz = 1) then
        begin
            penjumlahan(pilih);
            if (pilih = 'Y') or (pilih = 'y') then
                goto start
            else
                goto finish;
        end
    else if (quiz = 2) then
        begin
            pengurangan(pilih);
            if (pilih = 'Y') or (pilih = 'y') then
                goto start
            else
                goto finish;
        end
    else if (quiz = 3) then
        begin
            perkalian(pilih);
            if (pilih = 'Y') or (pilih = 'y') then
                goto start
            else
                goto finish;
        end
    else if (quiz = 4) then
        begin
            pembagian_mod(pilih);
            if (pilih = 'Y') or (pilih = 'y') then
                goto start
            else
                goto finish;
        end
    else if (quiz = 5) then
        begin
            pembagian_div(pilih);
            if (pilih = 'Y') or (pilih = 'y') then
                goto start
            else
                goto finish;
       end
    else if (quiz = 6) then
        exit
    else
        writeln('Tidak ada pilihan ', quiz);
    readln;
    finish:
end.
