package PiggyBank;

public class Quarter extends AbstractMoney 
{
    //fields
    private String name;
    private double value;

    //constructors
    public Quarter(int amount) 
    {
        super(amount);
        this.value = 0.25;
        this.name = "Quarters";
    }

    public Quarter() 
    {
        this.value = 0.25;
        this.name = "Quarter";
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
        return amount + " " + name;
    }

}