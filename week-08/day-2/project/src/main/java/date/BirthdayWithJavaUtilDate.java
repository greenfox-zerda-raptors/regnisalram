package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static com.sun.tools.javac.util.Constants.format;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = formatter.parse(str);
        } catch (ParseException e) {}
        return date;
    }

    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        DateFormat formatter = new SimpleDateFormat("MM. dd.");
        return formatter.format(date);
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        // TODO - return with true if today is the same month+day as date
        Date dateToday = new Date();
        return (printMonthAndDay(dateToday).equals(printMonthAndDay(date)));
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        // TODO - return how many years ago the input date 'birthday' was
        Calendar dateToday = Calendar.getInstance();
        Calendar birthdayDate = Calendar.getInstance();
        birthdayDate.setTime(birthday);

        int yearToday = dateToday.get(Calendar.YEAR);
        int yearBday = birthdayDate.get(Calendar.YEAR);

        int monthToday = dateToday.get(Calendar.MONTH);
        int monthBday = birthdayDate.get(Calendar.MONTH);

        int dayToday = dateToday.get(Calendar.DAY_OF_MONTH);
        int dayBday = birthdayDate.get(Calendar.DAY_OF_MONTH);

        int age = yearToday - yearBday;

        if (monthToday > monthBday) {
            age--;
        } else if (monthToday == monthBday) {
            if (dayBday > dayToday) {
                age--;
            }
        }
        return age;
    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        Calendar dateToday = Calendar.getInstance();
        Calendar birthdayDate = Calendar.getInstance();
        birthdayDate.setTime(date);

        int yearToday = dateToday.get(Calendar.YEAR);

        int monthToday = dateToday.get(Calendar.MONTH);
        int monthBday = birthdayDate.get(Calendar.MONTH);

        int dayToday = dateToday.get(Calendar.DAY_OF_MONTH);
        int dayBday = birthdayDate.get(Calendar.DAY_OF_MONTH);

        int days;
        long diff;

        birthdayDate.set(Calendar.YEAR, yearToday);

        if (monthBday > monthToday || (monthBday == monthToday && dayBday > dayToday)) {
        } else {
            birthdayDate.set(Calendar.YEAR, yearToday + 1);
        }

        diff = birthdayDate.getTimeInMillis() - dateToday.getTimeInMillis();

        days = (int) TimeUnit.MILLISECONDS.toDays(diff);

        return days;
    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
