package human;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EmployeeInformation {

    public static void main(String[] args) {
        Employee Andriy = new Employee(ZonedDateTime.of(LocalDate.of(1988, 7, 15), LocalTime.of(7, 30), ZoneId.of("Europe/Helsinki"))
                , ZonedDateTime.of(LocalDate.of(2019, 1, 14), LocalTime.of(9, 0), ZoneId.of("Europe/Helsinki")));

        System.out.println("Birthday: " + Andriy.getBirthdayDate());
        System.out.println("Employment date: " + Andriy.getDateOfEmployment());
        System.out.println("Age: " + Andriy.calculateHumanAge(Andriy.getBirthdayDate()));
        System.out.println("Job experience: " + Andriy.jobExperience(Andriy.getDateOfEmployment()));
        System.out.println("Was employed at: " + Andriy.ageWhenWasEmployed(Andriy.getDateOfEmployment(), Andriy.getBirthdayDate()));
    }
}
