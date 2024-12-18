program Pertemuan_7;
uses crt;

const MAX = 3; { Konstanta Maksimum }

var stack: array [1..MAX] of string;
    top: 0..MAX;
    i, n: integer;
    elemen: string;

begin
    clrscr;
    { Inisialisasi Top Stack }
    top := 0;
    { Melakukan Push Pada Stack }
    for i := 1 to MAX do
    begin
        { Mengimpan Data Ke Dalam Isi Stack }
        write('Masukkan nama ke-', i, ': '); readln(stack[i]); 
        { Melakukan Increment Pada Stack }
        top := top + 1; 
    end;
    { Menampilkan Posisi Stack }
    writeln('Posisi Tumpukan: ', top);
    { Melakukan Pop Pada Stack  }
    writeln('Pengambilan Data');
    { Menyimpan Jumlah Data Yang Akan Diambil }
    write('Berapa data yang akan diambil?? '); readln(n);
    { Jika Data Yang Diambil Tidak Lebih Dari 3 }
    if (n < 4) then
    begin
        { Melakukan Pengulangan Untuk Mengambil Data }
        for i := 1 to MAX do
        begin
            { Mengambil Data Pada Stack }
            elemen := stack[top]; 
            { Melakukan Decrement Pada Stack }
            top := top - 1; 
        end;
    end;
    { Menampilkan Data Yang Diambil }
    writeln('Data Elemen Sekarang: ', elemen);
    { Menampilkan Posisi Stack }
    writeln('Posisi Tumpukan: ', top);
end.
