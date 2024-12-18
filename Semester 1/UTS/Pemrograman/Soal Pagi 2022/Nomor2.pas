program Nomor2;
uses crt;

type list_karyawan = record
        nama_karyawan: string;
        gaji_pokok, gaji_bersih, tunjangan, pajak: real;
    end;

var karyawan: array [1..20] of list_karyawan;
    jumlah, i: integer;

procedure input_data;
begin
    clrscr;
    textcolor(13);
    writeln('=========================');
    writeln('   Input Data Karyawan   ');
    writeln('=========================');
    for i := 1 to jumlah do
    begin
        with karyawan[i] do
        begin
            write('> Masukan Nama : '); readln(nama_karyawan);
            write('> Masukan Gaji Pokok : '); readln(gaji_pokok);
        end;
        writeln;
    end;
    write('[ ! ] Tekan "ENTER" Untuk Konfirmasi!'); readln;
end;

procedure print_data;   
begin
    clrscr;
    textcolor(14);
    writeln('=========================');
    writeln('   Input Data Karyawan   ');
    writeln('=========================');
    for i := 1 to jumlah do
    begin
        with karyawan[i] do
        begin
            tunjangan := 0.20 * gaji_pokok;
            pajak := 0.15 * (gaji_pokok + tunjangan);
            gaji_bersih := gaji_pokok + tunjangan - pajak;
            writeln('Gaji Pokok : Rp. ', round(gaji_pokok));
            writeln('Tunjangan : Rp. ', round(tunjangan));
            writeln('Pajak : Rp. ', round(pajak));
            write('Gaji bersih yang diterima oleh ', nama_karyawan, ' adalah sebesar Rp. ', round(gaji_bersih));
        end;
        writeln;
    end;
end;

begin
    clrscr;
    textcolor(11);
    writeln('============================');
    writeln('   Menghitung Gaji Bersih   ');
    writeln('============================');
    write('[ ! ] Input Jumlah Karyawan : '); readln(jumlah);
    input_data;
    print_data;
end.
