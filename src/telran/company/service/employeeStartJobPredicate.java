package telran.company.service;

public class employeeStartJobPredicate implements java.util.function.Predicate<telran.company.dto.Employee> {
    java.time.LocalDate employeeStartJob;

    public employeeStartJobPredicate(java.time.LocalDate employeeStartJob) {
        this.employeeStartJob = employeeStartJob;
    }

    @Override
    public boolean test(telran.company.dto.Employee employee) {
        return false;
    }
}
