import javax.swing.JOptionPane;
    class ifMajemukJOptionPane{
        public static void main(String []args){
        String NILAI;
        int nilai;
        NILAI = JOptionPane.showInputDialog("MASUKAN NILAI [0-100] : ");
        nilai = Integer.parseInt(NILAI);
        if(nilai<0||nilai>100){
            System.out.println("Nilai harus diantara 0-100");
            System.exit(0);
        }
        
        if (nilai >=85){
            System.out.println("Nilai : " +nilai + " - Index = A"); 
        }else if(nilai >=75){
            System.out.println("Nilai : " +nilai + " - Index = B");
        }else if(nilai >=55){
            System.out.println("Nilai : " +nilai + " - Index = C");
        }else if(nilai >=45){
            System.out.println("Nilai : " +nilai + " - Index = D");
        }else {
            System.out.println("Nilai : " +nilai + " - Index = E");
        }
}
}