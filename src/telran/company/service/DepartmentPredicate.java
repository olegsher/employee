package telran.company.service;

public class DepartmentPredicate implements java.util.function.Predicate<telran.company.dto.Employee> {
    String department;

    public DepartmentPredicate(String department) {
        this.department = department;
    }

    @Override
    public boolean test(telran.company.dto.Employee employee) {
        return false;
    }
}
