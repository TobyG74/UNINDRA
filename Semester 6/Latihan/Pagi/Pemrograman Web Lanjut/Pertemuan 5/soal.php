<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Latihan Pertemuan 5</title>
</head>
<body>
<body>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <!-- Form Input -->
            <td>
                <center><h2>GENERATOR TABEL DINAMIS</h2></center>
                <form method="post" action="">
                    <table>
                        <tr>
                            <td>Jumlah Baris:</td>
                            <td><input type="number" name="baris" min="1" max="15" value="<?php echo isset($_POST['baris']) ? htmlspecialchars($_POST['baris']) : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>Jumlah Kolom:</td>
                            <td><input type="number" name="kolom" min="1" max="15" value="<?php echo isset($_POST['kolom']) ? htmlspecialchars($_POST['kolom']) : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="Buat Tabel">
                            </td>
                        </tr>
                    </table>
                </form>
            </td>
            
            <!-- Hasil Tabel -->
            <td>
                <center><h2>HASIL TABEL DINAMIS</h2></center>
                <?php
                if ($_SERVER["REQUEST_METHOD"] == "POST") {
                    $baris = (int)$_POST['baris'];
                    $kolom = (int)$_POST['kolom'];
                    
                    // Validasi input
                    if ($baris < 1 || $baris > 15 || $kolom < 1 || $kolom > 15) {
                        echo "<p><strong>Error: Jumlah baris dan kolom harus antara 1-15!</strong></p>";
                    } else {
                        // Tampilkan informasi dimensi
                        echo "<p><strong>Dimensi Tabel: {$kolom} Baris × {$baris} Kolom</strong></p>";
                        echo "<p><strong>Total Sel: " . ($baris * $kolom) . " sel</strong></p>";
                        echo "<br>";
                        
                        // Generate tabel
                        echo "<table border='1' cellpadding='10' cellspacing='0'>";
                        for ($i = 1; $i <= $kolom; $i++) {
                            echo "<tr>";
                            for ($j = 1; $j <= $baris; $j++) {
                                echo "<td>OKE</td>";
                            }
                            echo "</tr>";
                        }
                        echo "</table>";
                        
                        echo "<br><p><strong>Tabel berhasil dibuat!</strong></p>";
                    }
                } else {
                    echo "<p>Silakan isi form di sebelah kiri untuk membuat tabel dinamis.</p>";
                    echo "<br>";
                    echo "<p><strong>Fitur:</strong></p>";
                    echo "<ul>";
                    echo "<li>Input range 1-15</li>";
                    echo "<li>Validasi otomatis</li>";
                    echo "<li>Preview real-time</li>";
                    echo "</ul>";
                }
                ?>
            </td>
        </tr>
    </table>
</body>
</html>