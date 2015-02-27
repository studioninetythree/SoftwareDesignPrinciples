package me.sitey.ninetythree.softwareprinciples.SRP.Incorrect;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Dillan on 2/26/2015.
 */
public class Employee
{

    String name;
    String empNum;
    String surname;
    double salary;
    Scanner input;

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

    public void readToFile()
    {
        try
        {
            input = new Scanner(new File("InputFile.text"));
            assertEquals(null, input);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try
        {
            while(input.hasNext())
            {
                String line = input.nextLine();
                JOptionPane.showMessageDialog(null, line);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void closeFile()
    {
        assertEquals(null, input);
        if (input != null)
            input.close();
    }
}
