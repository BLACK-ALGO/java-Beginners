import java.util.*;

class reverse{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int [] nums = new int[10];
        int i;
        System.out.println(nums.length);
        System.out.println("Enter " +  nums.length + "in array");

        for(i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }

        for(i = 0; i < nums.length; i++){
            System.out.print(" " + nums[i]) ;
        }

        System.out.println();

        for(i = nums.length-1; i >= 0 ; i--){
            System.out.print(" " + nums[i]) ;
        }


    }
}