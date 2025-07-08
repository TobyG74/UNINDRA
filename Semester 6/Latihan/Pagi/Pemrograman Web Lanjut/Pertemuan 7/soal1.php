<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Latihan 1 - Pertemuan 7</title>
</head>
<body>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <!-- Form Input Nilai -->
            <td>
                <center><h2>PERHITUNGAN KARTU HASIL STUDI (KHS)</h2></center>
                <form method="POST" action="">
                    <table>
                        <tr>
                            <td>Nama Mahasiswa:</td>
                            <td><input type="text" name="nama" value="<?php echo isset($_POST['nama']) ? htmlspecialchars($_POST['nama']) : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>NIM:</td>
                            <td><input type="text" name="nim" value="<?php echo isset($_POST['nim']) ? htmlspecialchars($_POST['nim']) : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>Mata Kuliah:</td>
                            <td><input type="text" name="matakuliah" value="<?php echo isset($_POST['matakuliah']) ? htmlspecialchars($_POST['matakuliah']) : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>Nilai Tugas (0-100):</td>
                            <td><input type="number" name="tugas" min="0" max="100" value="<?php echo isset($_POST['tugas']) ? $_POST['tugas'] : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>Nilai UTS (0-100):</td>
                            <td><input type="number" name="uts" min="0" max="100" value="<?php echo isset($_POST['uts']) ? $_POST['uts'] : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>Nilai UAS (0-100):</td>
                            <td><input type="number" name="uas" min="0" max="100" value="<?php echo isset($_POST['uas']) ? $_POST['uas'] : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" name="hitung" value="Hitung KHS">
                                <input type="reset" value="Reset">
                            </td>
                        </tr>
                    </table>
                </form>
                
                <br>
                <h3>Keterangan Bobot Penilaian:</h3>
                <ul>
                    <li><strong>Tugas:</strong> 20% (0.2)</li>
                    <li><strong>UTS:</strong> 30% (0.3)</li>
                    <li><strong>UAS:</strong> 50% (0.5)</li>
                </ul>
                
                <h3>Grade Penilaian:</h3>
                <ul>
                    <li><strong>A:</strong> Nilai KHS ≥ 90</li>
                    <li><strong>B:</strong> Nilai KHS ≥ 80</li>
                    <li><strong>C:</strong> Nilai KHS ≥ 60</li>
                    <li><strong>D:</strong> Nilai KHS < 60</li>
                </ul>
            </td>
            
            <!-- Hasil Perhitungan -->
            <td>
                <center><h2>HASIL PERHITUNGAN KHS</h2></center>
                
                <?php
                // Function untuk menghitung nilai KHS
                function hitungKHS($tugas, $uts, $uas) {
                    $khs = ($tugas * 0.2) + ($uts * 0.3) + ($uas * 0.5);
                    return round($khs, 2);
                }
                
                // Function untuk menentukan grade berdasarkan nilai KHS
                function tentukanGrade($nilaiKHS) {
                    if ($nilaiKHS >= 90) {
                        return "A";
                    } elseif ($nilaiKHS >= 80) {
                        return "B";
                    } elseif ($nilaiKHS >= 60) {
                        return "C";
                    } else {
                        return "D";
                    }
                }
                
                // Function untuk menentukan keterangan lulus/tidak lulus
                function tentukanStatus($grade) {
                    if ($grade == "A" || $grade == "B" || $grade == "C") {
                        return "LULUS";
                    } else {
                        return "TIDAK LULUS";
                    }
                }
                
                // Function untuk menentukan warna grade
                function warnaGrade($grade) {
                    switch ($grade) {
                        case 'A':
                            return 'green';
                        case 'B':
                            return 'blue';
                        case 'C':
                            return 'orange';
                        case 'D':
                            return 'red';
                        default:
                            return 'black';
                    }
                }
                
                if (isset($_POST['hitung'])) {
                    // Ambil data dari form
                    $nama = htmlspecialchars($_POST['nama']);
                    $nim = htmlspecialchars($_POST['nim']);
                    $matakuliah = htmlspecialchars($_POST['matakuliah']);
                    $tugas = (float)$_POST['tugas'];
                    $uts = (float)$_POST['uts'];
                    $uas = (float)$_POST['uas'];
                    
                    // Validasi input nilai
                    if ($tugas < 0 || $tugas > 100 || $uts < 0 || $uts > 100 || $uas < 0 || $uas > 100) {
                        echo "<p style='color: red;'><strong>Error: Nilai harus antara 0-100!</strong></p>";
                    } else {
                        // Hitung KHS menggunakan function
                        $nilaiKHS = hitungKHS($tugas, $uts, $uas);
                        $grade = tentukanGrade($nilaiKHS);
                        $status = tentukanStatus($grade);
                        $warna = warnaGrade($grade);
                        
                        // Tampilkan hasil
                        echo "<h3>Data Mahasiswa:</h3>";
                        echo "<strong>Nama: </strong>" . $nama . "<br>";
                        echo "<strong>NIM: </strong>" . $nim . "<br>";
                        echo "<strong>Mata Kuliah: </strong>" . $matakuliah . "<br>";
                        echo "<hr>";
                        
                        echo "<h3>Rincian Nilai:</h3>";
                        echo "<strong>Nilai Tugas: </strong>" . $tugas . " (Bobot 20%)<br>";
                        echo "<strong>Nilai UTS: </strong>" . $uts . " (Bobot 30%)<br>";
                        echo "<strong>Nilai UAS: </strong>" . $uas . " (Bobot 50%)<br>";
                        echo "<hr>";
                        
                        echo "<h3>Perhitungan KHS:</h3>";
                        echo "<strong>Rumus: </strong>Tugas×0.2 + UTS×0.3 + UAS×0.5<br>";
                        echo "<strong>Perhitungan: </strong>";
                        echo $tugas . "×0.2 + " . $uts . "×0.3 + " . $uas . "×0.5<br>";
                        echo "<strong>Perhitungan: </strong>";
                        echo ($tugas * 0.2) . " + " . ($uts * 0.3) . " + " . ($uas * 0.5) . "<br>";
                        echo "<hr>";
                        
                        echo "<h3>Hasil Akhir:</h3>";
                        echo "<strong>Nilai KHS: </strong>" . $nilaiKHS . "<br>";
                        echo "<strong>Grade: </strong><span style='color: " . $warna . "; font-size: 20px; font-weight: bold;'>" . $grade . "</span><br>";
                        echo "<strong>Status: </strong><span style='color: " . ($status == "LULUS" ? "green" : "red") . "; font-weight: bold;'>" . $status . "</span><br>";
                        
                        // Tambahan informasi berdasarkan grade
                        echo "<br><h4>Keterangan:</h4>";
                        switch ($grade) {
                            case 'A':
                                echo "<p style='color: green;'>Excellent! Prestasi yang sangat baik.</p>";
                                break;
                            case 'B':
                                echo "<p style='color: blue;'>Good! Prestasi yang baik.</p>";
                                break;
                            case 'C':
                                echo "<p style='color: orange;'>Satisfactory. Perlu sedikit peningkatan.</p>";
                                break;
                            case 'D':
                                echo "<p style='color: red;'>Needs Improvement. Perlu belajar lebih giat.</p>";
                                break;
                        }
                    }
                } else {
                    echo "<p>Silakan isi form di sebelah kiri untuk menghitung nilai KHS.</p>";
                    echo "<br>";
                    echo "<h3>Cara Penggunaan:</h3>";
                    echo "<ol>";
                    echo "<li>Isi data mahasiswa (Nama, NIM, Mata Kuliah)</li>";
                    echo "<li>Masukkan nilai Tugas, UTS, dan UAS (0-100)</li>";
                    echo "<li>Klik tombol 'Hitung KHS'</li>";
                    echo "<li>Lihat hasil perhitungan dan grade yang diperoleh</li>";
                    echo "</ol>";
                    
                    echo "<h3>Contoh Perhitungan:</h3>";
                    echo "<p><strong>Tugas: 85, UTS: 80, UAS: 90</strong></p>";
                    echo "<p>KHS = (85×0.2) + (80×0.3) + (90×0.5)</p>";
                    echo "<p>KHS = 17 + 24 + 45 = 86</p>";
                    echo "<p>Grade: B (Karena 86 ≥ 80)</p>";
                }
                ?>
            </td>
        </tr>
    </table>
</body>
</html>
