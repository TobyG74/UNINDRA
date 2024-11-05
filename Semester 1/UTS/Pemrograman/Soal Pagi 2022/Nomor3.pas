program Nomor3;
uses crt;

var nama_customer: string;
    jarak_tempuh, total_harga, diskon, tarif: longint;
    pertama: boolean;

begin
    clrscr;
    textcolor(12);
    writeln('========================================');
    writeln('              DISKON HARGA              ');
    writeln('========================================');
    write('[ ! ] Nama Customer : '); readln(nama_customer);
    write('[ ! ] Jarak yang akan di tempuh (Km) : '); readln(jarak_tempuh);
    pertama := false;
    if (jarak_tempuh >= 0) and (jarak_tempuh <= 10) then
        diskon := 0
    else if (jarak_tempuh >= 10) and (jarak_tempuh <= 15) then
        diskon := 2000
    else
        diskon := 5000;
    while jarak_tempuh > 0 do
    begin
        if (jarak_tempuh >= 4) and (pertama = false) then
            begin
                pertama := true;
                jarak_tempuh := jarak_tempuh - 4;
                tarif := 9500;
            end
        else
            begin
                tarif := tarif + 2500;
                jarak_tempuh := jarak_tempuh - 1;
            end;
    end;
    total_harga := tarif - diskon;
    writeln('[ ! ] Selamat, anda mendapatkan potongan Rp. ', diskon);
    writeln('[ ! ] Tarik yang harus dibayarkan ', nama_customer, ' adalah sebesar ', total_harga);
    readln;
end.
