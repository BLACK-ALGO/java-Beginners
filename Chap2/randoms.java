import java.util.Scanner;

class randoms{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        

        if(num1 >= num2){
            System.out.println("The sum of " + num1 + " + " + num2 + " is");
            int sum = input.nextInt();

            if (num1 + num1 == sum){
                System.out.println("The sum of " + num1 + " + " + num2 +" = " + sum + " is currect");           
                }else{
                    System.out.println("The sum of " + num1 + " + " + num2 +" = " + sum + 
                    " is not currect  " + "The result is " + (num1 - num2));
                }
        }

    }
}