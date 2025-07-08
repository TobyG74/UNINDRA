<?php
echo "<h2>Contoh Operator Aritmatika</h2>";

$a = 10;
$b = 3;

echo "<h3>Variabel:</h3>";
echo "a = $a<br>";
echo "b = $b<br><br>";

echo "<h3>Hasil Operasi Aritmatika:</h3>";

// Penjumlahan
$hasil = $a + $b;
echo "Penjumlahan: $a + $b = $hasil<br>";

// Pengurangan
$hasil = $a - $b;
echo "Pengurangan: $a - $b = $hasil<br>";

// Perkalian
$hasil = $a * $b;
echo "Perkalian: $a * $b = $hasil<br>";

// Pembagian
$hasil = $a / $b;
echo "Pembagian: $a / $b = " . number_format($hasil, 2) . "<br>";

// Modulus (sisa bagi)
$hasil = $a % $b;
echo "Modulus: $a % $b = $hasil<br>";

// Pangkat (PHP 5.6+)
$hasil = $a ** $b;
echo "Pangkat: $a ** $b = $hasil<br>";

echo "<h3>Contoh dengan Variabel Lain:</h3>";
$x = 15.5;
$y = 4.2;

echo "x = $x, y = $y<br>";
echo "x + y = " . ($x + $y) . "<br>";
echo "x - y = " . ($x - $y) . "<br>";
echo "x * y = " . ($x * $y) . "<br>";
echo "x / y = " . number_format($x / $y, 2) . "<br>";
?>