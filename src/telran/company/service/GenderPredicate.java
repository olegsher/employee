package telran.company.service;

public class GenderPredicate implements java.util.function.Predicate<telran.company.dto.Employee> {
    String gender;

    public GenderPredicate(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean test(telran.company.dto.Employee employee) {
        return false;
    }
}
