

class tuitionFees{
    public static void main(String [] args){
        int TuitionFees = 10000;
        double increaseRate = 0.5;
        int numberOfyears = 0;
        int futurFees = 0;

        while(numberOfyears  <= 10){
            futurFees +=(TuitionFees *increaseRate);
             numberOfyears += 1;
        }
        System.out.println("The future fees is " + futurFees);
    }
}