import java.util.Scanner;

class Exo2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double reduis, area;
        double pi = (22.0/7);
        System.out.print("Enter the reduis of the circle: ");
        reduis = input.nextDouble();
        System.out.print("\n Reduis = " + reduis);
        area = (reduis*reduis) * pi;
        System.out.print("\n The area is = " + area );

    }
}