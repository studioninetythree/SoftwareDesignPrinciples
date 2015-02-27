package me.sitey.ninetythree.softwareprinciples.OCP.Incorrect;

/**
 * Created by Dillan on 2/26/2015.
 */
public interface BankServices
{
    public void depositMoney();
    public void withdrawMoney();
    public void checkBalance();

    // making changes to this module is bad
    public void cellphoneBanking();
    public void internetBanking();
}
