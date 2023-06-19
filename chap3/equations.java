import java.util.Scanner;
class equations{
    public static void main(String[] args) {
        // TODO code application logic here
//        SOLVING SIMULATANOUSE EQAUTION
    Scanner get = new Scanner(System.in);
         System.out.println("Equation of the form ax  + by = c\n");
       
        System.out.println("Enter the values for the first liner equation");
        System.out.print("X1 = ");
        double x = get.nextDouble();
        System.out.print("Y1 = ");
        double y = get.nextDouble();
        System.out.print("Z1 = ");
        double z = get.nextDouble();
        
        System.out.println("Enter the values for the second liner equation");
        System.out.print("X2 = ");
        double x1 = get.nextDouble();
        System.out.print("Y2 = ");
        double y1 = get.nextDouble();
        System.out.print("Z1 = ");
        double z1 = get.nextDouble();
        
        if(((x*y1) - (y*x1)) == 0){
             System.out.println("X has no values!!!! ");
             
        }else{

        double X = ((z*y1) - (y*z1)) / ((x*y1) - (y*x1)) ;
        
        double Y = ((z1*x) - (x1*z)) / ((x*y1) - (y*x1)) ;
        
        System.out.println("The value of X = " + X);
        System.out.println("The value of y = " + Y);
          }      
    }
}