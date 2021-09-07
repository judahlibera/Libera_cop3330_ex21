/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Please enter the number of the month: ");
        int mn = sc.nextInt();
        String m = null;
        switch (mn)
        {
            case 1: m = "January";
                break;
            case 2: m = "February";
                break;
            case 3: m = "March";
                break;
            case 4: m = "April";
                break;
            case 5: m = "May";
                break;
            case 6: m = "June";
                break;
            case 7: m = "July";
                break;
            case 8: m = "August";
                break;
            case 9: m = "September";
                break;
            case 10: m = "November";
                break;
            case 11: m = "October";
                break;
            case 12: m = "December";
                break;
        }
        System.out.printf("The name of the month is %s.", m);
    }
}