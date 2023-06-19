import java.util.Scanner;

class hexagon {
    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Emter the length of the reduis from the center of the pentagon");
        double side = input.nextDouble();
        
        // System.out.println(side);
        double Area = (6 * Math.pow(side, 2)) / (4 * Math.tan(180/6));
        System.out.println("The area is " + Area);
        // System.out.println(Math.pow(side, 2));

    }
}