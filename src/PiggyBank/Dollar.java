package PiggyBank;

public class Dollar extends AbstractMoney 
{
    //fields
    private String name;
    private double value;

    //constructors
    public Dollar(int amount) 
    {
        super(amount);
        this.value = 1.00;
        this.name = "Dollars";
    }

    public Dollar() 
    {
        this.value = 1.00;
        this.name = "Dollar";
    }

    //abstract methods
    @Override
    public double getValue() 
    {
        return amount * value;
    }

    @Override
    public String getName() 
    {
        return name;
    }

    @Override
    public String totalAmount()
    {
        return "$" + amount + " "+ name;
    }
}