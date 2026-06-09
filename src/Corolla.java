public class Corolla extends Toyota
{
    public Corolla()
    {
        setYear(2023);
        setPrice(21700.0);
        setType('c');
    }

    public void playSound()
    {
        System.out.println("Sound - room");
    }

    public static void color()
    {
        System.out.println("Color - Purple");
    }
}
