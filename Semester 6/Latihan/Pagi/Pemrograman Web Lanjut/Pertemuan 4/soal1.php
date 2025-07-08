<?php
/**
 * Soal 1: Program Konversi Nilai Angka ke Nilai Huruf
 * 
 * Range nilai:
 * Nilai >= 85 dan <= 100 = A
 * Nilai >= 70 dan <= 84  = B
 * Nilai >= 60 dan < 70   = C
 * Nilai >= 50 dan < 60   = D
 * Nilai < 50             = E
 */

echo "<h2>Program Konversi Nilai Angka ke Nilai Huruf</h2>";
echo "<hr>";

// Contoh dengan beberapa nilai
$nilai_mahasiswa = [95, 82, 67, 55, 45, 100, 0, 75];

echo "<h3>Tabel Konversi Nilai:</h3>";
echo "<table border='1' cellpadding='5' cellspacing='0'>";
echo "<tr><th>Nilai Angka</th><th>Nilai Huruf</th><th>Keterangan</th></tr>";

foreach ($nilai_mahasiswa as $nilai) {
    $nilai_huruf = "";
    $keterangan = "";
    
    // Menggunakan operator perbandingan untuk konversi
    if ($nilai >= 85 && $nilai <= 100) {
        $nilai_huruf = "A";
        $keterangan = "Sangat Baik";
    } elseif ($nilai >= 70 && $nilai <= 84) {
        $nilai_huruf = "B";
        $keterangan = "Baik";
    } elseif ($nilai >= 60 && $nilai < 70) {
        $nilai_huruf = "C";
        $keterangan = "Cukup";
    } elseif ($nilai >= 50 && $nilai < 60) {
        $nilai_huruf = "D";
        $keterangan = "Kurang";
    } else {
        $nilai_huruf = "E";
        $keterangan = "Sangat Kurang";
    }
    
    echo "<tr>";
    echo "<td style='text-align: center;'>$nilai</td>";
    echo "<td style='text-align: center; font-weight: bold;'>$nilai_huruf</td>";
    echo "<td>$keterangan</td>";
    echo "</tr>";
}

echo "</table>";

// Input manual untuk testing
echo "<br><h3>Test Input Manual:</h3>";

// Simulasi input (bisa diganti dengan $_POST jika menggunakan form)
$input_nilai = 88;

echo "Nilai yang diinput: <b>$input_nilai</b><br>";

if ($input_nilai >= 85 && $input_nilai <= 100) {
    echo "Hasil: <b style='color: green;'>A (Sangat Baik)</b>";
} elseif ($input_nilai >= 70 && $input_nilai <= 84) {
    echo "Hasil: <b style='color: blue;'>B (Baik)</b>";
} elseif ($input_nilai >= 60 && $input_nilai < 70) {
    echo "Hasil: <b style='color: orange;'>C (Cukup)</b>";
} elseif ($input_nilai >= 50 && $input_nilai < 60) {
    echo "Hasil: <b style='color: red;'>D (Kurang)</b>";
} else {
    echo "Hasil: <b style='color: darkred;'>E (Sangat Kurang)</b>";
}

echo "<br><br>";

// Fungsi untuk konversi nilai (reusable)
function konversiNilai($nilai) {
    if ($nilai >= 85 && $nilai <= 100) {
        return ["huruf" => "A", "keterangan" => "Sangat Baik"];
    } elseif ($nilai >= 70 && $nilai <= 84) {
        return ["huruf" => "B", "keterangan" => "Baik"];
    } elseif ($nilai >= 60 && $nilai < 70) {
        return ["huruf" => "C", "keterangan" => "Cukup"];
    } elseif ($nilai >= 50 && $nilai < 60) {
        return ["huruf" => "D", "keterangan" => "Kurang"];
    } else {
        return ["huruf" => "E", "keterangan" => "Sangat Kurang"];
    }
}

echo "<h3>Menggunakan Fungsi:</h3>";
$test_nilai = 77;
$hasil = konversiNilai($test_nilai);
echo "Nilai $test_nilai = Grade {$hasil['huruf']} ({$hasil['keterangan']})";

echo "<br><br><i>Program ini menggunakan operator perbandingan (>=, <=, <) dan operator logika (&&) untuk menentukan grade nilai.</i>";
?>
