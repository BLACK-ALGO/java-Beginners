import java.util.Scanner;
class mainClass{
    
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
     int raw , col;
       
        System.out.printf("Enter the number of raw");
        raw = input.nextInt();
        System.out.printf("Enter the number of column");
        col = input.nextInt();

        test t1 = new test();
        
        int [][] MyArray = t1.Takein(raw, col);
            t1.display(MyArray);
    }
}