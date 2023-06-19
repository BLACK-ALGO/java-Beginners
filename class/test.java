import java.util.Scanner;
public class test {

    Scanner input = new Scanner(System.in);
    int i, j;

    public int[][] Takein(int row, int col){
        System.out.println("Enter the element");

        int [][] T = new int[row][col];
        for(i = 0; i < T.length; i++){
            for(j = 0 ; j < T[i].length; j++){
                
                T[i][j] = input.nextInt();
            }

             System.out.println();
        }
        
        return T;
    }

    public void display( int [][] Array){
        System.out.print("The elements of the arrays are");
        for(i = 0; i < Array.length; i++){
            for(j = 0; j < Array[i].length; j++){
                
                System.out.printf("\t%d" , Array[i][j]);
            }
            System.out.println("\n");
        }
    }


}