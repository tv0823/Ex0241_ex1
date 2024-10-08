public class Main {
    public static void main(String[] args)
    {
        Chargeable[] charging = new Chargeable[3];
        charging[0] = new Phone();
        charging[1] = new Tablet();
        charging[2] = new Laptop();

        for(Chargeable device : charging)
        {
            device.charge();
        }
    }
}
