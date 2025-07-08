<h3>Buku Tamu</h3>

<?php
session_start(); 

if (!isset($_SESSION['bukutamu_entries'])) {
    $_SESSION['bukutamu_entries'] = [];
}

// Menangani submit form buku tamu
if (isset($_POST['submit_bukutamu'])) {
    $nama = htmlspecialchars(trim($_POST['nama_tamu']));
    $email = htmlspecialchars(trim($_POST['email_tamu']));
    $pesan = htmlspecialchars(trim($_POST['pesan_tamu']));

    if (!empty($nama) && !empty($email) && !empty($pesan)) {
        $_SESSION['bukutamu_entries'][] = [
            'nama' => $nama,
            'email' => $email,
            'pesan' => $pesan,
            'tanggal' => date('Y-m-d H:i:s')
        ];
        // Redirect untuk mencegah resubmission form
        header("Location: ?page=bukutamu");
        exit();
    } else {
        echo "<p style='color: red;'>Mohon lengkapi semua kolom!</p>";
    }
}
?>

<h4>Tinggalkan Pesan Anda</h4>
<form method="POST" action="?page=bukutamu">
    <table>
        <tr>
            <td>Nama:</td>
            <td><input type="text" name="nama_tamu" required></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email_tamu" required></td>
        </tr>
        <tr>
            <td>Pesan:</td>
            <td><textarea name="pesan_tamu" rows="5" cols="40" required></textarea></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit" name="submit_bukutamu">Kirim Pesan</button>
            </td>
        </tr>
    </table>
</form>

<h4>Daftar Pesan</h4>
<?php
if (empty($_SESSION['bukutamu_entries'])) {
    echo "<p>Belum ada pesan di buku tamu.</p>";
} else {
    echo "<table border='1' cellpadding='5' cellspacing='0' width='100%'>";
    echo "<tr><th>Tanggal</th><th>Nama</th><th>Email</th><th>Pesan</th></tr>";
    // Tampilkan pesan-pesan yang ada di buku tamu dari array session
    foreach (array_reverse($_SESSION['bukutamu_entries']) as $entry) { 
        echo "<tr>";
        echo "<td>" . $entry['tanggal'] . "</td>";
        echo "<td>" . $entry['nama'] . "</td>";
        echo "<td>" . $entry['email'] . "</td>";
        echo "<td>" . $entry['pesan'] . "</td>";
        echo "</tr>";
    }
    echo "</table>";
}
?>