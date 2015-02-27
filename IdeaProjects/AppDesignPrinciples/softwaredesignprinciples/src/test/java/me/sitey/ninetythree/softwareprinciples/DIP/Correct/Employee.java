package me.sitey.ninetythree.softwareprinciples.DIP.Correct;

/**
 * Created by Dillan on 2/26/2015.
 */
public class Employee
{
    String name;
    String surname;
    String empNum;
    String gender;
    double salary;

    public Employee()
    {
    }

    public Employee(String name, String surname, String empNum, String gender, double salary)
    {
        this.name = name;
        this.surname = surname;
        this.empNum = empNum;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getEmpNum()
    {
        return empNum;
    }

    public String getGender()
    {
        return gender;
    }

    public double getSalary()
    {
        return salary;
    }
}
