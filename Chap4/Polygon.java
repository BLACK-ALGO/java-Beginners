import java.util.Scanner;

class Polygon {
    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Emter the length of the reduis from the center of the pentagon");
        double length = input.nextDouble();
        double side = (2 * length) * (Math.sin(180/5));
        // System.out.println(side);
        double Area = (5 * Math.pow(side, 2)) / (4 * Math.tan(180/5));
        System.out.println("The area is " + Area);

    }
}