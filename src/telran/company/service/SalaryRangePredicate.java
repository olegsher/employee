package telran.company.service;

public class SalaryRangePredicate implements java.util.function.Predicate<telran.company.dto.Employee> {
    int salary;

    public SalaryRangePredicate(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean test(telran.company.dto.Employee t) {

        return false;
    }
}
