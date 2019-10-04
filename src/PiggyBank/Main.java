package PiggyBank;
//imports 
import java.text.DecimalFormat;
import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
        //Decimal Formatting ---- for decimals??
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        //Adding money to piggybank
        ArrayList<AbstractMoney> money = new ArrayList<AbstractMoney>();
        money.add(new Quarter());
        money.add(new Dime());
        money.add(new Dollar(5));
        money.add(new Nickel(3));
        money.add(new Dime(7));
        money.add(new Dollar());
        money.add(new Penny(10));

        //prints list of money
        money.forEach(m -> System.out.println(m.getAmount() + " " + m.getName()));

        //for loop adding sum of all to piggybank
        double total = 0;
	    for(int i = 0; i < money.size(); i++)
        {
            total += money.get(i).getValue();
        }

        //prints out sum of piggybank
        System.out.println("\nThe piggy bank holds " + fp.format(total));
    }
}