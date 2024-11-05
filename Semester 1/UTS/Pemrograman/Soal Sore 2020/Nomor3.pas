program nomor1;
uses crt;

var sewa: string;
    tipe: char;
    harga: longint;

begin
    clrscr;
    writeln('=====[ Biaya Sewa Kendaraan ]=====');
    write('Sewa Kendaraan (A)==> Mobil, (B)==> Motor : '); readln(sewa);
    write('Tipe Kendaraan (A)==> Mewah, (B)==> Biasa : '); readln(tipe);
    if (sewa = 'a') or (sewa = 'A') then // Mobil
    begin
        if (tipe = 'a') or (tipe = 'A') then harga := 300000 // Mewah
        else if (tipe = 'b') or (tipe = 'B') then harga := 100000; // Biasa
    end
    else if (sewa = 'b') or (sewa = 'B') then // Motor
    begin
        if (tipe = 'a') or (tipe = 'A') then harga := 150000 // Mewah
        else if (tipe = 'b') or (tipe = 'B') then harga := 50000; // Biasa
        
    end;
    writeln('Biaya Sewa : ', harga);
    readln;
end.
