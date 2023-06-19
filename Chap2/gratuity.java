import java.util.Scanner;

class gratuity{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Subtota");
        int Subtota = input.nextInt();

        System.out.println("Enter the gratuity rate ");
          int gratuity = input.nextInt();

        double gratuityRate = (float)gratuity / Subtota;
        double SubtotaRate = Subtota + gratuityRate;

        System.out.println("The subtotal is " + SubtotaRate + "The gratuity is " + gratuityRate);

    }
}