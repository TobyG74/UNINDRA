<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Latihan Pertemuan 8</title>
</head>
<body>
    <table border="1" cellpadding="10" cellspacing="0" width="100%">
        <tr>
            <td colspan="2" align="center">
                <h1>Selamat Datang di Sistem Informasi Perusahaan Kami</h1>
                <h2>MPD Team</h2>
            </td>
        </tr>
        <tr>
            <td width="20%" valign="top">
                <h2>Menu</h2>
                <ul>
                    <li><a href="?page=profile">Profil Perusahaan</a></li>
                    <li><a href="?page=contact">Kontak Perusahaan</a></li>
                    <li><a href="?page=visi_misi">Visi & Misi</a></li>
                    <li><a href="?page=buku_tamu">Buku Tamu</a></li>
                </ul>
            </td>
            <td width="80%" valign="top">
                <?php
                // Logika untuk menampilkan konten berdasarkan parameter 'page'
                $page = isset($_GET['page']) ? $_GET['page'] : 'home'; // Default ke 'home' jika tidak ada parameter

                switch ($page) {
                    case 'profile':
                        include 'profile.php';
                        break;
                    case 'contact':
                        include 'contact.php';
                        break;
                    case 'visi_misi':
                        include 'visi_misi.php';
                        break;
                    case 'buku_tamu':
                        include 'buku_tamu.php';
                        break;
                    case 'home':
                    default:
                        echo "<h2>Beranda</h2>";
                        echo "<p>Pilih salah satu menu di samping untuk melihat informasi lebih lanjut tentang perusahaan kami.</p>";
                        break;
                }
                ?>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <p>&copy; <?php echo date("Y"); ?> Sistem Informasi Perusahaan Sederhana</p>
            </td>
        </tr>
    </table>
</body>
</html>