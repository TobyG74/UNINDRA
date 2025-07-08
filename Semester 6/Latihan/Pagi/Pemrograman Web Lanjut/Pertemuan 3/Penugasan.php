<?php
echo "<h2>Contoh Operator Penugasan</h2>";

$a = 10;
echo "<h3>Nilai Awal:</h3>";
echo "a = $a<br><br>";

echo "<h3>Operator Penugasan:</h3>";

// Assignment biasa
$b = $a;
echo "b = a, maka b = $b<br>";

// Addition assignment
$a += 5; // sama dengan $a = $a + 5
echo "a += 5, maka a = $a<br>";

// Subtraction assignment
$a -= 3; // sama dengan $a = $a - 3
echo "a -= 3, maka a = $a<br>";

// Multiplication assignment
$a *= 2; // sama dengan $a = $a * 2
echo "a *= 2, maka a = $a<br>";

// Division assignment
$a /= 4; // sama dengan $a = $a / 4
echo "a /= 4, maka a = $a<br>";

// Modulus assignment
$a %= 3; // sama dengan $a = $a % 3
echo "a %= 3, maka a = $a<br>";

echo "<h3>Contoh dengan String:</h3>";
$str = "Hello ";
echo "str = '$str'<br>";

$str .= "World!"; // Concatenation assignment
echo "str .= 'World!', maka str = '$str'<br>";

echo "<h3>Contoh dengan Array:</h3>";
$arr = array(1, 2, 3);
echo "arr = [" . implode(", ", $arr) . "]<br>";

$arr[] = 4; // Menambah elemen ke array
echo "arr[] = 4, maka arr = [" . implode(", ", $arr) . "]<br>";

echo "<h3>Pre dan Post Increment/Decrement:</h3>";
$x = 5;
echo "x = $x<br>";

$y = ++$x; // Pre-increment
echo "y = ++x, maka x = $x, y = $y<br>";

$z = $x++; // Post-increment
echo "z = x++, maka x = $x, z = $z<br>";

$w = --$x; // Pre-decrement
echo "w = --x, maka x = $x, w = $w<br>";

$v = $x--; // Post-decrement
echo "v = x--, maka x = $x, v = $v<br>";
?>
