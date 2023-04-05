public class Main {
    public static void main(String[] args) {
        int calledMonths = getDaysInMonth(2, 2021);
        System.out.println(calledMonths);
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
                return true;
            } else if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " is a leap year");
                return true;
            } else {
                System.out.println(year + " is not a leap year");
                return false;
            }
        } else {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) && (year < 1 || year > 9999)) {
            return -1;
        } else {
            if (isLeapYear(year)) {
                return switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 2 -> 29;
                    case 4, 6, 9, 11 -> 30;
                    default -> -1;
                };
            } else {
                return switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 2 -> 28;
                    case 4, 6, 9, 11 -> 30;
                    default -> -1;
                };
            }
        }
    }
}

