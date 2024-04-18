import java.util.Scanner;

interface HolidayCalendar {
    void name();
    void date();
}

class January implements HolidayCalendar {

    @Override
    public void name() {
        System.out.println("New Year's Day");
        System.out.println("Republic Day");
    }

    @Override
    public void date() {
        System.out.println("1st January");
        System.out.println("26th January");
    }
}

class February implements HolidayCalendar {

    @Override
    public void name() {
        System.out.println("Vasant Panchami");
    }

    @Override
    public void date() {
        System.out.println("14th February");
    }
}

class March implements HolidayCalendar {

    @Override
    public void name() {
        System.out.println("Maha Shivaratri");
        System.out.println("Holi");
    }

    @Override
    public void date() {
        System.out.println("8th March");
        System.out.println("25th March");
    }
}

class April implements HolidayCalendar {

    @Override
    public void name() {
        System.out.println("Eid-ul-Fitar");
    }

    @Override
    public void date() {
        System.out.println("11th April");
    }
}

class Invalid implements HolidayCalendar {

    @Override
    public void name() {        
        System.out.print("Invalid Month");
    }

    @Override
    public void date() {
        System.out.println();
    }
}


class Holidays {
    public static HolidayCalendar showHolidays(String month) {
        if (month.equalsIgnoreCase("January")) {
            return new January();
        } 
        else if (month.equalsIgnoreCase("February")) {
            return new February();
        } 
        else if (month.equalsIgnoreCase("March")) {
            return new March();
        } 
        else if (month.equalsIgnoreCase("April")) {
            return new April();
        } 
        else {
            return new Invalid();
        }
    }
}

public class factorymethod {
    public static void main(String[] args) {

        System.out.println("\nEnter a month from the list:\n1. January\n2. February\n3. March\n4. April");
        Scanner sc= new Scanner(System.in);
        String month=sc.nextLine();

        HolidayCalendar holiday = Holidays.showHolidays(month);
        holiday.name();
        holiday.date();

        sc.close();
    }
}
