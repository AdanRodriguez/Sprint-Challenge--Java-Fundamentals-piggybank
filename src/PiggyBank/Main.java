package PiggyBank;

import java.text.DecimalFormat;
import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<AbstractMoney> piggyBank = new ArrayList<AbstractMoney>();

        piggyBank.add(new Dollar(5));
        piggyBank.add(new Dollar());
  

        piggyBank.forEach(m -> System.out.println(m.getAmount() + " " + m.getName()));
    }
}