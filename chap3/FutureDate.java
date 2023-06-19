import java.util.Scanner;

class FutureDay{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's date");
        int Currentday = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int Elapseday = input.nextInt();

        int futurday, laps ;
        

        if(Currentday ==  7){
            futurday = Currentday;

        }else{
            laps = Currentday + Elapseday;

            futurday = laps % 7;

        }

        switch( futurday ){
            case 0:
                System.out.println("The future date is SUNDAY");
                break;
            case 1:
                System.out.println("The future date is MONDAY");
                break;

            case 2:
                System.out.println("The future date is TUESDAY");
                break;
            
            case 3:
                System.out.println("The future date is WEDNESDAY");
                break;
            
            case 4:
                System.out.println("The future date is THURSDAY");
                break;
            
            case 5:
                System.out.println("The future date is FRIDAY");
                break;
            
            case 6:
                System.out.println("The future date is SATURDAY");
                break;
            
            default:
                System.out.println("No future date ");
                break;

        }
        
    }
}