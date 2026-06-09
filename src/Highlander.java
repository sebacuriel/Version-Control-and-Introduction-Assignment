import java.util.Scanner;

public class Highlander extends Toyota
{
    public Highlander()
    {
        setYear(2023);
        setPrice(36620.0);
        setType('s');
    }

    public void playSound()
    {
        System.out.println("Sound - froom");
    }

    class Config
    {
        public void selectConfig()
        {
            Scanner scanner = new Scanner(System.in);
            int userInput;

            while (true)
            {
                System.out.print("Highlander seats (7 or 8)? - ");
                userInput = scanner.nextInt();

                if (userInput == 7 || userInput == 8)
                {
                    System.out.println("Highlander has " + userInput + " seats.");
                    break;
                }
                else
                {
                    System.out.println("Invalid");
                }
            }
        }
    }
}
