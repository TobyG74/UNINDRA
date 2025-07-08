<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Latihan 2 - Pertemuan 7</title>
</head>
<body>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <!-- Form Input Determinan -->
            <td>
                <center><h2>PERHITUNGAN DETERMINAN</h2></center>
                <form method="POST" action="">
                    <table>
                        <tr>
                            <td>Nilai a:</td>
                            <td><input type="number" name="a" step="any" value="<?php echo isset($_POST['a']) ? $_POST['a'] : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>Nilai b:</td>
                            <td><input type="number" name="b" step="any" value="<?php echo isset($_POST['b']) ? $_POST['b'] : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>Nilai c:</td>
                            <td><input type="number" name="c" step="any" value="<?php echo isset($_POST['c']) ? $_POST['c'] : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" name="hitung" value="Hitung Determinan">
                                <input type="reset" value="Reset">
                            </td>
                        </tr>
                    </table>
                </form>
                
                <br>
                <h3>Rumus Determinan:</h3>
                <p><strong>D = b² - 4ac</strong></p>
                
                <h3>Interpretasi Hasil:</h3>
                <ul>
                    <li><strong>D > 0:</strong> Kurva di Atas Garis</li>
                    <li><strong>D = 0:</strong> Berada di Garis Kurva</li>
                    <li><strong>D < 0:</strong> Di Bawah Garis Kurva</li>
                </ul>
                
                <h3>Tentang Determinan:</h3>
                <p>Determinan adalah nilai yang menentukan sifat persamaan kuadrat ax² + bx + c = 0:</p>
                <ul>
                    <li><strong>D > 0:</strong> Memiliki 2 akar real berbeda</li>
                    <li><strong>D = 0:</strong> Memiliki 2 akar real sama</li>
                    <li><strong>D < 0:</strong> Memiliki 2 akar kompleks</li>
                </ul>
            </td>
            
            <!-- Hasil Perhitungan -->
            <td>
                <center><h2>HASIL PERHITUNGAN DETERMINAN</h2></center>
                
                <?php
                // Function untuk menghitung determinan
                function hitungDeterminan($a, $b, $c) {
                    $determinan = ($b * $b) - (4 * $a * $c);
                    return $determinan;
                }
                
                // Function untuk menentukan keterangan posisi kurva
                function tentukanPosisiKurva($determinan) {
                    if ($determinan > 0) {
                        return "Kurva di Atas Garis";
                    } elseif ($determinan == 0) {
                        return "Berada di Garis Kurva";
                    } else {
                        return "Di Bawah Garis Kurva";
                    }
                }
                
                // Function untuk menentukan jenis akar
                function tentukanJenisAkar($determinan) {
                    if ($determinan > 0) {
                        return "Memiliki 2 akar real berbeda";
                    } elseif ($determinan == 0) {
                        return "Memiliki 2 akar real sama";
                    } else {
                        return "Memiliki 2 akar kompleks (imajiner)";
                    }
                }
                
                // Function untuk menentukan warna berdasarkan determinan
                function warnaDeterminan($determinan) {
                    if ($determinan > 0) {
                        return 'green';
                    } elseif ($determinan == 0) {
                        return 'blue';
                    } else {
                        return 'red';
                    }
                }
                
                // Function untuk menghitung akar-akar persamaan (bonus)
                function hitungAkar($a, $b, $determinan) {
                    if ($a == 0) {
                        return "Bukan persamaan kuadrat (a = 0)";
                    }
                    
                    if ($determinan > 0) {
                        $akar1 = (-$b + sqrt($determinan)) / (2 * $a);
                        $akar2 = (-$b - sqrt($determinan)) / (2 * $a);
                        return "x₁ = " . round($akar1, 4) . ", x₂ = " . round($akar2, 4);
                    } elseif ($determinan == 0) {
                        $akar = -$b / (2 * $a);
                        return "x₁ = x₂ = " . round($akar, 4);
                    } else {
                        $real = -$b / (2 * $a);
                        $imajiner = sqrt(abs($determinan)) / (2 * $a);
                        return "x₁ = " . round($real, 4) . " + " . round($imajiner, 4) . "i<br>" .
                               "x₂ = " . round($real, 4) . " - " . round($imajiner, 4) . "i";
                    }
                }
                
                if (isset($_POST['hitung'])) {
                    // Ambil data dari form
                    $a = (float)$_POST['a'];
                    $b = (float)$_POST['b'];
                    $c = (float)$_POST['c'];
                    
                    // Hitung determinan menggunakan function
                    $determinan = hitungDeterminan($a, $b, $c);
                    $posisiKurva = tentukanPosisiKurva($determinan);
                    $jenisAkar = tentukanJenisAkar($determinan);
                    $warna = warnaDeterminan($determinan);
                    $akarPersamaan = hitungAkar($a, $b, $determinan);
                    
                    // Tampilkan hasil
                    echo "<h3>Input Nilai:</h3>";
                    echo "<strong>a = </strong>" . $a . "<br>";
                    echo "<strong>b = </strong>" . $b . "<br>";
                    echo "<strong>c = </strong>" . $c . "<br>";
                    echo "<hr>";
                    
                    echo "<h3>Persamaan Kuadrat:</h3>";
                    echo "<strong>" . $a . "x² + " . $b . "x + " . $c . " = 0</strong><br>";
                    echo "<hr>";
                    
                    echo "<h3>Perhitungan Determinan:</h3>";
                    echo "<strong>Rumus: </strong>D = b² - 4ac<br>";
                    echo "<strong>Substitusi: </strong>D = (" . $b . ")² - 4×(" . $a . ")×(" . $c . ")<br>";
                    echo "<strong>Perhitungan: </strong>D = " . ($b * $b) . " - " . (4 * $a * $c) . "<br>";
                    echo "<hr>";
                    
                    echo "<h3>Hasil Akhir:</h3>";
                    echo "<strong>Nilai Determinan (D): </strong><span style='color: " . $warna . "; font-size: 18px; font-weight: bold;'>" . $determinan . "</span><br>";
                    echo "<strong>Keterangan: </strong><span style='color: " . $warna . "; font-weight: bold;'>" . $posisiKurva . "</span><br>";
                    echo "<strong>Jenis Akar: </strong>" . $jenisAkar . "<br>";
                    echo "<hr>";
                    
                    echo "<h3>Akar-akar Persamaan:</h3>";
                    echo "<strong>" . $akarPersamaan . "</strong><br>";
                    echo "<hr>";
                    
                    // Tambahan informasi visual
                    echo "<h3>Visualisasi:</h3>";
                    if ($determinan > 0) {
                        echo "<p style='color: green;'>📈 <strong>Parabola memotong sumbu-x di 2 titik berbeda</strong></p>";
                        echo "<p>Grafik berada di atas garis x, memiliki titik minimum/maksimum.</p>";
                    } elseif ($determinan == 0) {
                        echo "<p style='color: blue;'>📊 <strong>Parabola menyentuh sumbu-x di 1 titik</strong></p>";
                        echo "<p>Grafik berada tepat di garis, memiliki 1 titik singgung.</p>";
                    } else {
                        echo "<p style='color: red;'>📉 <strong>Parabola tidak memotong sumbu-x</strong></p>";
                        echo "<p>Grafik berada di bawah garis, tidak ada titik potong real.</p>";
                    }
                    
                } else {
                    echo "<p>Silakan isi form di sebelah kiri untuk menghitung determinan.</p>";
                    echo "<br>";
                    echo "<h3>Cara Penggunaan:</h3>";
                    echo "<ol>";
                    echo "<li>Masukkan nilai a, b, dan c</li>";
                    echo "<li>Klik tombol 'Hitung Determinan'</li>";
                    echo "<li>Lihat hasil perhitungan dan interpretasi</li>";
                    echo "</ol>";
                    
                    echo "<h3>Contoh Perhitungan:</h3>";
                    echo "<p><strong>Contoh 1: a=1, b=5, c=6</strong></p>";
                    echo "<p>D = 5² - 4×1×6 = 25 - 24 = 1</p>";
                    echo "<p>Hasil: D > 0 → Kurva di Atas Garis</p>";
                    echo "<br>";
                    
                    echo "<p><strong>Contoh 2: a=1, b=4, c=4</strong></p>";
                    echo "<p>D = 4² - 4×1×4 = 16 - 16 = 0</p>";
                    echo "<p>Hasil: D = 0 → Berada di Garis Kurva</p>";
                    echo "<br>";
                    
                    echo "<p><strong>Contoh 3: a=1, b=2, c=5</strong></p>";
                    echo "<p>D = 2² - 4×1×5 = 4 - 20 = -16</p>";
                    echo "<p>Hasil: D < 0 → Di Bawah Garis Kurva</p>";
                }
                ?>
            </td>
        </tr>
    </table>
</body>
</html>
