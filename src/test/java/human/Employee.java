package human;

import java.time.ZonedDateTime;

public class Employee extends Human {

    private final ZonedDateTime dateOfEmployment;

    Employee(ZonedDateTime birthdayDate, ZonedDateTime dateOfEmployment) {
        super(birthdayDate);
        this.dateOfEmployment = dateOfEmployment;
    }

    public ZonedDateTime getDateOfEmployment() {
        return this.dateOfEmployment;
    }

    public int jobExperience(ZonedDateTime employmentDate) {
        ZonedDateTime currentTime = ZonedDateTime.now();
        return getCalculationFullYears(currentTime, employmentDate);
    }

    public int ageWhenWasEmployed(ZonedDateTime employmentDate, ZonedDateTime birthdayDate) {
        return getCalculationFullYears(employmentDate, birthdayDate);
    }
}
