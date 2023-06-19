public class SubRec implements rectangle {
    public int length;
    public int width;

    @Override
    public int Area (){
        return length * width;
    }

    @Override
    public int Perameter(){
        return (length + width) * 2;
    }
}