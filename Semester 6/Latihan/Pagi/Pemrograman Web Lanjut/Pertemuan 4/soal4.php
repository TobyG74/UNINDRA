<?php
/**
 * Soal 4: Program Konversi Angka menggunakan Switch-Case
 * 
 * Program ini mengkonversi angka 1-12 menjadi:
 * 1. Nama bulan
 * 2. Nama hari (1-7)
 * 3. Sistem penilaian (1-5)
 * 4. Konversi angka ke kata (0-9)
 */

echo "<h2>🔄 Program Konversi Angka dengan Switch-Case</h2>";
echo "<hr>";

// ========== 1. KONVERSI ANGKA KE NAMA BULAN ==========
echo "<h3>📅 1. Konversi Angka ke Nama Bulan (1-12)</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Angka</th>";
echo "<th style='padding: 10px;'>Nama Bulan</th>";
echo "<th style='padding: 10px;'>Bahasa Inggris</th>";
echo "<th style='padding: 10px;'>Jumlah Hari</th>";
echo "</tr>";

for ($bulan = 1; $bulan <= 12; $bulan++) {
    $nama_bulan = konversiKeBulan($bulan);
    $nama_english = konversiKeBulanInggris($bulan);
    $jumlah_hari = getJumlahHari($bulan);
    
    echo "<tr>";
    echo "<td style='padding: 10px; text-align: center;'>$bulan</td>";
    echo "<td style='padding: 10px;'>$nama_bulan</td>";
    echo "<td style='padding: 10px;'>$nama_english</td>";
    echo "<td style='padding: 10px; text-align: center;'>$jumlah_hari</td>";
    echo "</tr>";
}
echo "</table>";

echo "<hr>";

// ========== 2. KONVERSI ANGKA KE NAMA HARI ==========
echo "<h3>🗓️ 2. Konversi Angka ke Nama Hari (1-7)</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Angka</th>";
echo "<th style='padding: 10px;'>Nama Hari</th>";
echo "<th style='padding: 10px;'>Bahasa Inggris</th>";
echo "<th style='padding: 10px;'>Jenis Hari</th>";
echo "</tr>";

for ($hari = 1; $hari <= 7; $hari++) {
    $nama_hari = konversiKeHari($hari);
    $nama_english = konversiKeHariInggris($hari);
    $jenis_hari = getJenisHari($hari);
    $warna = ($jenis_hari == 'Weekend') ? '#dc3545' : '#28a745';
    
    echo "<tr>";
    echo "<td style='padding: 10px; text-align: center;'>$hari</td>";
    echo "<td style='padding: 10px;'>$nama_hari</td>";
    echo "<td style='padding: 10px;'>$nama_english</td>";
    echo "<td style='padding: 10px; color: $warna; font-weight: bold;'>$jenis_hari</td>";
    echo "</tr>";
}
echo "</table>";

echo "<hr>";

// ========== 3. SISTEM PENILAIAN ==========
echo "<h3>⭐ 3. Sistem Penilaian Bintang (1-5)</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Rating</th>";
echo "<th style='padding: 10px;'>Bintang</th>";
echo "<th style='padding: 10px;'>Kategori</th>";
echo "<th style='padding: 10px;'>Keterangan</th>";
echo "</tr>";

for ($rating = 1; $rating <= 5; $rating++) {
    $bintang = konversiKeBintang($rating);
    $kategori = getKategoriRating($rating);
    $keterangan = getKeteranganRating($rating);
    $warna = getWarnaRating($rating);
    
    echo "<tr>";
    echo "<td style='padding: 10px; text-align: center;'>$rating</td>";
    echo "<td style='padding: 10px; text-align: center; font-size: 18px;'>$bintang</td>";
    echo "<td style='padding: 10px; color: $warna; font-weight: bold;'>$kategori</td>";
    echo "<td style='padding: 10px;'>$keterangan</td>";
    echo "</tr>";
}
echo "</table>";

echo "<hr>";

// ========== 4. KONVERSI ANGKA KE KATA ==========
echo "<h3>🔢 4. Konversi Angka ke Kata (0-9)</h3>";
echo "<table border='1' style='border-collapse: collapse; width: 100%;'>";
echo "<tr style='background-color: #f8f9fa;'>";
echo "<th style='padding: 10px;'>Angka</th>";
echo "<th style='padding: 10px;'>Kata (Indonesia)</th>";
echo "<th style='padding: 10px;'>Kata (Inggris)</th>";
echo "<th style='padding: 10px;'>Romawi</th>";
echo "</tr>";

for ($angka = 0; $angka <= 9; $angka++) {
    $kata_indo = konversiKeKata($angka);
    $kata_english = konversiKeKataInggris($angka);
    $romawi = konversiKeRomawi($angka);
    
    echo "<tr>";
    echo "<td style='padding: 10px; text-align: center; font-size: 18px; font-weight: bold;'>$angka</td>";
    echo "<td style='padding: 10px;'>$kata_indo</td>";
    echo "<td style='padding: 10px;'>$kata_english</td>";
    echo "<td style='padding: 10px; text-align: center;'>$romawi</td>";
    echo "</tr>";
}
echo "</table>";

// ========== FUNGSI-FUNGSI KONVERSI ==========

/**
 * Konversi angka ke nama bulan
 */
function konversiKeBulan($bulan) {
    switch ($bulan) {
        case 1:
            return "Januari";
        case 2:
            return "Februari";
        case 3:
            return "Maret";
        case 4:
            return "April";
        case 5:
            return "Mei";
        case 6:
            return "Juni";
        case 7:
            return "Juli";
        case 8:
            return "Agustus";
        case 9:
            return "September";
        case 10:
            return "Oktober";
        case 11:
            return "November";
        case 12:
            return "Desember";
        default:
            return "Bulan tidak valid";
    }
}

/**
 * Konversi angka ke nama bulan bahasa Inggris
 */
function konversiKeBulanInggris($bulan) {
    switch ($bulan) {
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            return "Invalid month";
    }
}

/**
 * Mendapatkan jumlah hari dalam bulan
 */
function getJumlahHari($bulan) {
    switch ($bulan) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            return "31 hari";
        case 4:
        case 6:
        case 9:
        case 11:
            return "30 hari";
        case 2:
            return "28/29 hari";
        default:
            return "-";
    }
}

/**
 * Konversi angka ke nama hari
 */
function konversiKeHari($hari) {
    switch ($hari) {
        case 1:
            return "Senin";
        case 2:
            return "Selasa";
        case 3:
            return "Rabu";
        case 4:
            return "Kamis";
        case 5:
            return "Jumat";
        case 6:
            return "Sabtu";
        case 7:
            return "Minggu";
        default:
            return "Hari tidak valid";
    }
}

/**
 * Konversi angka ke nama hari bahasa Inggris
 */
function konversiKeHariInggris($hari) {
    switch ($hari) {
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
        case 7:
            return "Sunday";
        default:
            return "Invalid day";
    }
}

/**
 * Mendapatkan jenis hari (weekday/weekend)
 */
function getJenisHari($hari) {
    switch ($hari) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            return "Weekday";
        case 6:
        case 7:
            return "Weekend";
        default:
            return "-";
    }
}

/**
 * Konversi rating ke bintang
 */
function konversiKeBintang($rating) {
    switch ($rating) {
        case 1:
            return "⭐";
        case 2:
            return "⭐⭐";
        case 3:
            return "⭐⭐⭐";
        case 4:
            return "⭐⭐⭐⭐";
        case 5:
            return "⭐⭐⭐⭐⭐";
        default:
            return "-";
    }
}

/**
 * Mendapatkan kategori rating
 */
function getKategoriRating($rating) {
    switch ($rating) {
        case 1:
            return "Sangat Buruk";
        case 2:
            return "Buruk";
        case 3:
            return "Cukup";
        case 4:
            return "Baik";
        case 5:
            return "Sangat Baik";
        default:
            return "-";
    }
}

/**
 * Mendapatkan keterangan rating
 */
function getKeteranganRating($rating) {
    switch ($rating) {
        case 1:
            return "Perlu perbaikan menyeluruh";
        case 2:
            return "Masih banyak kekurangan";
        case 3:
            return "Standar, bisa ditingkatkan";
        case 4:
            return "Memuaskan, sedikit perbaikan";
        case 5:
            return "Luar biasa, pertahankan!";
        default:
            return "-";
    }
}

/**
 * Mendapatkan warna rating
 */
function getWarnaRating($rating) {
    switch ($rating) {
        case 1:
            return "#dc3545"; // Merah
        case 2:
            return "#fd7e14"; // Orange
        case 3:
            return "#ffc107"; // Kuning
        case 4:
            return "#20c997"; // Hijau muda
        case 5:
            return "#28a745"; // Hijau
        default:
            return "#6c757d"; // Abu-abu
    }
}

/**
 * Konversi angka ke kata Indonesia
 */
function konversiKeKata($angka) {
    switch ($angka) {
        case 0:
            return "Nol";
        case 1:
            return "Satu";
        case 2:
            return "Dua";
        case 3:
            return "Tiga";
        case 4:
            return "Empat";
        case 5:
            return "Lima";
        case 6:
            return "Enam";
        case 7:
            return "Tujuh";
        case 8:
            return "Delapan";
        case 9:
            return "Sembilan";
        default:
            return "Angka tidak valid";
    }
}

/**
 * Konversi angka ke kata Inggris
 */
function konversiKeKataInggris($angka) {
    switch ($angka) {
        case 0:
            return "Zero";
        case 1:
            return "One";
        case 2:
            return "Two";
        case 3:
            return "Three";
        case 4:
            return "Four";
        case 5:
            return "Five";
        case 6:
            return "Six";
        case 7:
            return "Seven";
        case 8:
            return "Eight";
        case 9:
            return "Nine";
        default:
            return "Invalid number";
    }
}

/**
 * Konversi angka ke romawi
 */
function konversiKeRomawi($angka) {
    switch ($angka) {
        case 0:
            return "-";
        case 1:
            return "I";
        case 2:
            return "II";
        case 3:
            return "III";
        case 4:
            return "IV";
        case 5:
            return "V";
        case 6:
            return "VI";
        case 7:
            return "VII";
        case 8:
            return "VIII";
        case 9:
            return "IX";
        default:
            return "-";
    }
}

echo "<hr>";
echo "<h3>📝 Contoh Input Manual:</h3>";
echo "<div style='background-color: #f8f9fa; padding: 15px; border-radius: 5px;'>";

// Contoh input manual
$input_bulan = 8;
$input_hari = 5;
$input_rating = 4;
$input_angka = 7;

echo "<p><strong>Input Bulan:</strong> $input_bulan → " . konversiKeBulan($input_bulan) . " (" . konversiKeBulanInggris($input_bulan) . ")</p>";
echo "<p><strong>Input Hari:</strong> $input_hari → " . konversiKeHari($input_hari) . " (" . konversiKeHariInggris($input_hari) . ")</p>";
echo "<p><strong>Input Rating:</strong> $input_rating → " . konversiKeBintang($input_rating) . " (" . getKategoriRating($input_rating) . ")</p>";
echo "<p><strong>Input Angka:</strong> $input_angka → " . konversiKeKata($input_angka) . " (" . konversiKeKataInggris($input_angka) . ")</p>";

echo "</div>";

echo "<hr>";
echo "<h3>💡 Keunggulan Switch-Case:</h3>";
echo "<ul>";
echo "<li><strong>Lebih Efisien:</strong> Untuk banyak kondisi, switch-case lebih cepat dari if-else</li>";
echo "<li><strong>Lebih Mudah Dibaca:</strong> Kode menjadi lebih terstruktur dan mudah dipahami</li>";
echo "<li><strong>Mudah Maintenance:</strong> Menambah atau mengubah kondisi menjadi lebih mudah</li>";
echo "<li><strong>Optimasi Compiler:</strong> Compiler dapat mengoptimalkan switch-case lebih baik</li>";
echo "</ul>";

echo "<hr>";
echo "<p><strong>🎯 Penggunaan Switch-Case:</strong></p>";
echo "<ul>";
echo "<li>Gunakan switch-case ketika membandingkan satu variabel dengan banyak nilai</li>";
echo "<li>Setiap case harus diakhiri dengan <code>break;</code> untuk mencegah fall-through</li>";
echo "<li>Gunakan <code>default:</code> untuk menangani nilai yang tidak terdefinisi</li>";
echo "<li>Switch-case hanya bisa membandingkan dengan nilai eksact (==), bukan range</li>";
echo "</ul>";

echo "<p><em>🏫 Dibuat untuk Pemrograman Web Lanjut - Pertemuan 4</em></p>";
?>
