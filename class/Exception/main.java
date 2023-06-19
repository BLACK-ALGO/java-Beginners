import java.util.*;
class main{

    public static void main(String [] arges){
        Scanner input =  new Scanner(System.in);
        int [] number = new int[2];
        number[0] = 5;
        number[1] = 10;
        int val, age = 15;
            // InputMismatchException
            // System.out.println("Enter the index of array");
            // val =  input.nextInt();
            if(age < 20){
                throw new ArithmeticException("too bad for you ");
            }else{
                System.out.println("Welcome");
            }


        try{
            System.out.println("Enter the index of array");
            int size =  input.nextInt();
            System.out.println( number[size]);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println( e );
        }catch(InputMismatchException e){
            System.out.println( e );
        }
        System.out.println( Math.sqrt(-2));
        System.out.println( "welcome");

    }
}