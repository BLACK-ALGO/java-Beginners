import java.util.Scanner;

class sumOfDigit{
    public static void main(String [] args){
            Scanner input =new Scanner(System.in);

        System.out.println("Enter a number between 1 to 1000");
        int number = input.nextInt();
        int firstDigit = number % 10;
        int RestNumber =number / 10;

        int secondDigit = RestNumber % 10;
        RestNumber = RestNumber / 10;

        int thirdDigit = RestNumber % 10;
        RestNumber = RestNumber / 10;

        int fouthDigit = RestNumber % 10;
        RestNumber = RestNumber / 10;

        int sum = firstDigit + secondDigit + thirdDigit + fouthDigit;

        System.out.println("The sum of digits from the number " + number + " is " + sum);
        
    }
}