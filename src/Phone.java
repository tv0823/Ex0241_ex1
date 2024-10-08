public class Phone implements Chargeable{
    @Override
    public void charge()
    {
        System.out.println("The phone is charged");
    }
    public void screenShot()
    {
        System.out.println("The phone took a screenshot");
    }
}
