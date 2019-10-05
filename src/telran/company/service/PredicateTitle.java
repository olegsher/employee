package telran.company.service;

public class PredicateTitle implements java.util.function.Predicate<telran.company.dto.Employee> {
    String title;

    public PredicateTitle(String title) {
        this.title = title;
    }

    @Override   // Do we need to use override here???
    public boolean test(telran.company.dto.Employee t) {
        return t.getTitle().equalsIgnoreCase(title);
    }

}
