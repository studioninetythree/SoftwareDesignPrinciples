package me.sitey.ninetythree.softwareprinciples.OCP.Correct;

/**
 * Created by Dillan on 2/26/2015.
 */
public interface BankServicesNew extends BankServices
{
    // extention to BankServices
    // adding new features without changing any code and older code
    public void cellphoneBanking();
    public void internetBanking();
}
