program Pertemuan_9;
uses crt;

const MAX = 10; { Konstanta Maksimum }

type TAntri = array [1..MAX] of char;

var head, tail, pilih: byte;
    antri: TAntri;
    i: integer;
    elemen: char;

procedure initAntri;
begin
    head := 0;
    tail := 0;
end;

procedure enqueue;
begin
    if tail < MAX then
    begin
        tail := tail + 1;
        write('Masukkan elemen: '); readln(elemen);
        antri[tail] := elemen;
    end
    else
    begin
        writeln('Antrian penuh');
    end;
end;

procedure dequeue;
begin
    if head < tail then
    begin
        head := head + 1;
        elemen := antri[head];
        writeln('Elemen yang diambil: ', elemen);
    end
    else
    begin
        writeln('Antrian kosong');
    end;
end;

procedure tampilAntri;
begin
    if head < tail then
    begin
        writeln('Antrian: ');
        for i := head + 1 to tail do
        begin
            write(antri[i], ' ');
        end;
        writeln;
    end
    else
    begin
        writeln('Antrian kosong');
    end;
end;

begin
    clrscr;
    initAntri;
    repeat
        writeln('Menu Antrian');
        writeln('1. Enqueue');
        writeln('2. Dequeue');
        writeln('3. Tampil Antrian');
        writeln('0. Keluar');
        write('Pilih: '); readln(pilih);
        case pilih of
            1: enqueue;
            2: dequeue;
            3: tampilAntri;
        end;
    until pilih = 0;
end.