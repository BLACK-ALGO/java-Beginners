import java.util.*;

class addPrime{
    public  static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nuber");
        int num = input.nextInt();
        int negNum=0;
        int posNum = 0;
        int sum = 0;

        while(num != 0){
            sum += num;
            if(num % 2 == 0){
                posNum += 1 ;
            }else{
                negNum += 1;
            }

            System.out.println("Enter a nuber");
            num = input.nextInt();
        }

        System.out.println("The sum is " + sum);
        System.out.println("The average  is " + sum/(posNum + negNum));
        System.out.println("The number of positive number " + posNum);
        System.out.println("The number of negative number " + negNum);

    }
}