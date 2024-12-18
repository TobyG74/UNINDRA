program Nomor2;
uses crt;

var buku, penerbit: string;
    harga: longint ;

begin
    clrscr;
    writeln('JUDUL BUKU');
    writeln('---------------');
    writeln('001 => buku Matematika');
    writeln('002 => buku Bahasa Indonesia');
    writeln('003 => buku IPA');
    writeln('004 => buku IPS');
    writeln('===============================');
    writeln('PENERBIT');
    writeln('----------------');
    writeln('101 => Erlangga');
    writeln('102 => Yudhistira');
    writeln('===============================');
    write('masukan kode judul buku yang ingin dibeli : '); readln(buku);
    write('masukan kode penerbit yang ingin dibeli : '); readln(penerbit);
    // IF MAJEMUK
    if (buku = '001') and (penerbit = '101') then 
    begin
        harga := 150000
    end
    else if (buku = '001') and (penerbit = '102') then harga := 100000
    else if (buku = '002') and (penerbit = '101') then harga := 130000
    else if (buku = '002') and (penerbit = '102') then harga := 95000
    else if (buku = '003') and (penerbit = '101') then harga := 135000
    else if (buku = '003') and (penerbit = '102') then harga := 98000
    else if (buku = '004') and (penerbit = '101') then harga := 125000
    else if (buku = '004') and (penerbit = '102') then harga := 92000;
    writeln('===============================');
    writeln('harga = ', harga);
    readln;
end.
