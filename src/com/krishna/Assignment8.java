/*
https://github.com/krshna18/KrishnakumarPatel_C0796378_A78
 */

package com.krishna;

import javax.swing.*;
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        String day_of_week, name;
        double temp, speed_of_wind;
        Temperature test = new Temperature();
        Scanner scan = new Scanner(System.in);

//        name = JOptionPane.showInputDialog("Enter Your Name ");
        test.setName();

        JOptionPane.showMessageDialog(null,"Welcome back, "+test.getName()+" this is an assignment 8 ");

        day_of_week = JOptionPane.showInputDialog("Enter the day of the week: ");
        test.setDayOfWeek(day_of_week);

        temp = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature for "+test.getDayOfWeek()+" : "));
        test.setTempOfDay(temp);

        speed_of_wind = Double.parseDouble(JOptionPane.showInputDialog("Enter wind speed " + test.getDayOfWeek()+" : "));
        test.setWindSpeed(speed_of_wind);

        JOptionPane.showMessageDialog(null,"The feels-like temperature on "+test.getDayOfWeek()+" is: " + test.temperature(temp, speed_of_wind));

        JOptionPane.showMessageDialog(null,"Thank you... have a nice day, "+test.getName());

    }
}
