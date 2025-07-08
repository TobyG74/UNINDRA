<?php
echo "<h2>Contoh Operator Perbandingan</h2>";

$a = 10;
$b = 20;
$c = "10";
$d = 10;

echo "<h3>Variabel:</h3>";
echo "a = $a (integer)<br>";
echo "b = $b (integer)<br>";
echo "c = '$c' (string)<br>";
echo "d = $d (integer)<br><br>";

echo "<h3>Operator Perbandingan:</h3>";

// Equal (==)
echo "<h4>Equal (==) - Membandingkan nilai saja:</h4>";
echo "a == b: ";
var_dump($a == $b);
echo "<br>";

echo "a == c: ";
var_dump($a == $c);
echo "<br>";

echo "a == d: ";
var_dump($a == $d);
echo "<br><br>";

// Identical (===)
echo "<h4>Identical (===) - Membandingkan nilai dan tipe data:</h4>";
echo "a === c: ";
var_dump($a === $c);
echo "<br>";

echo "a === d: ";
var_dump($a === $d);
echo "<br><br>";

// Not equal (!=)
echo "<h4>Not Equal (!=):</h4>";
echo "a != b: ";
var_dump($a != $b);
echo "<br>";

echo "a != c: ";
var_dump($a != $c);
echo "<br><br>";

// Not identical (!==)
echo "<h4>Not Identical (!==):</h4>";
echo "a !== c: ";
var_dump($a !== $c);
echo "<br>";

echo "a !== d: ";
var_dump($a !== $d);
echo "<br><br>";

// Less than (<)
echo "<h4>Less Than (<):</h4>";
echo "a < b: ";
var_dump($a < $b);
echo "<br>";

echo "b < a: ";
var_dump($b < $a);
echo "<br><br>";

// Greater than (>)
echo "<h4>Greater Than (>):</h4>";
echo "a > b: ";
var_dump($a > $b);
echo "<br>";

echo "b > a: ";
var_dump($b > $a);
echo "<br><br>";

// Less than or equal (<=)
echo "<h4>Less Than or Equal (<=):</h4>";
echo "a <= d: ";
var_dump($a <= $d);
echo "<br>";

echo "a <= b: ";
var_dump($a <= $b);
echo "<br><br>";

// Greater than or equal (>=)
echo "<h4>Greater Than or Equal (>=):</h4>";
echo "a >= d: ";
var_dump($a >= $d);
echo "<br>";

echo "b >= a: ";
var_dump($b >= $a);
echo "<br><br>";

// Spaceship operator (<=>)
echo "<h4>Spaceship Operator (<=>):</h4>";
echo "a <=> b: ";
var_dump($a <=> $b); // -1 (a kurang dari b)
echo "<br>";

echo "a <=> d: ";
var_dump($a <=> $d); // 0 (a sama dengan d)
echo "<br>";

echo "b <=> a: ";
var_dump($b <=> $a); // 1 (b lebih besar dari a)
echo "<br><br>";

echo "<h3>Contoh Praktis dalam Kondisi:</h3>";
$nilai = 85;
$batas_lulus = 60;

echo "Nilai mahasiswa: $nilai<br>";
echo "Batas kelulusan: $batas_lulus<br>";

if ($nilai >= $batas_lulus) {
    echo "Status: LULUS<br>";
} else {
    echo "Status: TIDAK LULUS<br>";
}

if ($nilai >= 90) {
    echo "Grade: A<br>";
} elseif ($nilai >= 80) {
    echo "Grade: B<br>";
} elseif ($nilai >= 70) {
    echo "Grade: C<br>";
} elseif ($nilai >= 60) {
    echo "Grade: D<br>";
} else {
    echo "Grade: E<br>";
}

echo "<h3>Perbandingan String:</h3>";
$str1 = "apple";
$str2 = "banana";

echo "str1 = '$str1'<br>";
echo "str2 = '$str2'<br>";

echo "str1 < str2: ";
var_dump($str1 < $str2); // true (secara alfabetis)
echo "<br>";

echo "str1 > str2: ";
var_dump($str1 > $str2); // false
echo "<br>";
?>
