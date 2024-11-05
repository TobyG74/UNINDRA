program gaji_karyawan;
uses crt;

var golongan: char;
    pendidikan, status_nikah: string;
    gaji_pokok, tunjangan, gaji: longint;

label start, finish;

begin
    start:
        clrscr;
        textcolor(12);
        writeln('=====================================');
        writeln('           Perusahaan Swasta         ');
        writeln('=====================================');
        writeln;
        write('Golongan Karyawan : ');
        readln(golongan);
        write('Pendidikan Karyawan : ');
        readln(pendidikan);
        write('Status Pernikahan : ');
        readln(status_nikah);
        writeln('Tekan "Enter" Untuk Melanjutkan');
        readln;
        if (golongan = 'A') then
            begin
                if (pendidikan = 'SMA') then
                    begin
                        gaji_pokok := 3000000;
                        tunjangan := 2000000;
                        gaji := gaji_pokok + tunjangan;
                        goto finish;
                    end
                else if (pendidikan = 'S1') then
                    begin
                        gaji_pokok := 4000000;
                        tunjangan := 3000000;
                        gaji := gaji_pokok + tunjangan;
                        goto finish;
                    end
                else
                    begin
                        writeln('Pendidikan ', pendidikan, ' Belum Terdaftar');
                        readln;
                        goto start;
                    end;
            end
        else if (golongan = 'B') then
            begin
                if (pendidikan = 'SMA') then
                    begin
                        gaji_pokok := 4000000;
                        tunjangan := 3000000;
                        gaji := gaji_pokok + tunjangan;
                        goto finish;
                    end
                else if (pendidikan = 'S1') then
                    begin
                        gaji_pokok := 6000000;
                        tunjangan := 5000000;
                        gaji := gaji_pokok + tunjangan;
                        goto finish;
                    end
                else
                    begin
                        writeln('Pendidikan ', pendidikan, ' Belum Terdaftar');
                        readln;
                        goto start;
                    end;
            end
        else
            writeln('Golongan ', golongan, ' Belum Terdaftar');
            readln;
            goto start;
    finish:
        clrscr;
        textcolor(14);
        writeln('===========================');
        writeln('       DATA KARYAWAN       ');
        writeln('===========================');
        writeln('Golongan Karyawan : ', golongan);
        writeln('Pendidikan Karyawan : ', pendidikan);
        writeln('Status Nikah : ', status_nikah);
        writeln('Gaji yang didapat : ', gaji);
        readln;
end.
