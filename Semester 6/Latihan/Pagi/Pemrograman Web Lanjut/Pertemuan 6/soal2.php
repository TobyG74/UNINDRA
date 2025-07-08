<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Latihan 2 - Pertemuan 6</title>
</head>
<body>
<body>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <!-- Form Pemesanan Tiket -->
            <td>
                <center>
                    <strong>FORM TIKET BOLA SEA GAMES 2018</strong><br><br>
                    <strong>INDONESIA VS MALAYSIA</strong><br>
                    <strong>PUKUL 15.00 WIB</strong>
                </center>
                <br>
                
                <form method="POST" action="">
                    <table>
                        <tr>
                            <td>NAMA PEMESAN</td>
                            <td>=</td>
                            <td><input type="text" name="nama" value="<?php echo isset($_POST['nama']) ? htmlspecialchars($_POST['nama']) : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>TELP</td>
                            <td>=</td>
                            <td><input type="text" name="telp" value="<?php echo isset($_POST['telp']) ? htmlspecialchars($_POST['telp']) : ''; ?>" required></td>
                        </tr>
                        <tr>
                            <td>JENIS TIKET</td>
                            <td>=</td>
                            <td>
                                <select name="jenis_tiket" required>
                                    <option value="">Pilih Jenis Tiket</option>
                                    <option value="VIP" <?php echo (isset($_POST['jenis_tiket']) && $_POST['jenis_tiket'] == 'VIP') ? 'selected' : ''; ?>>VIP</option>
                                    <option value="Premium" <?php echo (isset($_POST['jenis_tiket']) && $_POST['jenis_tiket'] == 'Premium') ? 'selected' : ''; ?>>Premium</option>
                                    <option value="Regular" <?php echo (isset($_POST['jenis_tiket']) && $_POST['jenis_tiket'] == 'Regular') ? 'selected' : ''; ?>>Regular</option>
                                    <option value="Ekonomi" <?php echo (isset($_POST['jenis_tiket']) && $_POST['jenis_tiket'] == 'Ekonomi') ? 'selected' : ''; ?>>Ekonomi</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>JUMLAH TIKET</td>
                            <td>=</td>
                            <td>
                                <input type="number" name="jumlah_tiket" min="1" max="10" value="<?php echo isset($_POST['jumlah_tiket']) ? $_POST['jumlah_tiket'] : ''; ?>" required>
                                Lembar
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3" align="center">
                                <button type="submit" name="submit">Simpan</button>
                            </td>
                        </tr>
                    </table>
                </form>
            </td>
            
            <!-- Hasil Pemesanan -->
            <td>
                <center>
                    <strong>DATA PEMESANAN TIKET BOLA SEA GAMES 2018</strong><br>
                    <strong>INDONESIA VS MALAYSIA</strong><br>
                    <strong>PUKUL 15.00 WIB</strong>
                </center>
                <br>
                
                <?php
                if (isset($_POST['submit'])) {
                    // Ambil data dari form
                    $nama = htmlspecialchars($_POST['nama']);
                    $telp = htmlspecialchars($_POST['telp']);
                    $jenis_tiket = htmlspecialchars($_POST['jenis_tiket']);
                    $jumlah_tiket = (int)$_POST['jumlah_tiket'];
                    
                    // Tentukan harga berdasarkan jenis tiket
                    $harga_tiket = 0;
                    switch ($jenis_tiket) {
                        case 'VIP':
                            $harga_tiket = 500000;
                            break;
                        case 'Premium':
                            $harga_tiket = 300000;
                            break;
                        case 'Regular':
                            $harga_tiket = 150000;
                            break;
                        case 'Ekonomi':
                            $harga_tiket = 75000;
                            break;
                    }
                    
                    // Hitung total bayar
                    $total_bayar = $harga_tiket * $jumlah_tiket;
                    
                    // Tampilkan hasil
                    echo '<strong>Nama &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ' . $nama . '</strong><br>';
                    echo '<strong>Telp &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ' . $telp . '</strong><br>';
                    echo '<strong>Jenis Tiket : ' . $jenis_tiket . '</strong><br>';
                    echo '<strong>Harga Tiket : ' . number_format($harga_tiket, 0, ',', '.') . '</strong><br>';
                    echo '<br>';
                    echo '<strong>Banyaknya Tiket : ' . $jumlah_tiket . '</strong><br>';
                    echo '<hr>';
                    echo '<strong>Total Bayar : ' . number_format($total_bayar, 0, ',', '.') . '</strong><br>';
                    
                } else {
                    echo 'Silakan isi form pemesanan tiket untuk melihat data pemesanan.';
                }
                ?>
            </td>
        </tr>
    </table>

    </table>
</body>
</html>
