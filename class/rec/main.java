class main{
    public static void main(String [] arges){

        System.out.println( "Start " );
        SubRec r1  =  new SubRec();
        r1.length = 5;
        r1.width = 5;

        System.out.println( "the area is  "  +  r1.Area());
        System.out.println( "the peremeter is  "  +  r1.Perameter());
    }
}