
class Average{
    public static void main(String [] args){
        int timeS = ( (60*60*60) + (60*60) + 35 );
        double distanceK = (24*1.6*1000);
        System.out.println("Time in second = " + timeS +"s");
        System.out.println("This in meter = " + distanceK + "m");
        System.out.println("Average Speed in Km/h = " + (distanceK/timeS) + "Km/h");

    }
}