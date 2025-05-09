<?php
$a = 1; // ubah sesuai npm
$b = 2; // ubah sesuai npm

// jika 0 / tidak muncul hasil = false

$c = (($a > $b) && ($a % $b == 0)) || ($a == $b);
echo "(($a > $b) && ($a % $b == 0)) || ($a == $b) : $c"; 
echo "<br>";

$c = !($a < $b || $a == $b);
echo "!($a < $b || $a == $b) : $c"; 
echo "<br>";

$c = ($a * 2) <= ($b * 3);
echo "($a * 2) <= ($b * 3) : $c"; 
?>
