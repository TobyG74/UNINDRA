<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Latihan 1 - Pertemuan 6</title>
</head>
<body>
<body>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <!-- Form Biodata -->
            <td>
                <h2>FORM BIODATA</h2>
                <form method="POST" action="">
                    <table>
                        <tr>
                            <td>First Name :</td>
                            <td><input type="text" name="nama" value="<?php echo isset($_POST['nama']) ? htmlspecialchars($_POST['nama']) : ''; ?>"></td>
                        </tr>
                        <tr>
                            <td>Gender :</td>
                            <td>
                                <input type="radio" name="gender" value="Laki-Laki" <?php echo (isset($_POST['gender']) && $_POST['gender'] == 'Laki-Laki') ? 'checked' : ''; ?>> Laki-Laki<br>
                                <input type="radio" name="gender" value="Perempuan" <?php echo (isset($_POST['gender']) && $_POST['gender'] == 'Perempuan') ? 'checked' : ''; ?>> Perempuan
                            </td>
                        </tr>
                        <tr>
                            <td>Hobby :</td>
                            <td>
                                <input type="checkbox" name="hobby[]" value="Korespondensi" <?php echo (isset($_POST['hobby']) && in_array('Korespondensi', $_POST['hobby'])) ? 'checked' : ''; ?>> Korespondensi<br>
                                <input type="checkbox" name="hobby[]" value="Travelling" <?php echo (isset($_POST['hobby']) && in_array('Travelling', $_POST['hobby'])) ? 'checked' : ''; ?>> Travelling<br>
                                <input type="checkbox" name="hobby[]" value="Shopping" <?php echo (isset($_POST['hobby']) && in_array('Shopping', $_POST['hobby'])) ? 'checked' : ''; ?>> Shopping
                            </td>
                        </tr>
                        <tr>
                            <td>Pendidikan :</td>
                            <td>
                                <select name="pendidikan">
                                    <option value="SD" <?php echo (isset($_POST['pendidikan']) && $_POST['pendidikan'] == 'SD') ? 'selected' : ''; ?>>SD</option>
                                    <option value="SMP" <?php echo (isset($_POST['pendidikan']) && $_POST['pendidikan'] == 'SMP') ? 'selected' : ''; ?>>SMP</option>
                                    <option value="SMA" <?php echo (isset($_POST['pendidikan']) && $_POST['pendidikan'] == 'SMA') ? 'selected' : ''; ?>>SMA</option>
                                    <option value="D3" <?php echo (isset($_POST['pendidikan']) && $_POST['pendidikan'] == 'D3') ? 'selected' : ''; ?>>D3</option>
                                    <option value="S1" <?php echo (isset($_POST['pendidikan']) && $_POST['pendidikan'] == 'S1') ? 'selected' : ''; ?>>S1</option>
                                    <option value="S2" <?php echo (isset($_POST['pendidikan']) && $_POST['pendidikan'] == 'S2') ? 'selected' : ''; ?>>S2</option>
                                    <option value="S3" <?php echo (isset($_POST['pendidikan']) && $_POST['pendidikan'] == 'S3') ? 'selected' : ''; ?>>S3</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Alamat :</td>
                            <td><input type="text" name="alamat" value="<?php echo isset($_POST['alamat']) ? htmlspecialchars($_POST['alamat']) : ''; ?>"></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <button type="submit" name="submit">Simpan</button>
                            </td>
                        </tr>
                    </table>
                </form>
            </td>
            
            <!-- Hasil Output -->
            <td>
                <h2>Hasil Outputnya :</h2>
                <?php
                if (isset($_POST['submit'])) {
                    echo "<h3>Biodata Anda</h3>";
                    
                    // Tampilkan Nama
                    $nama = isset($_POST['nama']) ? $_POST['nama'] : '';
                    echo "<strong>Nama &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " . htmlspecialchars($nama) . "</strong><br>";
                    
                    // Tampilkan Gender
                    $gender = isset($_POST['gender']) ? $_POST['gender'] : '';
                    echo "<strong>Gender &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " . htmlspecialchars($gender) . "</strong><br>";
                    
                    // Tampilkan Hobby
                    $hobby = isset($_POST['hobby']) ? $_POST['hobby'] : array();
                    echo "<strong>Hobby &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " . implode(', ', $hobby) . "</strong><br>";
                    
                    // Tampilkan Pendidikan
                    $pendidikan = isset($_POST['pendidikan']) ? $_POST['pendidikan'] : '';
                    echo "<strong>Pendidikan : " . htmlspecialchars($pendidikan) . "</strong><br>";
                    
                    // Tampilkan Alamat
                    $alamat = isset($_POST['alamat']) ? $_POST['alamat'] : '';
                    echo "<strong>Alamat &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " . htmlspecialchars($alamat) . "</strong><br>";
                } else {
                    echo "<h3>Biodata Anda</h3>";
                    echo "<p>Silakan isi form di sebelah kiri untuk menampilkan biodata Anda.</p>";
                }
                ?>
            </td>
        </tr>
    </table>
</body>
</html>
