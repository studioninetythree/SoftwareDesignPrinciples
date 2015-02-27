package me.sitey.ninetythree.softwareprinciples.SRP.Correct;

/**
 * Created by Dillan on 2/26/2015.
 */
public class Employee
{
    String name;
    String empNum;
    String surname;
    double salary;


    public Employee(String name, String empNum, String surname, double salary)
    {
        this.name = name;
        this.empNum = empNum;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public String getEmpNum()
    {
        return empNum;
    }

    public String getSurname()
    {
        return surname;
    }

    public double getSalary()
    {
        return salary;
    }
}
