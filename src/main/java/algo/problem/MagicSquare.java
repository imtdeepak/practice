package algo.problem;

public class MagicSquare {

    public static void main(String[] args) {

        int[][] magicNumber;

        magicNumber = buildMagicSquare(3, 0, 1);
        printsSquare(magicNumber);

    }

    private static void printsSquare(int[][] magicNumber) {
        for (int i = 0; i < magicNumber.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < magicNumber[i].length; j++) {
                System.out.print(magicNumber[i][j] + " ");
            }
            System.out.println("]");
        }

    }

    private static int[][] buildMagicSquare(int squareSize, int posX, int posY) {

        int[][] magic = new int[squareSize][squareSize];


        magic[posX][posY] = 1;

        for (int i = 2; i <= squareSize * squareSize; i++) {
            int tempX = posX;
            int tempY = posY;

            if ((posX +=2) >= squareSize) {
                posX = 0;
            }

            if (++posY == squareSize) {
                posY = 0;
            }
            if (magic[posX][posY] == 0) {

            } else {
                posX = tempX + 1;
                if(posX>=squareSize){
                    posX=0;
                }
                posY = tempY;

            }
            System.out.println("Inserting number =" + i);
            magic[posX][posY] = i;
            printsSquare(magic);

        }
        return magic;
    }


}
