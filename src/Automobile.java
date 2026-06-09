public class Automobile
{
    private Integer year;
    private Double price;
    private String slogan;
    private Character type;

    public Integer getYear()
    {
        return year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public String getSlogan()
    {
        return slogan;
    }

    public void setSlogan(String slogan)
    {
        this.slogan = slogan;
    }

    public Character getType()
    {
        return type;
    }

    public void setType(Character type)
    {
        this.type = type;
    }

    public void playSound()
    {
        System.out.println("Sound - vroom");
    }
}
