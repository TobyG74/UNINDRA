public class Array2D {
    public static void main(String[]args){
        int [][] arraycoy;
        arraycoy = new int [3] [3];
        arraycoy [0][0] = 1;
        arraycoy [0][1] = 2;
        arraycoy [0][2] = 3;
        arraycoy [0][0] = 4;
        arraycoy [1][1] = 5;
        arraycoy [1][2] = 6;
        arraycoy [1][0] = 7;
        arraycoy [2][1] = 8;
        arraycoy [2][2] = 9;
        
        System.out.println("Nilai array [0][0] = " + arraycoy[0][0]);
        System.out.println("Nilai array [0][1] = " + arraycoy[0][1]);
        System.out.println("Nilai array [0][2] = " + arraycoy[0][2]);
        System.out.println("Nilai array [1][0] = " + arraycoy[1][0]);
        System.out.println("Nilai array [1][1] = " + arraycoy[1][1]);
        System.out.println("Nilai array [1][2] = " + arraycoy[1][2]);
        System.out.println("Nilai array [2][0] = " + arraycoy[2][0]);
        System.out.println("Nilai array [2][1] = " + arraycoy[2][1]);
        System.out.println("Nilai array [2][2] = " + arraycoy[2][2]);
    }
}