<?php
/**
 * Soal 2: Program untuk Mengecek Bilangan Positif, Negatif, atau Nol
 * 
 * Program ini akan memeriksa apakah bilangan yang diinput adalah:
 * - Positif (> 0)
 * - Negatif (< 0) 
 * - Nol (= 0)
 */

echo "<h2>🔢 Program Pengecekan Bilangan Positif, Negatif, atau Nol</h2>";
echo "<hr>";

// Contoh bilangan untuk testing
$contoh_bilangan = [15, -8, 0, 3.5, -12.7, 100, -0.5, 0.0];

echo "<h3>Testing dengan berbagai bilangan:</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Bilangan</th>";
echo "<th style='padding: 10px;'>Jenis</th>";
echo "<th style='padding: 10px;'>Keterangan</th>";
echo "</tr>";

foreach ($contoh_bilangan as $bilangan) {
    $jenis = cekJenisBilangan($bilangan);
    $warna = getWarnaBilangan($jenis);
    $keterangan = getKeteranganBilangan($jenis);
    
    echo "<tr>";
    echo "<td style='padding: 10px; text-align: center;'>$bilangan</td>";
    echo "<td style='padding: 10px; text-align: center; color: $warna; font-weight: bold;'>$jenis</td>";
    echo "<td style='padding: 10px;'>$keterangan</td>";
    echo "</tr>";
}

echo "</table>";

echo "<hr>";

// Input manual (simulasi)
echo "<h3>Contoh Input Manual:</h3>";
$input_bilangan = -25;
echo "Input bilangan: <strong>$input_bilangan</strong><br>";
$hasil_cek = cekJenisBilangan($input_bilangan);
$warna_hasil = getWarnaBilangan($hasil_cek);
echo "Hasil pengecekan: <strong style='color: $warna_hasil;'>$hasil_cek</strong><br>";
echo "Keterangan: " . getKeteranganBilangan($hasil_cek) . "<br>";

/**
 * Cek Jenis Bilangan
 * @param float $bilangan Bilangan yang akan dicek
 * @return string Jenis bilangan (Positif, Negatif, Nol)
 */
function cekJenisBilangan($bilangan) {
    // Validasi input
    if (!is_numeric($bilangan)) {
        return "Bukan Bilangan";
    }
    
    // Menggunakan operator perbandingan
    if ($bilangan > 0) {
        return "Positif";
    } elseif ($bilangan < 0) {
        return "Negatif";
    } else {
        return "Nol";
    }
}

/**
 * Get Kode Warna Bilangan
 * @param string $jenis Jenis bilangan
 * @return string Kode warna CSS
 */
function getWarnaBilangan($jenis) {
    switch ($jenis) {
        case 'Positif':
            return '#28a745'; // Hijau
        case 'Negatif':
            return '#dc3545'; // Merah
        case 'Nol':
            return '#17a2b8'; // Biru
        default:
            return '#6c757d'; // Abu-abu
    }
}

/**
 * Get Keterangan Bilangan
 * @param string $jenis Jenis bilangan
 * @return string Keterangan bilangan
 */
function getKeteranganBilangan($jenis) {
    switch ($jenis) {
        case 'Positif':
            return "Bilangan lebih besar dari nol";
        case 'Negatif':
            return "Bilangan lebih kecil dari nol";
        case 'Nol':
            return "Bilangan sama dengan nol";
        default:
            return "Input tidak valid";
    }
}

echo "<hr>";
echo "<h3>📝 Penjelasan Konsep:</h3>";
echo "<div style='background-color: #f8f9fa; padding: 15px; border-radius: 5px;'>";
echo "<ul>";
echo "<li><strong>Bilangan Positif:</strong> Bilangan yang nilainya lebih besar dari 0 (contoh: 1, 5, 10.5)</li>";
echo "<li><strong>Bilangan Negatif:</strong> Bilangan yang nilainya lebih kecil dari 0 (contoh: -1, -5, -10.5)</li>";
echo "<li><strong>Bilangan Nol:</strong> Bilangan yang nilainya sama dengan 0</li>";
echo "</ul>";
echo "</div>";

echo "<hr>";
echo "<h3>🔍 Operator yang Digunakan:</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Operator</th>";
echo "<th style='padding: 10px;'>Simbol</th>";
echo "<th style='padding: 10px;'>Contoh</th>";
echo "<th style='padding: 10px;'>Keterangan</th>";
echo "</tr>";

$operators = [
    ['Lebih besar dari', '>', '$bilangan > 0', 'Mengecek bilangan positif'],
    ['Lebih kecil dari', '<', '$bilangan < 0', 'Mengecek bilangan negatif'],
    ['Sama dengan', '==', '$bilangan == 0', 'Mengecek bilangan nol']
];

foreach ($operators as $op) {
    echo "<tr>";
    echo "<td style='padding: 10px;'>{$op[0]}</td>";
    echo "<td style='padding: 10px; text-align: center; font-family: monospace;'>{$op[1]}</td>";
    echo "<td style='padding: 10px; font-family: monospace;'>{$op[2]}</td>";
    echo "<td style='padding: 10px;'>{$op[3]}</td>";
    echo "</tr>";
}

echo "</table>";

echo "<hr>";
echo "<p><strong>💡 Cara Penggunaan:</strong></p>";
echo "<ul>";
echo "<li>Input bilangan apa saja (integer atau float)</li>";
echo "<li>Program akan mengecek apakah bilangan tersebut positif, negatif, atau nol</li>";
echo "<li>Hasil akan ditampilkan dengan warna yang berbeda untuk setiap jenis</li>";
echo "</ul>";

echo "<p><em>🏫 Dibuat untuk Pemrograman Web Lanjut - Pertemuan 4</em></p>";
?>
