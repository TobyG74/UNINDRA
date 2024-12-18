program Pertemuan_5;
uses crt;
type
    data = record
        isi: string;
        next: ^data;
    end;
    PointerData = ^data;

var head, tail, now: PointerData;
    pertama, kedua, up: string;

procedure insert(elemen: string);
begin
    new(now);
    if (head = nil) then head := now
    else tail^.next := now;
    tail := now;
    tail^.next := nil;
    now^.isi := elemen;
end;

procedure find_first;
begin
    now := head;
    writeln(now^.isi);
end;

procedure find_next;
begin
    if (now^.next <> nil) then now := now^.next;
    writeln(now^.isi);
end;

procedure update(u: string);
begin
    now^.isi := u;
end;

begin
    clrscr;
    write('Masukkan data pertama : '); readln(pertama);
    insert(pertama);
    write('Masukkan data kedua : '); readln(kedua);
    insert(kedua);
    write('Update data now : '); readln(up);
    update(up);
    write('Data pertama : '); find_first;
    write('Data kedua : '); find_next;
end.
