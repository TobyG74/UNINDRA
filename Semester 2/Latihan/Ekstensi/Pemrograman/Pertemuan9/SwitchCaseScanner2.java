import javax.swing.*;
public class SwitchCaseScanner2 {
            public static void main(String[]args) {
        String nam = JOptionPane.showInputDialog("Masukkan Nama");
        String nim = JOptionPane.showInputDialog("Masukkan NIM");
        String n = JOptionPane.showInputDialog("Masukkan Nilai");
        
        int nilai = Integer.parseInt(n);
        switch (nilai) {
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100: JOptionPane.showMessageDialog(null,"Sangat Bagus");
            break;
            
            case 89:
            case 88:
            case 87:
            case 86:
            case 85:
            case 84:
            case 83:
            case 82:
            case 81:
            case 80:
            case 79:
            JOptionPane.showMessageDialog(null,"Bagus");
            break;
            
            case 78:
            case 77:
            case 76:
            case 75:
            case 74:
            case 73:
            case 72:
            case 71:
            case 70:
            case 69:
            case 68:
            case 67:
            case 66:
            case 65:
            case 64:
            case 63:
            case 62:
            case 61:
            case 60:
            JOptionPane.showMessageDialog(null,"Cukup"); 
            break;
            
            default:
            JOptionPane.showMessageDialog(null,"Gagal"); 
            break;
        }
    }
}
