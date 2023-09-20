package human;

import java.time.ZonedDateTime;

public class Human {

    private final ZonedDateTime birthdayDate;

    Human(ZonedDateTime birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public ZonedDateTime getBirthdayDate() {
        return this.birthdayDate;
    }

    public int getCalculationFullYears(ZonedDateTime firstDate, ZonedDateTime secondDate) {
        int fullYears = firstDate.getYear() - secondDate.getYear();
        if ((firstDate.getMonth().getValue() < secondDate.getMonth().getValue())
                || (firstDate.getMonth().getValue() == secondDate.getMonth().getValue()) && firstDate.getDayOfMonth() < secondDate.getDayOfMonth()) {
            return fullYears - 1;
        } else {
            return fullYears;
        }
    }

    public int calculateHumanAge(ZonedDateTime birthdayDate) {
        ZonedDateTime currentTime = ZonedDateTime.now();
        return getCalculationFullYears(currentTime, birthdayDate);
    }
}
