import java.util.Scanner;
class Feh{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in celsu");
        int temp = input.nextInt();

        double temF = (5 / 9.0) * temp + 32;
        
        System.out.println("The temeparetur in Feh is " + temF);

    }
}