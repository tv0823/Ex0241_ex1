public class Tablet implements Chargeable{
    @Override
    public void charge()
    {
        System.out.println("The tablet is now charged at 100%");
    }
    public void record()
    {
        System.out.println("The tablet started recording");
    }
}
