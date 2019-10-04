package PiggyBank;

public abstract class AbstractMoney 
{
    //fields
    protected double amount;

    //constructors
    public AbstractMoney(double amount) 
    {
        this.amount = amount;
    }

    public AbstractMoney() 
    {
        amount = 1;
    }

    //abstract methods passed to child classes
    public abstract String getName();
    public abstract double getValue();

    // getters and settters
    public double getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
}