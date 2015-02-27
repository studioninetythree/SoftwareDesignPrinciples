package me.sitey.ninetythree.softwareprinciples.SRP.Correct;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Dillan on 2/26/2015.
 */
public class WriteEmployeeData
{
    Scanner input;

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
