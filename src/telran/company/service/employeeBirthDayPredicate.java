package telran.company.service;

public class employeeBirthDayPredicate implements java.util.function.Predicate<telran.company.dto.Employee> {
    java.time.LocalDate employeeBirthDay;

    public employeeBirthDayPredicate(java.time.LocalDate employeeBirthDay) {
        this.employeeBirthDay = employeeBirthDay;
    }

    @Override
    public boolean test(telran.company.dto.Employee employee) {
        return false;
    }
}
