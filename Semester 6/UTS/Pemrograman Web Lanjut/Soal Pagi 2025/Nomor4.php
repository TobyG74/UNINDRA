<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Robot Patroli</title>
    <style>
        body { 
            font-family: Arial; 
            margin: 0;
            padding: 20px;
            background: #f0f2f5;
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container { 
            max-width: 500px;
            width: 100%;
        }
        .card {
            background: white;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            padding: 20px;
        }
        .card-header {
            text-align: center;
            margin-bottom: 20px;
            color: #1a73e8;
        }
        form { 
            margin: 20px 0; 
        }
        .form-group {
            margin-bottom: 15px;
        }
        .radio-group {
            display: flex;
            gap: 20px;
            margin-bottom: 15px;
        }
        input[type="radio"] {
            margin-right: 5px;
        }
        input[type="number"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 5px;
            margin-top: 5px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background: #1a73e8;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background: #1557b0;
        }
        .output { 
            margin-top: 20px;
            padding: 15px;
            background: #f8f9fa;
            border-radius: 5px;
            border: 1px solid #e9ecef;
        }
        .output b {
            color: #1a73e8;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="card">
            <div class="card-header">
                <h2>Form Patroli Robot</h2>
            </div>
            <form method="POST">
                <div class="form-group">
                    <div class="radio-group">
                        <label>
                            <input type="radio" name="arah" value="Maju" required> Maju
                        </label>
                        <label>
                            <input type="radio" name="arah" value="Mundur" required> Mundur
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label>Jumlah Langkah:</label>
                    <input type="number" name="jumlahLangkah" min="1" required>
                </div>
                <input type="submit" value="Mulai Patroli">
            </form>

            <?php
            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                $arah = $_POST['arah'];
                $jumlahLangkah = (int)$_POST['jumlahLangkah'];
                
                echo "<div class='output'>";
                for ($i = 1; $i <= $jumlahLangkah; $i++) {
                    echo ($i % 5 == 0) 
                        ? "<b>Alex Berhenti sejenak pada langkah ke $i</b><br>"
                        : "Alex berjalan $arah pada langkah ke $i<br>";
                }
                echo "<hr>Robot selesai melakukan patroli";
                echo "</div>";
            }
            ?>
        </div>
    </div>
</body>
</html>