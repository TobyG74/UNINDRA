program Nomor4;
uses crt;

var kelas: string;
    lama_menginap, tarif: longint;

begin
    clrscr;
    textcolor(13);
    writeln('=======================================');
    writeln('          BIAYA MENGINAP HOTEL         ');
    writeln('=======================================');
    write('[ ! ] Jenis Kelas Kamar : '); readln(kelas);
    write('[ ! ] Lama Menginap (dalam hari) : '); readln(lama_menginap);
    if (LowerCase(kelas) = 'standard') then
        begin
            if (lama_menginap >= 1) and (lama_menginap <= 2) then
                begin
                    tarif := 400000 * lama_menginap;
                end
            else 
                begin
                    tarif := 350000 * lama_menginap;
                end;
        end
    else if (LowerCase(kelas) = 'eksekutif') then
        begin
            if (lama_menginap >= 1) and (lama_menginap <= 2) then
                begin
                    tarif := 1200000 * lama_menginap;
                end
            else 
                begin
                    tarif := 1000000 * lama_menginap;
                end;
        end
    else
        writeln('Jenis Kelas Kamar ', kelas, ' tidak ada di daftar!');
    writeln('[ ! ] Total tarif yang harus dibayarkan adalah : Rp. ', tarif);
end.
