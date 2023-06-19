import java.util.Scanner;

class Acceleration{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Initial Velocity");
        float v1 = input.nextFloat();

        System.out.println("Enter the Final Velocity");
        float v2 = input.nextFloat();

        System.out.println("Enter the time inverval e.g 2.2 5.6 2.0 ");
        float t1 = input.nextFloat();
        float t2 = input.nextFloat();
        float t3 = input.nextFloat();

        float tavg = (t1 + t2 + t3 ) / 3.0F;

        float acc = (v2 - v1) / tavg;

        System.out.println("The Average acceleration is " + acc + " m/s^2");

    }
}