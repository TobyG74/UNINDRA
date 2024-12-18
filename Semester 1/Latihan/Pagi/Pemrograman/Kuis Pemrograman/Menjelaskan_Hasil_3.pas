program tobz_menentukan_hasil;

var a, b, c : integer;
    x, y, z : integer;

begin
    a := 2;
    b := 6;
    c := 14;
    x := a + b * c mod 2;
    y := c - b mod a * a;
    z := c * b div a;
    writeln('Hasil x : ', x);
    {
        x = 2
        2 didapat dari nilai b yaitu 6 dikali nilai c yaitu 14 hasilnya 84 -> b * c = 84
        hasil tersebut dibagi oleh 2 dan sisa bagi tersebut yaitu 0 ->  84 mod 2 = 0
        kemudian sisa bagi tersebut yaitu 0 ditambah dengan nilai a yaitu 2, hasilnya adalah 2 -> 2 + 0 = 2
    }
    writeln('Hasil y : ', y);
    {
        y = 14
        14 didapat dari nilai b yaitu 6 dibagi 2 lalu sisa bagi tersebut berupa 0 -> b mod a = 0
        lalu sisa bagi itu dikali kan dengan nilai a yaitu 2, hasilnya 0 -> 0 * a = 0
        kemudian hasil tersebut dikurangi dengan nilai c yaitu 14 jadi 14 - 0, hasilnya 0 -> c - 0 = hasil y
    }
    writeln('Hasil z : ', z);
    {
        z = 42
        42 didapat dari nilai c yaitu 14 dikali nilai b yaitu 6 hasilnya 84 -> c * b = 84
        kemudian 84 dibagi dengan nilai a yaitu 2,
        lalu dari hasil tersebut diambil bilangan bulatnya yaitu 42 -> 84 div a = 42
    }
    readln;
end.
