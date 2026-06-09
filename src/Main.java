public class Main
{
    public static void main(String[] args)
    {
        // Wrapper Classes
        Automobile automobile = new Automobile();
        Integer year = 2026;
        Double price = 2000.0;
        Character type = 'A';
        String slogan = "Automobile Slogan";
        automobile.setYear(year.intValue());
        automobile.setPrice(price.doubleValue());
        automobile.setType(type.charValue());
        automobile.setSlogan(slogan.toString());
        System.out.println("=== Automobile ===");
        automobile.playSound();
        System.out.println("Type - " + automobile.getType());
        System.out.println("Year - " + automobile.getYear());
        System.out.println("Price - $" + automobile.getPrice());
        System.out.println("Slogan - " + automobile.getSlogan());
        System.out.println();

        // Standard Inheritance
        Toyota toyota = new Toyota();
        System.out.println("=== Toyota ===");
        toyota.playSound();
        System.out.println("Type - " + toyota.getType());
        System.out.println("Year - " + toyota.getYear());
        System.out.println("Price - $" + toyota.getPrice());
        System.out.println("Slogan - " + toyota.getSlogan());
        System.out.println();

        // Polymorphism + Dynamic Binding (Sound)
        Automobile tundra = new Tundra();
        System.out.println("=== Tundra ===");
        tundra.playSound(); // Would play Automobile sound if Tundra had no playSound()
        System.out.println("Type - " + tundra.getType());
        System.out.println("Year - " + tundra.getYear());
        System.out.println("Price - $" + tundra.getPrice());
        System.out.println("Slogan - " + tundra.getSlogan());
        System.out.println();

        // Polymorphism + Static Binding (Color) + Dynamic Binding (Sound)
        Automobile corolla = new Corolla();
        System.out.println("=== Corolla ===");
        corolla.playSound(); // Would play Automobile sound if Corolla had no playSound()
        System.out.println("Type - " + corolla.getType());
        System.out.println("Year - " + corolla.getYear());
        System.out.println("Price - $" + corolla.getPrice());
        System.out.println("Slogan - " + corolla.getSlogan());
        Corolla.color();
        System.out.println();

        // Nested Class
        Highlander highlander = new Highlander();
        System.out.println("=== Highlander ===");
        highlander.playSound();
        System.out.println("Type - " + highlander.getType());
        System.out.println("Year - " + highlander.getYear());
        System.out.println("Price - $" + highlander.getPrice());
        System.out.println("Slogan - " + highlander.getSlogan() + "\n");
        Highlander.Config config = highlander.new Config();
        config.selectConfig();
        System.out.println();
    }
}