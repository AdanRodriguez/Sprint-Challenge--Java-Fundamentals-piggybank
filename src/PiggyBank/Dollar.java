package PiggyBank;

public class Dollar extends AbstractMoney 
{
    private String name;
    private double value;

    public Dollar(int amount) 
    {
        super(amount);
        this.value = 1.00;
        this.name = "Dollar";
    }

    public Dollar() 
    {
        this.value = 1.00;
        this.name = "Dollar";
    }

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
    public double getAmount() 
    {
        return amount;
    }

    @Override
    public String toString() 
    {
        return "Money {" + "name= " + name + "\'" + ", value= " + value + "\'" + ", Amount added= " + getAmount() + "\'"
                + "Total value= " + getValue() + "}";
    }
}