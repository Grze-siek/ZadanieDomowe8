package kalendarzstatyczny;

public class CalendarConverter {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;
    public static final int LENGHT_OF_THE_WEEK = 7;

    String convertDayToString(int dayNumber)
    {
        switch(dayNumber) {
            case 1:
                return "Poniedziałek";
            case 2:
                return "Wtorek";
            case 3:
                return "Środak";
            case 4:
                return "Czwartek";
            case 5:
                return "Piątek";
            case 6:
                return "Sobota";
            case 7:
                return "Niedziela";
        }
        return "Prosze podać liczbę od 1 do 7";
    }
}
