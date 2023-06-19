import java.util.Scanner;

class Greatcircle{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double x1 , x2 , y1 , y2;
         double X1 , X2 , Y1 , Y2;
        final double radius = 6371.01;

        System.out.println("Enter point 1 (latitude and longitude) in degrees");
        x1 = input.nextDouble();
        x2 = input.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees");
        y1 = input.nextDouble();
        y2 = input.nextDouble();

        X1 = Math.toRadians(x1);
        X2 = Math.toRadians(x2);
        Y1 = Math.toRadians(y1);
        Y2 = Math.toRadians(y1);

       double  d = radius * Math.acos(Math.sin(X1) * Math.sin(X2) + Math.cos(X1) * Math.cos(X2) * Math.cos(Y1 - Y2));
       System.out.println(d);
    }
}