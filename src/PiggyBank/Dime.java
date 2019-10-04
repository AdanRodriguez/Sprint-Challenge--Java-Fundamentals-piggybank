package PiggyBank;

public class Dime extends AbstractMoney 
{
    //fields
    private String name;
    private double value;

    //constructors
    public Dime(int amount) 
    {
        super(amount);
        this.value = 0.10;
        this.name = "Dimes";
    }

    public Dime()
    {
        this.value = 0.10;
        this.name = "Dime";
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

    // @Override
    // public double getAmount() 
    // {
    //     return amount;
    // }
}