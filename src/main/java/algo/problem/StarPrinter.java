import java.util.Scanner;

public class StarPrinter{

    public static void main(String args[]){

        System.out.println("Enter The number from 0-n");

        Scanner scanner= new Scanner(System.in);
        int inputInteger = scanner.nextInt();
        scanner.
        String space="\t";
        for(int i=0;i<=inputInteger;i++){
            StringBuffer printBuffer=new StringBuffer();

            //AddSpaces
            for(int j=0;j<=(inputInteger-i);j++){
                printBuffer.append(space);
            }
            //AddStars
            for(int k=0; k<=i;k++){
                printBuffer.append("*");
                printBuffer.append(space);
                printBuffer.append(space);

            }
            System.out.println(printBuffer.toString());

        }

        scanner.close();
    }
}
