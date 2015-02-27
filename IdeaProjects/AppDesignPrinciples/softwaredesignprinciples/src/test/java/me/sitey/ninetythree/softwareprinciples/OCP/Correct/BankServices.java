package me.sitey.ninetythree.softwareprinciples.OCP.Correct;

/**
 * Created by Dillan on 2/26/2015.
 */
public interface BankServices
{
    public void depositMoney();
    public void withdrawMoney();
    public void checkBalance();

    // new changes implemented in another module as an extention to this one

}
