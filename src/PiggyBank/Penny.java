package PiggyBank;

public class Penny extends AbstractMoney 
{
    //fields
    private String name;
    private double value;

    //constructors
    public Penny(int amount) 
    {
        super(amount);
        this.value = 0.01;
        this.name = "Pennies";
    }

    public Penny() {
        this.value = 0.01;
        this.name = "Penny";
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