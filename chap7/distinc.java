import java.util.*;
class distinc{
    static void get(int arr[]){
            int i, j ;

        for(i = 0; i < 10; i++){
                for(j = 0; j < i; j++){
                        if(arr[i] == arr[j]){
                            break;
                        }

                        

                }
                if(i == j){
                            System.out.print(" " + arr[i]);
                        }
                

        }
    }

    public static void main(String [] args){
     Scanner input = new Scanner(System.in);
        int [] nums = new int[10];
        int i;
        System.out.println(nums.length);
        System.out.println("Enter " +  nums.length + "in array");

        for(i = 0; i < 10; i++){
           
           
            nums[i] = input.nextInt();

        }
        get(nums);  
    }

}

