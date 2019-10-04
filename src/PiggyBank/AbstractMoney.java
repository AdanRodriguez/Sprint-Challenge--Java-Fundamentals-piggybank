package PiggyBank;

public abstract class AbstractMoney 
{
    protected double amount;

    public AbstractMoney(int amount) 
    {
        this.amount = amount;
    }

    public AbstractMoney() 
    {
        amount = 1;
    }

    public abstract String getName();

    public abstract double getValue();

    public abstract double getAmount();

}