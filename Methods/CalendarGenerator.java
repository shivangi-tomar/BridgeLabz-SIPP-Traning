import java.util.Scanner;

public class CalendarGenerator {

    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] days = {
        0, 31, 28, 31, 30, 31, 30, 31,
        31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month];
    }

    public static int getStartDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; // 0=Sunday, 1=Monday, ..., 6=Saturday
    }

    public static void printCalendar(int month, int year) {
        System.out.printf("\n     %s %d\n", months[month], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(month, year);
        int numDays = getDaysInMonth(month, year);

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print all days of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);
            if ((startDay + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year (e.g., 2025): ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }
}
