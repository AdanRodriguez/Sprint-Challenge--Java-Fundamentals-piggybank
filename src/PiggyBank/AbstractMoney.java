package PiggyBank;

public abstract class AbstractMoney 
{
    //fields
    protected int amount;

    //constructors
    public AbstractMoney(int amount) 
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
    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
}