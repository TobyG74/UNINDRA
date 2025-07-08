<?php
/**
 * Soal 3: Program untuk Mengecek Bilangan Genap atau Ganjil
 * 
 * Program ini akan memeriksa apakah bilangan yang diinput adalah:
 * - Genap (habis dibagi 2)
 * - Ganjil (tidak habis dibagi 2)
 */

echo "<h2>🎯 Program Pengecekan Bilangan Genap atau Ganjil</h2>";
echo "<hr>";

// Contoh bilangan untuk testing
$contoh_bilangan = [1, 2, 3, 4, 5, 10, 15, 20, 25, 100, 99, 0];

echo "<h3>Testing dengan berbagai bilangan:</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Bilangan</th>";
echo "<th style='padding: 10px;'>Jenis</th>";
echo "<th style='padding: 10px;'>Sisa Bagi 2</th>";
echo "<th style='padding: 10px;'>Keterangan</th>";
echo "</tr>";

foreach ($contoh_bilangan as $bilangan) {
    $jenis = cekGenapGanjil($bilangan);
    $sisa = $bilangan % 2;
    $warna = getWarnaGenapGanjil($jenis);
    $keterangan = getKeteranganGenapGanjil($jenis);
    
    echo "<tr>";
    echo "<td style='padding: 10px; text-align: center;'>$bilangan</td>";
    echo "<td style='padding: 10px; text-align: center; color: $warna; font-weight: bold;'>$jenis</td>";
    echo "<td style='padding: 10px; text-align: center;'>$sisa</td>";
    echo "<td style='padding: 10px;'>$keterangan</td>";
    echo "</tr>";
}

echo "</table>";

echo "<hr>";

// Input manual (simulasi)
echo "<h3>Contoh Input Manual:</h3>";
$input_bilangan = 17;
echo "Input bilangan: <strong>$input_bilangan</strong><br>";
$hasil_cek = cekGenapGanjil($input_bilangan);
$warna_hasil = getWarnaGenapGanjil($hasil_cek);
$sisa_bagi = $input_bilangan % 2;
echo "Sisa bagi dengan 2: <strong>$sisa_bagi</strong><br>";
echo "Hasil pengecekan: <strong style='color: $warna_hasil;'>$hasil_cek</strong><br>";
echo "Keterangan: " . getKeteranganGenapGanjil($hasil_cek) . "<br>";

/**
 * Fungsi untuk mengecek bilangan genap atau ganjil
 * @param int $bilangan Bilangan yang akan dicek
 * @return string Jenis bilangan (Genap, Ganjil)
 */
function cekGenapGanjil($bilangan) {
    // Validasi input
    if (!is_numeric($bilangan)) {
        return "Bukan Bilangan";
    }
    
    // Konversi ke integer jika berupa float
    $bilangan = (int)$bilangan;
    
    // Menggunakan operator modulus (%) untuk mengecek sisa bagi
    if ($bilangan % 2 == 0) {
        return "Genap";
    } else {
        return "Ganjil";
    }
}

/**
 * Fungsi untuk mendapatkan warna berdasarkan jenis bilangan
 * @param string $jenis Jenis bilangan
 * @return string Kode warna CSS
 */
function getWarnaGenapGanjil($jenis) {
    switch ($jenis) {
        case 'Genap':
            return '#28a745'; // Hijau
        case 'Ganjil':
            return '#dc3545'; // Merah
        default:
            return '#6c757d'; // Abu-abu
    }
}

/**
 * Fungsi untuk mendapatkan keterangan bilangan
 * @param string $jenis Jenis bilangan
 * @return string Keterangan bilangan
 */
function getKeteranganGenapGanjil($jenis) {
    switch ($jenis) {
        case 'Genap':
            return "Bilangan habis dibagi 2 (sisa 0)";
        case 'Ganjil':
            return "Bilangan tidak habis dibagi 2 (sisa 1)";
        default:
            return "Input tidak valid";
    }
}

echo "<hr>";
echo "<h3>📝 Penjelasan Konsep:</h3>";
echo "<div style='background-color: #f8f9fa; padding: 15px; border-radius: 5px;'>";
echo "<ul>";
echo "<li><strong>Bilangan Genap:</strong> Bilangan yang habis dibagi 2 (sisa bagi = 0)</li>";
echo "<li><strong>Bilangan Ganjil:</strong> Bilangan yang tidak habis dibagi 2 (sisa bagi = 1)</li>";
echo "<li><strong>Operator Modulus (%):</strong> Memberikan sisa hasil pembagian</li>";
echo "</ul>";
echo "</div>";

echo "<hr>";
echo "<h3>🔍 Cara Kerja Operator Modulus:</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Operasi</th>";
echo "<th style='padding: 10px;'>Hasil</th>";
echo "<th style='padding: 10px;'>Keterangan</th>";
echo "</tr>";

$contoh_modulus = [
    ['4 % 2', '0', 'Genap - habis dibagi'],
    ['5 % 2', '1', 'Ganjil - sisa 1'],
    ['10 % 2', '0', 'Genap - habis dibagi'],
    ['13 % 2', '1', 'Ganjil - sisa 1'],
    ['0 % 2', '0', 'Genap - nol habis dibagi apapun']
];

foreach ($contoh_modulus as $example) {
    echo "<tr>";
    echo "<td style='padding: 10px; font-family: monospace;'>{$example[0]}</td>";
    echo "<td style='padding: 10px; text-align: center; font-family: monospace;'>{$example[1]}</td>";
    echo "<td style='padding: 10px;'>{$example[2]}</td>";
    echo "</tr>";
}

echo "</table>";

echo "<hr>";
echo "<h3>🎲 Contoh dalam Kehidupan Sehari-hari:</h3>";
echo "<div style='background-color: #e9ecef; padding: 15px; border-radius: 5px;'>";
echo "<ul>";
echo "<li><strong>Nomor Rumah:</strong> Rumah dengan nomor genap biasanya di satu sisi jalan</li>";
echo "<li><strong>Ganjil-Genap Kendaraan:</strong> Pembatasan berdasarkan plat nomor</li>";
echo "<li><strong>Pembagian Kelompok:</strong> Membagi siswa berdasarkan nomor absen</li>";
echo "<li><strong>Sistem Antrian:</strong> Nomor antrian genap/ganjil untuk layanan berbeda</li>";
echo "</ul>";
echo "</div>";

echo "<hr>";
echo "<h3>🧮 Rangkuman Penggunaan:</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Kondisi</th>";
echo "<th style='padding: 10px;'>Rumus</th>";
echo "<th style='padding: 10px;'>Hasil</th>";
echo "</tr>";
echo "<tr>";
echo "<td style='padding: 10px;'>Bilangan Genap</td>";
echo "<td style='padding: 10px; font-family: monospace;'>bilangan % 2 == 0</td>";
echo "<td style='padding: 10px; color: #28a745; font-weight: bold;'>GENAP</td>";
echo "</tr>";
echo "<tr>";
echo "<td style='padding: 10px;'>Bilangan Ganjil</td>";
echo "<td style='padding: 10px; font-family: monospace;'>bilangan % 2 == 1</td>";
echo "<td style='padding: 10px; color: #dc3545; font-weight: bold;'>GANJIL</td>";
echo "</tr>";
echo "</table>";

echo "<hr>";
echo "<p><strong>💡 Cara Penggunaan:</strong></p>";
echo "<ul>";
echo "<li>Input bilangan integer apa saja</li>";
echo "<li>Program akan menggunakan operator modulus (%) untuk mengecek sisa bagi dengan 2</li>";
echo "<li>Jika sisa = 0, maka bilangan genap</li>";
echo "<li>Jika sisa = 1, maka bilangan ganjil</li>";
echo "</ul>";

echo "<p><em>🏫 Dibuat untuk Pemrograman Web Lanjut - Pertemuan 4</em></p>";
?>
