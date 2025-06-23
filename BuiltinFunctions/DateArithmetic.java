import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 6, 23);  // You can change input here

        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);
        result = result.minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Final Date after arithmetic: " + result);
    }
}
