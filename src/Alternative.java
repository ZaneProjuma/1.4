import java.util.Scanner;

public class Alternative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month (MM)");
        int month = input.nextInt();
        System.out.println("Enter year (YYYY)");
        int year = input.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("Number of days are 31");
        if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("Number of days are 30");
        if (year % 4 != 0 && month == 2)
            System.out.println("Number of days are 28");
        if (year % 4 == 0 && month == 2)
            System.out.println("Number of days are 29");
        if (month <= 0 || month > 12)
            System.out.println("Wrong input");
    }
}
