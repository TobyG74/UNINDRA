<?php
echo "<h2>Contoh Operator Logika</h2>";

$a = true;
$b = false;
$x = 10;
$y = 5;

echo "<h3>Variabel Boolean:</h3>";
echo "a = " . ($a ? 'true' : 'false') . "<br>";
echo "b = " . ($b ? 'true' : 'false') . "<br>";
echo "x = $x<br>";
echo "y = $y<br><br>";

echo "<h3>Operator Logika:</h3>";

// AND (&&)
echo "<h4>AND (&&) - Kedua kondisi harus benar:</h4>";
echo "a && b: ";
var_dump($a && $b);
echo "<br>";

echo "a && true: ";
var_dump($a && true);
echo "<br>";

echo "(x > y) && (x > 0): ";
var_dump(($x > $y) && ($x > 0));
echo "<br><br>";

// OR (||)
echo "<h4>OR (||) - Salah satu kondisi benar:</h4>";
echo "a || b: ";
var_dump($a || $b);
echo "<br>";

echo "b || false: ";
var_dump($b || false);
echo "<br>";

echo "(x < y) || (x > 0): ";
var_dump(($x < $y) || ($x > 0));
echo "<br><br>";

// NOT (!)
echo "<h4>NOT (!) - Membalik nilai boolean:</h4>";
echo "!a: ";
var_dump(!$a);
echo "<br>";

echo "!b: ";
var_dump(!$b);
echo "<br>";

echo "!(x > y): ";
var_dump(!($x > $y));
echo "<br><br>";

// XOR (xor)
echo "<h4>XOR (xor) - Salah satu benar, tapi tidak keduanya:</h4>";
echo "a xor b: ";
var_dump($a xor $b);
echo "<br>";

echo "a xor true: ";
var_dump($a xor true);
echo "<br>";

echo "b xor false: ";
var_dump($b xor false);
echo "<br><br>";

// AND dengan kata kunci 'and'
echo "<h4>AND dengan kata kunci 'and':</h4>";
echo "a and b: ";
var_dump($a and $b);
echo "<br><br>";

// OR dengan kata kunci 'or'
echo "<h4>OR dengan kata kunci 'or':</h4>";
echo "a or b: ";
var_dump($a or $b);
echo "<br><br>";

echo "<h3>Contoh Praktis - Validasi Login:</h3>";
$username = "admin";
$password = "123456";
$is_active = true;

$input_username = "admin";
$input_password = "123456";

echo "Data yang benar:<br>";
echo "Username: $username<br>";
echo "Password: $password<br>";
echo "Status aktif: " . ($is_active ? 'Ya' : 'Tidak') . "<br><br>";

echo "Input pengguna:<br>";
echo "Username: $input_username<br>";
echo "Password: $input_password<br><br>";

// Validasi login
$username_valid = ($input_username === $username);
$password_valid = ($input_password === $password);

echo "Username valid: " . ($username_valid ? 'Ya' : 'Tidak') . "<br>";
echo "Password valid: " . ($password_valid ? 'Ya' : 'Tidak') . "<br>";

if ($username_valid && $password_valid && $is_active) {
    echo "<strong>Status: LOGIN BERHASIL</strong><br>";
} else {
    echo "<strong>Status: LOGIN GAGAL</strong><br>";
    
    if (!$username_valid) {
        echo "- Username salah<br>";
    }
    if (!$password_valid) {
        echo "- Password salah<br>";
    }
    if (!$is_active) {
        echo "- Akun tidak aktif<br>";
    }
}

echo "<h3>Contoh Short-circuit Evaluation:</h3>";
$nilai = null;

echo "Nilai: " . ($nilai ?? 'null') . "<br>";

// Short-circuit dengan &&
if ($nilai !== null && $nilai > 0) {
    echo "Nilai positif<br>";
} else {
    echo "Nilai null atau tidak positif<br>";
}

// Short-circuit dengan ||
$default_nilai = $nilai || 100;
echo "Default nilai: $default_nilai<br>";

echo "<h3>Contoh Operator Precedence:</h3>";
$result1 = true || false && false;
echo "true || false && false = " . ($result1 ? 'true' : 'false') . "<br>";

$result2 = (true || false) && false;
echo "(true || false) && false = " . ($result2 ? 'true' : 'false') . "<br>";

$result3 = true || (false && false);
echo "true || (false && false) = " . ($result3 ? 'true' : 'false') . "<br>";
?>
