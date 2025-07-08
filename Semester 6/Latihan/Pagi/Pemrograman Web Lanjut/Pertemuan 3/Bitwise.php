<?php
echo "<h2>Contoh Operator Bitwise</h2>";

$a = 12; // Binary: 1100
$b = 7;  // Binary: 0111

echo "<h3>Variabel:</h3>";
echo "a = $a (Binary: " . decbin($a) . ")<br>";
echo "b = $b (Binary: " . decbin($b) . ")<br><br>";

echo "<h3>Operator Bitwise:</h3>";

// AND (&)
$hasil = $a & $b;
echo "AND: $a & $b = $hasil (Binary: " . decbin($hasil) . ")<br>";
echo "Penjelasan: 1100 & 0111 = 0100<br><br>";

// OR (|)
$hasil = $a | $b;
echo "OR: $a | $b = $hasil (Binary: " . decbin($hasil) . ")<br>";
echo "Penjelasan: 1100 | 0111 = 1111<br><br>";

// XOR (^)
$hasil = $a ^ $b;
echo "XOR: $a ^ $b = $hasil (Binary: " . decbin($hasil) . ")<br>";
echo "Penjelasan: 1100 ^ 0111 = 1011<br><br>";

// NOT (~)
$hasil = ~$a;
echo "NOT: ~$a = $hasil<br>";
echo "Penjelasan: ~1100 (complement dari 32-bit)<br><br>";

// Left Shift (<<)
$hasil = $a << 2;
echo "Left Shift: $a << 2 = $hasil (Binary: " . decbin($hasil) . ")<br>";
echo "Penjelasan: 1100 digeser 2 posisi ke kiri menjadi 110000<br><br>";

// Right Shift (>>)
$hasil = $a >> 2;
echo "Right Shift: $a >> 2 = $hasil (Binary: " . decbin($hasil) . ")<br>";
echo "Penjelasan: 1100 digeser 2 posisi ke kanan menjadi 11<br><br>";

echo "<h3>Contoh Praktis - Manipulasi Flag:</h3>";
// Contoh penggunaan bitwise untuk flag
$permissions = 0; // 000

// Set permission bits
$READ = 4;    // 100
$WRITE = 2;   // 010
$EXECUTE = 1; // 001

echo "Permission bits:<br>";
echo "READ = $READ (Binary: " . str_pad(decbin($READ), 3, '0', STR_PAD_LEFT) . ")<br>";
echo "WRITE = $WRITE (Binary: " . str_pad(decbin($WRITE), 3, '0', STR_PAD_LEFT) . ")<br>";
echo "EXECUTE = $EXECUTE (Binary: " . str_pad(decbin($EXECUTE), 3, '0', STR_PAD_LEFT) . ")<br><br>";

// Memberikan permission READ dan WRITE
$permissions = $READ | $WRITE;
echo "Memberikan READ dan WRITE: $permissions (Binary: " . str_pad(decbin($permissions), 3, '0', STR_PAD_LEFT) . ")<br>";

// Cek apakah ada permission READ
if ($permissions & $READ) {
    echo "User memiliki permission READ<br>";
}

// Cek apakah ada permission EXECUTE
if ($permissions & $EXECUTE) {
    echo "User memiliki permission EXECUTE<br>";
} else {
    echo "User TIDAK memiliki permission EXECUTE<br>";
}

// Hapus permission WRITE
$permissions = $permissions & ~$WRITE;
echo "Setelah menghapus WRITE: $permissions (Binary: " . str_pad(decbin($permissions), 3, '0', STR_PAD_LEFT) . ")<br>";
?>
