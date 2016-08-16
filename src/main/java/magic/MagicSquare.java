package magic;

/**
 * Created by deepak.kumar on 7/8/16.
 */
public class MagicSquare {

    public static void main(String[] args) {
        MagicSquare magicSquare = new MagicSquare();
        int n = 3;
        int[][] magic = magicSquare.buildMagicSquare(3);
        for(int i = 0 ; i < n ;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + magic[i][j]);
            }
            System.out.println(" ");
        }
    }

    public int[][] buildMagicSquare(int n){

        int[] [] magic = new int[n][n];

        int row = 0;
        int col = (n-1)/2;
        magic[row][col] =1;

        for(int i = 2; i <= n*n ; i++){
            row = row == 0 ? n-1 : row -1;
            col = col == n -1 ? 0 : col +1;
            if(magic[row][col] != 0){
                row = row == n-1 ? 0 : row +1;
            }
            magic[row][col] = i;
        }

        return magic;
    }
}
