<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kategori Donatur</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 500px;
            margin: 20px auto;
            padding: 20px;
            background: #f0f2f5;
        }
        .card {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }
        h1 { color: #1a73e8; text-align: center; }
        input { width: 100%; padding: 8px; margin: 10px 0; }
        button {
            width: 100%;
            padding: 10px;
            background: #1a73e8;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .result {
            margin-top: 20px;
            padding: 15px;
            background: #f8f9fa;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <div class="card">
        <h1>Kategori Donatur</h1>
        <form method="POST">
            <input type="number" name="jumlahDonasi" placeholder="Masukkan jumlah donasi" required>
            <button type="submit">Cek Kategori</button>
        </form>

        <?php
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            $jumlahDonasi = intval($_POST['jumlahDonasi']);
            
            if ($jumlahDonasi >= 3 && $jumlahDonasi <= 9) {
                $kategori = "Penyumbang Pemula";
                $reward = "E-sertifikat Penghargaan";
            } elseif ($jumlahDonasi >= 10 && $jumlahDonasi <= 25) {
                $kategori = "Penyumbang Aktif";
                $reward = "E-sertifikat dan Merchandise";
            } elseif ($jumlahDonasi > 25) {
                $kategori = "Penyumbang Utama";
                $reward = "E-sertifikat, Merchandise, dan Undangan ke acara penghargaan tahunan";
            } else {
                $kategori = "Belum termasuk kategori";
                $reward = "Tidak ada reward";
            }

            echo "<div class='result'>";
            echo "<p><strong>Kategori:</strong> $kategori</p>";
            echo "<p><strong>Reward:</strong> $reward</p>";
            echo "</div>";
        }
        ?>
    </div>
</body>
</html>