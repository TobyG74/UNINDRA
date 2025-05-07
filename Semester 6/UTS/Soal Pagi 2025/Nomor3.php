<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Soal 3</title>
</head>
<body>
    <?php
    $list_nama = [
        ['nama' => 'Nastar', 'harga' => 75000],
        ['nama' => 'Kastengel', 'harga' => 60000],
        ['nama' => 'Kue Sagu', 'harga' => 45000],
    ];

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $namaPemesan = $_POST['namaPemesan'];
        $jenisKue = $_POST['jenisKue'];
        $jumlah = $_POST['jumlah'];
        $harga = array_column($list_nama, 'harga', 'nama')[$jenisKue];
        $total = $harga * $jumlah;
        $diskon = ($jumlah >= 12) ? 15 : (($jumlah >= 6) ? 10 : (($jumlah >= 3) ? 5 : 0));
        $totalAkhir = $total * (1 - $diskon/100);
    }
    ?>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <td>Bentuk Form</td>
            <td>Output Setelah DiSubmit</td>
        </tr>
        <tr>
            <td>
                <form method="POST">
                    <label for="namaPemesan">Nama Pemesan</label>
                    <input type="text" id="namaPemesan" name="namaPemesan" required><br><br>
                    
                    <label for="jenisKue">Jenis Kue</label>
                    <select id="jenisKue" name="jenisKue" required>
                        <?php foreach ($list_nama as $kue): ?>
                            <option value="<?= $kue['nama'] ?>"><?= $kue['nama'] ?></option>
                        <?php endforeach; ?>
                    </select><br><br>
                    
                    <label for="jumlah">Jumlah</label>
                    <input type="number" id="jumlah" name="jumlah" required><br><br>
                    
                    <input type="submit" value="Submit">
                </form>
            </td>
            <td>
                <?php 
                if ($_SERVER["REQUEST_METHOD"] == "POST") {
                    echo "Pesanan atas nama: $namaPemesan<br>";
                    echo "$jenisKue $jumlah toples @$harga dengan diskon $diskon%<br>";
                    echo "Total pesanan adalah $totalAkhir" ;
                }
                ?>
            </td>
        </tr>
    </table>
</body>
</html>