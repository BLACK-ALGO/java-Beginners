import  java.util.Scanner;

class numberYears{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
            final int YearsMIn = 21900;
            System.out.println("Enter the number of munites e.g 10000000000 minutes");
            int time = input.nextInt();

            int numberOfYears = time / YearsMIn;

            int numberOfDays = (time % YearsMIn)/60;

            System.out.println("The are " + numberOfYears + " years and they are " + numberOfDays + " days");

        
    }
}