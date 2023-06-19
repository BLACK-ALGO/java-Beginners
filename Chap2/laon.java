import java.util.Scanner;

class laon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println( "Enraer annaul interest rate e.g 2.7%" );
        double annaulIterest = input.nextDouble();

        double monthlyInterestRate = annaulIterest / 1200;


        System.out.println( "Enter the loan amount" );
        int lamt = input.nextInt();

        System.out.println( "Enter the number of years e.g 5 years" );
        int numberOfYears = input.nextInt();

        // calculation
        double monthPayment = ((lamt * monthlyInterestRate) / 1) / Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        double annaulPayment = (monthPayment * (numberOfYears * 12));

        System.out.println("The monthly interest is: " +
            ((monthPayment*100) / 100.0)
        );

        System.out.println("The annual interest is: " +
            ((annaulPayment*100) / 100.0)
        );





        // System.out.print( "welcome" );
    }
}