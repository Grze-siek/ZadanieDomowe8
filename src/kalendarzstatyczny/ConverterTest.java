package kalendarzstatyczny;

public class ConverterTest {
    public static void main(String[] args) {
        CalendarConverter calendar = new CalendarConverter();

        for (int counter = 1; counter <= CalendarConverter.LENGHT_OF_THE_WEEK; counter++) {
            String nameOfTheWeek = calendar.convertDayToString(counter);
            System.out.println(counter + " dzień tygodnia to " + nameOfTheWeek);
        }
    }
}
