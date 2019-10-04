package telran.company.service;

import java.util.function.Predicate;

import telran.company.dto.Employee;

public class PredicateTitle implements java.util.function.Predicate<telran.company.dto.Employee> {
String title;
	public PredicateTitle(String title) {
	this.title = title;
}
	public boolean test(telran.company.dto.Employee t) {
		return t.getTitle().equalsIgnoreCase(title);
	}

}
