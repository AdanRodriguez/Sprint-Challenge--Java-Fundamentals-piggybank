package PiggyBank;

public class Nickel extends AbstractMoney 
{
    //fields
    private String name;
    private double value;

    //constructors
    public Nickel(int amount) 
    {
        super(amount);
        this.value = 0.05;
        this.name = "Nickels";
    }

    public Nickel() 
    {
        this.value = 0.05;
        this.name = "Nickel";
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
}