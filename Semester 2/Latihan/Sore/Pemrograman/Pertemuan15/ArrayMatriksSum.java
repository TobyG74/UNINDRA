public class ArrayMatriksSum {
    public static void main(String[]args){
        double m [] [] = {{7, 2, 32}, {3, 5, 12}};
        double n [] [] = {{8, 21, 3}, {3, 6, 10}};

        // menampilkan matriks m
        System.out.println("matriks m : ");
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // menampilkan matriks n
        System.out.println("matriks n : ");
        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // hasil matriks m+n
        System.out.println("Hasil matriks m + n :");
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j]+n[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
